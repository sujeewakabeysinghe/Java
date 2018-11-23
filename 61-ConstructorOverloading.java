public class SixtyOne{
    public static void main(String[] args){
        A a=new A(2,5,4);
    }
}
class A{
    public A(){
        System.out.println("Sujeewa K. Abeysinghe");
    }
    public A(int i){
        System.out.println("University of Moratuwa");
    }
    public A(int ... j){
        System.out.println("Faculty of Information Technology");
    }
}