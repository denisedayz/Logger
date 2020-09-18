
public class SpacedLogger implements Logger {

	@Override
	public void log(String logInfo) {
		System.out.println(logInfo.replaceAll("(.)", "$0 "));

	}

	@Override
	public void error(String errorInfo) {

		System.out.println("ERROR: " + errorInfo.replaceAll("(.)", "$0 "));

	}

}