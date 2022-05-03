package mcm.edu.ph.villaflores_multicalculator.ConeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class ConeVolume extends AppCompatActivity implements View.OnClickListener{

    EditText txtVolRadius,txtVolHeight;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_volume);

        txtVolRadius = findViewById(R.id.txtVolRadius);
        txtVolHeight = findViewById(R.id.txtVolHeight);
        calculate = findViewById(R.id.btnCalcConeVolume);
        answer = findViewById(R.id.coneVolumeAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtVolRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtVolHeight.getText()));

        switch (v.getId()) {
            case R.id.btnCalcConeVolume:
                Formulas.coneVolumeFormula(radius,height);
                answer.setText(String.valueOf(Formulas.coneVolumeFormula(radius,height)));
                break;
        }

    }

}