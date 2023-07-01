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
		String s = br.readLine();
		
		while(!s.isEmpty() && s.charAt(0) == ' ') {
			s = s.substring(1);
		}
		
		if(s.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		String[] s_list = s.split(" ");
		System.out.println(s_list.length);
	}
}

