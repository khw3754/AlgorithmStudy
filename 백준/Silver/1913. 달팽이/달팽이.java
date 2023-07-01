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
		int target = Integer.parseInt(br.readLine());
		
		int[][] map = new int[N][N];
		
		int x = N/2, y = N/2;
		int count = 1;
		map[x][y] = count;
		
		int move = 1;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int v = 0;
		boolean nn = false;
		
		while(map[0][0] == 0) {
			for(int i = 0; i < move; i++) {
				x = x + dx[v];
				y = y + dy[v];
				
				map[x][y] = ++count;
				
				if(x == 0 && y == 0)
					break;
			}
			
			if(nn)
				move++;
			nn = !nn;
			v++;
			if(v == 4)
				v = 0;
		}
		
		StringBuilder sb = new StringBuilder();
		int tx = 0, ty = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(Integer.toString(map[i][j])).append(' ');
				if(map[i][j] == target) {
					tx = i + 1;
					ty = j + 1;
				}
			}
			sb.append('\n');
		}
		System.out.print(sb.toString());
		System.out.println(Integer.toString(tx) + ' ' + Integer.toString(ty));
	}
}