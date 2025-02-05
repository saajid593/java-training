import java.util.Scanner;
public class Given {

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=num/2;i++){

            if(num%i ==0){
                 count+=1;
            }
            
            


        }System.out.println(count);
    
    }   
}
