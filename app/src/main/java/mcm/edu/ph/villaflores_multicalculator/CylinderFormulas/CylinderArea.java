package mcm.edu.ph.villaflores_multicalculator.CylinderFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class CylinderArea extends AppCompatActivity implements View.OnClickListener{

    EditText txtCylinderRadius,txtCylinderHeight;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_area);

        txtCylinderRadius = findViewById(R.id.txtCylinderRadius);
        txtCylinderHeight = findViewById(R.id.txtCylinderHeight);
        calculate = findViewById(R.id.btnCalcCylinderArea);
        answer = findViewById(R.id.cylinderAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtCylinderRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtCylinderHeight.getText()));

        switch (v.getId()) {
            case R.id.btnCalcCylinderArea:
                Formulas.cylinderAreaFormula(radius,height);
                answer.setText(String.valueOf(Formulas.cylinderAreaFormula(radius,height)));
                break;
        }

    }

}