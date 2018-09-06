package com.example.admin1.apirecyclerapplication.webservices;

import com.example.admin1.apirecyclerapplication.models.FirstModel;

import java.util.ArrayList;

public class JsonResponse {

    public static final String SUCCESS = "success";
    public static final String FAILURE = "failure";

    public String result;

    public ArrayList<FirstModel> contacts;
}
