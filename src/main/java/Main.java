import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String... args) throws InterruptedException {
        while (true) {
            Scanner num = new Scanner(System.in);
            boolean isTrue = true;
            int q = 404, w = 405;
            Point.START.getFunction().init();
            if(num.hasNextInt()) {
                q = num.nextInt();
                Point.WAIT.getFunction().init();
                for (int h = 5; h > 0; h--) {
                    //В случайном порядке задерживаем вывод, чтобы эмулировать загрузку
                    Thread.sleep(ThreadLocalRandom.current().nextInt(300, 1000));
                    Point.valueOf("POINTS" + h).getFunction().init();
                    if (h == 1) {
                        //Здесь можно сделать анимированные точки . .. ... (если получится)
                    };
                }
                Specifications specifications = q == 1 ? new Population() : new Capital();
                Point.PROCESS.getFunction().init();
                specifications.say();
            }
        }
    }
}