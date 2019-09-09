import java.io.IOException;
import java.io.InterruptedIOException;

public class Runner extends Thread {

    public Runner(String name){
        super(name);

    }

    @Override
    public void run() {
        Thread m = new Thread("Runner 1");
        Thread m1 = new Thread("Runner 2");
        Thread m2 = new Thread("Runner 3");
        Thread m3 = new Thread("Runner 4");
        Thread m4 = new Thread("Runner 5");

        try {

            System.out.println(m.getName() + " Берет палочку");
            System.out.println(m.getName() + " Бежит к " + m1.getName());
            m.start();
            sleep(5000);
            m1.join();
            System.out.println(m1.getName() + " Берет палочку");
            System.out.println(m1.getName() + " Бежит к " + m2.getName());
            m1.start();
            sleep(5000);
            m2.join();

            System.out.println(m2.getName() + " Берет палочку");
            System.out.println(m2.getName() + " Бежит к " + m3.getName());
            m2.start();
            sleep(5000);
            m3.join();
            System.out.println(m3.getName() + " Берет палочку");
            System.out.println(m3.getName() + " Бежит к " + m4.getName());
            m3.start();
            sleep(5000);
            m4.join();

            System.out.println(m4.getName() + " Берет палочку");
            System.out.println(m4.getName() + " Бежит к Финишу");

            System.out.println(m4.getName() + " Бежит к " + m3.getName());
            m4.start();
            sleep(5000);
            m3.join();

            System.out.println(m3.getName() + " Берет палочку");
            System.out.println(m3.getName() + " Бежит к " + m2.getName());
            m3.start();
            sleep(5000);
            m2.join();

            System.out.println(m2.getName() + " Берет палочку");
            System.out.println(m2.getName() + " Бежит к " + m1.getName());
            m2.start();
            sleep(5000);
            m1.join();

            System.out.println(m1.getName() + " Берет палочку");
            System.out.println(m1.getName() + " Бежит к " + m.getName());
            m1.start();
            sleep(5000);
            m.join();

            System.out.println(m.getName() + " Берет палочку");




        }catch (Exception e){
            e.getMessage();
        }

    }




}
