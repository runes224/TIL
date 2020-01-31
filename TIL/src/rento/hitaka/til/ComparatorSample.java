package rento.hitaka.til;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSample {

  public static void main(String[] args) {

    Integer[] array = {3, 1, 13, 2, 8, 5, 1};
    System.out.println(Arrays.toString(array));
    
    Comparator<Integer> c = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };
    
    Arrays.sort(array, c);
    System.out.println(Arrays.toString(array));
  }

}
