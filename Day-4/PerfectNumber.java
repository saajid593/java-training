import java.util.Scanner;
public class PerfectNumber {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
