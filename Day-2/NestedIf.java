public class NestedIf {

    public static void main(String args[]){

        int  a = 10;
        boolean hasticket = true;
        if(hasticket==true){

            if(a>=60){

                System.out.println("Eligible for play");
            }
            else{

                System.out.println("Pay fine then go for play");
            }
        }
        else{
 
            System.out.println("Not eligible for play");
        }
    }
    
}
