import java.util.Scanner;

public class OddorEven {

    public static void main(String args []){

        Scanner sc = new Scanner (System.in);
         System.out.println("Enter a number");

         int number = 20;

        if(number % 2==0){

            System.out.println(number + "is Even");

        }else{

            System.out.println(number + "is odd");
        }


    }
    
}
