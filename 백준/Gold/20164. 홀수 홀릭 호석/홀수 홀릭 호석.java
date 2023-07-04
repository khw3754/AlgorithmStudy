import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		String N = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(calc(N, 'm')).append(' ').append(calc(N, 'M'));
		System.out.println(sb.toString());
	}
	
	static int calc(String N, char goal) {
		int count = 0;
		for(int i = 0; i < N.length(); i++) {
			if((N.charAt(i) - '0') % 2 == 1) {
				count++;
			}
		}
		
		int len = N.length();
		if(len == 1) {
			return count;
		}
		else if(len == 2) {
			int tmp = N.charAt(0) - '0' + N.charAt(1) - '0';
			count += calc(Integer.toString(tmp), 'm');
		}
		else {
			// 임의의 위치에서 끊어서 3개의 수로 분할
			List<Integer> list = new ArrayList<>();
			for(int a = 1; a < len-1; a++) {
				for(int b = a+1; b < len; b++) {
					int num1 = Integer.parseInt(N.substring(0, a));
					int num2 = Integer.parseInt(N.substring(a, b));
					int num3 = Integer.parseInt(N.substring(b));
					list.add(num1 + num2 + num3);
				}
			}
			
			if(goal == 'M') {
				// 분할해서 더한 값들을 재귀호출한 것 중에 가장 큰 값을 더해서 반환
				int max = calc(Integer.toString(list.get(0)), 'M');
				for(int i = 1; i < list.size(); i++) {
					int c = calc(Integer.toString(list.get(i)), 'M');
					if(max < c) 
						max = c;
				}
				count += max;
			}
			else {
				// 분할해서 더한 값들을 재귀호출한 것 중에 가장 작은 값을 더해서 반환
				int min = calc(Integer.toString(list.get(0)), 'm');
				for(int i = 1; i < list.size(); i++) {
					int c = calc(Integer.toString(list.get(i)), 'm');
					if(min > c) 
						min = c;
				}
				count += min;
			}
		}
		return count;
	}
}