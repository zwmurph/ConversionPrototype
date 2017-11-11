package com.example.android.conversionprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Create the ArrayList, so it can be used with objects
        List<SavedCurrencies> savedCurrencies = new ArrayList<>();
        //Populate the ArrayList
        savedCurrencies.add(new SavedCurrencies("£1", "$1.20", "04 Sep 2015"));
        savedCurrencies.add(new SavedCurrencies("£12", "€15,30", "21 Aug 2016"));
        savedCurrencies.add(new SavedCurrencies("£510", "¥1683", "14 Jan 2017"));

        //Creates an adapter for the values to use, appends the array of values to the adapter,
        //the adapter is responsible for making a View for each item in the data set
        SavedCurrenciesAdapter adapter = new SavedCurrenciesAdapter(this, savedCurrencies);
        //Creates a object constructor for the ListView
        ListView listView = (ListView) findViewById(R.id.root_list_view);
        //Sets the adapter method on the ListView
        listView.setAdapter(adapter);
    }
}
