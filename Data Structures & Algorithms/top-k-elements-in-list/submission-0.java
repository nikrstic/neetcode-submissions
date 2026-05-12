class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] lista = new ArrayList[nums.length + 1];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new ArrayList<>();
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            lista[frequency].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = lista.length - 1; i >= 0; i--) {
            for (int num : lista[i]) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}