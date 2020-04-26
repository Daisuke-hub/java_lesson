package app;

public class For01 {
  // public static void main(String[] args){
  //   for(int number = 1; number <=5; number++){
  //     System.out.println("For01 = " + number);
  //   }
  // }

  public static void main(String[] args){
    String[] array = {"alpha", "beta", "charlie", "delta", "echo"};
    for(String number :array){
      System.out.println("For02 = " + number);
    }
  }
}