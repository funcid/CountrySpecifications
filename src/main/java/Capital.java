import java.util.Scanner;

class Capital implements Specifications {
    private Scanner num = new Scanner(System.in);

    @Override
    public void say() {
        int r = 405;
        System.out.println(Ansi.ANSI_YELLOW + "Успешно подключено.[Столица]" + Ansi.ANSI_RESET);
        Country.showChoices();
        r = num.nextInt();
        System.out.print((r < 21 ?
                Ansi.ANSI_BLUE + Country.getCountryByNumber(r).getCapital() :
                Ansi.ANSI_RED + "Ошибка//ERROR||||Не нашел данной цифры.") +
                Ansi.ANSI_RESET
        );
        System.out.print(Ansi.ANSI_GREEN + "\nУспешно сработано, завершение...\nУспешно завершено.\n" + Ansi.ANSI_RESET);
    }
}
