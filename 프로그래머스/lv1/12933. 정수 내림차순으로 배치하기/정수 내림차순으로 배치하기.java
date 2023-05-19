import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        
        int[] nums = new int[Long.toString(n).length()];
        int i = 0;
        while(n != 0){
            nums[i] = (int)(n % 10);
            n /= 10;
            i += 1;
        }
        Arrays.sort(nums);
        for(i = nums.length-1; i >= 0; i--){
            answer += nums[i];
        }
        
        return Long.parseLong(answer);
    }
}