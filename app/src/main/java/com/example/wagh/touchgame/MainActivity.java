package com.example.wagh.touchgame;

import android.content.Intent;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {


    Button start;
    TextView displaytitle;
    ImageView show;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.start);

        show=(ImageView)findViewById(R.id.iv1);
        RippleBackground rippleBackground=(RippleBackground)findViewById(R.id.rb1);
        rippleBackground.startRippleAnimation();



            YoYo.with(Techniques.Shake).duration(1000).playOn(findViewById(R.id.activitymaintitlename));


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii= new Intent(MainActivity.this,level1.class);

                startActivity(ii);
            }
        });



    }
}
