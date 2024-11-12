package com.example.xo;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    TextView Res;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Vibrator vibrator;
    int flag =0;
    int count =0;
    int winner =0;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.again).setVisibility(View.GONE);
        init();
        vibrator =(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void PlayAgain(View v) {
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        count =0;
        winner=0;
        flag =0;
        Res.setText("");
        Res.setBackgroundColor(Color.TRANSPARENT);
    }

    public void init(){
        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button9);
        Res = findViewById(R.id.result);
    }

    @SuppressLint("ResourceAsColor")
    public void check(View v){
        Button btncheck = (Button) v;
        if(flag==0){
            btncheck.setText("X");
            count++;
            flag=1;
        }else{
            btncheck.setText("O");
            count++;
            flag=0;
        }
        if(count>4){
            b1 = bt1.getText().toString();
            b2 = bt2.getText().toString();
            b3=  bt3.getText().toString();
            b4 = bt4.getText().toString();
            b5 = bt5.getText().toString();
            b6 = bt6.getText().toString();
            b7 = bt7.getText().toString();
            b8 = bt8.getText().toString();
            b9 = bt9.getText().toString();
            if(b1.equals(b2)&&b2.equals(b3)&& !b1.isEmpty()){
                winner =1;
                bt4.setText("");
                bt5.setText("");
                bt6.setText("");
                bt7.setText("");
                bt8.setText("");
                bt9.setText("");
                Res.setTextColor(Color.GREEN);
                findViewById(R.id.again).setVisibility(View.VISIBLE);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b1 + "'");
            }else if(b4.equals(b1)&&b7.equals(b4)&& !b4.isEmpty()){
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b4 + "'");
                bt2.setText("");
                bt3.setText("");
                bt5.setText("");
                bt6.setText("");
                bt8.setText("");
                bt9.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }else if(b5.equals(b4)&&b4.equals(b6)&& !b4.isEmpty()){
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b5 + "'");
                bt1.setText("");
                bt2.setText("");
                bt3.setText("");
                bt7.setText("");
                bt8.setText("");
                bt9.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }else if(b2.equals(b5)&&b5.equals(b8)&& !b2.isEmpty()){
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b2 + "'");
                bt1.setText("");
                bt4.setText("");
                bt7.setText("");
                bt3.setText("");
                bt6.setText("");
                bt9.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }else if(b7.equals(b8)&&b8.equals(b9)&& !b7.isEmpty()){
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b7 + "'");
                bt1.setText("");
                bt2.setText("");
                bt3.setText("");
                bt4.setText("");
                bt5.setText("");
                bt6.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }else if(!b3.isEmpty() &&b3.equals(b6)&&b6.equals(b9)){
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b3 + "'");
                bt1.setText("");
                bt4.setText("");
                bt7.setText("");
                bt2.setText("");
                bt5.setText("");
                bt8.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }else if(!b1.isEmpty() &&b1.equals(b5)&&b5.equals(b9)){
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b1 + "'");
                bt2.setText("");
                bt3.setText("");
                bt4.setText("");
                bt6.setText("");
                bt7.setText("");
                bt8.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }else if(!b7.isEmpty() &&b7.equals(b5)&&b5.equals(b3)) {
                winner =1;
                Res.setTextColor(Color.GREEN);
                Res.setBackgroundColor(Color.parseColor("#ffffff"));
                Res.setText("  Winner " + "'" + b7 + "'");
                bt1.setText("");
                bt2.setText("");
                bt4.setText("");
                bt6.setText("");
                bt8.setText("");
                bt9.setText("");
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }
          else if(count==7){
                Res.setText(" Match Draw!!"+" ");
                winner=2;
                bt1.setClickable(false);
                bt2.setClickable(false);
                bt3.setClickable(false);
                bt4.setClickable(false);
                bt5.setClickable(false);
                bt6.setClickable(false);
                bt7.setClickable(false);
                bt8.setClickable(false);
                bt9.setClickable(false);
                findViewById(R.id.again).setVisibility(View.VISIBLE);
            }
        }
        if(winner==1){
            vibrator.vibrate(600);
        }
        else if(winner==2){
            vibrator.vibrate(300);

        }
    }
}