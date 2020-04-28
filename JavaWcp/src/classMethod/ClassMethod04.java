package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
  // public の用途が不明
    public static void main(String[] args){
    Human04 yamada = new Human04("山田");
    Human04 sato = new Human04("佐藤");

    Human04.staticMethodPrint();
    System.out.println(Human04.GREETING);

    // instanceMechodPrintにyamadaを指定して実行してから、yamda.nameを出力する
    yamada.instanceMethodPrint();
    System.out.println(yamada.name);
  }
}