package mcm.edu.ph.villaflores_multicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.villaflores_multicalculator.SphereFormulas.SphereArea;
import mcm.edu.ph.villaflores_multicalculator.SphereFormulas.SphereVolume;

public class Sphere extends AppCompatActivity implements View.OnClickListener{

    Button btnSphereArea,btnSphereVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        btnSphereArea = findViewById(R.id.btnSphereArea);
        btnSphereVolume = findViewById(R.id.btnSphereVolume);

        btnSphereArea.setOnClickListener(this);
        btnSphereVolume.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnSphereArea:
                Intent intent = new Intent(this, SphereArea.class);
                startActivity(intent);
                break;
            case R.id.btnSphereVolume:
                Intent intent2 = new Intent(this, SphereVolume.class);
                startActivity(intent2);
                break;
        }
    }
}