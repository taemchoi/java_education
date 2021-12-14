package lifecoding;

public class String_ {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!!");// String, 문자열(캐릭터의 집합)
//		System.out.println('Hello world!!');// error 자바에서 작은 따옴표는 Character를 지칭함
		System.out.println('H');//Character
		System.out.println("Hello world!!\nhello");//줄바꿈
		System.out.println("Hello "
				+ "world"); //줄바꿈 안됨
		System.out.println("Hello \"world\""); //역슬래쉬 이스캐이프를  활용한 따옴표 출력
		
		
		System.out.println("Hello world".length()); //11
		System.out.println("Hello, lee ...bye".replace("lee", "ego"));
	}

}
