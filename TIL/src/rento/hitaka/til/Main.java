package rento.hitaka.til;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {

		int num = 123;
		String str = "456";
		// valueOfの変換　文字列→数値　※ラッパークラスのオブジェクトに変換する
		int num2 = Integer.valueOf(str);
		// parseIntの変換　数値→文字列　※プリミティブ型に変換する
		int num3 = Integer.parseInt(str);
		// toStringの変換　数値→文字列
		String str2 = Integer.toString(num);
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(str2);
		
		Point p = new Point(1, 2);
		p.equals(obj)
		
	}

}