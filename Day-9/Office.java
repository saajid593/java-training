package tamilnadu.chennai;

public class Office {
    Office()
    {
        System.out.println("welcome to Branch_Office");
    }

    public static void main(String[] args) {
        Office off = new Office();
        off.work();
        off.recruit();        
    }

    void work() 
    {
        System.out.println("working in office");
    }
    void wfh(){
        System.out.println("working in home");
    }
    void recruit()
    {
        System.out.println("recruitment");
    }
    void get_travel_allowance()
    {
         System.out.println("get travel allowance");
    }
    
}