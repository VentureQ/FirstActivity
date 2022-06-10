package com.example.firstactivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String data=getIntent().getStringExtra("extra_data");
        Log.d("extra",data);

        button=(Button) findViewById(R.id.bt_2);
        editText=(EditText) findViewById(R.id.et1);
        imageView=(ImageView) findViewById(R.id.iv1);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=editText.getText().toString();
                Toast.makeText(SecondActivity.this,text,Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.mhl);
                if(progressBar.getVisibility()==View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }

            }
        });
    }



}
