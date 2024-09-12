//package 双指针.复写零;
//
//class Solution {
//    public void duplicateZeros(int[] arr) {
//        int cur = 0, dest = -1;
//        for (cur = 0, dest = -1; dest < arr.length - 1; cur++) {
//            if (arr[cur] != 0) {
//                dest++;
//                if (dest >= arr.length - 1) {
//                    break;
//                }
//            } else {
//                dest += 2;
//                if (dest > arr.length - 1) {
//                    dest = arr.length - 1;
//                    break;
//                }
//            }
//        }
//        System.out.println(cur);
//        System.out.println(dest);
//        while (cur >= 0) {
//            if (arr[cur] != 0) {
//                arr[dest] = arr[cur];
//                cur--;
//                dest--;
//            } else {
//                arr[dest] = arr[cur];
//                dest--;
//                arr[dest] = arr[cur];
//                cur--;
//                dest--;
//            }
//
//        }
//    }
//}


package 双指针.复写零;

class Solution {
    public void duplicateZeros(int[] arr) {
        int cur = 0, dest = 0;
        int length = arr.length;

        // 第一遍遍历，计算 `dest` 的位置
        while (dest < length) {
            if (arr[cur] == 0) {
                dest++;  // 0需要占据两个位置
            }
            cur++;
            dest++;
        }

        // 调整 `cur` 和 `dest` 使其都位于合法的范围
        cur--;
        dest--;

        // 从后往前填充数组
        while (cur >= 0) {
            if (dest < length) {
                arr[dest] = arr[cur];
            }
            if (arr[cur] == 0) {
                dest--;
                if (dest < length) {
                    arr[dest] = 0;  // 复写0
                }
            }
            cur--;
            dest--;
        }
    }
}
