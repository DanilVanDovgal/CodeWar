package printerError;

public class PrinterError {
    private static final String GOOD_CONTROL_REGEX = "[abhijm]";
    static String printerError(String source) {
        return source.replaceAll(GOOD_CONTROL_REGEX, "").length() + "/" + source.length();
    }

}
