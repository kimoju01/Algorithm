/*

public class Main {

    static int max = 10000;
    static boolean[] notSelfNumber = new boolean[max + 1];

    public static void main(String[] args) {
        for (int i=1; i<=max; i++) {    // 1부터 10000까지 검사해서
            d(i);
        }

        for (int i=1; i<=max; i++) {    // 셀프넘버인 숫자만 출력
            if (!notSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static void d(int n) {
        int sum = n;    // n을 sum에 대입

        while (n > 0) { // n이 0보다 크다면
            sum += n % 10;  // n 자릿수를 한 자리씩 분리해서 sum에 넣음
            n /= 10;
        }

        if (sum <= max) {   // sum이 10000보다 작거나 같으면
            notSelfNumber[sum] = true;   // 배열 인덱스를 true로 변경
            // ex) n = 33 이면.. sum = 33 + 3 + 3 = 39 니까 isSelfNumber[39] = true
            // true가 된 index 숫자는 생성자가 있는 숫자가 됨! -> 셀프넘버 아님
        }

    }
}

*/

class Main {
	
	static int N = 10000;
	static int[] hasConst = new int[N + 1];	// hasConst[10001] 배열 생성
	
	public static void main(String[] args) {
		
		for (int i=1; i<=N; i++) {
			checkSelfNumber(i);			// 1부터 10000까지 검사해서
		}
		
		for (int i=1; i<=N; i++) {
			if (hasConst[i] == 0)		// 셀프 넘버가 아닌 숫자만 출력해준다
				System.out.println(i);
		}
		
	}
	
	// number가 생성자인 숫자 체크
	public static void checkSelfNumber (int number) {
		
		int sum = number;			// 매개변수 number를 sum에 대입한다
		
		while (number != 0) {		// number가 0이 아니라면
			int mod = number % 10;	// number를 한 자리씩 분리한다
			number /= 10;
			sum += mod;				// sum = number 이기 때문에 원래 숫자에 각 자리 수를 더해준 것과 같다
		}
		
		if (sum <= N)				// sum 값이 10000보다 작거나 같으면 (즉, 10000보다 작거나 같은 셀프 넘버라면)
			hasConst[sum] = 1;		// hasConst 배열 각 인덱스에 1을 대입해준다
	}
}