package ch16_1;

public class Product
{
    private int month;
    private int con;
    private String car;
    private int qty;
    private String remark;
    public Product(int month, int con, String car, int qty, String remark)
    {
        this.month = month;
        this.con = con;
        this.car = car;
        this.qty = qty;
        this.remark = remark;
    }
    
    @Override
    public String toString()
    {
        return month + "월, 조건=" + (getCon()==1?"생산": getCon()==2 ? "판매" : "반품") +", car="+ car + ", qty="
                + getQty() + ", remark=" + remark;
    }
    
    public int getMonth()
    {
        return month;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getCon()
    {
        return con;
    }
    public void setCon(int con)
    {
        this.con = con;
    }
    public String getCar()
    {
        return car;
    }
    public void setCar(String car)
    {
        this.car = car;
    }
    public int getQty()
    {
        return qty;
    }
    public void setQty(int qty)
    {
        this.qty = qty;
    }
    public String getRemark()
    {
        return remark;
    }
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
} 
