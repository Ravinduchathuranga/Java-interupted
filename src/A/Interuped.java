package A;

public class Interuped {

    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        t1.setName("abc");

        System.out.println(t1.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("xyz");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
        Thread.sleep(5000);
        Thread.yield();
            System.out.println("main Thread");
        }

    }

}

class MyThread extends Thread {

    public void run() {

        for (int i = 10; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println("I got interupted");
            }
            System.out.println("Java task");
        }

    }

}
