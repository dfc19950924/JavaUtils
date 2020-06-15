package JavaSuanfa;

public class TestSort {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,6,8,7};
		System.out.println("未排序：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new BubbleSort().bubbleSort(arr);
		System.out.println();
		System.out.println("冒泡排序：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new InsertSort().sort(arr);
		System.out.println();
		System.out.println("插入排序：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new FastSort().sort(arr);
		System.out.println();
		System.out.println("快速排序：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new MergeSort().sort(arr);
		System.out.println();
		System.out.println("归并排序：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new bucketSort().sort(arr);
		System.out.println();
		System.out.println("桶排序：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
			
		
	}

}
