public class NestedIf {

    public static void main(String args[]){

        int  a = 70;
        boolean hasticket = true;
        if(hasticket==true){

            if(a>=60){

                System.out.println("Eligible for Test");
            }
            else{

                System.out.println("Pay fine then go for Test");
            }
        }
        else{
 
            System.out.println("Not eligible for test");
        }
    }
    
}
