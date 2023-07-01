

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] list = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			list[i] = tmp;
			sum += tmp;
		}
		
		double max = Arrays.stream(list).max().getAsInt();
		
		System.out.println(sum*100/max/N);
	}
}
