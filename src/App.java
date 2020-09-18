
public class App {

	public static void main(String[] args) {

		String logInfo = "Auto backup made, you can rest easy for now.";
		String errorInfo = "This is bad, this is really, REALLY, bad!";

		AsteriskLogger starLog = new AsteriskLogger();
		starLog.log(logInfo);
		starLog.error(errorInfo);

		SpacedLogger spacedLog = new SpacedLogger();
		spacedLog.log(logInfo);
		spacedLog.error(errorInfo);

	}

}
