package com.example.admin1.apirecyclerapplication.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FirstModel implements Serializable {

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    @SerializedName("address")
    public String address;

    @SerializedName("gender")
    public String gender;

    public SecondModel phone;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

}
