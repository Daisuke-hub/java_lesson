package extend.human;

public class Student extends Human {
  private int score;

  public Student(String name, int age, int score){
    // 引数の無い親のコンストラクタは自動で呼び出される
    // 引数がある場合は、super(引数)で明示的に記述する必要がある
    super(name, age);
    this.score = score;
  }

  public String getStudentProfile(){
    // super.メソッド名()　super.フィールド名で親クラスから呼び出せる
    String profile = "年齢は" + super.age + "です";
    profile += "学生で、テストの点数は" + this.score + "点です";
    return profile;
  }

}