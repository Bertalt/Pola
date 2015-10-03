package com.son.pola.labs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.son.pola.R;

import static java.lang.Math.*;


public class BlankFragment_n1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters


    private EditText editX;
    private EditText editY;
    private EditText editZ;
    private TextView textResult_a;
    private TextView textResult_b;
    private ViewGroup mContainer;
    private Button mButton;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment_n1.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment_n1 newInstance(String param1, String param2) {
        BlankFragment_n1 fragment = new BlankFragment_n1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public BlankFragment_n1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mContainer = container;
        return inflater.inflate(R.layout.fragment_blank_1, container, false);

    }

    @Override
    public void onResume()
    {

        super.onResume();
        editX = (EditText)mContainer.findViewById(R.id.editTextX);
        editY = (EditText)mContainer.findViewById(R.id.editTextY);
        editZ = (EditText)mContainer.findViewById(R.id.editTextZ);

        textResult_a = (TextView)mContainer.findViewById(R.id.textView_result_a);
        textResult_b = (TextView)mContainer.findViewById(R.id.textView_result_b);
    mButton = (Button) mContainer.findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double resultA = 0,
                        resultB = 0,x=0,y=0,z=0;

                try {
                    x = Double.valueOf(editX.getText().toString());
                    y = Double.valueOf(editY.getText().toString());
                    z = Double.valueOf(editZ.getText().toString());
                     }catch (NumberFormatException MFE)
                {
                    Toast.makeText(getContext(),"Перевірте введені дані",Toast.LENGTH_SHORT).show();
                    return;
                }

                resultA = sqrt(2.591-pow(x,1/3));
                resultA = resultA/(y*(pow(Math.E,2)+pow(Math.E,z)));
                textResult_a.setText("a = "+resultA);

                resultB= pow((x+1),-1/pow(sin(z), 2));
                textResult_b.setText("b = " + resultB);
            }
        });
    }

}
