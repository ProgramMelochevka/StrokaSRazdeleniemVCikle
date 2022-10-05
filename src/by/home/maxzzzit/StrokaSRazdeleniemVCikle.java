package by.home.maxzzzit;

import java.util.Scanner;

public class StrokaSRazdeleniemVCikle {
	public static void main(String[]args) {
		Scanner chit = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String str;
		long i;
		str=chit.nextLine();
		i=str.length();
		System.out.print("Строка с разделением: ");
		for (int j=0;j<i;j++)
		System.out.print(str.charAt(j)+"#");// строку разделяем на символы и вставляем #
	}
}