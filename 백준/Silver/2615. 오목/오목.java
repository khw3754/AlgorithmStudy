import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st;
		int[][] map = new int[19][19];
		for(int i = 0; i < 19; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 19; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++) {
				// 빈 공간이 아니라면 검사
				if(map[i][j] != 0 && !(i >= 15 && j >= 15)) {
					if(check(map, i, j)) {
						System.out.println(map[i][j]);
						System.out.println(Integer.toString(i+1) + ' ' + Integer.toString(j+1));
						return;
					}
				}
			}
		}
		System.out.println(0);

	}
	
	static boolean check(int[][] map, int x, int y) {
		int color = map[x][y];
		// 3방향으로 검사 (우, 대각아래, 아래, 대각위)
		int[] dx = {0, 1, 1, -1};
		int[] dy = {1, 1, 0, 1};
		for(int i = 0; i < 4; i++) {
			boolean result = true;
			for(int count = 1; count < 5; count++) {
				int nx = x + dx[i] * count;
				int ny = y + dy[i] * count;
				
				if(nx < 0 || nx >= 19 || ny < 0 || ny >= 19 || map[nx][ny] != color) {
					result = false;
					break;
				}
			}
			if(result) {
				int nx = x - dx[i];
				int ny = y - dy[i];
				
				if(!(nx >= 0 && nx < 19 && ny >= 0 && ny < 19) || map[nx][ny] != color)
					result = true;
				else
					return false;
				
				nx = x + dx[i] * 5;
				ny = y + dy[i] * 5;
				
				if(!(nx >= 0 && nx < 19 && ny >= 0 && ny < 19) || map[nx][ny] != color)
					return true;
			}
		}
		return false;
	}
}