package A;

public class NonEffectThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int a = 0; a < 10 ;a++) {
            System.out.println("I am sleeping");
        }
    }

}
