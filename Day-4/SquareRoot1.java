
public class SquareRoot1{

    public static void main(String args []){

        int n= 64;
        int div = 2;
        while(div<=n/2)
        {

            if(n/div==div)
            {
                System.out.println(div);
                break;
            }
            div++;
        }
    }
}