package rento.hitaka.til.exception;

import java.io.IOException;

public class ExampleContinue {
  public static void main(String[] args) {
    
    String strValue = null;
    try {
      // 処理
    } catch(IOException ex) {
      log.error("プロパティの読み込みに失敗しました", ex);
      strValue = "default";
    }
    
  }

}
