package mst;

import java.util.Arrays;

/**
 * @description: 常用排序算法
 * @author: he.l
 * @create: 2019-04-08 17:28
 **/
public class SortAlgorithm {

    /**
     * 冒泡排序
     * @param arry
     * @return
     */
    public static int[] bubbleSort(int[] arry){
        for(int i=0;i<arry.length-1;i++){
            for(int j=0;j<arry.length-1;j++){
                if(arry[j]>arry[j+1]){
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arry));
        return  arry;
    }

    /**
     * 选择排序: 选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，
     *          存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     *
     * @param arry
     * @return
     */
    public static int[] selectionSort(int[] arry){
        for(int i=0;i<arry.length-1;i++){
            int index = i;
            for(int j=1+i;j<arry.length;j++){
                if(arry[j]<arry[index]){
                    index = j;
                }
            }
            int temp = arry[i];
            arry[i]=arry[index];
            arry[index]=temp;
        }
        System.out.println(Arrays.toString(arry));
        return arry;
    }

    /**
     * 插入排序: 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，
     *          对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
     * @param arry
     * @return
     */
    public static int[] insertionSort(int[] arry){
        int len = arry.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arry[i];
            while (preIndex >= 0 && arry[preIndex] > current) {
                arry[preIndex + 1] = arry[preIndex];
                preIndex--;
            }
            arry[preIndex + 1] = current;
        }
        return arry;
    }

    public static void main(String[] args) {
        int[] arry = new int[]{22,32,11,6,99,56,18};
        //bubbleSort(arry);
        /*selectionSort(arry);*/
    }

}
