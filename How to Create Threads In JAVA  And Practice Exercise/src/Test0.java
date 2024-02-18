
class worker extends Thread{
    public void run(){

        for(int i=1; i<=0;i++){
            System.out.println("Thread 1 is running..."+ new java.util.Date());

            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        //run is a predefined method. when a thread is tarted it
        //automatically looks fo run method
        //the job of a thread is defined inside run method\

        System.out.println("hi! I am Thread....");
    }
}

public class Test0 {
    public static void main(String[] args) {
        worker w1 = new worker();
        w1.start();
        //used to start thread.. indirectly calls run()

    }
}
