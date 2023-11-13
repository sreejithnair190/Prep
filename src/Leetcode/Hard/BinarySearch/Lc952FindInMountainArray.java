package Leetcode.Hard.BinarySearch;
/*
* https://leetcode.com/problems/find-in-mountain-array/submissions/
* Find in Mountain Array
*/
public class Lc952FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int[] arr1 = {1,5,2};
        int ans = findInMountainArray(2, arr1);
        System.out.println(ans);

    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int N = mountainArr.length - 1;
        int peak = peakOfMountainArray(mountainArr, 0, N);

        if (mountainArr[peak] == target){
            return peak;
        }

        int ans = search(mountainArr, 0, peak -1, target, true);
        if (ans == -1){
            ans = search(mountainArr, peak + 1, N, target, false);
        }

        return ans;
    }

    public static int search(int[] mountainArr, int start, int end, int target, boolean isAsc){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if (mountainArr[mid] == target){
            return mid;
        }

        if (mountainArr[mid] < target){
            if (isAsc){
                return search(mountainArr, mid + 1, end, target, isAsc);
            }
            return search(mountainArr, start, mid - 1, target, isAsc);
        }

        if (isAsc){
            return search(mountainArr, start, mid - 1, target, isAsc);
        }
        return search(mountainArr, mid + 1, end, target, isAsc);
    }

    public static int peakOfMountainArray(int[] mountainArr, int start, int end){
        if (start == end){
            return start;
        }

        int mid = start + (end - start)/2;

        if (mountainArr[mid] < mountainArr[mid + 1]){
            return peakOfMountainArray(mountainArr, mid + 1, end);
        }

        return peakOfMountainArray(mountainArr, start, mid);
    }
}

/*
Leetcode Solution (They used Interface MountainArray)
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr){
        int N = mountainArr.length() - 1;
        int peak = peakOfMountainArray(mountainArr, 0, N);

        if (mountainArr.get(peak) == target){
            return peak;
        }

        int ans = search(mountainArr, 0, peak -1, target, true);
        if (ans == -1){
            ans = search(mountainArr, peak + 1, N, target, false);
        }

        return ans;
    }

    public int search(MountainArray mountainArr, int start, int end, int target, boolean isAsc){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if (mountainArr.get(mid) == target){
            return mid;
        }

        if (mountainArr.get(mid) < target){
            if (isAsc){
                return search(mountainArr, mid + 1, end, target, isAsc);
            }
            return search(mountainArr, start, mid - 1, target, isAsc);
        }

        if (isAsc){
            return search(mountainArr, start, mid - 1, target, isAsc);
        }
        return search(mountainArr, mid + 1, end, target, isAsc);
    }

    public int peakOfMountainArray(MountainArray mountainArr, int start, int end){
        if (start == end){
            return start;
        }

        int mid = start + (end - start)/2;

        if (mountainArr.get(mid) < mountainArr.get(mid + 1)){
            return peakOfMountainArray(mountainArr, mid + 1, end);
        }

        return peakOfMountainArray(mountainArr, start, mid);
    }
}
 */
