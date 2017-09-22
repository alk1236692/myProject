package test;

public class MultipleMatrix {

	public static int matrix(int[][] list) {
		int answer = 0;
		System.out.println(list[0][0]);
		System.out.println(list[0][1]);
		
		
		

		return answer;
	}

	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		
		int[][] list = { { 5, 3 }, { 3, 2 }, { 2, 6 } };
		if (matrix(list) == 90) {
			System.out.println("{{5,3},{3,2},{2,6}}인 경우에 정상동작합니다. 제출을 눌러서 다른 경우에도 정답인지 확인해 보세요.");
		} else {
			System.out.println("{{5,3},{3,2},{2,6}}인 경우에 정상동작하지 않습니다.");
		}
	}

}
