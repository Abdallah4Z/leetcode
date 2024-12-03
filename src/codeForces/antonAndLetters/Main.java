package codeForces.antonAndLetters;

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