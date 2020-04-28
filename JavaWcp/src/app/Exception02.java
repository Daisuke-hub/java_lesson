package app;

public class Exception02 {
  public static void main(String[] args){
    try{
      System.out.println("100 / 0 は？");
      int result = 100 / 0;
      System.out.println("計算結果" + result);
    }catch (ArithmeticException e){
      System.out.println("例外が発生");
    }finally{
      System.out.println("プログラム終了");
    }
  }

  // try{
  // 例外が発生する可能性のある処理
  // }catch (例外クラス 変数名){
  //  例外が発生した場合の処理
  // }catch (例外クラス 変数名){
  //  例外が発生した場合の処理
  // }finally{
  //  例外の有無に関わらず、必ず実行される処理 
  // }

}