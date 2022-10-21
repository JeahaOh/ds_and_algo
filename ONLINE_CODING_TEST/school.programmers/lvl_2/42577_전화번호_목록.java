import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean answer = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
            String prev = phone_book[i];
            String next = phone_book[i + 1];
            if (next.startsWith(prev)) return false;
            
        }
        return answer;
    }
}