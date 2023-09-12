package com.noyon.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity3 extends AppCompatActivity {

    TextView givenGoldPrice ,givenSilverPrice,myGold,myGoldValue,mySilver,mySilverValue;

    TextView tvNogodTaka ,tvBiyeTaka,tvBankTaka,tvRakhaTaka,tvPetTaka,tvVaraTaka,tvDokanTaka,tvOwnerTaka,tvShareTaka;

    TextView tvRinTaka,tvBetonTaka,tvBillTaka,tvOnadayiTaka;
    TextView tvTotalProperty,tvResult;
    ImageView backArrow2;

    float totalEarn=0;
    float totalSpend=0;
    float zakatNisab=90017;
    int gMarketPrice,sMarketPrice;


    int goldInVuri,goldInAna,goldInRoti;

    int silverInVuri,silverInAna,silverInRoti;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //relation with xml
        backArrow2=findViewById(R.id.backArrow2);
         givenGoldPrice=findViewById(R.id.givenGoldPrice);
         givenSilverPrice=findViewById(R.id.givenSilverPrice);
         myGold=findViewById(R.id.myGold);
         myGoldValue=findViewById(R.id.myGoldValue);
         mySilver=findViewById(R.id.mySilver);
         mySilverValue=findViewById(R.id.mySilverValue);

         tvNogodTaka=findViewById(R.id.tvNogodTaka);
         tvBiyeTaka=findViewById(R.id.tvBiyeTaka);
         tvBankTaka=findViewById(R.id.tvBankTaka);

         tvRakhaTaka=findViewById(R.id.tvRakaTaka);
         tvPetTaka=findViewById(R.id.tvPetTaka);
         tvVaraTaka=findViewById(R.id.tvVaraTaka);
         tvDokanTaka=findViewById(R.id.tvDokanTaka);

         tvOwnerTaka=findViewById(R.id.tvOwnerTaka);
         tvShareTaka=findViewById(R.id.tvShareTaka);

        tvRinTaka=findViewById(R.id.tvRinTaka);
        tvBetonTaka=findViewById(R.id.tvBetonTaka);
        tvBillTaka=findViewById(R.id.tvBilTaka);
        tvOnadayiTaka=findViewById(R.id.tvOnadyiTaka);

        tvTotalProperty=findViewById(R.id.tvTotalProperty);
        tvResult=findViewById(R.id.tvResult);


         //convert into int current market price of gold

          if(MainActivity2.sgoldCurrentPrice.isEmpty() ){
              givenGoldPrice.setText(" 0 TK");

               gMarketPrice=0;


        }
          else{
              givenGoldPrice.setText(MainActivity2.sgoldCurrentPrice+ " TK");

               gMarketPrice=Integer.parseInt(MainActivity2.sgoldCurrentPrice);

          }


     //convert into int current market price of silver

          if(MainActivity2.sSilverCurrentPrice.isEmpty()){

              givenSilverPrice.setText("0 Tk");

               sMarketPrice=0;
          }

          else{
              givenSilverPrice.setText(MainActivity2.sSilverCurrentPrice+" Tk");

               sMarketPrice=Integer.parseInt(MainActivity2.sSilverCurrentPrice);


          }

          //convert my amount of gold into int

          if(MainActivity2.sGoldInVuri.isEmpty()){
                goldInVuri=0;
          }

          else{
              goldInVuri=Integer.parseInt(MainActivity2.sGoldInVuri);

          }

          if(MainActivity2.sGoldInAna.isEmpty()){
               goldInAna=0;
          }
          else{

               goldInAna=Integer.parseInt(MainActivity2.sGoldInAna);
          }


          if(MainActivity2.sGoldINRoti.isEmpty()){
               goldInRoti=0;
          }

          else{

              goldInRoti=Integer.parseInt(MainActivity2.sGoldINRoti);

          }

          //convert into int currennt market price of silver

         if(MainActivity2.sSilverInvuri.isEmpty()){
             silverInVuri=0;
         }
          else{
              silverInVuri=Integer.parseInt(MainActivity2.sSilverInvuri);

         }


          if(MainActivity2.sSilverInAna.isEmpty()){
              silverInAna=0;
          }
          else{
              silverInAna=Integer.parseInt(MainActivity2.sSilverInAna);
          }


          if(MainActivity2.sSilverInRoti.isEmpty()){
              silverInRoti=0;
          }
          else{
              silverInRoti=Integer.parseInt(MainActivity2.sSilverInRoti);
          }


         //showing Amount of gold i have
          myGold.setText(goldInVuri+  " ভরি " + goldInAna + " আনা " + goldInRoti + " রতি ");

         //calculate and showing the price of my gold

          float totalGold=goldInVuri+((float)1/16)*goldInAna+((float)1/96)*goldInRoti;
          float goldPrice= totalGold*gMarketPrice;

          myGoldValue.setText(String.valueOf(goldPrice));//settext e sudu int/float show korano jay na tai float ke String e convert korlam

         //showing the amount of silver i have
          mySilver.setText(silverInVuri +" ভরি "+ silverInAna + " আনা " +  silverInRoti + " রতি ");

          //calculating and showing the price of silver

         float totalSilver=silverInVuri + ((float)1/16)*silverInAna +((float)1/96)*silverInRoti;
         float silverPrice=sMarketPrice*totalSilver;
         mySilverValue.setText(String.valueOf(silverPrice)); //make the float into string

         totalEarn=silverPrice + goldPrice; //adding to the earning;

         //now convert other String information into int if string is empty then fill it with 0
         //and  also  if String is 0 then no need no adding this to earning

         if(MainActivity2.sNogodTaka.isEmpty()){

             tvNogodTaka.setText("0"+" Tk");
         }
         else{
              int nogodTaka=Integer.parseInt(MainActivity2.sNogodTaka);

              totalEarn=totalEarn+nogodTaka;

              tvNogodTaka.setText(MainActivity2.sNogodTaka+" Tk");

         }

         //--end--

        if(MainActivity2.sBiyerTaka.isEmpty()){

            tvBiyeTaka.setText("0 Tk");

        }
        else{
            int biyerTaka=Integer.parseInt(MainActivity2.sBiyerTaka);

            totalEarn=totalEarn+biyerTaka;

            tvBiyeTaka.setText(MainActivity2.sBiyerTaka+" Tk");

        }
        //--end--

        if(MainActivity2.sBankTaka.isEmpty()){
            tvBankTaka.setText("0 Tk");
        }
        else{
            int bankTaka=Integer.parseInt(MainActivity2.sBankTaka);
            totalEarn=totalEarn+ bankTaka;
            tvBankTaka.setText(MainActivity2.sBankTaka+ " Tk");
        }
        //---end--

        if(MainActivity2.sRakhaTaka.isEmpty()){
            tvRakhaTaka.setText("0 Tk");

        }
        else{
            int rakhaTaka=Integer.parseInt(MainActivity2.sRakhaTaka);

            tvRakhaTaka.setText(MainActivity2.sRakhaTaka+" Tk");
            totalEarn=rakhaTaka +totalEarn;
        }
        //--end--

        if(MainActivity2.sPetTaka.isEmpty()){
            tvPetTaka.setText("0 Tk");
        }
        else {
            int petTaka=Integer.parseInt(MainActivity2.sPetTaka);
            tvPetTaka.setText(MainActivity2.sPetTaka+" Tk");
            totalEarn=totalEarn + petTaka;

        }
        //----end--

        if(MainActivity2.sVaraTaka.isEmpty()){
            tvVaraTaka.setText("0 Tk");
        }
        else{
            int varaTaka=Integer.parseInt(MainActivity2.sVaraTaka);
            tvVaraTaka.setText(MainActivity2.sVaraTaka+" Tk");
            totalEarn=totalEarn + varaTaka;
        }
        //--end--

        if(MainActivity2.sDokanerTaka.isEmpty()){
            tvDokanTaka.setText("0 Tk");

        }
        else{
            int dokaneTaka=Integer.parseInt(MainActivity2.sDokanerTaka);
            totalEarn=totalEarn+dokaneTaka;
            tvDokanTaka.setText(MainActivity2.sDokanerTaka +" Tk");
        }
        //--end--

        if(MainActivity2.sOwnerTaka.isEmpty()){
            tvOwnerTaka.setText("0 Tk");
        }
        else {
            int ownerTaka=Integer.parseInt(MainActivity2.sDokanerTaka);
            totalEarn=totalEarn+ownerTaka;
            tvOwnerTaka.setText(MainActivity2.sOwnerTaka+" Tk");

        }
        //--end--

        if(MainActivity2.sShareTaka.isEmpty()){
            tvShareTaka.setText("0 Tk");
        }

        else{
            int shareTaka=Integer.parseInt(MainActivity2.sShareTaka);
            totalEarn=totalEarn+shareTaka;
            tvShareTaka.setText(MainActivity2.sShareTaka+ " Tk ");
        }
        //---end--

        if(MainActivity2.sRinTaka.isEmpty()){
            tvRinTaka.setText("0 Tk");
        }
        else{
            int rinTaka=Integer.parseInt(MainActivity2.sRinTaka);
            totalSpend=totalSpend+ rinTaka;
            tvRinTaka.setText(MainActivity2.sRinTaka+" Tk");
        }

        //end

        if(MainActivity2.sBetonTaka.isEmpty()){
            tvBetonTaka.setText("0 Tk");
        }
        else{
            int betonTaka=Integer.parseInt(MainActivity2.sBetonTaka);
            tvBetonTaka.setText(MainActivity2.sBetonTaka+" Tk");
            totalSpend=totalSpend +  betonTaka;
        }
        //-----end---

        if(MainActivity2.sBillTaka.isEmpty()){
            tvBillTaka.setText("0 Tk");
        }
        else{
            int billTaka=Integer.parseInt(MainActivity2.sBillTaka);
            tvBillTaka.setText(MainActivity2.sBillTaka +" Tk");
            totalSpend=totalSpend + billTaka;
         }
        //--end--

        if(MainActivity2.sOnadayiTaka.isEmpty()){
            tvOnadayiTaka.setText("0 Tk");
        }
        else{
            int onadayiTaka=Integer.parseInt(MainActivity2.sOnadayiTaka);
            totalSpend=totalSpend + onadayiTaka;
            tvOnadayiTaka.setText(MainActivity2.sOnadayiTaka+" Tk");
        }
        //---end--

        //showing the remaining  money after subtract from totalSpend
        float remainingMoney= totalEarn -  totalSpend;
        tvTotalProperty.setText(remainingMoney + " Tk");

        //checking if zakat is foroz or not

        if(remainingMoney>=zakatNisab){

            float zakat=  (2.5f/100) * remainingMoney;

            tvResult.setText("আপনার ওপর যাকাত ফরজ হয়েছে। \nআপনার যাকাতের পরিমাণ : "+zakat);

        }

        else{
            tvResult.setText("আপনার উপর যাকাত ফরজ হয়নি।");
        }

        //---end=-
        backArrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}