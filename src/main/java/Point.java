import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author func 18.01.2020
 */
@Getter
@AllArgsConstructor
public enum Point {
    START(() -> System.out.println(Ansi.ANSI_BLACK + "Что хотите выбрать: " + 1 + "-[Узнать население странны]," + 2 + "-[Узнать столицу страны]: " + Ansi.ANSI_RESET)),
    WAIT(() -> System.out.println(Ansi.ANSI_CYAN + "Ожидайте..." + Ansi.ANSI_RESET)),
    PROCESS(() -> System.out.println(Ansi.ANSI_PURPLE + "Процесс..." + Ansi.ANSI_RESET)),
    POINTS1(() -> System.out.println(Ansi.ANSI_CYAN + "1..." + Ansi.ANSI_RESET)),
    POINTS2(() -> System.out.println(Ansi.ANSI_CYAN + "2..." + Ansi.ANSI_RESET)),
    POINTS3(() -> System.out.println(Ansi.ANSI_CYAN + "3..." + Ansi.ANSI_RESET)),
    POINTS4(() -> System.out.println(Ansi.ANSI_CYAN + "4..." + Ansi.ANSI_RESET)),
    POINTS5(() -> System.out.println(Ansi.ANSI_CYAN + "5..." + Ansi.ANSI_RESET)),;

    private MyFunction function;
}
