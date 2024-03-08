class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(Math.min(n, m), Math.max(n, m));
        
        return new int[] {gcd, (n * m) / gcd};
    }
    
    public int getGcd(int min, int max) {
        return max % min != 0 ? getGcd(max % min, min) : min;
    }
}