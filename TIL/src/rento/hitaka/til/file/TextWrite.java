package rento.hitaka.til.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextWrite {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    
    Path path = Paths.get("C:/work/sample.txt");
    
    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
      writer.append("test");
      writer.newLine();
      writer.append("test");
    } catch (IOException ex) {
      System.err.println(ex);
    }

  }

}
