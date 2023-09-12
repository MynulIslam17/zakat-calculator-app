package com.noyon.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity2 extends AppCompatActivity {




    Button totalCal;

    EditText goldCurrentPrice,silverCurrentPrice,goldVuri,goldAna,goldRoti;
    EditText silverVuri,silverAna,silverRoti;

    EditText nogodTaka,biyerTaka,bankTaka,rakhaTaka,petTaka,varaTaka,dokanerTaka,ownerTaka,shareTaka;
    EditText rinTaka,betonTaka,billTaka,onadayiTaka;

    public  static String sgoldCurrentPrice;
    public static  String sSilverCurrentPrice;



    public static String sGoldInVuri;
    public static String sGoldInAna;
    public static  String sGoldINRoti;

    public static String  sSilverInvuri;
    public static String sSilverInAna;
    public static String sSilverInRoti;

    public static  String sNogodTaka;
    public static String sBiyerTaka;
    public static String sBankTaka;
    public static String sRakhaTaka;
    public static String sPetTaka;
    public static String sVaraTaka;
    public static String sDokanerTaka;
    public static String sOwnerTaka;
    public static String sShareTaka;
    public  static String sRinTaka;
    public static String sBetonTaka;
    public static String sBillTaka;
     public static String sOnadayiTaka;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //make relation to the xml

        totalCal=findViewById(R.id.totalCal);
        goldCurrentPrice=findViewById(R.id.goldCurrentPrice);
        silverCurrentPrice=findViewById(R.id.silverCurrentPrice);
        goldVuri=findViewById(R.id.goldVuri);
        goldAna=findViewById(R.id.goldAna);
        goldRoti=findViewById(R.id.goldRoti);
        silverVuri=findViewById(R.id.silverVuri);
        silverAna=findViewById(R.id.silverAna);
        silverRoti=findViewById(R.id.silverRoti);
        nogodTaka=findViewById(R.id.nogodTaka);
        biyerTaka=findViewById(R.id.biyerTaka);
        bankTaka=findViewById(R.id.bankTaka);
        rakhaTaka=findViewById(R.id.rakhaTaka);
        petTaka=findViewById(R.id.petTaka);
        varaTaka=findViewById(R.id.varaTaka);
        dokanerTaka=findViewById(R.id.dokanerTaka);
        ownerTaka=findViewById(R.id.ownerTaka);
        shareTaka=findViewById(R.id.shareTaka);
        rinTaka=findViewById(R.id.rinTaka);
        betonTaka=findViewById(R.id.betonTaka);
        billTaka=findViewById(R.id.billTaka);
        onadayiTaka=findViewById(R.id.ondayiTaka);


        totalCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting all value from editText as string
                 //market price of gold/silver
                 sgoldCurrentPrice=goldCurrentPrice.getText().toString();//get gold current price as string

                 sSilverCurrentPrice=silverCurrentPrice.getText().toString(); //get silver current price as String

                // amount of my gold/silver

                  sGoldInVuri=goldVuri.getText().toString();
                  sGoldInAna=goldAna.getText().toString();
                  sGoldINRoti=goldRoti.getText().toString();

                  sSilverInvuri=silverVuri.getText().toString();
                  sSilverInAna=silverAna.getText().toString();
                  sSilverInRoti=silverRoti.getText().toString();

                  //-------end------

                 //collecting all information edtextText as string
                  sNogodTaka=nogodTaka.getText().toString();
                  sBiyerTaka=biyerTaka.getText().toString();
                  sBankTaka=bankTaka.getText().toString();

                  sRakhaTaka=rakhaTaka.getText().toString();
                  sPetTaka=petTaka.getText().toString();
                  sVaraTaka =varaTaka.getText().toString();
                  sDokanerTaka=dokanerTaka.getText().toString();

                  sOwnerTaka=ownerTaka.getText().toString();
                  sShareTaka=shareTaka.getText().toString();

                  sRinTaka=rinTaka.getText().toString();
                  sBetonTaka=betonTaka.getText().toString();
                  sBillTaka=billTaka.getText().toString();
                  sOnadayiTaka=onadayiTaka.getText().toString();






                Intent myIntent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(myIntent);












            }
        });


    }
}