import java.util.Scanner;

class Population implements Specifications {
    @Override
    public void say() {
        Scanner num = new Scanner(System.in);
        int w = 405;
        System.out.println(Ansi.ANSI_YELLOW + "Успешно подключено.[Население]" + Ansi.ANSI_RESET);
        Country.showChoices();
        w = num.nextInt();
        if (w < 21) {
            System.out.print(Ansi.ANSI_BLUE + Country.getCountryByNumber(w).getInfo() + Ansi.ANSI_RESET);
        }
        System.out.print(Ansi.ANSI_GREEN + "\nУспешно сработано, завершение...\nУспешно завершено.\n" + Ansi.ANSI_RESET);
    }
}
