/**
 * 数字を判定する処理のみ
 * @author shiori-o
 */
package fizzbuzz01;

public class FizzBuzz02Class {

	public static void judge() {

		int num = 0 ;
		// numの値をどう設定するか、このままだと0のまま処理される

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

}
