package 排序算法总结;


public class SortUtil {
    public static void main(String []args) {
        int []array = {77, -12, 45, 7 , 5, 0, -456, 456, 456, -1234};
        select_sort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    // 冒泡排序
    public static void bubble_sort(int []array) {
        int len = array.length;
        for(int i = 1; i < len; i++) {
            for(int j = 0; j < len - i; j++) {
                // 这里使用>符号而不是>=符号可以保证冒泡排序的稳定性
                if(array[j] > array[j + 1]) {
                    swap(array, j+1, j);
                }
            }
        }
    }

    // 选择排序
    public static void select_sort(int []array) {
        int len = array.length, temp;
        int index;   // 记录当前轮最小数的下标
        for(int i = 0; i < len - 1; i++) {
            index = i;
            for(int j = i + 1; j < len; j++) {
                if(array[j] < array[index]) {
                    index = j;
                }
                swap(array, i, index);
            }
        }
    }

    // 插入排序
    public static void insert_sort(int []array) {
        int len = array.length, temp;
        int index;  //记录已排序部分最右边的下标
        for(int i = 1; i < len; i++) {
            index = i - 1;
            temp = array[i];
            while(index >= 0 && array[index] > temp) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = temp;
        }
    }

    // 希尔排序
    public static void shell_sort(int []array) {
        int len = array.length, tem;
        int gap = 1;
        int index;
        while(gap < len) {
            gap = gap * 3 + 1;
        }
        while(gap >= 1) {
            for(int i = gap; i < len; i++) {
                index = i - gap;
                tem = array[i];
                while(index >= 0 && array[index] > tem) {
                    array[index + gap] = array[index];
                    index -= gap;
                }
                array[index + gap] = tem;
            }
            gap = (gap - 1) / 3;
        }

    }


    // 快速排序函数
    public static void quick_sort(int []array) {
        sort(array, 0, array.length - 1);
    }
    // 快速排序递归部分
    private static void sort(int []array, int left, int right) {
        if(left < right) {
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot + 1, right);
        }
    }
    //以下标为l的元素为基准对数组进行分区并返回其在新数组中对应的位置下标
    private static int partition(int[] array, int l, int r) {
        int num = array[l];
        while(l < r) {
            while(l < r && array[r] > num) r--;
            swap(array, l, r);
            while(l < r && num >= array[l]) l++;
            swap(array, l ,r);
        }
        return l;
    }

    // 归并排序（分治的思想）
    public static void merge_sort(int []array)  {
        int len = array.length;
        //在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        int []temp = new int[len];
        sort(array, 0, len - 1, temp);
    }
    // “分”的部分
    private static void sort(int []array, int left, int right, int []temp) {
        if(left < right) {
            int mid = (left + right) / 2;
            // 左边归并排序，使得左子序列有序
            sort(array, left, mid, temp);
            // 右边归并排序，使得右子序列有序
            sort(array, mid + 1, right, temp);
            // 将两个有序子数组合并操作
            merge(array, left, mid, right, temp);
        }
    }
    // “治”的部分
    private static void merge(int []array, int left, int mid, int right, int []temp) {
        int i = left, j = mid + 1;
        int index = 0;
        // 依次将两个子数组中的较小值填入新数组
        while(i <= mid && j <= right) {
            if(array[i] <= array[j]) {
                temp[index++] = array[i++];
            } else {
                temp[index++] = array[j++];
            }
        }

        // 当其中一个子数组已经将所有数填入新数组后
        while(i <= mid) {
            temp[index++] = array[i++];
        }
        while(j <= right) {
            temp[index++] = array[j++];
        }

        // 长度为right - left
        index = 0;
        while(left <= right) {
            array[left++] = temp[index++];
        }
    }

    // 堆排序
    public static void heap_sort(int []array) {
        int tail = array.length - 1;  //当前尾部元素的下标

        // 从tail / 2 - 1到0的下标对应的元素才有子节点
        for (int i = tail / 2 - 1; i >= 0; i--) {
            headAdjust(array, i, tail);
        }
        while(tail >= 0) {
            // 堆顶元素和tail下标对应的元素交换(堆顶元素为当前0~tail中的最大值)
            swap(array, 0, tail--);
            headAdjust(array, 0, tail);
        }
    }

    private static void headAdjust(int []array, int index, int tail) {
        int left, right, i;  //left表示index下标对应元素的左子节点的下标，right同理
        while((left = 2 * index + 1) <= tail) {
            right = left + 1;
            i = left;
            if(i < tail && array[left] < array[right]) i++;  // 此时i表示两个子节点的较大值的下标
            if(array[index] < array[i]) {   // 保证父节点的值大于两个子节点的值
                swap(array, index, i);
            } else {
                // 如果父节点已经大于两个子节点直接跳出循环
                break;
            }
            /**
             * 交换后的子节点还有父节点的情况
             * 这种情况发生在整个树的根节点发生一下交换后
             * 继续执行while循环
             */
            index = i;
        }
    }

    // 将特定下标的元素交换
    private static void swap(int[] array, int i, int j) {
        int tem = array[i];
        array[i] = array[j];
        array[j] = tem;
    }
}