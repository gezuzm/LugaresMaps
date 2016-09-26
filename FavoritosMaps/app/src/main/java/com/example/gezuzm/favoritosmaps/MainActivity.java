package com.example.gezuzm.favoritosmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ir(View v)
    {

        Intent i  = new Intent(this, MapsActivity.class);

        switch (v.getId())
        {

            case R.id.btnIrCentroArtes:

                i.putExtra("latitud", 22.138799489946248);
                i.putExtra("longitud",-100.97107077654191);
                i.putExtra("titulo","Casa de la Cultura");
                i.putExtra("icono",R.drawable.casa_cultura);
                i.putExtra("descripcion","Casa de la Cultura");

                startActivity(i);

                break;

            case R.id.btnIrParque:

                i.putExtra("latitud", 22.131512321055187);
                i.putExtra("longitud",-100.99884505089112 );
                i.putExtra("titulo","Parque");
                i.putExtra("icono",R.drawable.parque_icon);
                i.putExtra("descripcion","Tangamanga I");

                startActivity(i);

                break;


            case R.id.btnIrTeatro:

                i.putExtra("latitud", 22.150930522623643);
                i.putExtra("longitud",-100.97364837940522);
                i.putExtra("titulo","Teatro");
                i.putExtra("icono",R.drawable.teatro);
                i.putExtra("descripcion","Juárez");

                startActivity(i);

                break;

            case R.id.btnIrUniversidad:

                i.putExtra("latitud", 22.152500514160135);
                i.putExtra("longitud",-100.97802574451752);
                i.putExtra("titulo","Universidad");
                i.putExtra("icono",R.drawable.universidad_icon);
                i.putExtra("descripcion","UASLP");

                startActivity(i);

                break;


        }

    }

}
