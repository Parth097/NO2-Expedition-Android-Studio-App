package com.example.parthsharma.no2expedition;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        double currentLatitude = 51.556957;
        double currentLongitude = -0.279673;

        LatLng london = new LatLng(currentLatitude, currentLongitude);
        mMap.addMarker(new MarkerOptions().position(london).title("Marker at Wembley Stadium, London"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(london));


        LatLng latLng = new LatLng(currentLatitude, currentLongitude);

        float zoomLevel1 = (float) 15.0;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel1));



    }
}
