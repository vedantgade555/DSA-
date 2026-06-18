import java.util.HashMap;









class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}


class Solution {
    public int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0;j=arr.length-1;

        ArrayList list = new ArrayList();

        while(i<j)
        {
            if(arr[i]+arr[j]==target) 
                list.add(i,j);
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }

    
    }
}