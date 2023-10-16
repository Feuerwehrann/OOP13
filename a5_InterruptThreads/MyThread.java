package a5_InterruptThreads;

public class MyThread implements Runnable {

    Thread t;

    public MyThread() {
        t = new Thread(this);

    }

    @Override
    public void run() {

        System.out.print("Ich arbeite");
        {
            while ((t.isInterrupted())==false) {
                System.out.print(".");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    break;

                }

            }

        }
    }

    public void start() {
        t.start();
    }

    public void Interrupt() {
        t.interrupt();
    }

}
