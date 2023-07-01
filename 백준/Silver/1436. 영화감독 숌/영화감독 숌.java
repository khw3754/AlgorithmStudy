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
		
		int count = 0;
		int num = 665;
		while (count < N) {
			num++;
			if(Integer.toString(num).indexOf("666") != -1) {
				count++;
			}
		}
		
		System.out.println(num);
	}
}