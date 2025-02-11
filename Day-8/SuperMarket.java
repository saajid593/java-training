public class SuperMarket {

    static String name="Reliance Mall";
    String pname;
    int price;
    int discount;
    // global variables, non - static variable,fields

    SuperMarket()
    {
        System.out.println("Welcome");
    }
    SuperMarket(String pname,int price,int discount)
    {
        this.pname=pname;
        this.price=price;
        this.discount=discount;
    }
    
}
