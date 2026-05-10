package com.infosysSample;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FoodStamps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] v = new int[n];
		int[] d = new int[n];
		for(int i = 0; i < n; i++) v[i] = sc.nextInt();
		for(int i = 0; i < n; i++) d[i] = sc.nextInt();
		
		System.out.println(maxTaste(n, m, v, d));
		sc.close();
	}

	private static long maxTaste(int n, int m, int[] v, int[] d) {
		PriorityQueue<Food> pq = new PriorityQueue<>((a, b) -> Long.compare(b.value, a.value));
		
		
		for(int i = 0; i < n; i++)
			pq.add(new Food(v[i], d[i]));
		
		long total = 0;
		
		for(int i = 0; i < m; i++) {
			if(pq.isEmpty()) break;
			
			Food f = pq.poll();
			
			if(f.value <= 0) break;
			
			total += f.value;
			
			long nextValue = f.value - f.decay;
			
			pq.add(new Food(nextValue, f.decay));
		}
		return total;
	}
	
	static class Food {
		long value;
		long decay;
		
		Food(long value, long decay) {
			this.value = value;
			this.decay = decay;
		}
	}
}
