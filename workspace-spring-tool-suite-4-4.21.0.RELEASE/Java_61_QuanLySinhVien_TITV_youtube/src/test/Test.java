package test;

import java.util.Locale;
import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		DanhSachSinhVien dssv = new DanhSachSinhVien();

		while (true) {
			System.out.println("MENU");
			System.out.println("Vui lòng chọn chức năng:");
			System.out.println("1. Thêm sinh viên vào danh sách.");
			System.out.println("2. In danh sách sinh viên ra màn hình.");
			System.out.println("3. Kiểm tra danh sách có rỗng hay không.");
			System.out.println("4. Lấy ra số lượng sinh viên trong danh sách.");
			System.out.println("5. Làm rỗng danh sách sinh viên.");
			System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
			System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
			System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
			System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
			System.out.println("0. Thoát khỏi chương trình");

			int choice = 0;

			choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Nhập mã số sinh viên: ");
				String maSV = in.nextLine();
				System.out.println("Nhập họ tên sinh viên: ");
				String hoTen = in.nextLine();
				System.out.println("Nhập năm sinh: ");
				int namSinh = in.nextInt();
				in.nextLine();
				System.out.println("Nhập điểm trung bình môn: ");
				float diemTB = in.nextFloat();
				in.nextLine();

				SinhVien sv = new SinhVien(maSV, hoTen, namSinh, diemTB);
				dssv.themSV(sv);
				break;
			case 2:
				dssv.printDSSV();
				break;
			case 3:
				System.out.println("Danh sach rỗng: " + dssv.checkIsEmpty());
				break;
			case 4:
				System.out.println("Số lượng sinh viên: " + dssv.getSVQuantity());
				break;
			case 5:
				dssv.clearAll();
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 0:
				System.out.println("Thoát chương trình!");
				return;
			default:
				System.out.println("Không hợp lệ. Xin vui lòng nhập lại!");
			}
		}
	}

}
