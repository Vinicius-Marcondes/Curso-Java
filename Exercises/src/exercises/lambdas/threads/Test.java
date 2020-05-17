package exercises.lambdas.threads;

public class Test {
    public static void main(String[] args) {
        Runnable thread1 = new Threads();
        Runnable thread2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread #2");
                try{
                    Thread.sleep(100);
                }catch(Exception e){}
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
