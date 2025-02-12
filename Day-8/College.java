package tamilnadu.chennai;

public class College {

    static String Clgname="DACE";
    //int fees=200000;
    
    public static void main(String[] args) {
        College clg = new College();
        display();
        clg.studying();
        clg.recruit();
        clg.write();
        clg.semesterpaper();
        

    }

     static void display()
    {
        System.out.println("Welcome to College"+ Clgname);
    }
    void studying()
    {
        System.out.println("students are studying");

    }
    void recruit()
    {
        System.out.println("company is recruiting");
    }
    void write()
    {
        System.out.println("exams are going on");


    }
    private void semesterpaper()
    {
        System.out.println("this is top secret");
    }
}
