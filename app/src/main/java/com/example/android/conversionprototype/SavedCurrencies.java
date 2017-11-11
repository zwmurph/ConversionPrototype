package com.example.android.conversionprototype;

public class SavedCurrencies {

    /**
     * Declare private variables for this class to use
     */
    private String mBaseCurrencyValue;
    private String mConversionCurrencyValue;
    private String mDate;

    /**
     * Create the constructor for this class, a constructor creates an instance of a class
     * This constructor will create an instance of two Strings
     */
    public SavedCurrencies(String baseCurrencyValue, String conversionCurrencyValue, String date) {
        mBaseCurrencyValue = baseCurrencyValue;
        mConversionCurrencyValue = conversionCurrencyValue;
        mDate = date;
    }

    /**
     * Custom method
     *
     * @return the user-entered value to convert
     */
    public String getBaseCurrencyValue() {
        return mBaseCurrencyValue;
    }

    /**
     * Custom method
     *
     * @return the converted value
     */
    public String getConversionCurrencyValue() {
        return mConversionCurrencyValue;
    }

    /**
     * Custom method
     *
     * @return the date
     */
    public String getDate() {
        return mDate;
    }
}
