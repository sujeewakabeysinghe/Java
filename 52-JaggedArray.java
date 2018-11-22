public class FiftyTwo{
    public static void main(String[] args){
        int A[][]=new int[3][];
        A[0]=new int[4];
        A[1]=new int[3];
        A[2]=new int[2];
        System.out.println(A[0].length);
        System.out.println(A[1].length);
        System.out.println(A[2].length);
        for(int a=0;a<3;a++){
            for(int b=0;b<A[a].length;b++){
                A[a][b]=b;
            }
        }
        for(int i[]:A){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}