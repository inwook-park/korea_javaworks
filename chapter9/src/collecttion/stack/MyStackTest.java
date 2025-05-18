package collecttion.stack;

public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		//요소 넣기
		stack.push("강아지");
		stack.push("고양이");
		stack.push("소");
		
		//요소의 개수
		System.out.println("요소의 총 수: " + stack.getSize());
		
		//요소 삭제
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
