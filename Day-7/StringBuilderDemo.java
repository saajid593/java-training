
public class StringBuilderDemo {

    public static void main(String[] args) {
        
       StringBuilder str = new StringBuilder("abc");
       StringBuilder str2 = new StringBuilder("abc");

        // StringBuilder sb = new StringBuilder();
        //StringBuilder sb1= "abx";--> not a valid way



        str.append("hello");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println();

        String s1="abcd";
        String s2=s1;
        s2="pqr";
        System.out.println(s1==s2);


        
        
        
    }
    
}
