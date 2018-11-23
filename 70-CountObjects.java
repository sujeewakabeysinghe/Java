public class Seventy{
    public static void main(String[] args){
        A obj1=new A();
        A obj2=new A();
        A obj3=new A();
        A obj4=new A();
        obj2.print();
    }
}
class A{
    static int i;
    public A(){
        i++;
    }
    void print(){
        System.out.println(i);
    }
}