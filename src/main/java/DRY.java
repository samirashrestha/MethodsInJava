import java.util.Scanner;

public class DRY {
    public static void main(String[] args) {
        //for which we need return type

//       int total = sum2();
//        System.out.println("the sum is " + total);

        //for which we dont need return type

//        sum();

        //    for which you want to pass value by yourself
        System.out.println(sum3(5, 10));

    }


//    for which you want to pass value by yourself (Parameterize, arguments)

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;

    }
//for which we need return type
    static int sum2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Numero: ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        return sum;

    }
    //for which we do not need return type

    static void sum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("the sum is: "+ (num1+num2));


        }
   }


