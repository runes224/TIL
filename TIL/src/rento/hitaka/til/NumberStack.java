package rento.hitaka.til;

import java.util.ArrayList;
import java.util.List;

public class NumberStack<E extends Number> {
  // EはNumberクラスまたはそのサブクラスでなけらばならない
  private List<E> taskList;
  
  private NumberStack( ) {
    taskList = new ArrayList<>();
  }
  
  public boolean push(E task) {
    System.out.println("Added" + task.intValue() + "(integer)");
    return taskList.add(task);
  }
  
  public E pop() {
    if(taskList.isEmpty()) {
      return null;
    }
    
    return taskList.remove(taskList.size() - 1);
  }
}
