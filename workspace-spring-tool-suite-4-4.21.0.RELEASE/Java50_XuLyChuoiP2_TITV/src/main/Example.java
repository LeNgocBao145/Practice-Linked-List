package main;

public class Example {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "TITV.vn";

		// Hàm equals => so sánh 2 chuỗi giống nhau,
		// có phân biệt chữ in hoa với chữ thường
		System.out.println("s1 equals s2: " + s2.equals(s1));
		System.out.println("s1 equals s3: " + s2.equals(s3));

		// Hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau,
		// không phân biệt chữ in hoa với chữ thường
		System.out.println("s1 equalsIgnoreCase s2: " + s2.equalsIgnoreCase(s1));
		System.out.println("s1 equalsIgnoreCase s3: " + s2.equalsIgnoreCase(s3));

		// Hàm compareTo => So sánh > < =
		String s4 = "Lê Đái Hành";
		String s5 = "Lê Đại Hánh";

		System.out.println("s2 compare to s3: " + s2.compareTo(s3));
		System.out.println("s4 compare to s5: " + s4.compareTo(s5));

		// Hàm compareToIgnoreCase => tương tự hàm compareTo
		// nhưng không phân biệt chữ in hoa và chữ thường
		String s6 = "Lê Đái Hành";
		String s7 = "Lê Đại Hánh";

		System.out.println("s6 compare to ignore case s7: " + s6.compareToIgnoreCase(s7));

		// Hàm regionMatches => so sánh 1 đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);

		// Hàm startsWith => Hàm kiểm tra chuỗi bắt đầu bằng ...
		String sdt = "037456789";
		System.out.println(sdt.startsWith("034"));
		System.out.println(sdt.startsWith("037"));

		// Hàm endsWith => Hàm kiểm tra chuỗi kết thúc bằng ...
		String fileName = "I love you.JPG";
		String fileName2 = "Hoc Java.PDF";

		if (fileName.endsWith("JPG")) {
			System.out.println("File 1 là hình ảnh!");

		} else if (fileName.endsWith("PDF")) {

			System.out.println("File 1 là file pdf!");
		}

		if (fileName2.endsWith("JPG")) {
			System.out.println("File 2 là hình ảnh!");

		} else if (fileName2.endsWith("PDF")) {

			System.out.println("File 2 là file pdf!");
		}
	}
}
