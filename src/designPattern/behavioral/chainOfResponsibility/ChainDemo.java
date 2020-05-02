package designPattern.chainOfResponsibility;

public class ChainDemo {

	public static void main(String[] args) {
		AbstractLogger chain = getChainOfLogs();
		chain.logMessage(AbstractLogger.INFO, "Info message");
		chain.logMessage(AbstractLogger.DEBUG, "debug message");
		chain.logMessage(AbstractLogger.ERROR, "error message");
		
	}

	private static AbstractLogger getChainOfLogs(){
		AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger console = new ConsoleLogger(AbstractLogger.DEBUG);
		AbstractLogger file = new FileLogger(AbstractLogger.INFO);
		
		error.setNextLogger(file);
		file.setNextLogger(console);
		
		return error;
	}
}