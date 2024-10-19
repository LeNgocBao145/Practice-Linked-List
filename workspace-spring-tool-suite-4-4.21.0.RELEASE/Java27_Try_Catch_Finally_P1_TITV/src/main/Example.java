package main;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int n = 0;
		while (true) {
			try {
				Scanner in = new Scanner(System.in);
				System.out.println("Nhập vào số nguyên n: ");
				n = in.nextInt();
				break;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Giá trị nhập không đúng!");
			} finally {
				// Dù có ngoại lệ hay không chương trình trong finally
				// vẫn sẽ chạy bình thường
			}
		}

		System.out.println("Giá trị nhập là " + n);
		System.out.println("Kết thúc chương trình!");
	}
}
