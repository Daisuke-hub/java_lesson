package app;

public class Human01 {
  // フィールド
  public String name;
  public int age;

  // コンストラクタ(引数なし)
  public Human01(){
    name = "山田";
    age = 20;
  }

  // コンストラクタ(引数あり)
  public Human01(String name, int age){
    this.name = name;
    this.age = age;
  }

}