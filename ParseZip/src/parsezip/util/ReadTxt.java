package parsezip.util;

import parsezip.main.Main;

import java.io.File;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadTxt {
	private final static Logger LOGGER = Logger.getLogger(ReadTxt.class.getName());

	public static List<String> readTxt(String filePath) {
		LOGGER.log(Level.INFO, "Reading file from path {0} ", filePath);
		File theFile = new File(filePath);
		List<String> fileNames = new ArrayList<>();

		try {
			Scanner scan = new Scanner(theFile);
			while (scan.hasNextLine()) {
				fileNames.add(scan.nextLine());
			}
			scan.close();
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception occurred while file parsing {0} ", e.toString());
		}

		return fileNames;
	}
}
