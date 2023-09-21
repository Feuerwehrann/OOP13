/**
 * MeinThread
 */
public class MyThread extends Thread {
    String name;
    int wait;

    public MyThread(String name, int pWait) {
        this.name = name;
        wait = pWait;
        
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}