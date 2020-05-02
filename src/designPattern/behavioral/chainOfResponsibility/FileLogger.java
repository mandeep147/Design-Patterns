package designPattern.chainOfResponsibility;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level= level;
	}
	@Override
	protected void write(String message) {
		System.out.println("inside file logger");
		System.out.println("File::Logger: "+message);
	}

}