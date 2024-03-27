package org.example;

public class Shadowing {
  static  int num = 50;

    public static void main(String[] args) {
//        System.out.println(num); this is shadowed
        int num;
        num =90;
        System.out.println( num);
        print();
    }
    static void print(){
        System.out.println(num);
    }
}
