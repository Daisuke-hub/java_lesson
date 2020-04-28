package classMethod.human;

public class Human02 {
  // フィールド
  public String name;
  public int age;

  // コンストラクタ(引数なし)
  public Human02(){
    name = "山田";
    age = 20;
  }

  // 引数を宣言して
  // 引数にインスタンスの値を代入している
  // この処理をすることで、他のクラスでも引数を用いて、このクラスを呼び出せる
  public Human02(String name, int age){
    this.name = name;
    this.age = age;
  }
}