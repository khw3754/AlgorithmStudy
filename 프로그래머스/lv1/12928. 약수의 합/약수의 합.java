import java.util.*;

class Solution {
    public int[] div(int n) {
        List<Integer> result = new ArrayList();
        
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                result.add(i);
                if(i*i != n){
                    result.add(n / i);
                }
            }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
    
    public int solution(int n) {
        int[] result = div(n);
        return Arrays.stream(result).sum();
    }
}