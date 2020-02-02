package rento.hitaka.til.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermeditateOperationSort {

  public static void main(String[] args) {

    // 「要素の並び変え」

    List<Student> students = new ArrayList<>();
    students.add(new Student("Ken", 100));
    students.add(new Student("Shin", 60));
    students.add(new Student("Takuya", 80));

    students.stream()
      .sorted((s1, s2) -> s2.getScore() - s1.getScore())
      .forEach(System.out::println);

  }
}