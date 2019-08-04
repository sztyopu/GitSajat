package readzip;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ReadZip {
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		String zipEleresiUt = "C:/eclipse-workspace/ReadZip/src/readzip/proba.zip";
		
	    ZipFile zipFile = new ZipFile(zipEleresiUt);

	    Enumeration<? extends ZipEntry> entries = zipFile.entries();

	    while(entries.hasMoreElements()){
	        ZipEntry entry = entries.nextElement();
	        InputStream stream = zipFile.getInputStream(entry);
	        String eredmeny = convertInputStreamToString(stream);	
	        System.out.println(eredmeny);
	    }
	}
//ez egy függvény a netrõl Stringé alakitás
    private static String convertInputStreamToString(InputStream inputStream) throws IOException {

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        return result.toString(StandardCharsets.UTF_8);

    }
}
