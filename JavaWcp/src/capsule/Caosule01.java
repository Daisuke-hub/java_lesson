package capsule;

import capsule.human.HumanNoCapsule;
import capsule.human.HumanCapsule;

public class Caosule01 {
  public static void main(String[] args){
    HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
    // フィールドの値を直接変更できてしまう。
    human1.name = "今田";
    human1.age = 70;
    System.out.println("名前は" + human1.name + "、年齢は" + human1.age + "です。");

    HumanCapsule human2 = new HumanCapsule("小林", 32);
    System.out.println("名前は" + human2.getName() + "、年齢は" + human2.getAge() + "です。");
    // フィールドの値を取得するために、getter,setterメソッドを使用する
    human2.setName("佐々木");
    System.out.println("変更した名前は" + human2.getName() + "です。");
  }
}