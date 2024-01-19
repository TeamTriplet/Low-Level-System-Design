import ChainOfResponsibilityDesingPattern.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logger log = new Logger();
        log.log(LogProcessor.INFO, "Info Message");
        log.log(LogProcessor.DEBUG, "Debug Message");
        log.log(LogProcessor.ERROR, "Error Message");
        log.log(4, "Unknown Message");

    }
}