package com.example.myapplicationweek9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

//        Intent intent2 = getIntent();
//        String data_get = intent2.getStringExtra("hello");
//        int id = intent2.getIntExtra("id",0);
//        Log.d("LSQ",data_get + id);

/*        Button btn2 = findViewById(R.id.Button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent();
                intent3.putExtra("data_return","Hello FirstActivity!");
                setResult(RESULT_OK,intent3);
                finish();
            }
        });*/

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Message");
        String name = bundle.getString("name");
        int id = bundle.getInt("id",0);
        Log.d("LSQ",name + id);
    }
}