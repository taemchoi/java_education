package programmers;
import java.util.Calendar;

public class Switch_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =1;
		// case�� ���� case���� ���� ��� case �����, break�� ������ Ȱ��
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
        
        // ������ ���� case���� �ѹ��� ����ϸ� �� ª�� �ڵ带 © �� �ֽ��ϴ�.
        switch(month) {
            case 1:
            case 2:
            case 12:
                season = "�ܿ�";
                break;
            case 3:
            case 4:
            case 5:
                season = "��";
                break;
            case 6:
            case 7:
            case 8:
                season = "����";
                break;
            case 9:
            case 10:
            case 11:
                season = "����";
                break;
        }
        System.out.println("������ " + month + "���̰�, " + season + "�Դϴ�.");
	}

}
