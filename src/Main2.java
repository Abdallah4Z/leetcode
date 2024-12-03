import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // length of the line of students
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();  // topics of interest
            }

            // Calculate initial disturbance (consecutive same topics)
            int disturbance = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    disturbance++;
                }
            }

            // Output the minimal disturbance
            System.out.println(disturbance);
        }
        sc.close();
    }
}
