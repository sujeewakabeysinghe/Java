public class FiftyThree{
    public static void main(String[] args){
        int A[][][]=new int[3][4][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    A[i][j][k]=k;
                }
            }
        }
        for(int a[][]:A){
            for(int b[]:a){
                for(int c:b){
                    System.out.print(c+" ");
                }
                System.out.println();
            }
            System.out.println("---------");
        }
    }
}