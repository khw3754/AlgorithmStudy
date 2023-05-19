class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int countP = 0;
        int countY = 0;
            
        String str = s.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'p'){
                countP += 1;
            } else if(str.charAt(i) == 'y') {
                countY += 1;
            }
        }

        return countP == countY;
    }
}