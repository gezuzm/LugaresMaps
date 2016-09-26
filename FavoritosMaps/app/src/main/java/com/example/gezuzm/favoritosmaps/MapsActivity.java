package com.example.gezuzm.favoritosmaps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.drive.internal.StringListResponse;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final String KEY_LATITUD = "latitud";
    private static final String KEY_LONGITUD = "longitud";
    private static final String KEY_TITULO = "titulo";
    private static final String KEY_ICONO = "icono";
    private static final String KEY_DESCRIPCION = "descripcion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Bundle extras = getIntent().getExtras();
        double latitud   =  extras.getDouble(KEY_LATITUD);
        double longitud    = extras.getDouble(KEY_LONGITUD);
        String titulo    =  extras.getString(KEY_TITULO);
        String descripcion    =  extras.getString(KEY_DESCRIPCION);
        int icono       =   extras.getInt(KEY_ICONO);

        // Add a marker in Sydney and move the camera

        LatLng lugar = new LatLng(latitud, longitud);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar, 15));

        // You can customize the marker image using images bundled with
        // your app, or dynamically generated bitmaps.
        // LatLng lugar = new LatLng(22.138799489946248,-100.97107077654191);
        mMap.addMarker(new MarkerOptions()
                .position(lugar)
                .icon(BitmapDescriptorFactory.fromResource(icono))
                .anchor(0.0f,1.0f)
                .title(titulo)
                .snippet(descripcion));

    }
}
