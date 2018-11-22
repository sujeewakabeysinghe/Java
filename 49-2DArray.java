public class Fourtynine{
    public static void main(String[] args){
        int A[][]={
            {5,4,7,2},
            {1,8,6,4},
            {8,0,6,3}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}