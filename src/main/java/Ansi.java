import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author func 18.01.2020
 */
@Getter
@AllArgsConstructor
public enum Ansi {
    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_RED("\u001B[30m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m"),;

    private String code;

    @Override
    public String toString() {
        return this.getCode();
    }
}