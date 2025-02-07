import java.util.Scanner;
public class NeonNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();

        int sqr = n*n;
        int temp = sqr;
        int sum = 0;
        int rem;
        
        while(temp!=0){
            rem=temp%10;
            sum = sum+rem; 
            temp = temp/10;
        }
        if(sum==n){
            System.out.println("Given number is neon");
        }
        else{
            System.out.println("Not a neon number");
    }
    
}
}
