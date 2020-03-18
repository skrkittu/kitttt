package com.example.loginscreenp2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1,b2;
int count =3;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.edittext);
        e2=(EditText)findViewById(R.id.edittext2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.textview);
        t.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("ADMIN")&&e2.getText().toString().equals("ADMIN")){
                    Toast.makeText(getApplicationContext(),"redirecting...",Toast.LENGTH_SHORT).show();
                }
                else{
                    count--;
                    t.setVisibility(View.VISIBLE);
                    t.setBackgroundColor(Color.RED);
                    t.setText(""+count);
                    if(count==0){
                        b1.setEnabled(false);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
