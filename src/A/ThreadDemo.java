package A;

class ThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am sleeping");
                Thread.sleep(5000);
            }
        } catch (InterruptedException ie) {
            System.out.println("I got interupted by interupted();");
        }
    }

}
