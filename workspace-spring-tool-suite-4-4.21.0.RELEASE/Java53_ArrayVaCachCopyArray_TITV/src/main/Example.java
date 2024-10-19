package main;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		// Kiểu nguyên thủy
		int[] arr1 = { 1, 2, 3 };

		// Copy mảng cách 1 - Thay đổi 1 trong 2 mảng
		// có thể dẫn đến sự thay đổi của mảng còn lại
		int[] arr1_a = arr1;
		arr1_a[0] = 100;

		System.out.println("Mảng 1: " + Arrays.toString(arr1));
		System.out.println("Mảng 1_a: " + Arrays.toString(arr1_a));

		// Copy mảng cách 2 - dùng hàm clone
		int[] arr1_b = arr1.clone();
		arr1_a[0] = 50;
		System.out.println("Mảng 1_b: " + Arrays.toString(arr1_b));

		// Copy mảng cách 2 - dùng hàm System.arraycopy
		int[] arr1_c = new int[arr1.length];
		System.arraycopy(arr1, 0, arr1_c, 0, arr1.length);
		arr1_a[0] = 90;
		System.out.println("Mảng 1_c: " + Arrays.toString(arr1_c));
	}
}
