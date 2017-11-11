package com.example.android.conversionprototype;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SavedCurrenciesAdapter extends ArrayAdapter<SavedCurrencies> {

    /**
     * A custom constructor
     *
     * @param context         is used to inflate the layout file
     * @param savedCurrencies is the data we want to populate into the lists
     */
    public SavedCurrenciesAdapter(Activity context, List<SavedCurrencies> savedCurrencies) {
        // This initialises the ArrayAdapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews the adapter is not
        // going to use this second argument, so it can be any value.
        super(context, 0, savedCurrencies);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    is the position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get the data item for this position
        SavedCurrencies savedCurrencies = getItem(position);

        //Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        //Lookup view for data population
        TextView baseCurrencyValueField = (TextView) convertView.findViewById(R.id.baseCurrencyValue);
        TextView conversionCurrencyValueField = (TextView) convertView.findViewById(R.id.conversionCurrencyValue);
        TextView dateField = (TextView) convertView.findViewById(R.id.date);

        //Populate the data into the template view using the data object
        baseCurrencyValueField.setText(savedCurrencies.getBaseCurrencyValue());
        conversionCurrencyValueField.setText(savedCurrencies.getConversionCurrencyValue());
        dateField.setText(savedCurrencies.getDate());

        //Return the completed view to render on-screen
        return convertView;
    }
}
