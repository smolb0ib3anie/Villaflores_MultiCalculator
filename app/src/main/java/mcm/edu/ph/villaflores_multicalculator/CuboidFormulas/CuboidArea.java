package mcm.edu.ph.villaflores_multicalculator.CuboidFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class CuboidArea extends AppCompatActivity implements View.OnClickListener{

    EditText txtEdge;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid_area);

        txtEdge = findViewById(R.id.txtEdge);
        calculate = findViewById(R.id.btnCalcCuboidArea);
        answer = findViewById(R.id.cuboidAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(txtEdge.getText()));

        switch (v.getId()) {
            case R.id.btnCalcCuboidArea:
                Formulas.cuboidAreaFormula(edge);
                answer.setText(String.valueOf(Formulas.cuboidAreaFormula(edge)));
                break;
        }

    }

}