package week5labs;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger aLogger = new AsteriskLogger();
		aLogger.log("Hello");
		aLogger.error("Hi");
		
		SpacedLogger sLogger = new SpacedLogger();
		sLogger.log("Hello");
		System.out.println();
		sLogger.error("Hello");
		
	}
}
