package com.example.custom_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.latihan_listview_2.Hero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //a List of type hero for holding list items
    List<Hero> heroList;
    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<com.example.latihan_listview_2.Hero>();
        listView = (ListView) findViewById(R.id.listView);

        //adding some values to our list
        heroList.add(new com.example.latihan_listview_2.Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroList.add(new com.example.latihan_listview_2.Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new com.example.latihan_listview_2.Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new com.example.latihan_listview_2.Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        heroList.add(new com.example.latihan_listview_2.Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new com.example.latihan_listview_2.Hero(R.drawable.batman, "Batman", "Justice League"));

        //creating the adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);
        //attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}