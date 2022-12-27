import java.util.*;

class identicalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter no. of rows: ");
        int R = sc.nextInt();
        System.out.println();
        System.out.println("Enter no. of cols: ");
        int C = sc.nextInt();
        int[][] A = new int[R][C];
        System.out.println();
        System.out.println("Enter Matrix 1 elements: ");
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] B = new int[R][C];
        System.out.println();
        System.out.println("Enter Matrix 2 elements: ");
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int ans = verifyEquality(R, C, A, B);
        if ( ans == 1) {
            System.out.println();
            System.out.println("Identical Matrices!");
            System.out.println();
        }
        else { 
            System.out.println();
            System.out.println("Non-identical Matrices");
            System.out.println();
        }
        sc.close();
    }

    public static int verifyEquality(int R, int C, int[][] A, int[][] B) {
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                if (A[i][j] == B[i][j]) continue;
                else return 0;
            }
        }
        return 1;
    }
}