package mcm.edu.ph.villaflores_multicalculator.SphereFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class SphereArea extends AppCompatActivity implements View.OnClickListener{

    EditText txtSphereRadius;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_area);

        txtSphereRadius = findViewById(R.id.txtSphereRadius);
        calculate = findViewById(R.id.btnCalcSphereArea);
        answer = findViewById(R.id.sphereAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(txtSphereRadius.getText()));

        switch (v.getId()) {
            case R.id.btnCalcSphereArea:
                Formulas.sphereAreaFormula(radius);
                answer.setText(String.valueOf(Formulas.sphereAreaFormula(radius)));
                break;
        }

    }

}