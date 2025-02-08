import java.util.Arrays;
public class TwoSum {
    public static void main(String args[]){
        int num[]={7,3,5};
        int target=8;
        int res[] = new int[2];

        for(int i =0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
            
        }
        System.out.println(Arrays.toString(res));
    }
    
}
