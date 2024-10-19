package main;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = in.nextLine();
		System.out.println("=========");

		// Function length() => Lấy ra độ dài chuỗi
		System.out.println(s.length());
		int width = s.length();

		// Function charAt(position) => lấy ra 1 kí tự tại vị trí i
		for (int i = 0; i < width; i++) {
			System.out.println("Vị trí " + i + " là: " + s.charAt(i));
		}

		// Function getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu chuỗi kí tự, vị
		// trí bắt đầu lưu mảng)
		// Lưu ý: VD begin = 2 và end = 4 thì nó chỉ lấy tới vị
		// trí end - 1 tức là nó chỉ lấy tới kí tự thứ 3
		char[] arrChar = new char[100];
		s.getChars(2, 4, arrChar, 0);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("Kí tự của mảng tại " + i + " là: " + arrChar[i]);

		}

		// Function getBytes => có 3 cách, lấy ra giá trị của các kí tự
		// (trong bảng mã ASCII) thành 1 mảng
		byte[] arrBytes = s.getBytes();
		for (byte b : arrBytes) {
			System.out.println(b);
		}

	}
}
