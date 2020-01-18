import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String... args) throws InterruptedException {
        while (true) {
            Scanner num = new Scanner(System.in);
            int inputNumber;
            Output.START.getOutputEvent().init();
            if(num.hasNextInt()) {
                inputNumber = num.nextInt();
                Output.WAIT.getOutputEvent().init();
                for (int h = 5; h > 0; h--) {
                    //В случайном порядке задерживаем вывод, чтобы эмулировать загрузку
                    Thread.sleep(ThreadLocalRandom.current().nextInt(300, 1000));
                    Output.valueOf("POINTS" + h).getOutputEvent().init();
                    if (h == 1) {
                        //Здесь можно сделать анимированные точки . .. ... (если получится)
                    };
                }
                Specifications specifications = inputNumber == 1 ? new Population() : new Capital();
                Output.PROCESS.getOutputEvent().init();
                specifications.say();
            }
        }
    }
}