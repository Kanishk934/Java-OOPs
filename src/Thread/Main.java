class T1 extends Thread {
    public void run() {
        System.out.print("T1: ");
        for (int i = 1; i * i <= 500; i++)
            System.out.print(i * i + " ");
        System.out.println();
    }
}

class T2 extends Thread {
    public void run() {
        System.out.print("T2: ");
        for (int i = 1; i * i * i <= 500; i++)
            System.out.print(i * i * i + " ");
        System.out.println();
    }
}

class T3 extends Thread {
    public void run() {
        System.out.print("T3: ");
        for (int i = 1; i * i * i <= 500; i++)
            System.out.print((i * i) * (i * i * i) + " ");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}