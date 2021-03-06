package com.example.common;

/**
 * Created by franciswalsh on 7/25/17.
 */
public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCOTBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private final String englishName;

    Month(String englishName){
        this.englishName = englishName;
    }

    public String getEnglishName(){
        return this.englishName;
    }
}
