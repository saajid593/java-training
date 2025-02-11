public class Merge {

    public static void main(String args []){

        String s1 = "abc";
        String s2 = "pqr";
        StringBuilder sb=new StringBuilder(s1);
        StringBuilder sb1=new StringBuilder(s2);
        StringBuilder finalsb =new StringBuilder();
        int length = sb.length()+sb1.length();

        System.out.println(length);

        for(int i=0;i<length;i++){
            for(int j =i;j<sb.length();){
                finalsb.append(sb.charAt(i));
                System.out.println(finalsb);
                break;

            }
            for(int j =i;j<sb1.length();){
                finalsb.append(sb1.charAt(i));
                System.out.println(finalsb);
                break;
            }
            


        }
        //System.out.println("Helloooo");
        String finalout=finalsb.toString();
        //System.out.println(finalsb);
        
    }
    
}
