package datastructures.BigONotation;

public class BigO {

    public static void main(String[] args) {
        int n = 10;
        int m = 15;

        //O(N)
        BigOOfN(n);

        //O(N^2)
        BigOOfN2(n);

        //O(1)
        BigOOf1(n);

        //O(2N)
        BigOOF2N(n);

        //O(N+M)
        DifferentInputs(n, m);

    }

    private static void DifferentInputs(int n, int m) {
        for (int i = 0; i < n; i++) { // -> n operation
            // -> o(n)
            System.out.println(i);
        }
        for (int j = 0; j < m; j++) { // -> m operation
            // -> o(n)
            System.out.println(j); // O(N)+ 0(M) -> O(N+M)

        }
    }

    private static void BigOOF2N(int n) {
        for (int i = 0; i < n; i++) { // -> n operation
            // -> o(n)
            System.out.println(i);
        }
        for (int j = 0; j < n; j++) { // -> n operation
            // -> o(n)
            System.out.println(j); // O(N)+ 0(N) -> O(2N) -> 0(N)

        }
    }

    private static void BigOOf1(int n) {
        System.out.println(n + n + n); //only one operation
    }

    private static void BigOOfN2(int n) {
        for (int i = 0; i < n; i++) { // -> N operation //-> O(N)
            for (int j = 0; j < n; j++) { // -> N operation //-> O(N)
                System.out.println(i + " " + j); // O(N) + 0(N) -> 0(N^2)
            }
        }
    }

    private static void BigOOfN(int n) {
        for (int i = 0; i < n; i++) { // -> n operation
            // -> o(n)
            System.out.println(i);
        }
    }
}
