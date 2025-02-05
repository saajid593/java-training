import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int num = sc.nextInt();

        for(int i = 0;i<num;i++){

            if(i%3==0 && i%5==0){
                System.out.println(i);
            }


        }

        
    }


     
    
}
