//public class SWAP {
//    public static void main(String[] args) {
//        String name = "Samira";
//        intro(name);
//        System.out.println(name);
//
//    }
//
//     static void intro(String firstName){
////         (here we are creating new object  hence no change)
////         name = Samira, firstName = Samira because firstName is the copy of name
////         scoping = nobody can access firstName outside this method/function
//        firstName ="Hemanta";
//     }
//}


import java.util.Arrays;

public class SWAP{
    public static void main(String[] args) {
        int[] array ={1, 2, 3, 4, 5};
        modify(array);
        System.out.println(Arrays.toString(array));


    }
static void modify(int[] num){

//        here we are modifying the value so changes seen
        num [0] = 22;

}
}

