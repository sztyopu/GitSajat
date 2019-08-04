package parsezip.main;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import parsezip.util.ReadTxt;
import parsezip.util.UnzipFile;
//import sun.util.logging.PlatformLogger;

public class Main {

	private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		LOGGER.log(Level.INFO, "Starting...", args);
		List<String> fileNames = ReadTxt.readTxt(args[0]);

		if (fileNames.size() > 0) {
			new UnzipFile(args[1], args[2], fileNames);
		}
	}
}
