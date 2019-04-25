package com.biz.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/*
 * Junit을 이용한 test
 * 
 * Java에서 작성된 클래스의 여러가지 메서드들을 테스트할 때
 * 매개변수와 리턴값, 오류발생 유무, 시간의 과도한 소비등을 일일이 
 * main메서드를 만들어 테스트 하는것은 매우 어렵다.
 * 
 * 이때, 매개변수와 리턴값에 대한 리스트(Test Case)를 만들어 두고
 *  Junit의 test 클래스를 만들어 테스트를 수행하면
 *  일일이 값들을 눈으로 비교하여 테스트하는것보다 쉽고,
 *  정확하게 테스트를 할 수 있다.
 *  
 *  Junit은 Java에서 아주 오래전부터 
 *  테스트 자동화 도구로 사용되고 있다.
 */

/*
 * HelloTest2 클래스에 testCalc와 testHello 두개의 테스트 method를 모으고 
 * 한번의 junit 실행으로 모두 테스트를 수행한다.
 * 
 * Test용 클래스는
 * 테스트하고자 하는 클래스 이름 + Test 라는 접미사를 사용한다.
 * 가급적 package를 분리하는 것도 좋고
 * method의 이름은 테스트하고자 하는 method의 접두사로 test를 사용한다.
 * 
 * Junit 4 미만에서는 method의 이름의 접두사를 반드시 test로 해야만 한다.
 * Junit 4 이상에서는 선택적으로 test 접두사를 사용한다.
 * 	하지만 일반적 패턴(관습적)에 따라 test로 시작한다.
 * 
 * 테스트 메서드에는 @Test Annotation을 부착한다.
 */

import org.junit.Test;

import com.biz.jtest.Hello;

public class HelloTest2 {

	/*
	 *  timeout : test를 수행하는데 1000밀리초가 넘으면
	 *  		이 테스트는 실패한 것
	 *  
	 *  expected : 이 메서드는 실행되는 동안에 분명히
	 *  		 RuntimeException이 발생할 것이라는 test
	 */
	@Test(timeout=1000) //,expected=RuntimeException.class)
	public void test() {
		
		Hello hello = new Hello();
		
		int num1 = 10;
		
		// calc method를 호출한 결과가 10인가?
		assertEquals(10, hello.calc(5, 5));
		
		// hello() method가 return 하는 값이 null인가?
		assertNotNull(hello.hello());
		
		assertEquals("Hello", hello.hello());
	}

	@Test
	public void testHello() {
		Hello hello = new Hello();
		
		assertEquals("Hello", hello.hello()); // test case
	}
	
	
	/*
	 * setupClass 이름은 패턴적으로 변경되고
	 * @BeforeClass를 부착한다
	 */
	@BeforeClass
	public static void setupClass() {
		/*
		 * 테스트를 수행하기 전에 대상 클래스에서 한 번 실행해야할 일들을 명시하는 method
		 */

	}
	
	@AfterClass
	public static void tearDownClass() {
		/*
		 * 테스트가 끝난 후 대상 클래스에서 한 번 실행해야할 일들을 명시
		 * 데이터베이스와 연동할 때 Connection 닫기 등을 수행
		 */
	}
	
	/*
	 * 각 테스트 메서드가 수행되기 전에 한 번 실행
	 * 
	 * jdbc 사용하는데 DB 로그인 정보 등을 설정하는 곳
	 * 
	 */
	@Before
	public void setup() {
		
	}
	
	
	/*
	 * 각 테스트 메서드가 수행된 후 한 번 실행
	 */
	@After
	public void tearDown() {
		
	}
} 
