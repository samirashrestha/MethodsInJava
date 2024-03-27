package org.example;
//when the two functions have same name but different arguments
//happens at complie time
public class MethodOverloading {
    public static void main(String[] args) {
        function(2);
        function("sAmira" );
    }
    static void function(int a){
        System.out.println( a);
    }
    static void function(String b){
        System.out.println(b);
    }
}
