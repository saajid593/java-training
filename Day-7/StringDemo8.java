public class StringDemo8 {
    public static void main(String args []){
        String s = "hello world";

        System.out.println(s.indexOf("orld"));

        System.out.println(s.indexOf("o",5));
        //fromIndex method-start from "o"index

        System.out.println(s.lastIndexOf("o"));
        //LastIndex method-till "o" index


        System.out.println(s.substring(2));
        //substring-from 2nd index 
        System.out.println(s.substring(6,s.length()-1));
        //total=11 , 10-11=1 , as 10 not considered so take from 6 to 9
       
        System.out.println(s.subSequence(10,11));
        // subSquence will print according to the index values , -ve numbers will not be printed
    }
    
}
