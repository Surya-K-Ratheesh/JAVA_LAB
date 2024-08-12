class myThread extends Thread{
    public void run(){
        System.out.println("Current Thread Name: "+Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}

public class thread_run_start {
    public static void main(String args[]){
        myThread t = new myThread();
        t.start();
        // t.run();
        
    }
}
