package task;

public class Task_01Main {
	public static void main(String[] args) {
		Task_01 t1 = new Task_01("멍멍이", 2, "강아지");  // 객체 1 생성
		Task_01 t2 = new Task_01("짹짹이", 3, "앵무새");  // 객체 2 생성
		Task_01 t3 = new Task_01("냥냥냥", 2);  // 객체 3 this() 사용하여 type지정
		Task_01 t4 = new Task_01("길진수", 27, "인간");  // 객체 4 생성
		
		System.out.println(t3.type);  // 객체4에 type이 잘 들어갔나 확인
		
		t1.eat();  // 메소드 호출
		t2.birthday();  // 메소드 호출
		t3.play();  // 메소드 호출
		t4.sleep();  // 메소드 호출
	}
}
