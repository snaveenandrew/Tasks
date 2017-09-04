package com.quitricx.testlt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.quitricx.testlt.R.drawable.image2;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private Marker marker1,marker2,marker3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }
        public void onMapReady(GoogleMap googleMap) {
            try {
        LatLng sydney = new LatLng(-33.852, 151.211);
        LatLng sa = new LatLng(-31.852, 140.211);
        LatLng ls = new LatLng(-20.852, 140.211);
        marker1=googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney").snippet("marker 1"));
        marker2=googleMap.addMarker(new MarkerOptions().position(sa)
                .title("Marker in SA").snippet("marker 2"));
        marker3=googleMap.addMarker(new MarkerOptions().position(ls)
                .title("Marker in SA").snippet("marker 3"));

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener(){
            public boolean onMarkerClick(final Marker marker) {

                    if (marker.equals(marker1)) {
                        int[] p = {R.drawable.image1, image2};
                        Intent intent = new Intent(MainActivity.this, image.class);
                        intent.putExtra("resourseInt", p);
                        startActivity(intent);
                    } else if (marker.equals(marker2)) {
                        int[] p = {R.drawable.image1, image2};
                        Intent intent = new Intent(MainActivity.this, image.class);
                        intent.putExtra("resourseInt", p);
                        startActivity(intent);
                    } else if (marker.equals(marker3)) {
                        int[] p = {R.drawable.image1, image2};
                        Intent intent = new Intent(MainActivity.this, image.class);
                        intent.putExtra("resourseInt", p);
                        startActivity(intent);
                    }

                    return true;

            }
        });
            }catch (Exception e){
                Toast.makeText(getApplication(),e.toString(),Toast.LENGTH_LONG);
            }
    }
}


