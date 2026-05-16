import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Remove duplicates
        for (int num : nums) {
            set.add(num);
        }

        // Convert set to list
        List<Integer> list = new ArrayList<>(set);

        // Sort the list
        Collections.sort(list);

        // If less than 3 unique numbers, return maximum
        if (list.size() < 3) {
            return list.get(list.size() - 1);
        } 
        else {
            // Return third maximum
            return list.get(list.size() - 3);
        }
    }
}
