package programmers;
import java.util.Calendar;

public class Switch_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =1;
		// case는 만난 case부터 하위 모든 case 출력함, break를 적절히 활용
		switch (value) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
			default :
				System.out.println("another value");
		}
		String str = "A";
		switch (str) {
			case "A":
				System.out.println("A");
				break;
			case "B":
				System.out.println("B");
			defalut :
			System.out.println("another value");
		}
		
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        
        // 다음과 같이 case문을 한번에 사용하면 더 짧게 코드를 짤 수 있습니다.
        switch(month) {
            case 1:
            case 2:
            case 12:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
        }
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
	}

}
