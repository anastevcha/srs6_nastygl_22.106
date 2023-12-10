package com.example.srs6_nastygl_22106;

public class Weather {
    String date;
    String temp;
    String we;
    String veter;

    public Weather(String date, String temp, String we, String veter)
    {
        this.date= date;
        this.temp= temp;
        this.we= we;
        this.veter = veter;
    }
    public String GetDate()
    {
        return this.date;
    }
    public void SetDate(String date)
    {
        this.date= date;
    }
    public String GetUrl()
    {
        return this.we;
    }
    public String GetTemp()
    {
        return this.temp;
    }

    public String GetVeter() {return this.veter;}

}