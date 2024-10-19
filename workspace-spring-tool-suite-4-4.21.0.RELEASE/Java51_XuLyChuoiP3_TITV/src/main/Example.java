package main;

public class Example {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
		// Hàm indexOf => Tìm vị trí chuỗi hoặc kí tự tham chiếu so với chuỗi gốc
		// theo chiều từ trái sang phải
		// Giá trị -1 => Không tìm thấy
		System.out.println("Vị trí s2 trong s1 là " + s1.indexOf(s2));
		System.out.println("Vị trí s3 trong s1 là " + s1.indexOf(s3));

		// Sử dụng vị trí bắt đầu trong indexOf
		System.out.println("Vị trí s2 trong s1 là " + s1.indexOf(s2, 2));

		// Tìm kiếm kí tự trong chuỗi
		System.out.println("Vị trí c1 trong s1 là " + s1.indexOf(c1));
		System.out.println("Vị trí c1 trong s1 là " + s1.indexOf(c1, 20));

		// Hàm lastIndexOf => Tìm kiếm tương tự như indexOf nhưng từ phải sang trái
		System.out.println("Vị trí s2 trong s1 là " + s1.lastIndexOf(s2));

		// Ứng dụng
		// Tìm kiếm tên file theo định dạng như
		// .pdf, .xls, ...
	}
}
