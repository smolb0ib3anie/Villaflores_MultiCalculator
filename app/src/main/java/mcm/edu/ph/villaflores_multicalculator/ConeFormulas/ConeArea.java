package mcm.edu.ph.villaflores_multicalculator.ConeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class ConeArea extends AppCompatActivity implements View.OnClickListener{

    EditText txtRadius,txtHeight;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_area);

        txtRadius = findViewById(R.id.txtRadius);
        txtHeight = findViewById(R.id.txtHeight);
        calculate = findViewById(R.id.btnCalcConeArea);
        answer = findViewById(R.id.coneAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtHeight.getText()));

        switch (v.getId()) {
            case R.id.btnCalcConeArea:
                Formulas.coneAreaFormula(radius,height);
                answer.setText(String.valueOf(Formulas.coneAreaFormula(radius,height)));
                break;
        }

    }

}