class Solution {
    public int solution(int age) {
        int answer = 2022;
        if (0 < age && age <= 120){
            answer = answer - age + 1;
        }
        return answer;
    }
}