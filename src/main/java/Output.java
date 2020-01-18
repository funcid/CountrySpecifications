import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author func 18.01.2020
 */
@Getter
@AllArgsConstructor
public enum Output {
    START(Ansi.ANSI_BLACK + "Что хотите выбрать: 1 [Узнать население странны], 2 [Узнать столицу страны]: " + Ansi.ANSI_RESET),
    WAIT(Ansi.ANSI_CYAN + "Ожидайте..." + Ansi.ANSI_RESET),
    PROCESS(Ansi.ANSI_PURPLE + "Процесс..." + Ansi.ANSI_RESET);

    private String output;
}
