package tk.hongkailiu.test;

import java.util.concurrent.TimeUnit;

/**
 * Created by hongkailiu on 2016-10-25.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("simple-jar");
        while (true) {
            System.out.println("running ...");
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
