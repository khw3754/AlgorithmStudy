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
		
		String[] board = new String[N];
		for(int i = 0; i < N; i++) {
			board[i] = br.readLine();
		}
		
		int min = 100;
		for(int x = 0; x < N-8+1; x++) {
			for(int y = 0; y < M-8+1; y++) {
				int c = count(board, x, y);
				if(min > c)
					min = c;
			}
		}
		
		System.out.println(min);
	}
	
	static int count(String[] board, int x, int y) {
		int result1 = 0, result2 = 0;
		
		for(int i = x; i < x+8; i++) {
			for(int j = y; j < y+8; j++) {
				if((i + j) % 2 == 0) {
					if(board[i].charAt(j) == 'W')
						result1++;
					else
						result2++;
				}
				else {
					if(board[i].charAt(j) == 'B')
						result1++;
					else
						result2++;
				}
			}
		}
		
		
		return Math.min(result1, result2);
	}
}