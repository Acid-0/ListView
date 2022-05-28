package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* String [] list = {"ali","ahmad","amna","alex","ali","aahdmad","aldsfi","auuuhmad","amli",
                "irsa","kash","alsh","zindagi","aloo","akhatar","anam"};*/

        ArrayList<String> list = new ArrayList<String>();
        list.add("zubi");
        list.add("kash");
        list.add("aaa");
        list.add("zubi");
        list.add("kash");
        list.add("aaa");
        list.add("zubi");
        list.add("kash");
        list.add("aaa");
        list.add("zubi");
        list.add("kash");
        list.add("aaa");
        list.add("zubi");
        list.add("kash");
        list.add("aaa");
        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

    }
}