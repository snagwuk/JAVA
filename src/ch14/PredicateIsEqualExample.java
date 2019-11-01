package ch14;

public class PredicateIsEqualExample {

        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
                Predicate<String> predicate;
                
                predicate = Predicate.isEqual(null);
                System.out.println("null, null: "+predicate.test(null));
                
                predicate = Predicate.isEqual("Java8");
                System.out.println("null, Java8: "+predicate.test(null));
                
                predicate = Predicate.isEqual(null);
                System.out.println("Java8, null: "+predicate.test("Java8"));
                
                predicate = Predicate.isEqual("Java8");
                System.out.println("Java8, Java8: "+predicate.test("Java8"));
                
                predicate = Predicate.isEqual("Java8");
                System.out.println("Java7, Java8: "+predicate.test("Java7"));
        }

}

interface Predicate<T>
{
    public boolean test(T arg0);
    static <U> Predicate isEqual(U u)
    {
        Predicate p = (t) ->
        {
            if(u == null && t==null) return true;
            if(u!= null && t!=null) return t.equals(u);
            return false;
        };
        return p;
    }
}