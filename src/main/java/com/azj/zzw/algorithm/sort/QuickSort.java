package com.azj.zzw.algorithm.sort;

/**
 * 快速排序   递归
 * 原理:
 * 从小到大排序
 * <p> 1. 取出一个标本(比较数,默认第一个数) </p>
 * <p> 2. 依次从数据right最后一位与标本进行比较,如果小于标本,则与标本交换索引位置,交换之后, right-1,防止重复对比</p>
 * <p> 3. 当right交换后,依次从left侧与标本进行对比, 如果left大于标本,则互换索引位置,left+1,防止重复对比 </p>
 * <p> 4. 直到left>=right时  取出中间数point </p>
 * <p> 5. 再次递归 left -> point-1 </p>
 * <p> 6. 再次递归 point+1 -> right </p>
 * 注意:再次递归时 一定不要包含point索引位  否则可能导致排序有错误
 *
 * @author zzw zengzhiwei_hfut@163.com
 * @see
 * @since 2019/3/29 0029-15:16
 */
public class QuickSort {


    /**
     * 快速排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // 首次取出point
            int point = getPoint(arr, left, right);
            // 递归左边
            quickSort(arr, left, point - 1);
            // 递归右边
            quickSort(arr, point + 1, arr.length - 1);
        }
    }

    /**
     * 取出数组point
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int getPoint(int[] arr, int left, int right) {
        // 取第一个数为对比标本
        int temp = arr[left];
        while (left < right) {
            // right不断向left靠近 与标本进行对比
            while (left < right && arr[right] >= temp) {
                right--;
            }
            // 防止left=right的时候空置换
            if (left < right) {
                // 遇到right的值小于标本 进行交换
                swap(arr, left, right);
                // 交换后right-1
                right--;
            }

            // 交换后  拿left侧与标本进行对比
            while (left < right && arr[left] <= temp) {
                left++;
            }
            if (left < right) {
                // 遇到left的值大于标本  进行交换
                swap(arr, left, right);
                // 交换后left+1
                left++;
            }
        }
        // 直到 left=right 返回
        return left;
    }

    /**
     * 两数进行交换
     *
     * @param left
     * @param right
     */
    private void swap(int[] arr, int left, int right) {
        if (arr != null && arr.length > 0) {
            // cp为副本
            int cp = arr[left];
            arr[left] = arr[right];
            arr[right] = cp;
        }
    }

}
