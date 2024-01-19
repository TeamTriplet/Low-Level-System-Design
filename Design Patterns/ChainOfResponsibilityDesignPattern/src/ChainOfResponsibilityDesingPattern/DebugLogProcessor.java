package ChainOfResponsibilityDesingPattern;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == DEBUG){
            System.out.println("Debug Log Message " + msg);
        } else super.log(logLevel, msg);
    }
}
