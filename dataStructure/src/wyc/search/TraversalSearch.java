package wyc.search;

/**
 * 功能：编历查询指定数值的索引
 * T(n) = O(n) 
 * S(n) = O(1)
 * @author 王以诚
 */
public class TraversalSearch {

	public static void main(String[] args) {
		// 给定数组
		int[] scoreArr = { 89, 45, 78, 45, 100, 98, 86, 100, 65 };

		// 给定要查找的数值
		int score = 65;

		// 完成查找
		int index = search(scoreArr, score);

		// 输出结果
		if (index == -1) {
			System.out.println("该数数不存在");
		} else {
			System.out.println(score + "的索引是" + index);
		}

	}

	public static int search(int[] arr, int key) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			}
		}
		return index;
	}

}
