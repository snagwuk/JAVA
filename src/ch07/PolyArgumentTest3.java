package ch07;

import java.util.*;

class Buyer3{      
   int money = 1000;
   int bonusPoint = 0;
   
   //������ �޶����� �ʴ´�.
   
   Vector<Product3> item = new Vector<Product3>();
   //i�� ���� �ʾƵ� ��
   //�ְ������� Object�̴�.
   //array�� �߰� ���� �Ұ���
   //Vector�� �����ϴ�.
   
   
   void buy(Product3 p){
      if(money<p.price){
         System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�");
         return;
      }
      money-=p.price;
      bonusPoint+=p.bonusPoint;
      item.add(p);//���� �ִ´�.
      //�Ķ��Ÿ Ÿ���� object�̴�.
      
      System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
   
   }
   void summury(){
      int sum=0;
      for(int i=0;i<item.size();i++){ //size�� �ٲ��ش�. 
         //vector�� ���͸� �ִ´�.
         Product3 pp = (Product3)item.get(i);
         //object�� �⺻�̴�. ���� �ش�Ǵ� Product3 casting�ؾ� �Ѵ�.
            System.out.println(pp+", "+pp.price+", "+
                  pp.bonusPoint);
            sum+=pp.price;
      }
      System.out.println("�ѱ��űݾ��� : "+sum);
   }
   void refund(Product3 p){
      if(item.remove(p)){
         money+=p.price;
         bonusPoint=+p.bonusPoint;
         System.out.println(p+": ��ǰ");
      }else{
         System.out.println("��ǰ�� �����ϴ�.");
      }
      System.out.println("��ǰ��");
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
      System.out.println("���� ���� ����"+b.money+"�����Դϴ�.");
      System.out.println("���� ���ʽ� ������"+b.bonusPoint+"���Դϴ�.");
      
      System.out.println();
      b.refund(tv);

   }

}