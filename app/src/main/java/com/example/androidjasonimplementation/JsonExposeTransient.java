package com.example.androidjasonimplementation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Pojo.Employee;

public class JsonExposeTransient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // DOT'N FORGET TO CHANGE LAUNCHER ACTIVITY IN MANIFEST.

        /**
         *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> DEMONSTRATION TO JSON EXPOSE AND TRANSIENT PROPERTIES   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         */




        //get the jason object

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        //CREATE A EMPLOYEE OBJECT.

        Employee employee = new Employee("shdab","shadabsehikh07@gmail.com",28,"rock","male","toronto");


        String employee1 = gson.toJson(employee);


        /**
         *
         *  DEBUG VALUE TO ABOVE STATEMENT.
         *
         *
         *  {
         *   "FirstName": "shdab",
         *   "Gender": "male",
         *   "age": 28,
         *   "mail": "shadabsehikh07@gmail.com"
         * }
         *
         *
         * PASSWORD AND CURRENT LOCAITON IS NOT SERIALIZED IN ABOVE EXAMPLE.
         *
         */





        String json = "{\"FirstName\":\"shadab\",\"mail\":\"shadbasheikh07@gmail.com\",\"age\":\"29\",\"password\":\"rock\",\"gender\":\"male\",\"currentlocation\":\"toronto\"}";

        Employee employee2 = gson.fromJson(json,Employee.class);



    }

    }
