package app;

public class If01 {
  // public static void main(String[] args){
  //   int number = 7;
  //   if (number < 5){
  //     System.out.println(number +"は5未満です");
  //   }
  //   if (number < 10){
  //     System.out.println(number + "は10未満です");
  //   }
  //   if (number < 15){
  //     System.out.println(number + "は15未満です");
  //   }
  // }

  public static void main(String[] args){
    int number2 = 10;
    if(number2 < 5){
      System.out.println(number2 + "は5未満です");
    }else if(number2 < 10){
      System.out.println(number2 + "は10未満です");
    }else{
      System.out.println(number2 + "は10以上です");
    }
  }
}