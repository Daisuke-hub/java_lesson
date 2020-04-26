package app;

public class Variable01 {
  public static void main(String[] args) {
    int num1 = 10;
    String str1 = "Hello World!";
    // str1 = null;
    System.out.println(str1 + "文字" + str1.length());
    // num1 = 10;
    // str1 = "Hello World!";
    System.out.println(num1);
    System.out.println(str1);

    num1 = 20;
    System.out.println(num1);

    int num2 = 30;
    System.out.println(num2);

    final int NUMBER = 15;
    System.out.println(NUMBER);

    int[] array1 = new int[3];
    array1[0] = 60;
    array1[1] = 20;
    array1[2] = 40;
    int int2 = array1[2];
    int array2[] = null;
    // []は変数の後でも、intの後でもok

    System.out.println(int2);
    System.out.println(array2);
  }
}