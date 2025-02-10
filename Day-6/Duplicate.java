public class Duplicate{

    public static void main(String[] args) {
        Integer[]num={2,3,1,2,3};
        boolean[] d=new boolean[num.length];
        for(int i =0;i<=num.length-1;i++){
            for(int j =i+1;j<num.length;j++){
                if(num[i].equals(num[j])){
                d[i]=true;
                d[j]=true;
                }
            }
        }
        System.out.println("Duplicate:");
        for(int j=0;j<num.length;j++){
            if(d[j]){
                System.out.print(num[j]+" ");
            }
        }
        
    }
}