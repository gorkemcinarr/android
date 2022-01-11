package com.example.myapplication;
public class HavaDurumu {

    private String DATE_TIME;
    private String OBSERVATORY_NAME;
    private double AVERAGE_TEMPERATURE;
    private double AVERAGE_HUMIDITY;


    public HavaDurumu(String DATE_TIME, String OBSERVATORY_NAME, double AVERAGE_TEMPERATURE, double AVERAGE_HUMIDITY) {
        this.DATE_TIME = DATE_TIME;
        this.OBSERVATORY_NAME = OBSERVATORY_NAME;
        this.AVERAGE_TEMPERATURE = AVERAGE_TEMPERATURE;
        this.AVERAGE_HUMIDITY = AVERAGE_HUMIDITY;
    }

    @Override
    public String toString() {
        return "HavaDurumu{" +
                "DATE_TIME=" + DATE_TIME +
                ", OBSERVATORY_NAME=" + OBSERVATORY_NAME +
                ", AVERAGE_TEMPERATURE=" + AVERAGE_TEMPERATURE +
                ", AVERAGE_HUMIDITY=" + AVERAGE_HUMIDITY +
                '}';
    }
}


