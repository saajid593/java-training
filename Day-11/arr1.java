public class arr1 {

    public static void main(String[] args){
        int a[]={3,0,4,5,0,1,2};
               //0,1,2,3,4,5,6

        moveZero(a);
        }
        public static void moveZero(int a[]){
        int count = a.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
            a[count--] = a[i];
            }
        }
        while (count >= 0) {
            a[count--] = 0;
        }
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " ");
        }}
        //int count=0;
        //for(int i=0;i<a.length;i++){
          //  if(a[i]!=0){
            //    a[count++]=a[i];
    
        
        //while(count>a.length){
           // a[count++]=0;
        
        //for(int i=0;i<a.length;i++){
            //System.out.print(a[i]+" ");
        




    

