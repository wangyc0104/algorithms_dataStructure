package wyc.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ��ʹ��
 * ʮ����ת���ɶ�����
 * @author ���Գ�
 */
public class DecToBin {

	public static void main(String[] args) {

		// ����һ��ʮ������
		int n = 100;

		// ��ʮ������ת���ɶ�����
		int t = n;// ������
		
		// String str = "";
		
		// ����һ����ջ��˫����У����Ե�ջ�ã�
		Deque<Integer> stack = new LinkedList<Integer>();
		do {
			// ����2������
			int mod = t % 2;
			
			// �������
			// System.out.println(mod);
			// str =mod +str;
			
			// ��ջ
			stack.push(mod);
			
			// ����2�õ���
			// int result = t / 2;
			
			// ʹ������������
			// t = result;
			t = t / 2;
		} while (t > 0);// ��>0

		// ������
		System.out.print("ʮ���ƣ�" + n + "\n�����ƣ�");
		while (!stack.isEmpty()) {// ջ�ǿ�
			System.out.print(stack.pop());
		}

	}

}
