package wyc.search;

/**
 * 递归版二分查找（折半查找）
 * 前提：顺序结构、按照关键字有序
 * @author 王以诚
 */
public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// 给定数组
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 给定要查找的值
		int key = 60;

		// 进行折半二分查找
		int index = binarySearch(array, key);

		// 输出结果
		if (index == -1) {
			System.out.println("不存在");
		} else {
			System.out.println(key + "的索引是" + index);
		}
	}

	/**
	 * 使用递归
	 * T(n) = O(logn) 
	 * S(n) = O(logn)
	 * @param array
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] array, int key) {
		// 指定low和high
		int low = 0;
		int high = array.length - 1;
		return binarySearch(array, key, low, high);

	}

	public static int binarySearch(int[] array, int key, int low, int high) {
		// 递归的结束条件
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (key == array[mid]) {
			return mid;
		} else if (key < array[mid]) {
			return binarySearch(array, key, low, mid - 1);
		} else {// key >array[mid]
			return binarySearch(array, key, mid + 1, high);
		}
	}

}
