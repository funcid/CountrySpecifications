class Population implements Specifications {
    @Override
    public void say() {
        System.out.println(Ansi.ANSI_YELLOW + "Успешно подключено.[Население]" + Ansi.ANSI_RESET);
        Country.showChoices();
        int inputNumber = SCANNER.nextInt();
        if (inputNumber < 21) {
            System.out.print(Ansi.ANSI_BLUE + Country.getCountryByNumber(inputNumber).getInfo() + Ansi.ANSI_RESET);
        }
        System.out.print(Ansi.ANSI_GREEN + "\nУспешно сработано, завершение...\nУспешно завершено.\n" + Ansi.ANSI_RESET);
    }
}