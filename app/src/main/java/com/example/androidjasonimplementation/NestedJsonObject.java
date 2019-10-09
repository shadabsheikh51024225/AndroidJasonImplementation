package com.example.androidjasonimplementation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import Pojo.Address;
import Pojo.Employee;

public class NestedJsonObject extends AppCompatActivity {


    // DOTN FORGET TO CHANGE LAUNCHER ACTIVITY IN MANIFEST.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         *   >>>>>>>>>>>>>>>>>>>>>>>>>>>> DEMONSTRATION TO NESTED JSON OBJECT <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         *
         */


        //get the jason object

        Gson gson = new Gson();


        //get address class constructor.

        Address address = new Address("indore","India");

        //get constructor of Employee and nested with Adress constructor data.

        Employee employee = new Employee("shadab","shadabshiekh07@gmai.com",29,address);


        String json = gson.toJson(employee);
        /**
         *
         *  DEBUG VALUE TO ABOVE STATEMENT.
         *
         *  {
         *   "FirstName": "shadab",
         *   "address": {
         *     "city": "India",
         *     "country": "indore"
         *   },
         *   "age": 29,
         *   "mail": "shadabshiekh07@gmai.com"
         * }
         *
         *  nested address object.
         */




    }

}
