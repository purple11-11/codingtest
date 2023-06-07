class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = 0;
        int denom = 0;
        
        numer = (numer1 * denom2) + (numer2 * denom1);
        denom = denom1 * denom2;
        
        int gdc = getGDC(numer, denom);
         
        answer[0] = numer/gdc;
        answer[1] = denom/gdc;
        return answer;
    }
    
        private static int getGDC(int a, int b) {
            if(a%b == 0){
               return b;
            } 
            return getGDC(b, a%b);
        }
        
}