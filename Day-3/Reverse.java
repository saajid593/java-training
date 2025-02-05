import java.util.Scanner;
public class Reverse {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int val = sc.nextInt();
        int rem=0;
        int sum=0;

        while(val!=0){

            rem = val%10;//3//2/1
            sum = sum*10+rem;//321
            val= val/10;//12//1
        }
        System.out.println(sum);
        


    }
    
}
