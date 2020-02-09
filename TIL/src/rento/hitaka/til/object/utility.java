package rento.hitaka.til.object;

public class utility {

  public static void main(String[] args) {

    // ユーティリティクラス
    public class StringUtils {
      // staticはつけない
      public boolean isEmpty(String text) {
        return (text == null || text.length() == 0);
      }
    }
    
    public class MainService {
      // ユーティリティクラスのインスタンスを生成し、static扱いにする
      private static StringUtils stringUtils = new StringUtils();
      
      public void execute(String text) {
        // staticインスタンスのメソッドを呼び出す
        if (stringUtils.isEmpty(text)) {
          System.out.println("成功");
        }
      }
    }
    
  }

}
