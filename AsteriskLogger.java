package week5labs;

public class AsteriskLogger implements Logger  {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	
	@Override
	public void error(String error) {
		for (int i = 0; i < 13 + error.length();i++) {
			System.err.print("*");
	}
		System.err.println();
		
		System.err.println("***" + "Error: " + error + "***");
	
		for (int i = 0; i < 13 + error.length();i++) {
			System.err.print("*");
	}
		System.err.println();
	
	}
}
