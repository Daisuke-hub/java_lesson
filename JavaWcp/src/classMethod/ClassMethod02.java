package classMethod;

// 他のパッケージのクラスを使用する場合に、パッケージとクラス名を宣言すると
// クラス名だけで他のパッケージのクラスが使用できるようになる
import classMethod.human.Human02;

public class ClassMethod02 {
  public static void main(String[] args) {
    Human02 yamada = new Human02();
    System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

    // classMethod.human.Human02 sato = new classMethod.human.Human02("佐藤", 25);
    Human02 sato = new Human02("佐藤", 25);
    System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
  }
}