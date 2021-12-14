package programmers;

public class Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[100]; // 100개의 정수를 저장할 수 있는 int형 배열 생성
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4}; 
		int[] array3 = {1,2,3,4}; // 위와 같은 코드
		
		System.out.println(array1[10]);
		
		int value = array3[0]; 

		
		
		// for로 배열 채우기
		int[] forarray = new int[100];
		int sum = 0;
		
		for (int i =0;i < forarray.length; i++) {
			forarray[i] =i+1;
			sum += forarray[i];
			System.out.println(forarray[i]);
		}
		System.out.println(sum);
		
		
		
		// 2차원 배열
		int [][] array4 = new int[3][4];   // 3x4행렬
		
		int [][] array5 = new int[3][];  // 3x ? 행렬, 즉 사각형꼴이 아닌 배열 생성
		
		array5[0] = new int[1];
		array5[1] = new int[2];
		array5[2] = new int[3];
		
		int [][] array6 = {{1},{1,2},{1,2,3}}; // array 5와 같은꼴
		System.out.println(array6[0][0]);
//		System.out.println(array6[0][1]); //error

		
		// for each
		int[] iarr = {10,20,30,40,50};
		
		for (int i = 0; i< iarr.length; i++) {
			System.out.println(iarr[i]);
		}
		
		for(int values : iarr) {
			System.out.println(values);
		} // 위와 같은 코드지만 for each 구문은 훨씬 간단하게 사용 가능
	}

}
