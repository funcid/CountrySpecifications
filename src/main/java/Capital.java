class Capital implements Specifications {
    @Override
    public void say() {
        System.out.println(Ansi.ANSI_YELLOW + "Успешно подключено.[Столица]" + Ansi.ANSI_RESET);
        Country.showChoices();
        int inputNumber = SCANNER.nextInt();
        System.out.print((inputNumber < 21 ?
                Ansi.ANSI_BLUE + Country.getCountryByNumber(inputNumber).getCapital() :
                Ansi.ANSI_RED + "Ошибка//ERROR||||Не нашел данной цифры.") +
                Ansi.ANSI_RESET
        );
        System.out.print(Ansi.ANSI_GREEN + "\nУспешно сработано, завершение...\nУспешно завершено.\n" + Ansi.ANSI_RESET);
    }
}