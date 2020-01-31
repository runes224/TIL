package rento.hitaka.til;

public class Generitics {
  GenericStack<String> genStack = new GenericStack<>();
  
  genStack.push("Scala");
  genStack.push("Groovy");
  genStack.push("Java");
  
  String genElement = genStack.pop();

}
