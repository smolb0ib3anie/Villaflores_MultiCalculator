package mcm.edu.ph.villaflores_multicalculator.SphereFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class SphereVolume extends AppCompatActivity implements View.OnClickListener{

    EditText txtSphereVolRadius;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_area);

        txtSphereVolRadius = findViewById(R.id.txtSphereVolRadius);
        calculate = findViewById(R.id.btnCalcSphereVolume);
        answer = findViewById(R.id.sphereVolumeAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtSphereVolRadius.getText()));

        switch (v.getId()) {
            case R.id.btnCalcSphereVolume:
                Formulas.sphereVolumeFormula(radius);
                answer.setText(String.valueOf(Formulas.sphereVolumeFormula(radius)));
                break;
        }

    }

}