package com.azj.zzw.algorithm.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 测试快速排序
 *
 * @author zzw zengzhiwei_hfut@163.com
 * @see QuickSort
 * @since 2019/3/29 0029-17:36
 */
@Slf4j
public class QuickSortTest {

    @Test
    public void testQuickSort() {
        // 测试
        int[] arr = {2, 5, 3, 1, 7, 4, 10, 2, 4};
        // 快速排序
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0,arr.length-1);
        // 打印
        for (int i = 0; i < arr.length; i++) {
            log.info("{}  ",arr[i]);
        }
    }


}
