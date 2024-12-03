//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), k = in.nextInt(), q = in.nextInt();
//        int[] temps  = new int[200001];
//        for (int i =0 ; i < n  ;i ++){
//            int f = in.nextInt();
//            int s = in.nextInt();
//            for (;f<=s;f++){
//                temps[f]++;
//            }
//        }
//        for (int i =1 ; i < temps.length ; i++){
//            if (temps[i]< k)
//                temps[i] = 0;
//        }
//
//        //q
//        for (int i =0 ; i < q  ;i ++){
//            int c = 0;
//            int f = in.nextInt();
//            int s = in.nextInt();
//            for (;f<=s;f++){
//                if (temps[f] >= k)
//                    c++;
//            }
//            System.out.println(c);
//        }
//    }
//}



//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), q =in.nextInt();
//        int[] arr = new int[n];
//        int[] temp = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        for (int i =0 ; i< q;i++){
//            int f = in.nextInt();
//            int s = in.nextInt();
//            f--;
//            for (;f<s;f++){
//                temp[f]++;
//            }
//        }
//
//        Arrays.sort(arr);
//        Arrays.sort(temp);
//        long sum = 0;
//        for (int i =0 ; i < arr.length;i++){
//            sum+= (long) arr[i] *temp[i];
//        }
//        System.out.println(sum);
//    }
//}
//
//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] r = new int[n];
//        for (int i = 0; i < n; i++) {
//            r[i] = in.nextInt();
//        }
//        for (int k : r) {
//            int c = 1;
//            for (int i = 0; i < r.length; i++) {
//                if (r[i] > k)
//                    c++;
//            }
//            System.out.print(c + " ");
//        }
//    }
//}
//



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Set<Character> chars = new HashSet<>();
        for (int i =0 ; i < s.length(); i++){
            if (s.charAt(i) >= 'a'&& s.charAt(i) <= 'z'){
                chars.add(s.charAt(i));
            }
        }
        System.out.println(chars.size());
    }
}

