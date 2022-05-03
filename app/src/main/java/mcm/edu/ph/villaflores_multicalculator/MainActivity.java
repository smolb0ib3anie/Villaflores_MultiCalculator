package mcm.edu.ph.villaflores_multicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCuboid,btnCylinder,btnCone,btnSphere,btnOctahedron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCuboid = findViewById(R.id.btnCuboid);
        btnCylinder = findViewById(R.id.btnCylinder);
        btnCone = findViewById(R.id.btnCone);
        btnSphere = findViewById(R.id.btnSphere);
        btnOctahedron = findViewById(R.id.btnOctahedron);

        btnCuboid.setOnClickListener(this);
        btnCylinder.setOnClickListener(this);
        btnCone.setOnClickListener(this);
        btnSphere.setOnClickListener(this);
        btnOctahedron.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){

            case R.id.btnCuboid:
                Intent intent = new Intent(this,Cuboid.class);
                startActivity(intent);
                break;
            case R.id.btnCylinder:
                Intent intent1 = new Intent(this,Cylinder.class);
                startActivity(intent1);
                break;
            case R.id.btnCone:
                Intent intent2 = new Intent(this,Cone.class);
                startActivity(intent2);
                break;
            case R.id.btnSphere:
                Intent intent3 = new Intent(this,Sphere.class);
                startActivity(intent3);
                break;
            case R.id.btnOctahedron:
                Intent intent4 = new Intent(this,Octahedron.class);
                startActivity(intent4);
                break;
        }
    }

}