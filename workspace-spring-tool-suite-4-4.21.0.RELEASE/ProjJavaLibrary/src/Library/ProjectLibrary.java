package Library;

import java.util.Scanner;

public class ProjectLibrary {
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		String tendangnhap;
//		String matkhau;

		char choose;

		String daynow;

		int total;
		int quantity;
		int so_Phieu;

//			Reader* x;
//			Book* y;
//			Ticket* z;

//			fstream Account;
//
//			fstream docgia;
//
//			fstream sach;
//
//			fstream phieu;

		Account admin = new Account();
		while (admin.Login() == false) {
			admin.Login();
		}

//			system("cls");
//
//			ReadFileDocGia(docgia, x, total);
//
//			ReadFileSach(sach, y, quantity);
//
//			ReadFilePhieu(phieu, z, so_Phieu);

		System.out.println("\nDANG NHAP TAI KHOAN ADMIN THANH CONG!");

		char is_continue2;
		System.out.println("\nMoi ban vui long nhap lua chon de tiep tuc (y/n)");

		is_continue2 = in.next().charAt(1);
		while (is_continue2 != 'y' && is_continue2 != 'n') {
			System.out.println("\nLua chon khong hop le. Vui long nhap lai!");
			System.out.println("\nBan co muon lua chon tiep khong (y/n)");
			is_continue2 = in.next().charAt(1);
			// cin >> is_continue2;
		}
		if (is_continue2 == 'n') {
			System.out.println("Xin chao tam biet. Hen gap lai lan sau");
			// return 0;
		} else {
			// InputDayNow(daynow);
		}

		while (true) {
			// int n = show_menu();
			int n = in.nextInt();
			switch (n) {
			case 0:
				System.out.println("Xin chao tam biet. Hen gap lai lan sau!\n");
				// return 0;
			case 1:
//					system("cls");
//					ReaderManager();
				break;
			case 2:
				// system("cls");
				// BookManager();
				break;

			case 3:
				// LapPhieuMuon(x, y, z, so_Phieu, total, quantity, daynow, phieu, sach);
				break;
			case 4:
				// LapPhieuTra(y,z, so_Phieu, quantity, daynow, phieu, sach);
				break;

			case 5:
//					system("cls");
//					BasicStatistic();
				break;
			case 6:
				// InPhieuMuonTra(z, so_Phieu);
				break;
			default:
				System.out.println("\nLua chon khong hop le. Vui long nhap lai!");
			}

			if (n == 1 || n == 2 || n == 5) {
				System.out.println("\nLua chon cua ban la ");
				// choose = in.nextChar();

//					while (!isalpha(choose))
//					{
//						System.out.println("\nLua chon khong hop le. Vui long nhap lai!");
//						System.out.println("\nLua chon cua ban la ");
//						//cin >> choose;
//					}
			}

			// Luachon(x, y, z, n, choose, total, quantity, sach, docgia);

			String is_continue;
			System.out.println("\nBan co muon lua chon tiep khong (y/n)");
			is_continue = in.nextLine();
			while (is_continue != "y" && is_continue != "n") {
				System.out.println("\nLua chon khong hop le. Vui long nhap lai!");
				System.out.println("\nBan co muon lua chon tiep khong (y/n)");
				is_continue = in.nextLine();
			}
			if (is_continue == "n") {
				System.out.println("Xin chao tam biet. Hen gap lai lan sau");
				// return 0;
			}
		}
	}
}
