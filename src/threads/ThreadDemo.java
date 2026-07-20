package threads;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        Thread.sleep(10);
        obj2.start();

    }
}
