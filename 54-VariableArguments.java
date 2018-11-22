public class FiftyFour{
    public static void main(String[] args){
        Show s=new Show();
        s.print(5,6,4,0,2);
        s.print(1,4);
    }
}
class Show{
    void print(int ... a){
        for(int i:a){
            System.out.print(i+" ");   
        }
        System.out.println();
    }
    void print(int a,int b){
        System.out.println("This calls");
    }
}