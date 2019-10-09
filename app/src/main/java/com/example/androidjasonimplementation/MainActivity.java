package com.example.androidjasonimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import Pojo.Employee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         *  >>>>>>>>>>>>>>>>>>>>>> JAVA SCRIPT OBJECT NOTATION (JASON)<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         *
         *
         *  - its language Independent format
         *  - text base
         *  - light weight
         *  - data interchange format.
         *  - jason object are easily readable.
         *  - supports key value pair formation for data exchange
         *  - jason array []
         *  -jason object {}
         *
         *  ---------------------------------------------------------------------------------------------
         *
         *
         *        DESERIALIZE AND SERIALIZE THE JAVA OBJECT.
         */



        //get the jason object

        Gson gson = new Gson();

        //get the pojo constructor.

        Employee employee = new Employee("shadab","shadabsheikh07@gmail.com",29 );

        //turn java object to jason object serialize.

        String json = gson.toJson(employee);

        /**
         *  ------------------------ DEBUG OUTPUT -------------------------------
         *
         *  the above operation will generate json object for respected constructor.
         *
         *  {
         *   "FirstName": "shadab",
         *   "age": 29,
         *   "mail": "shadabsheikh07@gmail.com"
         * }
         *
         *
         *  LOOK AT EMPLOYEE.JSON
         *
         */



        //converting jason object to java object deserialize.

      String jason = "{\"FirstName\":\"shdab\",\"age\":\"29\",\"mail\":\"shadabsheikh07@gmail.com\"}";

      Employee employee1 = gson.fromJson(json,Employee.class);

    /**------------------------ DEBUG OUTPUT -------------------------------
     *
     *   FirstName = shadab.
     *   mail      = shdabsheikh07@gmail.com.
     *   age       = 29.
     *
     *
     *
     *
     *
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> NestedJsonObject.class <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    */






    }
}
