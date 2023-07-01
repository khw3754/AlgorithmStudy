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
		
		s = s.replaceAll("dz=", "*").replaceAll("c=", "*").replaceAll("c-", "*").replaceAll("d-", "*")
				.replaceAll("lj", "*").replaceAll("nj", "*").replaceAll("s=", "*").replaceAll("z=", "*");
		System.out.println(s.length());
	}
}