package ch07;

import java.util.*;

class Buyer3{      
   int money = 1000;
   int bonusPoint = 0;
   
   //내용은 달라지지 않는다.
   
   Vector<Product3> item = new Vector<Product3>();
   //i는 쓰지 않아도 됨
   //최고조상인 Object이다.
   //array는 추가 삭제 불가능
   //Vector는 가능하다.
   
   
   void buy(Product3 p){
      if(money<p.price){
         System.out.println("잔액이 부족하여 물건을 살수 없습니다");
         return;
      }
      money-=p.price;
      bonusPoint+=p.bonusPoint;
      item.add(p);//집어 넣는다.
      //파라메타 타입은 object이다.
      
      System.out.println(p+"을/를 구입하셨습니다.");
   
   }
   void summury(){
      int sum=0;
      for(int i=0;i<item.size();i++){ //size로 바꿔준다. 
         //vector는 들어간것만 넣는다.
         Product3 pp = (Product3)item.get(i);
         //object가 기본이다. 따라서 해당되는 Product3 casting해야 한다.
            System.out.println(pp+", "+pp.price+", "+
                  pp.bonusPoint);
            sum+=pp.price;
      }
      System.out.println("총구매금액은 : "+sum);
   }
   void refund(Product3 p){
      if(item.remove(p)){
         money+=p.price;
         bonusPoint=+p.bonusPoint;
         System.out.println(p+": 반품");
      }else{
         System.out.println("제품이 없습니다.");
      }
      System.out.println("반품함");
   }
}
class Product3{
   int price;      
   int bonusPoint; 
   Product3(int price){
      this.price = price;
      bonusPoint = (int)(price/10.0); 
   }
}
class Tv3 extends Product3{
   Tv3(){
      super(100);
   }
   @Override
   public String toString(){
      return "Tv";
   }   
}
class Computer3 extends Product3{
   Computer3(){
      super(200);
   }
   @Override
   public String toString(){
      return "Computer";
   }
   
}

public class PolyArgumentTest3 {

   public static void main(String[] args) {
      Buyer3 b = new Buyer3();
      Tv3 tv = new Tv3();
      Computer3 computer = new Computer3();
      
      b.buy(tv);
      b.buy(computer);
      System.out.println();
      b.summury();
      System.out.println();
      
      
      b.refund(computer);
      System.out.println();
      b.summury();
      System.out.println();
      System.out.println("현재 남은 돈은"+b.money+"만원입니다.");
      System.out.println("현재 보너스 점수는"+b.bonusPoint+"점입니다.");
      
      System.out.println();
      b.refund(tv);

   }

}