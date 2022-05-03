package mcm.edu.ph.villaflores_multicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.villaflores_multicalculator.CuboidFormulas.CuboidArea;
import mcm.edu.ph.villaflores_multicalculator.CuboidFormulas.CuboidVolume;

public class Cuboid extends AppCompatActivity implements View.OnClickListener{

    Button btnCuboidArea,btnCuboidVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        btnCuboidArea = findViewById(R.id.btnCuboidArea);
        btnCuboidVolume = findViewById(R.id.btnCuboidVolume);

        btnCuboidArea.setOnClickListener(this);
        btnCuboidVolume.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btnCuboidArea:
                Intent intent = new Intent(this, CuboidArea.class);
                startActivity(intent);
                break;
            case R.id.btnCuboidVolume:
                Intent intent2 = new Intent(this, CuboidVolume.class);
                startActivity(intent2);
                break;
        }
    }
}