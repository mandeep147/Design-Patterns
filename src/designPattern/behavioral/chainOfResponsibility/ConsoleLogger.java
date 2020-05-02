package designPattern.chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("inside console logger");
		System.out.println("Console:: Logger: "+message);
	}

}