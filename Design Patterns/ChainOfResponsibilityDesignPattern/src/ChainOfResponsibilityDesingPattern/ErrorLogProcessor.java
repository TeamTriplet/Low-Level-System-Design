package ChainOfResponsibilityDesingPattern;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == ERROR){
            System.out.println("Error Log Message " + msg);
        } else super.log(logLevel, msg);
    }
}
