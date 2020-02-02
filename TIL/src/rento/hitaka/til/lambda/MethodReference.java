package rento.hitaka.til.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Xxx", "Yyy", "Zzz");
    // 拡張for
    for (String str : list) {
      System.out.println(str);
    }
    // メソッド参照
    list.forEach(System.out::println);
    // ラムダの場合
    list.forEach(str -> System.out.println(str));
  }

}
