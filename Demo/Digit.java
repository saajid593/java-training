import java.util.Scanner;

public class Digit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num = sc.nextInt();
        int count =0;

        while(num!=0){
            int rem = num%10;
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
    
}
