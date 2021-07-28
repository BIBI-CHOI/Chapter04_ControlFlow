package training;

public class Test04 {
	public static void main(String[] args) {
//		자연수 1부터 시작해서 모든 홀수를 더하고 
//		몇을 더 했을때 그 합이 1000을 넘는지, 그리고 1000을 넘어선 값은 얼마인지?
//		출력하는 프로그램을 작성하시오
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			// 홀수 조건
			if(num % 2 != 0) {
				sum += num; 
			}
			// 합 > 1000
			if(sum > 1000) {
				System.out.println(num + "더할 때 1000을 넘습니다.");
				System.out.println("초과된 값은:" + sum);
				break;			
				}
			num++;
			}
	}
}
