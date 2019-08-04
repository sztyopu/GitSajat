package parsezip.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {

	private String destDir;
	private List<String> fileNames;
	private String zipFilePath;
	private final static Logger LOGGER = Logger.getLogger(UnzipFile.class.getName());

	public UnzipFile(String zipFilePath, String destDir, List<String> fileNames) {
		this.destDir = destDir;
		this.zipFilePath = zipFilePath;
		this.fileNames = fileNames;

		getFilesFromFolder(new File(this.zipFilePath));

	}

	private void getFilesFromFolder(File directory) {
		LOGGER.log(Level.INFO, "Reading zipped files from path {0} ", directory);

		for (File fileEntry : directory.listFiles()) {
			if (!fileEntry.isDirectory()) {
				try {
					unzip(fileEntry.getAbsolutePath(), this.fileNames);
				} catch (IOException e) {
					LOGGER.log(Level.SEVERE, "Exception occurred while file parsing zip file {0} ", e.toString());
				}
			}
		}
	}

	private void unzip(String zipFilePath, List<String> fileNames) throws IOException {
		LOGGER.log(Level.INFO, "Unzip process started, zipped file path {0}, Files to be unzipped {1}", new Object[]{zipFilePath, fileNames});
		byte[] buffer = new byte[1024];
		ZipInputStream zis = new ZipInputStream(new FileInputStream(new File(zipFilePath)));
		ZipEntry zipEntry = zis.getNextEntry();

		while (zipEntry != null) {
			for (String fileFromTxt : fileNames) {
				if (zipEntry != null && zipEntry.getName().equals(fileFromTxt.trim())) {
					File newFile = newFile(new File(this.destDir), zipEntry);
					FileOutputStream fos = new FileOutputStream(newFile);
					int len;
					while ((len = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}
					fos.close();
				}
			}
			zipEntry = zis.getNextEntry();
		}
		zis.closeEntry();
		zis.close();
	}

	public File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
		LOGGER.log(Level.INFO, "Creating new file from zipped one. Destination folder: {0} ", destinationDir);

		File destFile = new File(destinationDir, zipEntry.getName());

		String destDirPath = destinationDir.getCanonicalPath();
		String destFilePath = destFile.getCanonicalPath();

		if (!destFilePath.startsWith(destDirPath + File.separator)) {
			throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
		}

		return destFile;
	}
}
