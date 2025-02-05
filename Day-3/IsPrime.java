public class IsPrime {
    public static void main(String[] args) {
        
        int n = 11;
        int div=2;
        boolean isPrime = true;

        while (div<=n/2) {
            if(n%div==0){
                isPrime = false;
                break;
            }    
        }
        // if(isPrime){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }

        System.out.println(isPrime ? "Yes" : "No");
    }
    
}
