package com.aks.test4dagger;


import javax.inject.Inject;


public class Coffee {

    public static final String TAG = "tag";


    public   Water water;

    @Inject
    public  Beans beans;

    @Inject
    public  int suger;



    @Inject
   public Coffee (){
    }

   public String getCoffeeCup(){
   return  "CoffeeCup : water and beans";
    }

}
