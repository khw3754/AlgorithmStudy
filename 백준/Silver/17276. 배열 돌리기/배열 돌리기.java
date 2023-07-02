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
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			if(d < 0)
				d = 360 + d;
			
			// 입력 받음
			int[][] map = new int[n][n];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			make(map, d);
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++) {
				Arrays.stream(map[i]).forEach(s -> sb.append(Integer.toString(s) + ' '));
				sb.append('\n');
			}
			System.out.print(sb.toString());
		}
	}
	
	// 각 행을 돌리고 반환하는 함
	static int[][] rotate(int[][] map, int count) {
		int n = map.length;
		int[][] lines = new int[4][n]; 
		
		int[] x = {n-1, n/2, 0, 0};
		int[] y = {0, 0, 0, n/2};
		int[] dx = {-1, 0, 1, 1};
		int[] dy = {1, 1, 1, 0};
		// 돌려야하는 라인 식별
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < n; j++) {
				int posx = x[i] + dx[i] * j;
				int posy = y[i] + dy[i] * j;
				lines[i][j] = map[posx][posy];
			}
		}
		
		// 돌림
		for(int c = 0; c < count; c++) {
			int[][] newLines = new int[4][n];
			for(int i = n-1, j =0; i >= 0; i--, j++) {
				newLines[0][j] = lines[3][i];
			}
			for(int i = 1; i < 4; i++) {
				for(int j = 0; j < n; j++) {
					newLines[i][j] = lines[i-1][j];
				}
			}
			lines =	Arrays.stream(newLines).map(int[]::clone).toArray(int[][]::new);
		}
		
		return lines;
	}
	
	// 돌려서 실제 map에 적용하는 함
	static void make(int[][] map, int d) {
		int n = map.length;
		int[][] lines = rotate(map, d / 45); 
		
		int[] x = {n-1, n/2, 0, 0};
		int[] y = {0, 0, 0, n/2};
		int[] dx = {-1, 0, 1, 1};
		int[] dy = {1, 1, 1, 0};
		// 돌린 라인들을 map에 적용
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < n; j++) {
				int posx = x[i] + dx[i] * j;
				int posy = y[i] + dy[i] * j;
				map[posx][posy] = lines[i][j];
			}
		}
	}
}