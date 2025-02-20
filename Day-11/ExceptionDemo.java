public class ExceptionDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException abc){
            System.out.println("");
        }
        
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at ExceptionDemo.main(ExceptionDemo.java:7)
        
    }
    
}