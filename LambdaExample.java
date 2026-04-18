@FunctionalInterface
interface Math
{
    int add(int a,int b);
}
public class LambdaExample {

    public static void main(String[] args) {
        Math obj=new Math()
        {
            @Override
            public int add(int a,int b)
            {
                return a+b;
            }
        };
        System.out.println(obj.add(11,22));
    }
}
