package app;

// 修飾子　class クラス名
public class ClassMethod01 {
  public static void main(String[] args){
    // コンストラクタ => クラス名と同じ名前のメソッドで、初期化したい時に生成する。初期化しない時は引数を指定しない
    // インスタンス =　修飾子 コンストラクタ(引数)
    Human01 yamada = new Human01();
    System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

    Human01 sato = new Human01("佐藤", 25);
    System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
  }
}