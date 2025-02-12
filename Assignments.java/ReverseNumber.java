public class ReverseNumber {

    public static void main(String[] args) {
        
        int  a  =1234;
        System.out.println(reverse(a));
    }

    static int reverse (int n){
        int reverse=0;
        
        while (n>0) {
            int rem = n%10;
            reverse = reverse*10+rem;
            n = n/10;
        }
        return reverse;
    
    }
}

    

