package JavaSuanfa;
/**
 *  冒泡 排序 算法 
（1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。 
（2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第
N-1 个位置。 
（3）N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。 
 * 
 * @author 小济公
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			//前面的数字大于后面的数字就交换
			if(arr[i - 1] > arr[i]){
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
