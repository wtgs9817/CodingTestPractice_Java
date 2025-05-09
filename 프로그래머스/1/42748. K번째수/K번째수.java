//두번째 풀이
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            int idx = commands[i][2]-1;
            
            result[i] = arr[idx];
        }
        
        return result;
        
    }
}