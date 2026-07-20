package threads;

class C implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread c: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread D: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable obj1 = new C();
        Runnable obj2 = new D();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
}
