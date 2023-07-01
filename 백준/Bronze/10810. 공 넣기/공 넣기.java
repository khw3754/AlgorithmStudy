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
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int sta = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			for(int j = sta-1; j < end; j++)
				basket[j] = num;
		}
			
		Arrays.stream(basket).mapToObj(s -> Integer.toString(s)).reduce((a, b) -> a + " " + b).ifPresent(System.out::println);
	}
}
