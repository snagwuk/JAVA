package ch15;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Map<String,String> map = new Hashtable<String,String>();
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("아이디와 비밀번호를 입력");
            System.out.print("아이디 : "); String id = sc.nextLine();
            System.out.print("비밀번호 : "); String pw = sc.nextLine();
            System.out.println();
            if(map.containsKey(id))
            {
                if(map.get(id).equals(pw))
                {
                    System.out.println("로그인되었습니다.");
                    break;
                }
                else
                    System.out.println("비밀번호 불일치");
            }
            else
                System.out.println("아이디 불일치");
            
        }
    }
    
}
