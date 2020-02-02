package rento.hitaka.til.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermeditateOperationFilter {

  public static void main(String[] args) {

    // 「要素の絞り込み」

    List<Student> students = new ArrayList<>();
    students.add(new Student("Ken", 100));
    students.add(new Student("Shin", 60));
    students.add(new Student("Takuya", 80));

    students.stream().filter(s -> s.getScore() > 70)
    .forEach(System.out::println);
    
  }
}
