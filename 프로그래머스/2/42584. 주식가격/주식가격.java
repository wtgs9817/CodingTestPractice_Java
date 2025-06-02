import java.util.*;

/*
문제설명
n초 간의 주가를 초 단위로 기록한 배열 prices가 매개변수로 주어질 때, 각 초의 주가를 기준으로 해당 초 부터 n초 사이에 가격이 떨어지지 않은 시간은 몇 초인지 배열에 담아 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이 n은 2 이상 100,000 이하입니다. (2 <= n <= 100,000)

입출력 예
prices : [1, 2, 3, 2, 3]
return : [4, 3, 1, 1, 0]

입출력 예 설명
1초의 주가는 1이며 1초부터 5초까지 총 4초간 주가를 유지했습니다.
2초의 주가는 2이며 2초부터 5초까지 총 3초간 주가를 유지했습니다.
3초의 주가는 3이며 4초의 주가는 2로 주가가 떨어졌지만 3초에서 4초가 되기 직전까지의 1초간 주가가 유지 된것으로 봅니다. 따라서 5초까지 총 1초간 주가를 유지했습니다.
4초의 주가는 2이며 4초부터 5초까지 총 1초간 주가를 유지했습니다.
5초의 주가는 3이며 5초 이후로는 데이터가 없으므로 총 0초간 주가를 유지했습니다.

*/

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stk = new Stack<>();
        int n = prices.length;
        
        for(int i=0; i<n; i++) {
            
            while(!stk.isEmpty() && prices[i] < prices[stk.peek()]) {
                int idx = stk.pop();
                answer[idx] = i - idx;
            }
            
            stk.push(i);
        }
        
        while(!stk.isEmpty()) {
            int idx = stk.pop();
            answer[idx] = n - 1 - idx;
            
            }
        
        return answer;
    }
}