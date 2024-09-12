package 双指针.复写零;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        // 示例 1
//        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
//        System.out.println("Original array: ");
//        printArray(arr1);
//        solution.duplicateZeros(arr1);
//        System.out.println("Modified array: ");
//        printArray(arr1);
//
//        // 示例 2
//        int[] arr2 = {1, 2, 3};
//        System.out.println("Original array: ");
//        printArray(arr2);
//        solution.duplicateZeros(arr2);
//        System.out.println("Modified array: ");
//        printArray(arr2);

        // 示例 3
        int[] arr3 = {0, 0, 0, 0, 0};
        System.out.println("Original array: ");
        printArray(arr3);
        solution.duplicateZeros(arr3);
        System.out.println("Modified array: ");
        printArray(arr3);

        int[] arr4 = {0,1,7,6,0,2,0,7};
        System.out.println("Original array: ");
        printArray(arr4);
        solution.duplicateZeros(arr4);
        System.out.println("Modified array: ");
        printArray(arr4);
    }

    // 辅助方法：打印数组
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

