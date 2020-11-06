package com.example.myapplicationweek9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first);

        Log.d("LSQ","FirstActivity的onCreate（）函数被调用");

        Button btn1 = findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击进入学校官网
               /*Intent intent1 = new Intent(Intent.ACTION_VIEW);
               intent1.setData(Uri.parse("http://www.tfswufe.edu.cn"));
               startActivity(intent1);*/

               //拨打电话
                /*Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:10086"));
                startActivity(intent1);*/


               /*Intent intent1 = new Intent("com.example.MyApplicationweek9.MY_ACTION");
                intent1.addCategory("android.intent.category.DEFAULT");
                startActivity(intent1);*/

               /*String data = "Hello SecondActivity!";
               Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               intent.putExtra("hello",data);
               intent.putExtra("id",123);
               startActivityForResult(intent,1);*/


               Bundle bundle = new Bundle();
               bundle.putString("name","LSQPL");
               bundle.putInt("id",121);
               Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               intent.putExtra("Message",bundle);
               startActivity(intent);
            }
        });
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("LSQ",returnedData);
                }
        }
    }*/
}