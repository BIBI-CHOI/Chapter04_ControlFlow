package method;

public class ControlFlow {
	public static void main(String[] args) {
//		"오버로딩"
		
//		int a, b, c;
//		
//		a = 1;
//		b = 5;
//		c = a + b;
//		System.out.println(c);
//		
//		a = 11;
//		b = 22;
//		c = a + b;
//		System.out.println(c);
//		
//		a = 33;
//		b = 55;
//		c = a + b;
//		System.out.println(c);
		

//		add(1, 5);
//		add(11, 22);
//		add(33, 55);
//		
//		add(1.5, 3.1);				
//	}
//
//	private static void add(double d, double e) {
//		System.out.println(d + e);
//		
//	}
//
//	private static void add(int i, int j) {
//		System.out.println(i + j);
//	}

		
//		int result = add(1, 2); // 리턴 타입이 void -> int로 변경해야됨
//		System.out.println(add(1, 2));
//	}
//	
		
		showDisplay();
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("-----menu-----");
		System.out.println();
		System.out.println("1.계좌등록  2.입금  3.출금  4.종료\n");
		System.out.println();
		System.out.println(add(1, 2));
		
		
	public static int add(int i, int j) { // 하위의 자료형과 비교하여 동일하게 인식하기 때문에 차이를 두어야 함
		return i + j;
	}

	private static void add(double d, double e) {
		System.out.println(d + e);
		

//	private static void add(int i, int j) { 
//		System.out.println(i + j);
//	}
		
		
	}
	}
