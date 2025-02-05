import java.util.Scanner;
public class Digit {

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();
        int count = 0;

        while(num!=0){

            int rem = num%10;//8//7//6/5
            count++;//1//2//3//4
            num = num/10;//567//56//5/0
        }
        System.out.println(count);

       
    }

}    