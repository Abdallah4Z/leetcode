package codeForces.sakurakosFieldTrip;

import java.util.*;

public class Main {

//    public static void print(int[] arr){
//            System.out.println(Arrays.toString(arr));
//    }

    public static int[] swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static int disturbance (int[] arr) {
        int dis = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                dis++;
        }
        return dis;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j  = 0 ; j< t ; j++){
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i =n/2-1 ;i>=0;i--) {
                if (a[i] == a[i + 1] || a[n - i - 1] == a[n - i - 2]) {
                    a = swap(a, i, n-i-1);
                }
            }
            System.out.println(disturbance (a));
        }
    }

}