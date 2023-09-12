package com.noyon.zakatcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout title1,title2,title3,title4;
    ImageView tv1Plus,tv2Plus,tv3Plus,tv4Plus;
    LinearLayout tv1Details,tv2Details,tv3Details,tv4Details;
    Button zakatCal;

    MediaPlayer mp;

    //start onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign xml to java
        title1=findViewById(R.id.title1);
        tv1Plus=findViewById(R.id.tv1Plus);
        tv1Details=findViewById(R.id.tv1Details);
        title2=findViewById(R.id.title2);
        tv2Plus=findViewById(R.id.tv2Plus);
        tv2Details=findViewById(R.id.tv2Details);
        title3=findViewById(R.id.title3);
        title4=findViewById(R.id.title4);
        tv3Plus=findViewById(R.id.tv3Plus);
        tv4Plus=findViewById(R.id.tv4Plus);
        tv3Details=findViewById(R.id.tv3Details);
        tv4Details=findViewById(R.id.tv4Details);
        zakatCal=findViewById(R.id.zakatCal);


        //animationn declare
        Animation translate_anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate_anim);

         //set animation
         title1.setAnimation(translate_anim);
         title2.setAnimation(translate_anim);
         title3.setAnimation(translate_anim);
         title4.setAnimation(translate_anim);



        //set on click event

        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound effect

                if(mp!=null){
                    mp.release();
                }
                mp=MediaPlayer.create(MainActivity.this,R.raw.musictouch);
                mp.start();



         //checking if other title have open tag then make it close without title1

           if(title2.getTag().toString().contains("Open")){
               title2.setTag("Closed");
           }

           if(title3.getTag().toString().contains("Open")){
               title3.setTag("Closed");
           }

           if(title4.getTag().toString().contains("Open")){
               title4.setTag("Closed");
           }



                  if(title1.getTag()!=null && title1.getTag().toString().contains("Closed")){

                      tv1Plus.setImageResource(R.drawable.minus);
                      tv1Details.setVisibility(View.VISIBLE);
                      tv2Details.setVisibility(View.GONE);
                      tv2Plus.setImageResource(R.drawable.plus);
                      tv4Details.setVisibility(View.GONE);
                      tv4Plus.setImageResource(R.drawable.plus);
                      tv3Details.setVisibility(View.GONE);
                      tv3Plus.setImageResource(R.drawable.plus);
                      title1.setTag("Open");


                  }

                  else {
                      title1.setTag("Closed");
                      tv1Details.setVisibility(View.GONE);
                      tv1Plus.setImageResource(R.drawable.plus);
                  }






            }
        });


        title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound effect
                if(mp!=null){
                    mp.release();
                }
                mp=MediaPlayer.create(MainActivity.this,R.raw.musictouch);
                mp.start();

                //check if other title has tag="open" or not without title2

                if(title1.getTag().toString() .contains("Open") ){
                    title1.setTag("Closed");
                }

                if(title3.getTag().toString().contains("Open")){
                    title3.setTag("Closed");
                }
                if(title4.getTag().toString().contains("Open")){
                    title2.setTag("Closed");
                }


          //if tag closed then it will execute this operation

              if(title2.getTag()!=null && title2.getTag().toString().contains("Closed")) {



                  tv1Plus.setImageResource(R.drawable.plus);
                  tv1Details.setVisibility(View.GONE);
                  tv2Details.setVisibility(View.VISIBLE);
                  tv2Plus.setImageResource(R.drawable.minus);
                  tv4Plus.setImageResource(R.drawable.plus);
                  tv4Details.setVisibility(View.GONE);
                  tv3Details.setVisibility(View.GONE);
                  tv3Plus.setImageResource(R.drawable.plus);
                  title2.setTag("Open");
              }
              else{
                  title2.setTag("Closed");
                  tv2Details.setVisibility(View.GONE);
                  tv2Plus.setImageResource(R.drawable.plus);


              }

            }
        });


        title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound effect
                 if(mp!=null){
                     mp.release();
                 }
                mp=MediaPlayer.create(MainActivity.this,R.raw.musictouch);
                mp.start();

                //check if other  title have open tag without title3 then  closed it

                if(title1.getTag().toString().contains("Open")){
                    title1.setTag("Closed");
                }
                if(title2.getTag().toString().contains("Open")){
                    title2.setTag("Closed");
                }
                if(title4.getTag().toString().contains("Open")){
                    title4.setTag("Closed");

                }


                //first click e aita execute hobe
                if(title3.getTag()!=null && title3.getTag().toString().contains("Closed")) {

                    tv3Details.setVisibility(View.VISIBLE);
                    tv3Plus.setImageResource(R.drawable.minus);
                    tv1Details.setVisibility(View.GONE);
                    tv2Details.setVisibility(View.GONE);
                    tv4Details.setVisibility(View.GONE);
                    tv1Plus.setImageResource(R.drawable.plus);
                    tv2Plus.setImageResource(R.drawable.plus);
                    tv4Plus.setImageResource(R.drawable.plus);
                    title3.setTag("Open");

                }

                //2nd time click e aita execute hove
                else{
                    title3.setTag("Closed");
                    tv3Details.setVisibility(View.GONE);
                    tv3Plus.setImageResource(R.drawable.plus);


                }

            }
        });


        title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound effect
                if(mp!=null){
                    mp.release();
                }
                mp=MediaPlayer.create(MainActivity.this,R.raw.musictouch);
                mp.start();

                //check if other title have Open tag without title4 then closed it
                if(title1.getTag().toString().contains("Open")){
                    title1.setTag("Closed");
                }
                if(title2.getTag().toString().contains("Open")){
                    title2.setTag("Closed");
                }
                if(title3.getTag().toString().contains("Open")){
                    title3.setTag("Closed");
                }



                //first click e aita execute hobe
                if(title4.getTag()!=null && title4.getTag().toString().contains("Closed")) {
                    tv4Details.setVisibility(View.VISIBLE);
                    tv4Plus.setImageResource(R.drawable.minus);
                    tv1Plus.setImageResource(R.drawable.plus);
                    tv1Details.setVisibility(View.GONE);
                    tv2Details.setVisibility(View.GONE);
                    tv2Plus.setImageResource(R.drawable.plus);
                    tv3Details.setVisibility(View.GONE);
                    tv3Plus.setImageResource(R.drawable.plus);
                    title4.setTag("Open");
                }
                //2nd click e aita execute hobe
                else{
                    tv4Details.setVisibility( View.GONE);
                    tv4Plus.setImageResource(R.drawable.plus);
                    title4.setTag("Closed");

                }



            }
        });


       zakatCal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(mp!=null){
                   mp.release();
               }
               mp=MediaPlayer.create(MainActivity.this,R.raw.touch2);
               mp.start();
               Intent myIntent=new Intent(MainActivity.this,MainActivity2.class);
               startActivity(myIntent);
           }
       });



    }

    //----------end ooCreate method



    //-----------------start backPress method----------------


    @Override
    public void onBackPressed() {


      // super.onBackPressed();


        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Confirm Exit!!")
                .setIcon(R.drawable.exit)
                .setMessage("Do you really want to exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                        finishAndRemoveTask();

                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                        dialogInterface.dismiss();
                    }
                })

                .show();





    }



    //-------on backPress method end--------

    



}