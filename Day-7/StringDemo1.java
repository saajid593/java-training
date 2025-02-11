public class StringDemo1 {

    public static void main(String[] args) {
        
        String s="World";
        System.out.println(s.length());

        String s1="asd";
        //return string length
        System.out.println(s1.isBlank());
        //?return true if string is empty or contains whitespace

        String s2="ghj";
        //return string length
        System.out.println(s2.length());
        System.out.println(s2.isEmpty());
        //return true if the string length is 0 

        String s3="Jav";
        s3+="a";
        System.out.println(s3);

        String s4 ="ABC";
        String s5 ="ABCD";
        s1+="C";
        System.out.println(s1);
    }
    
}
