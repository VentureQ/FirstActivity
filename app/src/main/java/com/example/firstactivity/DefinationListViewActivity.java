package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DefinationListViewActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defination_list_view);
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(DefinationListViewActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit lizi = new Fruit("梨子", R.drawable.fruit_icons_04);
            fruitList.add(lizi);
            Fruit pingguo = new Fruit("苹果", R.drawable.fruit_icons_05);
            fruitList.add(pingguo);
            Fruit xiangjiao = new Fruit("香蕉", R.drawable.fruit_icons_06);
            fruitList.add(xiangjiao);
            Fruit yingtao = new Fruit("樱桃", R.drawable.fruit_icons_07);
            fruitList.add(yingtao);
            Fruit liulian = new Fruit("榴莲", R.drawable.fruit_icons_08);
            fruitList.add(liulian);
            Fruit xigua = new Fruit("西瓜", R.drawable.fruit_icons_09);
            fruitList.add(xigua);
        }
    }


}