import java.util.Arrays;
public class String5 {
    public static void main(String args []){
        String str = "hello";
        char c[]=str.toCharArray();

        for(int i =0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        String str1= new String(c);
        System.out.println(str1);
        System.out.println(Arrays.toString(c));
    }
    
}
