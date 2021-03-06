package rento.hitaka.til.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InitializeListByAtream {

  public static void main(String[] args) {

    // IntStreamで作成したStreamからboxedメソッドを利用して、intからIntegerにボクシングしてリストにする
    List<Integer> integerList = IntStream.of(1, 62, 31, 54, 31).boxed()
        .collect(Collectors.toList());
    
    System.out.println(integerList);

    // 範囲指定して作成することも可能
    List<Integer> integerListRange = IntStream.rangeClosed(1, 100).boxed()
        .collect(Collectors.toList());

    System.out.println(integerListRange);
  }

}
