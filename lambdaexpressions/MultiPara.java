package lambdaexpressions;
interface Addable{
    int add(int a, int b);
}
public class MultiPara {
    public static void main(String[] args) {
        Addable ad = (int a,int b) -> {
            return a+b;
        };

        Addable ad1 = (a,b) ->  a+b;

        System.out.println(ad.add(4, 5));
        System.out.println(ad1.add(3, 8));
    }
}
