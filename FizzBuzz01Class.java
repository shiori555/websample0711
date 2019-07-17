/* *
 * 3,5 を割り切れるか判定する処理
 * @autohr onitsuka
 *
 */

package fizzbuzz01;

public class FizzBuzz01Class {
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}
		if (isNumber(args[0]) == false) {
			System.out.println("引数が数字ではありません。");
			return;
		}
		int num = Integer.parseInt(args[0]);
		System.out.println("引数：" + num);

		FizzBuzz02Class.judge();
	}

	/**
	 * 数字かどうか判定します。
	 *
	 * @param 判定する数字
	 * @return true:数字 / false:数字以外
	 */
	private static boolean isNumber(String num) {
		try {
			Integer.parseInt(num);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}