public class NumberPrinter extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e ) {
            System.out.println("Thread Interrupted");
        }
    }

    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter();
        t1.start();
    }
}