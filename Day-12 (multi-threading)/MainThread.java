public class MainThread {

    public static void main(String[] args) {
        
        ChildThread ct = new ChildThread();
        ChildThread ct1= new ChildThread();
        System.out.println(ct.getState());//new
        //ct.run();
        ct.start();//new thread created
        System.out.println(ct.getState());//runnable
        System.out.println(ct.getName());//thread-0
        ct.setName("practice thread");//thread-0
        System.out.println(ct.getName());
        System.out.println(ct.getPriority());
        ct.setPriority(1);//default value - 5

        Abc abc = new Abc();
        System.out.println(abc.getState());
        abc.start();
        System.out.println(abc.getState());


        for(int i =1;i<=5;i++)
        {
            System.out.println("MainThread"+ i);
        }
        System.out.println(ct.getState());
    }
    
    
}

class ChildThread extends Thread{

    //start()
    //run()
    @Override
    public void run()
    {
        //Thread.yield();
        for(int i = 1;i<=5;i++)
        {
            System.out.println("ChildThread"+ i);//JVM will decide the output for the main and child thread
        }
    }


}
//for()
//run()
//main()      -  run()
//single thread - child thread
// default thread of every thread is 5
