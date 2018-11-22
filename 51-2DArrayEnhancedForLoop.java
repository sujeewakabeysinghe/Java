public class FiftyOne{
    public static void main(String[] args){
        int A[][]={
            {5,4,7,2},
            {1,8,6,4},
            {8,0,6,3}
        };
        for(int i[]:A){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}