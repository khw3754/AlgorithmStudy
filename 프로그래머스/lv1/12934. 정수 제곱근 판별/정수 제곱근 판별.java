import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double sqrt_n = Math.sqrt(n);
        if (sqrt_n == (int) sqrt_n){
            answer = (long)((sqrt_n + 1)*(sqrt_n + 1));
        }
        
        return answer;
    }
}