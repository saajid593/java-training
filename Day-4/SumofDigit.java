import java.util.Scanner;
public class SumofDigit{

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sum = 0;
        int digit;

        while(n!=0){
            digit=n%10;
            sum+=digit;
            n/=10;
        }
        int total=0,digit2;

        while(sum!=0){
            digit2=sum%10;
            total+=digit2;
            sum/=10;

        }
        System.out.println(total);

    }
}