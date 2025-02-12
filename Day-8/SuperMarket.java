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
    public static void main(String[] args) {
        
        // SuperMarket product = new SuperMarket();
        SuperMarket product1 = new SuperMarket("rice",50,10);
        SuperMarket product3 = new SuperMarket();
        product3.pname=sc.next();
        
        System.out.println(product1.pname);
        //System.out.println(this.pname);//cannot be used inside static block

        SuperMarket product2=new SuperMarket("biscuits",10,2);

        System.out.println(product2.pname);
        System.out.println(name);
        product1.display();
    }

    void display()
    {
        System.out.println(this.pname);
    }
    
}
