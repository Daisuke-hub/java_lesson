package app;

public class Chapter08 {
  public static void main(String[] args){
    int number = 2;
    while(number <= 100){
      System.out.println(number);
      number *= 2;
    }

    int array[] = {1, 4, 20 ,31};
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }

    for(int val :array){
      if (val % 2 == 0){
        continue;
      }
      System.out.println(val);
    }
  }
}