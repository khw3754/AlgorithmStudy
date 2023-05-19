class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++){
            answer[i] = Integer.parseInt(str.substring(str.length() - i - 1, str.length() - i));
        }
        
        return answer;
    }
}