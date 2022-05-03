package mcm.edu.ph.villaflores_multicalculator.OctahedronFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class OctahedronArea extends AppCompatActivity implements View.OnClickListener{

    EditText txtOctahedronEdge;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octahedron_area);

        txtOctahedronEdge = findViewById(R.id.txtOctahedronEdge);
        calculate = findViewById(R.id.btnCalcOctahedronArea);
        answer = findViewById(R.id.octahedronAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(txtOctahedronEdge.getText()));

        switch (v.getId()) {
            case R.id.btnCalcOctahedronArea:
                Formulas.octahedronAreaFormula(edge);
                answer.setText(String.valueOf(Formulas.octahedronAreaFormula(edge)));
                break;
        }

    }

}