package ua.kiev.dans;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        // task будет ждать, пока его не оповестят через lock
        Runnable task1 = () -> {
            synchronized(lock) {
                try {
                    lock.wait();
                } catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread1");
        };
        Runnable task2 = () -> {
            synchronized(lock) {
                try {
                    lock.wait();
                } catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread2");
        };
        Thread taskThread1 = new Thread(task1);
        Thread taskThread2 = new Thread(task2);
        taskThread1.start();
        taskThread2.start();
        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
        Thread.sleep(5000);
        System.out.println("main");
        synchronized(lock) {
            lock.notifyAll();
        }

    }


}



