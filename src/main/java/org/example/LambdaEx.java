package org.example;
@FunctionalInterface
interface A{
    public  void add(int n1,int n2);
}
public class LambdaEx {
    public static void main(String[] args)
    {
        A obj=(n1,n2)->{
            int result=n1+n2;
            System.out.println("sum of n & n2 is "+result);
        };
        obj.add(23,70);
        obj.add(123565544,765433);
    }
}
