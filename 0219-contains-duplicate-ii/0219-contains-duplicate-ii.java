import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (map.containsKey(a[i])) {
                int previousIndex = map.get(a[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }
            map.put(a[i], i);
        }

        return false;
    }
}