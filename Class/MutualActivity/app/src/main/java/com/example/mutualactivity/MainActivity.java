package com.example.mutualactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        Button BtnNewActivity=(Button)findViewById(R.id.BtnNew);
        BtnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Num1=(EditText)findViewById(R.id.Num1);
                EditText Num2=(EditText)findViewById(R.id.Num2);
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                 intent.putExtra("Num1",Integer.parseInt(Num1.getText().toString()))  ;
                 intent.putExtra("Num2",Integer.parseInt(Num2.getText().toString()));
                 startActivityForResult(intent,0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            int hap=data.getIntExtra("Hap",0);
            Toast.makeText(getApplicationContext(),"합계 :"+hap,Toast.LENGTH_SHORT).show();
        }
    }
}