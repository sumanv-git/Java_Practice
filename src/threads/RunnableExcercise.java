package threads;

class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + " Running task " + i);
        }
    }
}

public class RunnableExcercise {
    public static void main(String[] args) throws InterruptedException {
        PrinterTask task = new PrinterTask();
        Thread thread1 = new Thread(task, "Worker-1");
        Thread thread2 = new Thread(task, "Worker-2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
