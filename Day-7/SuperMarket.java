public class SuperMarket {
    static String name="Mall";
    String pname;
    int price;
    int discount;
    // global variable, non-static variable,fields

    public static void main(String args []){

        //example-1
        int a = 20;
        SuperMarket product1=new SuperMarket();
        product1.pname= "rice,wheat";
        product1.price=60;
        product1.discount=10;
        System.out.println(product1.pname);


        //example-2
        SuperMarket product2=new SuperMarket();
        product2.pname="chocolate";
        product2.price=70;
        product2.discount=15;
        System.out.println(product2.pname);
        System.out.println(name);

    }
    
}
