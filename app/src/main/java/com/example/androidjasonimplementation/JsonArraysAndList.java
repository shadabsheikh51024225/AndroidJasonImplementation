package com.example.androidjasonimplementation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import Pojo.Address;
import Pojo.Employee;
import Pojo.FamilyMember;

public class JsonArraysAndList  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // DOT'N FORGET TO CHANGE LAUNCHER ACTIVITY IN MANIFEST.



        /**
         *   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> DEMONSTRATION TO JSON ARRAY LIST  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         *
         */

        //get the jason object

        Gson gson = new Gson();


        //get address class constructor.

        Address address = new Address("indore","India");

        //define object for FamilyMember.class


        //define list class and define the members for it.
        List<FamilyMember> familyMembers = new ArrayList<FamilyMember>();
        familyMembers.add(new FamilyMember("sister",26));
        familyMembers.add(new FamilyMember("brother",24));



        //get constructor of Employee and nested with Adress constructor data.

        Employee employee = new Employee("shadab","shadabshiekh07@gmai.com",29,address,familyMembers);



        // create json object.


        String json = gson.toJson(employee);
        /**
         *
         *  DEBUG VALUE TO ABOVE STATEMENT.
         *
         *   {
         *   "FirstName": "shadab",
         *   "address": {
         *     "city": "India",
         *     "country": "indore"
         *   },
         *   "age": 29,
         *   "familyMembers": [
         *     {
         *       "age": 26,
         *       "Role": "sister"
         *     },
         *     {
         *       "age": 24,
         *       "Role": "brother"
         *     }
         *   ],
         *   "mail": "shadabshiekh07@gmai.com"
         * }
         *
         */
    }
}