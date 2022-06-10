package com.example.firstactivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.bt1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"pressed",Toast.LENGTH_LONG).show();

                //显示Intent跳转
                //Intent intent=new Intent(MainActivity.this,SecondActivity.class);

                //隐式Intent跳转
//                Intent intent=new Intent("com.example.activitytest.ACTION_START");
//                intent.addCategory("android.intent.category.DEFAULT");

                //调用系统资源
//                Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("https://www.baidu.com"));//打开网页
//                intent.setData(Uri.parse("tel:10086"));//拨号

                //Intent传输数据
                String data="Date exchange";
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(MainActivity.this,"add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(MainActivity.this,"remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

}