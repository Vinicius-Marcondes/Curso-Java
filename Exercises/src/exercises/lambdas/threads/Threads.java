package exercises.lambdas.threads;

public class Threads implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread #1");
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}
