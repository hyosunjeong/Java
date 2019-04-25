import java.util.Scanner;

public class ClientInput {
	
	public void inputData(Scanner scan) {
		System.out.println("이름을 입력하세요");
		System.out.print("입력: ");
		char ch = scan.nextLine().charAt(0);
		System.out.println("성은 " +ch+"이다.");
	}
}
