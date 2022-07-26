package staticModel;

//二分查找
public class BoundBinarySearch {
    //普通二分法
    int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意左闭右闭
        while(left <= right) {  //注意左闭右闭
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1; // 注意左闭右闭
            else if (nums[mid] < target)
                left = mid + 1; // 注意左闭右闭
        }
        return -1;
    }

    //左侧
    public int leftBoundBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;  // 左闭右开
        while (left < right) {  // 左闭右开
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;  // 左侧查询，缩小范围
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (left == nums.length) return -1;  //
        return nums[left] == target ? left : -1;
    }

    //右侧
    public int rightBoundBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;  //注意
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (left == 0) return -1;  //
        return nums[left - 1] == target ? (left - 1) : -1;  //注意left-1
    }
}
