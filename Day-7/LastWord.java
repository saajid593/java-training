public class LastWord {
    public static void main(String args []){

        String s1="  Hello World  ";
        String trimed=s1.trim();
        System.out.println(trimed.lastIndexOf(" "));
        int count = 0;
        int i = trimed.lastIndexOf(" ");
        for(;i<trimed.length()-1;i++){
            count++;
        }
        System.out.println(count);
    }
    
}
