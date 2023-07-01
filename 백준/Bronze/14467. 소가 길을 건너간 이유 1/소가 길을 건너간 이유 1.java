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
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		HashMap<Integer, Integer> cows = new HashMap<Integer, Integer>();
		for(int i = 1; i <= 10; i++) {
			cows.put(i, -1);
		}
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int cow_num = Integer.parseInt(st.nextToken());
			int pos = Integer.parseInt(st.nextToken());
			
			if(cows.get(cow_num) == -1)
				cows.put(cow_num, pos);
			else if(cows.get(cow_num) != pos){
				cows.put(cow_num, pos);
				count++;
			}
		}
		
		System.out.println(count);
	}
}