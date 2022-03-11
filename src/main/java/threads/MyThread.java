package threads;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try{
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Всем привет! Это поток %s!\n", Thread.currentThread().getName());
            }
        } catch(InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
