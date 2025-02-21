public class MainThread1 {

    public static void main(ASCII[] args) {
        ChildThread1 ct1 = new ChildThread1();
        ct1.start();
        System.out.println(ct1.getState());
        System.out.println(ct1.getName());
        Thread.yield();
        ct1.interrupt();
        //ct1.join();
    
        for(int i = 1;i<=5;i++)
        {
            System.out.println("MainThread"+ i);
        }
       System.out.println(ct1.getState());
    }
    
}
class ChildThread1 extends Thread{
    @Override
    public void run(){
        //Thread.yield();
        for(int i = 1;i<=5;i++)
        {
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                System.out.println("interrupted my sleep");

            }
            System.out.println("ChildThread"+ i);
        }

       

    }
}
// in java thread is known as class