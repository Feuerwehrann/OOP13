package a5_InterruptThreads;

public class MyThread implements Runnable {
    
        String name;
        int wait;
        Thread t;
    
        public MyThread(String name, int wait) {
            this.name = name;
            this.wait = wait;
            t = new Thread(this);
        }
        @Override
        public void run() {
            System.out.print("Ich arbeite");
            while(true){
                System.out.print(".");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
            
            
        }
        public void start(){
            t.start();
        }
    

    
}
