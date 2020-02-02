package rento.hitaka.til.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalPperation {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Xxx", "Yyy", "Zzz");
    
    List<String> newList = list.stream()
        .filter(p -> p.length() > 5)
        .collect(Collectors.toList());
  }

}
