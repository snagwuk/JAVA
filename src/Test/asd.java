package Test;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class asd {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
       boolean run=true;   
         Buyers b = new Buyers();
         while(run){
            System.out.println("1. ��ǰ��ĵ");
            System.out.println("2. �������");
            System.out.println("3. ����Ʈ����");
            System.out.println("4. ���������");
            System.out.print("����>");
            
            int selectNo=scan.nextInt();
            
            if(selectNo==1){
              
               b.scaner();
            }else if(selectNo==2){
               b.payment();
            }else if(selectNo==3){
               b.summery();
            }else if(selectNo==4){
               run=false;
            }
         }      
      }
      
}
          
         
      
   

class Custemer extends Buyers{
   int cusmoney = 100000;
   int cardmoney=200000;
   int cardnum;
   int csname;
   int cardpoint;
Custemer[]card = new Custemer[100];

   }

   class Buyers{

        int money = 10000;
         int point = 0;
         int fruitcnt = 0;
         int snackcnt = 0;
         int drinkcnt=0;
         int cnt = 0;
         Food [] barcode= new Food [20];
         int productcode;
         Food[]item = new Food[10];
         static int amount=0;
      void buy(Food f){
        if (money < f.price) {
            System.out.println("�ܾ׺���");
            return;}
            money-=f.price;
            point+=f.point;
            
            System.out.println(f+" ���� ��ǰ ���� : "+f.price);
            item[cnt++]=f;
            if(f instanceof Fruit)++fruitcnt;
            if(f instanceof Drink)++drinkcnt;
            if(f instanceof Snack)++snackcnt;}
      
      public void scaner(){   
         
      System.out.print("[��� : enter 0 ][��ǰ ��ĵ :  ");
      boolean continu = true;
      while (continu) {
         for (int i = 0; i < barcode.length; i++) {
            Scanner scan = new Scanner(System.in);
            cnt = scan.nextInt();
            if (cnt == 1001) {
                barcode[i] = new Apple();
                          

               System.out.println("��ǰ�� : " + barcode[i].getPdname() + "  ���� : " +barcode[i].getPrice());
               System.out.print("[��ǰ ��ĵ :  ");
            }
            if (cnt == 1002)
            {
               barcode[i] = new Peach("������", "1000", "1002");

               System.out.println("��ǰ�� : " + barcode[i].pdname + "  ���� : " + barcode[i].price);
               System.out.print("[��ǰ ��ĵ :  ");
            }
            if (cnt == 0) {
//               payment();
               break;

            }
         }
      }
   }

      public int countamount(String code){
         int cnt=0;
         for(int i =0; i<barcode.length;i++)
            if(code.equals(barcode[i].pdname)
               cnt+=1;
            
         
      return cnt; }
    public void payment(){
      System.out.println("card = 1 , cash = 2");
    }
         
      
         
      
      
      
      
      
      
      

      void summery(){
         String foodlist = "", fruitlist = "", snacklist = "",drinklist = "";
         int sum = 0,fruitsum = 0,drinksum = 0,snacksum = 0;
      for(int i =0; i<cnt;i++){
         if(item[i] instanceof Fruit){
            fruitlist+=barcode[i]+" "; fruitsum+=barcode[i].price;
         }else if (item[i] instanceof Drink){
            drinklist+=item[i]+" "; drinksum+=item[i].price;
         }else if (item[i] instanceof Snack){
            snacklist+=item[i]+" "; snacksum+=item[i].price;
         }sum+=item[i].price;
               foodlist+=item[i]+" ";}
      
      System.out.println("---------------------------------");
      System.out.println("��¥�ð�"+LocalDateTime.now());
      System.out.println("ǰ��"+fruitcnt+", ���űݾ�:"+fruitsum+"  ���ϱ��Ÿ��"+fruitlist);
      System.out.println("ǰ��"+drinkcnt+", ���ᱸ�űݾ�:"+drinksum+"  ���ᱸ�Ÿ��"+drinklist);
      System.out.println("ǰ��"+snackcnt+", ���ڱ��űݾ�:"+snacksum+"  ���ڱ��Ÿ��"+snacklist);
      System.out.println("���� �ܾ� : "+money+" , ��������Ʈ : "+point);
       System.out.println("�Ѽ���"+cnt+", �ѱ��űݾ�:"+sum+"  ���Ÿ�� : "+foodlist);
   }
   }
   class Food {
      String price;
   
      String productcode;
      String pdname;  
      
      
      public String getPrice()
    {
        return price;
    }


    public void setPrice(String price)
    {
        this.price = price;
    }


    public String getProductcode()
    {
        return productcode;
    }


    public void setProductcode(String productcode)
    {
        this.productcode = productcode;
    }


    public String getPdname()
    {
        return pdname;
    }


    public void setPdname(String pdname)
    {
        this.pdname = pdname;
    }


    Food(String pdname,String price,String productcode2) {
         this.pdname=pdname;
         this.productcode=productcode;
         this.price = price;
        
      }
   }

   class Fruit extends Food {
   
      Fruit(String pdname,String price, String productcode) {
         super(pdname, price, productcode);
       }
   @Override
      public String toString() {
      return super.toString() + "��ǰ�ڵ�: " + productcode;
      }
   }

   class Apple extends Fruit {
       Apple()
       {
           super("���", "1000", "1001");
       }
      Apple(String pdname,String price, String productcode) 
      {
          super(pdname, price, productcode);
      }
      

      @Override
      public String toString() {
      return "���";
      }
   }

   class Peach extends Fruit {
   Peach(String pdname,String price, String productcode) {
         super(pdname,price, productcode);this.pdname="������";}

      @Override
      public String toString() {
         return "������";}
   }

   