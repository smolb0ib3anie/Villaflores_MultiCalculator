package mcm.edu.ph.villaflores_multicalculator.OctahedronFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class OctahedronVolume extends AppCompatActivity implements View.OnClickListener{

    EditText txtOctahedronVolEdge;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octahedron_volume);

        txtOctahedronVolEdge = findViewById(R.id.txtOctahedronVolEdge);
        calculate = findViewById(R.id.btnCalcOctahedronVolume);
        answer = findViewById(R.id.octahedronVolumeAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(txtOctahedronVolEdge.getText()));

        switch (v.getId()) {
            case R.id.btnCalcOctahedronVolume:
                Formulas.octahedronVolumeFormula(edge);
                answer.setText(String.valueOf(Formulas.octahedronVolumeFormula(edge)));
                break;
        }

    }

}