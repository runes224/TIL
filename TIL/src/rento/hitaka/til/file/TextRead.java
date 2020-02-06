package rento.hitaka.til.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextRead {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    
    Path path = Paths.get("C:/work/sample.txt");
    
    try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
      for (String line; (line = reader.readLine()) != null; ) {
        System.out.println(line);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }

  }

}
