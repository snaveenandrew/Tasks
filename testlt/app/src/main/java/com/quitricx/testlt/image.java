package com.quitricx.testlt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class image extends AppCompatActivity {

    private ViewFlipper myViewFlipper;
    private float initialXPoint;
    int[] p;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ViewFlipper myViewFlipper;
        Bundle extras = getIntent().getExtras();
        p = extras.getIntArray("resourseInt");
        getIntent().removeExtra("resourseInt");
        myViewFlipper = (ViewFlipper) findViewById(R.id.myflipper);

        for (int i = 0; i < p.length; i++) {
            ImageView imageView = new ImageView(image.this);
            imageView.setImageResource(p[i]);
            myViewFlipper.addView(imageView);
            myViewFlipper.setAutoStart(true);
            myViewFlipper.setFlipInterval(3000);
            myViewFlipper.startFlipping();
        }
    }
}
