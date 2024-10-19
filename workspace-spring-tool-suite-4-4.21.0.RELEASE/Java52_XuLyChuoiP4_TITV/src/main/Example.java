package main;

public class Example {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";

		String s3 = s1 + s2;
		System.out.println("S3 = " + s3);

		// Hàm concat => Hàm nối chuỗi
		String s4 = s1.concat(s2);
		System.out.println("S4 = " + s4);

		// Hàm replace => thay thế
		// Không làm thay đổi giá trị của biến được thay thế
		// mà phải gán vào biến mới
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung", "TITV");

		System.out.println("S5 = " + s5);
		System.out.println("S6 = " + s6);

		// toLowerCase => chuyển về chữ thường
		// toUpperCase => chuyển về chữ in hoa

		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();

		System.out.println("S7 = " + s7);
		System.out.println("S8 = " + s8);

		// Hàm trim() => giúp xóa bỏ những khoảng trắng dư thừa ở đầu chuỗi
		String s9 = "  Xin chào các bạn, mình là TITV.vn    ";
		System.out.println("S9 = " + s9.trim());

		// Hàm substring(begin, end) => hàm cắt chuỗi để lấy chuỗi con
		// Lưu ý: substring chỉ lấy tới giá trị thứ end - 1
		String s10 = "Xin chào các bạn, mình là TITV.vn";
		String s11 = s10.substring(18);
		String s12 = s10.substring(0, 16);

		System.out.println(s11);
		System.out.println(s12);
	}
}
