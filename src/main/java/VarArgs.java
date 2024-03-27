import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        when we dont know how many inputs we are giving
         fun("Samira", "Hemanta", "John", "Lovie");
         multiple(2,3, "Samira", "Hemanta");
    }

            static void multiple(int a, int b, String...p){
                System.out.println(Arrays.toString(p));
                System.out.println(a);
                System.out.println(b);


            }
            static void fun(String...b){
                System.out.println(Arrays.toString(b));
            }
        }

