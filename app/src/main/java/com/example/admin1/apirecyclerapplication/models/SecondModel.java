package com.example.admin1.apirecyclerapplication.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SecondModel implements Serializable{

    @SerializedName("mobile")
    public String mobile;

    @SerializedName("home")
    public String home;

    @SerializedName("office")
    public String office;

    public String getMobile() {
        return mobile;
    }

    public String getHome() {
        return home;
    }

    public String getOffice() {
        return office;
    }
}
