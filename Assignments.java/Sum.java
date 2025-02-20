public class Sum {
    public static void main(String[] args) {

        //N + (N-1) - (N-2) + (N-3) - (N-4) + ... + 1

        int a =6;//11,7,10,8,9
        int count =0;//1,2,3
        for(int i =a-1;i>0;i--)//5,4,3,2,1
        {
            if(count%2==0)
            {
                a+=i;
            }
            else{
                a-=i;
            }
            count = count +1;
            System.out.println(a);
        }
    }
}
