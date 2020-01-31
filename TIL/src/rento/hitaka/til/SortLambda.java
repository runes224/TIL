package rento.hitaka.til;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLambda {

  public static void main(String[] args) {
    
    List<Student> students = new ArrayList<>();
    students.add(new Student("Ken", 100));
    students.add(new Student("Shin", 60));
    students.add(new Student("Takuya", 80));
    
    Collections.sort(students, (student1, student2) ->
    Integer.compare(student1.getScore(), student2.getScore()));

    System.out.println(students);
  }

}
