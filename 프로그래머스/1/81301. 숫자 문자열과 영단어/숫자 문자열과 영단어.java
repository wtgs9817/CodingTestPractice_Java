//두번째 풀이 

import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        
        
        for(String key : map.keySet()) {
            s = s.replace(key, map.get(key));  // replace -> (변경하려는 값, 새로운 값);
        }
        int answer = Integer.parseInt(s);
        
        return answer;
        
    }
}