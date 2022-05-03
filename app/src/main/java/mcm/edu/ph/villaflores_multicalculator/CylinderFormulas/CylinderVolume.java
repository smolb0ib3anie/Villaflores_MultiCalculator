package mcm.edu.ph.villaflores_multicalculator.CylinderFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class CylinderVolume extends AppCompatActivity implements View.OnClickListener{

    EditText txtCylinderVolRadius,txtCylinderVolHeight;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);

        txtCylinderVolRadius = findViewById(R.id.txtCylinderVolRadius);
        txtCylinderVolHeight = findViewById(R.id.txtCylinderVolHeight);
        calculate = findViewById(R.id.btnCalcCylinderVolume);
        answer = findViewById(R.id.cylinderVolumeAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtCylinderVolRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtCylinderVolHeight.getText()));

        switch (v.getId()) {
            case R.id.btnCalcCylinderVolume:
                Formulas.cylinderVolumeFormula(radius,height);
                answer.setText(String.valueOf(Formulas.cylinderVolumeFormula(radius,height)));
                break;
        }

    }

}