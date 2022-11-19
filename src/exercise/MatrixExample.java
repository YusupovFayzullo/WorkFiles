package exercise;

public class MatrixExample {

    public static void main(String args[]) {

        int a[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int b[][] = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}};


        int c[][] = new int[3][5];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Done");

        System.out.println("Hello from me");
        System.out.println("Hello from me");
    }
}

