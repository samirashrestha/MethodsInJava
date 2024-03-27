package org.example;

import java.sql.SQLOutput;

public class SelfPractice {
    public static void main(String[] args) {
        //    when we dont want a return type

//        Order2();
        //    when we want a return type

//        String food = Order();
//        System.out.println(food);

        //    for which you want to pass value by yourself
        System.out.println(myOrder("coke  " , "burger"));

    }



    //    for which you want to pass value by yourself

    static String myOrder(String Drink, String Food){
        String personalizedOrder = Drink + Food;
        return personalizedOrder;

    }



//    when we want a return type

    static String Order(){
        String menu = "Choose the food you want to order";
        return menu;
    }
    //    when we dont want a return type
    static void Order2(){
        String menu1 = "Choose the food you want to order";
        System.out.println(menu1);

    }



}
