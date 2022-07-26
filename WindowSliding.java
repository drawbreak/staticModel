package staticModel;

import java.util.HashSet;
import java.util.Set;

// 滑动窗口
public class WindowSliding {
    public int lengthOfLongestSubstring(String s) {
        int count =0;
        int left =0;
        Set<Character> set = new HashSet<>();
        char[] str = s.toCharArray();
        for (int i=0;i<str.length;i++){
            while (set.contains(str[i]) && left <=i){
                set.remove(str[left]);
                left++;
            }
            count = Math.max(count,i-left+1);
            set.add(str[i]);
        }
        return count;
    }
}
