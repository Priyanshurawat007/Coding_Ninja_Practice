import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class CountPrime {
	
	// Function to check if a number is prime
	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Function to count primes in the range from s to e
	public int totalPrime(int s, int e) {
		int count = 0;
		for (int i = s; i <= e; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
