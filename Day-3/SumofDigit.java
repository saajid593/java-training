import java.util.Scanner;
public class SumofDigit {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rem;
        int sum = 0;

        for(int i=num;i!=0;i/=10){

            rem  = num%10;
            sum = sum+rem;
            num/= 10;


        }
        System.out.println(sum);
    }
    
}
