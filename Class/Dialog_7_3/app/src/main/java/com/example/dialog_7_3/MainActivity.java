package com.example.dialog_7_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
Button btn=findViewById(R.id.Btn);
EditText dname=findViewById(R.id.DName);
EditText demail=findViewById(R.id.DEmail);
TextView tv=findViewById(R.id.Tv);
View dialog1,toast1;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        dialog1=(View)View.inflate(MainActivity.this,R.layout.dialog1,null);
        AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
        dlg.setTitle("사용자 정보 입력");
        dlg.setView(dialog1);
dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        String userName=dname.getText().toString();
        String userEmail=demail.getText().toString();
        dname.setText(userName);
        demail.setText(userEmail);
    }
});
dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast toast=new Toast(MainActivity.this);
        toast1=(View)View.inflate(MainActivity.this,R.layout.toast1,null);
        tv.setText("취소했습니다.");
        toast.setView(toast1);
        toast.show();
    }
});
    }
});   };
            }
