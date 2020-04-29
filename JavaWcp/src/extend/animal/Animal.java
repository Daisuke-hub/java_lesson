package extend.animal;

// abstract修飾子をつけて、抽象クラスであることを宣言する
public abstract class Animal {
  protected String name;

  public void eat(){
    System.out.println(name + "が食事をしました");
  }

  // cryメソッドをsubclassに記述しないとコンパイルエラーにできる
  public abstract void cry();

}