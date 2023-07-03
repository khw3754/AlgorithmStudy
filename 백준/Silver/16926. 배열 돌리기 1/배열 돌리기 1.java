import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] lines = makeLines(map);
		lines = rotate(lines, R);
		
		map = make_map(map, lines);
        
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			Arrays.stream(map[i]).forEach(s -> sb.append(Integer.toString(s) + ' '));
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
	
	static int[][] makeLines(int[][] map){
		int N = map.length;
		int M = map[0].length;
		int l = Math.min(N, M) / 2;
		int[][] lines = new int[l][N*2 + M*2 - 4];
		for(int i = 0; i < l; i++) {
			Arrays.fill(lines[i], -1);
		}
		
		// lines 만들기
		for(int i = 0; i < l; i++) {
			int x = i, y = i;
			int NN = N - i*2;
			int MM = M - i*2;
			
			int count = 0;
			for(int p = 0; p < NN; p++)
				lines[i][count++] = map[x+p][y];
			for(int p = 1; p < MM; p++)
				lines[i][count++] = map[x + NN-1][y+p];
			for(int p = NN - 2; p >= 0; p--)
				lines[i][count++] = map[x + p][y + MM-1];
			for(int p = MM - 2; p > 0; p--)
				lines[i][count++] = map[x][y + p];
		}
		
		return lines;
	}
	
	static int[][] rotate(int[][] lines, int R) {
		int l = lines.length;
		int ll = lines[0].length;
		
		for(int r = 0; r < R; r++) {
			int[][] new_lines = new int[l][ll];
			for(int i = 0; i < l; i++) {
				for(int j = 1; j < ll; j++) {
					new_lines[i][j] = lines[i][j-1];
				}
				
				int tmp = ll - 1;
				int last = lines[i][tmp];
				if(last == -1) {
					while(last == -1) {
						tmp--;
						last = lines[i][tmp];
					}
					new_lines[i][tmp+1] = -1;
				}
				new_lines[i][0] = last;
			}
			lines = new_lines;
		}
		
		return lines;
	}
	
	static int[][] make_map(int[][] map, int[][] lines){
		int N = map.length;
		int M = map[0].length;
		int l = lines.length;
		
		// map에 적용
		for(int i = 0; i < l; i++) {
			int x = i, y = i;
			int NN = N - i*2;
			int MM = M - i*2;
			
			int count = 0;
			for(int p = 0; p < NN; p++)
				map[x+p][y] = lines[i][count++];
			for(int p = 1; p < MM; p++)
				map[x + NN-1][y+p] = lines[i][count++];
			for(int p = NN - 2; p >= 0; p--)
				map[x + p][y + MM-1] = lines[i][count++];
			for(int p = MM - 2; p > 0; p--)
				map[x][y + p] = lines[i][count++];
		}
		
		return map;
	}
}