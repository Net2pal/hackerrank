//You are given a list(1-indexed) of size n, initialized with zeroes. You have to perform m operations on the list and output the maximum of final values of all the n elements in the list. For every operation, you are given three integers a, b and k and you have to add value k to all the elements ranging from a index  to b  (both inclusive).
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] deltas = new long[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();

			deltas[a - 1] += k;
			if (b < deltas.length) {
				deltas[b] -= k;
			}
		}

		long maxNumber = Long.MIN_VALUE;
		long number = 0;
		for (int i = 0; i < deltas.length; i++) {
			number += deltas[i];
			maxNumber = Math.max(maxNumber, number);
		}
		System.out.println(maxNumber);

		sc.close();
    }
}
