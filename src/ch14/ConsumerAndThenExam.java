package ch14;

import java.util.function.Consumer;
class Address
{
    private String country;
    private String city;
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public Address(String country, String city)
    {
        super();
        this.country = country;
        this.city = city;
    }
    
}
class Member
{
    String name;
    String id;
    Address address;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getId()
    {
        return id;
    }
    public Address getAddress()
    {
        return address;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public Member(String name, String id, Address address)
    {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
    }
    
}

public class ConsumerAndThenExam
{
    
    
    public static void main(String[] args)
    {
        Consumer<Member> consumerA = (m) -> 
        {
            System.out.println("ConsumerA :" + m.getName());
        };
        
        Consumer<Member> consumerB = (m) -> 
        {
            System.out.println("ConsumerA :" + m.getId());
        };
        
        // TODO Auto-generated method stub
        Consumer<Member> ConsumerAB = consumerA.andThen(consumerB);
        ConsumerAB.accept(new Member("ȫ�浿","hong",null));
        
    }
    
}
