package mcm.edu.ph.villaflores_multicalculator.CuboidFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.villaflores_multicalculator.Formulas;
import mcm.edu.ph.villaflores_multicalculator.R;

public class CuboidVolume extends AppCompatActivity implements View.OnClickListener{

    EditText txtVolEdge;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid_volume);

        txtVolEdge = findViewById(R.id.txtVolEdge);
        calculate = findViewById(R.id.btnCalcCuboidVolume);
        answer = findViewById(R.id.cuboidVolumeAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(txtVolEdge.getText()));

        switch (v.getId()) {
            case R.id.btnCalcConeVolume:
                Formulas.cuboidVolumeFormula(edge);
                answer.setText(String.valueOf(Formulas.cuboidVolumeFormula(edge)));
                break;
        }

    }

}