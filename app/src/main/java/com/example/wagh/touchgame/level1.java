package com.example.wagh.touchgame;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;

/**
 * Created by wagh on 24/7/16.
 */
public class level1 extends AppCompatActivity{

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7;
    RippleBackground rb1,rb2,rb3,rb4,rb5,rb6,rb7;

    TextView show;

    int count,cnt;
    long millis;
    int seconds,minutes;

    int z1,z2,z3,z4,z5,z6,z7=0;

    CountDownTimer t;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);


        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);

        setContentView(R.layout.level1);

        iv1=(ImageView)findViewById(R.id.lvl1iv1);
        iv2=(ImageView)findViewById(R.id.lvl1iv2);
        iv3=(ImageView)findViewById(R.id.lvl1iv3);
        iv4=(ImageView)findViewById(R.id.lvl1iv4);
        iv5=(ImageView)findViewById(R.id.lvl1iv5);
        iv6=(ImageView)findViewById(R.id.lvl1iv6);
        iv7=(ImageView)findViewById(R.id.lvl1iv7);

        rb1=(RippleBackground)findViewById(R.id.lvl1rb1);
        rb2=(RippleBackground)findViewById(R.id.lvl1rb2);
        rb3=(RippleBackground)findViewById(R.id.lvl1rb3);
        rb4=(RippleBackground)findViewById(R.id.lvl1rb4);
        rb5=(RippleBackground)findViewById(R.id.lvl1rb5);
        rb6=(RippleBackground)findViewById(R.id.lvl1rb6);
        rb7=(RippleBackground)findViewById(R.id.lvl1rb7);


        show=(TextView)findViewById(R.id.shownumber);


       starttimer();

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.startRippleAnimation();
                z1=1;
                check();
                show.setText("1");

            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.startRippleAnimation();
                z2=1;
                check();
                show.setText("2");
                 }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb3.startRippleAnimation();
                z3=1;
                check();
                show.setText("3");
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb4.startRippleAnimation();
                z4=1;
                check();
                show.setText("4");
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb5.startRippleAnimation();
                z5=1;
                check();
                show.setText("5");
            }
        });

        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb6.startRippleAnimation();
                z6=1;
                check();
                show.setText("6");
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb7.startRippleAnimation();
                z7=1;
                check();
                show.setText("7");
            }
        });

    }

    public void check()
    {

        if (z1==1 && z2==1 && z3==1 && z4==1 && z5==1 && z6==1 && z7==1)
        {
            t.cancel();

            String result;
            result="\nThis is your time\n";
            result+= String.valueOf(minutes);
            result+= String.valueOf(seconds);
            result+= String.valueOf(millis);
            result+="\n";

            Toast.makeText(level1.this,result,Toast.LENGTH_LONG).show();
        }
    }


   public void starttimer()
    {
        //counting time

                t=new CountDownTimer(Long.MAX_VALUE,1000) {
                @Override
                public void onTick(long l) {

                    cnt++;
                    String time = new Integer(cnt).toString();

                    millis = cnt;
                    seconds = (int) (millis / 60);
                    minutes = seconds / 60;
                    seconds = seconds % 60;

                    //txtcount.setText(String.format("%d:%02d:%02d", minutes, seconds, millis));


                }

                @Override
                public void onFinish() {

                }
            };


            //ends time


            //starts time

            t.start();


    }

    }



