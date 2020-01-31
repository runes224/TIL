package rento.hitaka.til;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBeforeJava7 {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Ken", 100));
    students.add(new Student("Shin", 60));
    students.add(new Student("Takuya", 80));

    Collections.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getScore(), student2.getScore());
      }
    });
  }
}
