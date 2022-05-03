package mcm.edu.ph.villaflores_multicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.villaflores_multicalculator.OctahedronFormulas.OctahedronArea;
import mcm.edu.ph.villaflores_multicalculator.OctahedronFormulas.OctahedronVolume;

public class Octahedron extends AppCompatActivity implements View.OnClickListener{

    Button btnOctahedronArea,btnOctahedronVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octahedron);

        btnOctahedronArea = findViewById(R.id.btnOctahedronArea);
        btnOctahedronVolume = findViewById(R.id.btnOctahedronVolume);

        btnOctahedronArea.setOnClickListener(this);
        btnOctahedronVolume.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnOctahedronArea:
                Intent intent = new Intent(this, OctahedronArea.class);
                startActivity(intent);
                break;
            case R.id.btnOctahedronVolume:
                Intent intent2 = new Intent(this, OctahedronVolume.class);
                startActivity(intent2);
                break;
        }
    }
}