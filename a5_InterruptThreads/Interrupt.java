package a5_InterruptThreads;

import java.util.Scanner;

public class Interrupt {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Erzeuge Thread gestartet");
        MyThread a = new MyThread("a", 30);
        Scanner s = new Scanner(System.in);

        a.start();
        int taste = s.nextInt();

        if (taste==1){
            Thread.sleep(2000);
            Boolean flag = Thread.interrupted();
            if(flag==true){
                System.out.println("!");
            }

        }
        s.close();

        System.out.println("Main beendet");

    }
}