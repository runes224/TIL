package rento.hitaka.til.file;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRead {

  public static void main(String[] args) {
    
    Path path = Paths.get("C:/work/sample.dat");

    try(InputStream is = Files.newInputStream(path)) {
      for (int ch; (ch = is.read()) != -1;) {
        System.out.println((char) ch);
      }
    } catch (IOException ex) {
      System.out.println(ex);
    }
  }

}
