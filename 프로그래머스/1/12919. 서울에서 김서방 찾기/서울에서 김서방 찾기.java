class Solution {
    public String solution(String[] seoul) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < seoul.length; i++) {
            if (!seoul[i].equals("Kim")) {
                count++;
            } else {
                str.append("김서방은 ");
                str.append(count);
                str.append("에 있다");
            }
        }
        return str.toString();
    }
}