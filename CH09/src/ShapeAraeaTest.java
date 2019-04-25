/*
 * 인터페이스는 객체를 생성할 수 없다.
 * 하지만 레퍼런스 변수 선언은 가능하다.
 */
import com.inheri.ex03.Circle;
import com.inheri.ex03.InstanceOfEx;
import com.inheri.ex03.Square;
import com.inheri.ex03.Triangle;

public class ShapeAraeaTest {

	public static void main(String[] args) {
		InstanceOfEx.castingMethod(new Circle());
		// Shape sh = new Circle(); > 업캐스팅
		
		InstanceOfEx.castingMethod(new Square());
		InstanceOfEx.castingMethod(new Triangle());

	}

}

