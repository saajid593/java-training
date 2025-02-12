package tamilnadu.thiruvarur;
import tamilnadu.chennai.Branch_Office;

public class Branch_Office1 extends Branch_Office {
    
    public Branch_Office1()
    {
        System.out.println("welcome to Branch_Office1");
    }

    public static void main(String[] args) {
        Branch_Office1 offv =new Branch_Office1();
        offv.work();
    }
    void work()
    {
        System.out.println("got work");
    }
}
