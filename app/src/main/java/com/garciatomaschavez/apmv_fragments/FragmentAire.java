package com.garciatomaschavez.apmv_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentAire#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentAire extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Buffer buffer;
    EditText inputMensaje;
    TextView mensaje;

    public FragmentAire() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentAire.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentAire newInstance(String param1, String param2) {
        FragmentAire fragment = new FragmentAire();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aire, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        buffer = new ViewModelProvider(requireActivity()).get(Buffer.class);
        mensaje = requireActivity().findViewById(R.id.mensaje);
        inputMensaje = requireActivity().findViewById(R.id.inputMensaje);

        TextView anteriorElemento = requireActivity().findViewById(R.id.anteriorElemento);
        anteriorElemento.setText(anteriorElemento.getText().toString()+buffer.getAnteriorElemento());

        mensaje.setText(buffer.getMensaje());

        buffer.setAnteriorElemento("AIRE");

        // for closing fragment and returning to main menu
        Button returnButton = view.findViewById(R.id.volver);
        returnButton.setOnClickListener(view1 -> {
            buffer.setMensaje(inputMensaje.getText().toString());
            requireActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
    }
}