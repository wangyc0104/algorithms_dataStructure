package wyc.linetable;
/**
 * 自定义数组越界异常
 * @author 王以诚
 */
@SuppressWarnings("serial")
public class MyArrayIndexOutOfBoundsException  extends RuntimeException{

	public MyArrayIndexOutOfBoundsException() {
		super();
	}

	public MyArrayIndexOutOfBoundsException(String message) {
		super(message);
	}

	
}
