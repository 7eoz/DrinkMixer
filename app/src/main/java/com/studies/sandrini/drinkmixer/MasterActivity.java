package com.studies.sandrini.drinkmixer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MasterActivity extends AppCompatActivity {

    ListView drinkList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        drinkList = (ListView) findViewById(R.id.drink_list);

        String[] drinks= new String[]{"The Real Mojito", "Margaritas", "Pretty in Pink Sangria"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, drinks);
        drinkList.setAdapter(adapter);

        drinkList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MasterActivity.this, DetailActivity.class);
                intent.putExtra("drink", position);
                startActivity(intent);
            }
        });

    }
}
