import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String... args) throws InterruptedException {
        while (true) {
            Scanner num = new Scanner(System.in);
            int inputNumber;
            System.out.println(Output.START.getOutput());
            if(num.hasNextInt()) {
                inputNumber = num.nextInt();
                System.out.println(Output.WAIT.getOutput());
                for (int h = 5; h > 0; h--) {
                    //В случайном порядке задерживаем вывод, чтобы эмулировать загрузку
                    Thread.sleep(ThreadLocalRandom.current().nextInt(300, 1000));
                    System.out.println(Ansi.ANSI_CYAN + "" + h + "..." + Ansi.ANSI_RESET);
                    if (h == 1) {
                        //Здесь можно сделать анимированные точки . .. ... (если получится)
                    };
                }
                Specifications specifications = inputNumber == 1 ? new Population() : new Capital();
                System.out.println(Output.PROCESS.getOutput());
                specifications.say();
            }
        }
    }
}