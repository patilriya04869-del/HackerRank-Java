// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-05, 11:21 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");

        sc.close();
    }
}
