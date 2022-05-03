package mcm.edu.ph.villaflores_multicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.villaflores_multicalculator.CylinderFormulas.CylinderArea;
import mcm.edu.ph.villaflores_multicalculator.CylinderFormulas.CylinderVolume;

public class Cylinder extends AppCompatActivity implements View.OnClickListener{

    Button btnCylinderArea,btnCylinderVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        btnCylinderArea = findViewById(R.id.btnCylinderArea);
        btnCylinderVolume = findViewById(R.id.btnCylinderVolume);

        btnCylinderArea.setOnClickListener(this);
        btnCylinderVolume.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnCylinderArea:
                Intent intent = new Intent(this, CylinderArea.class);
                startActivity(intent);
                break;
            case R.id.btnCylinderVolume:
                Intent intent2 = new Intent(this, CylinderVolume.class);
                startActivity(intent2);
                break;
        }
    }
}