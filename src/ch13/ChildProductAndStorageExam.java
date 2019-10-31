package ch13;
class ProductZ<T,M>
{
    private T kind;
    private M model;
    public T getKind()
    {
        return kind;
    }
    public void setKind(T kind)
    {
        this.kind = kind;
    }
    public M getModel()
    {
        return model;
    }
    public void setModel(M model)
    {
        this.model = model;
    }
}
class TvZ
{
    
}
class ChildProduct<T,M,C> extends Product<T,M>
{
    private C company;

    public C getCompany()
    {
        return company;
    }

    public void setCompany(C company)
    {
        this.company = company;
    }
    
}

 interface Storagee<T>
{
     void add(T item, int index);
     T get(int index);
}
class StorangeImp1<T> implements Storagee<T>
{
    
    private T[] array;
    
    @SuppressWarnings("unchecked")
    StorangeImp1(int capacity) 
    {
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index)
    {
        // TODO Auto-generated method stub
        array[index] = item;
    }

    @Override
    public T get(int index)
    {
        // TODO Auto-generated method stub
        return  array[index];
    }


}




public class ChildProductAndStorageExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ChildProduct<TvZ,String,String> product = new ChildProduct<>();
        product.setKind(new TvZ());
        product.setModel("smartTv");
        product.setCompany("samsung");
        
        Storagee<TvZ> storage = new StorangeImp1<TvZ>(100);
        storage.add(new TvZ(), 0);
        TvZ tv = storage.get(0);
        
        }
    
}
