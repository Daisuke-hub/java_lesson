package classMethod.human;

public class Human04 {
  // static変数
  static public int humanCount = 0;
  public String name;

  // 定数フィールド
  public static final String GREETING = "こんにちわ";
  
  public Human04(String name){
    this.name = name;
    // インスタンス生成ごとにstatic変数をインクリメント
    Human04.humanCount++;
  }

  // staticをつけると呼び出し方法が変わる
  // クラス指定で呼び出す
  static public void staticMethodPrint(){
    // static メソッドからインスタンス変数は使用できない(コンパイルエラー)
    // System.out.println("名前は、" + Human04.humanCount);
    // static 変数のhumanCountを表示
    System.out.println("人の数は" + Human04.humanCount);
  }

  // staticをつけない場合は、変数を指定して実行できる
  public void instanceMethodPrint(){
    System.out.println("名前は" + name);
    System.out.println("人の数は" + Human04.humanCount);
  }
}