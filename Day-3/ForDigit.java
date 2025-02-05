import java.util.Scanner;
public class ForDigit {

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rem;
        int count = 0;
        for(int i=1;i<num;i++){
            rem = num%10;
            count++;
            num = num/10;

        }
        System.out.println(count);
    }

    
}
