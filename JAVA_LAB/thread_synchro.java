class first{
    public void displaay(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("]");
    }
}

class second extends Thread{
    String msg;
    first obj;
    second (first fp, String str){
        fobj = fp;
        msg = str;
        start();
    }
    public void run(){
        fobj.display(msg);
    }
}

public class thread_synchro {
    
}
