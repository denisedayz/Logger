
public class AsteriskLogger implements Logger {

	@Override
	public void log (String logInfo) {
		System.out.println("***" + logInfo + "***");

	}

	@Override
	public void error (String errorInfo) {

		System.out.println("******************************************************");
		System.out.println("***ERROR: " + errorInfo + "***");
		System.out.println("******************************************************");

	}


}
