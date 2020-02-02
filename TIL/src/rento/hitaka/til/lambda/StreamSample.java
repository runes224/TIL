package rento.hitaka.til.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample {

  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("Sato");
    list.add("Koji");
    list.add("Kawamura");
    Stream<String> stream = list.stream();
    stream.forEach(System.out::println);
    
    Stream<String> stream1 = Stream.of("Murata", "Okada", "Tanihiro");
    stream1.forEach(System.out::println);
    
    // MapからStreamを作成する
    Map<String, String> map = new HashMap<>();
    map.put("1", "Murata");
    map.put("2", "Okada");
    map.put("3", "Tanimoto");
    
    Stream<Entry<String, String>> stream2 = map.entrySet().stream()
;
    stream2.forEach(e -> System.out.println(e.getKey() + "." + e.getValue()));
  
  // 数値範囲からStreamを作成する
  IntStream stream3 = IntStream.range(1, 5);
  stream3.forEach(System.out::print);

  IntStream stream4 = IntStream.rangeClosed(1, 5); //末尾の値を含む
  stream4.forEach(System.out::print);
  
  // for文を使った処理
  int count = 5;
  for (int i=0; i < count; i++) {
    System.out.println(i);
  }
  
  // IntStreamを使った繰り返し処理
  IntStream.range(0, count).forEach(i -> {
    System.out.println(i);
  });
  
  

  }
}
