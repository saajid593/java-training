public class Main {

    public static void main(String[] args) {
         String s = "abc";
         char[] c= s.toCharArray();

         int index = 2;

         for(int i =0;i<c.length;i++){
            int as = (int)c[i];
            as = as + index;
            if(as>122){
                as =26;

            }
            char ch = (char)as;
            System.out.println(ch);
         }
        


        
    }
    
}
