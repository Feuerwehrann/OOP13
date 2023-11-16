package b3_StacksAndQueues;


public class Main {
    public static void main(String[] args) {
        FiFo meineFiFo = new FiFo();
        meineFiFo.push("hello");
        meineFiFo.push("world");
        meineFiFo.push("!");
        System.out.println("\33[H\033[2J");
        System.out.flush();
        for(int i = 0; i <3; i++){
            System.out.println(meineFiFo.pop());
        }
        

    }
    
    
}
