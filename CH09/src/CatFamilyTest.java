import com.animal.Cat;
import com.animal.CatFamily;
import com.animal.Tiger;

 // 코드의 결합도는 낮추고, 응집도는 높인다.
 // 커스터마이징(유지보수) 작업의 효율성을 위해.
public class CatFamilyTest {

	public static void main(String[] args) {
		
		CatFamily cf = null;
		
		cf = new Cat(); // 업캐스팅
		cf.eat();
		cf.cry();
		cf.move();
		
		cf = new Tiger(); // 업캐스팅
		cf.eat();
		cf.cry();
		cf.move();
		

	}

}
