package ChainOfResponsibilityDesingPattern;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String msg){
        if(logLevel == INFO){
            System.out.println("Info Log Message " + msg);
        } else nextLogProcessor.log(logLevel, msg);
    }
}
