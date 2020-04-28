package practice;

public class Car {
  // 使用する変数を宣言する
  private double fuelCost;
  private double fuelAmount;

  public Car(double fuelCost, double fuelAmount){
    // 変数に引数で受け取った値を代入しておく
    this.fuelCost = fuelCost;
    this.fuelAmount = fuelAmount;
  }

  public void move(int km){
    System.out.println(km + "km走ります");
    this.fuelAmount -= (km / fuelCost);
  }

  // thisの用途が不明。this使わなくても表示できる
  // 引数を指定して無いのにvoidを指定していないのが理解できない
  // クラスとして変数を指定できる？
  public double getFuelAmount(){
    // 実行元に値を返す場合にreturnを使用する
    return this.fuelAmount;
  }
}