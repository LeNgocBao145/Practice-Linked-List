package Library;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookList {
	private ArrayList<Book> listBook;

	public BookList() {
		this.listBook = new ArrayList<Book>();
	}

	public BookList(ArrayList<Book> _listBook) {
		this.listBook = _listBook;
	}

	public boolean checkIsExistBook(String book) {

		for (int i = 0; i < listBook.size() - 1; i++) {
			if (book.equals(listBook.get(i).getName())) {
				return true;
			}
		}
		return false;
	}

	int MaISBN() {
//		srand(static_cast < unsigned > (time(0)));
//		int random = rand();
//		while (random > 9999) {
//			random /= 10;
//		}

		Random rand = new Random();

		int rand_int = rand.nextInt(9999 - 1000 + 1) + 1000;

		return rand_int;
	}

	void addSach(int quantity) {
		Book newBook = new Book();
		Function edit = new Function();
		int ISBN = edit.geneId();
		newBook.setISBN(ISBN);
		System.out.println("Ten sach (toi da 39 ki tu): ");
		// cin.ignore();
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String name = in.nextLine();

		name = edit.upperName(name);

		while (checkIsExistBook(name) == false) {

			System.out.println("Sach da ton tai trong thu vien. Xin vui long nhap lai!");

			int choose;
			System.out.println("1. Nhap lai ten sach");
			System.out.println("2. Thoat");
			System.out.println("\nNhap lua chon: ");
			choose = in.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Ban vui long nhap ten sach (toi da 39 ki tu): ");
				// cin.ignore();
				in.nextLine();
				name = in.nextLine();

				break;

			case 2:
				quantity--;
				return;
			}

		}

		name = edit.upperName(name);

		newBook.setName(name);

		System.out.println("Tac gia (toi da 27 ki tu): ");
		String author = in.nextLine();

		author = edit.upperAllName(author);

		newBook.setAuthor(author);

		System.out.println("Nha xuat ban (toi da 27 ki tu): ");
		String publisher = in.nextLine();

		publisher = edit.upperAllName(publisher);

		newBook.setPublisher(publisher);

		System.out.println("Nam xuat ban (4 so): ");
		int publicYear = in.nextInt();
		while (publicYear > 3000 || publicYear < 2000) {
			System.out.println("Nam xuat ban (4 so): ");
			publicYear = in.nextInt();
		}

		newBook.setPublicYear(publicYear);

		System.out.println("The loai (toi da 24 ki tu): ");
		// cin.ignore();
		in.nextLine();
		String category = in.nextLine();

		category = edit.upperAllName(category);

		newBook.setCategory(category);
		System.out.println("Gia tien: ");
		int price = in.nextInt();

		newBook.setPrice(price);

		System.out.println("So luong: ");
		int quantity1 = in.nextInt();
		newBook.setQuantity(quantity1);

		int BookIsBorrowing = 0;
		newBook.setBookIsBorrowing(BookIsBorrowing);

		this.listBook.add(newBook);

//		sach.open("sach.txt", ios::app);
//
//		if(sach.is_open())
//		{
//			sach << y[quantity - 1].ISBN << "," << y[quantity - 1].ISBN << "," << y[quantity - 1].ten_sach << "," << y[quantity - 1].tac_gia << "," << y[quantity - 1].nha_xuat_ban << "," << y[quantity - 1].nam_xuat_ban << "," << y[quantity - 1].the_loai << "," << y[quantity - 1].gia_tien << "," << y[quantity - 1].so_luong << "," << y[quantity - 1].BookIsBorrowing);
//			sach.close();
//			System.out.println("\nCap nhat du lieu sach thanh cong...!");
//		}
//		else {
//			System.out.println("Khong the mo tep tin.");
//		}

		// errno_t sach2 = fopen_s(&sach, "sach.txt", "r+");
		// if (sach != NULL)
		// {
		// fprintf(sach, "%d", quantity);
		// fclose(sach);
		// }

		// errno_t sach3 = fopen_s(&sach, "sach.txt", "a");

		// if (sach != NULL)
		// {
		// fprintf(sach, "%d,", y[quantity - 1].ISBN);

		// fprintf(sach, "%s,", y[quantity - 1].ten_sach);

		// fprintf(sach, "%s,", y[quantity - 1].tac_gia);

		// fprintf(sach, "%s,", y[quantity - 1].nha_xuat_ban);

		// fprintf(sach, "%d,", y[quantity - 1].nam_xuat_ban);

		// fprintf(sach, "%s,", y[quantity - 1].the_loai);

		// fprintf(sach, "%d,", y[quantity - 1].gia_tien);

		// fprintf(sach, "%d,", y[quantity - 1].so_luong);

		// fprintf(sach, "%d\n", y[quantity - 1].BookIsBorrowing);

		// fclose(sach);

		// System.out.println("\nCap nhat du lieu sach thanh cong...!" << endl;
		// }

		System.out.println("\nThong tin sach da duoc them!");
	}

	void printSach(int quantity) {
		System.out.println(
				"<<==========================================================DANH SACH THONG TIN CUA SACH TRONG THU VIEN===============================================================>>");

		System.out.println(
				"========================================================================================================================================================================\n");
		System.out.println("|ISBN  |" << setw(39) << left << "Ten Sach" << setw(28) << left << "|Tac gia" << setw(
				28) << left << "|Nha xuat ban" << setw(12) << left << "|Nam xuat ban" << setw(
						25) << left << "|The loai" << setw(
								15) << left << "|Gia tien" << setw(9) << left << "|So luong");
		System.out.println("|" << setw(6) << "______" << "|" << setw(
				39) << "_______________________________________" << "|" << setw(
						27) << "___________________________" << "|" << setw(
								27) << "___________________________" << "|" << setw(
										12) << "____________" << "|" << setw(
												23) << "________________________" << "|" << setw(
														14) << "______________" << "|" << setw(9) << "___________");
		for (int i = 0; i < listBook.size(); i++) {
			System.out.println(
					"|" << setw(6) << left << y[i].ISBN << "|" << setw(39) << left << y[i].ten_sach << "|" << setw(
							27) << left << y[i].tac_gia << "|" << setw(27) << left << y[i].nha_xuat_ban << "|" << setw(
									12) << left << y[i].nam_xuat_ban << "|" << setw(
											24) << left << y[i].the_loai << "|" << setw(
													14) << left << fixed << setprecision(
															3) << y[i].gia_tien << "|" << setw(
																	9) << left << y[i].so_luong);
			System.out.println("|" << setw(6) << "______" << "|" << setw(
					39) << "_______________________________________" << "|" << setw(
							27) << "___________________________" << "|" << setw(
									27) << "___________________________" << "|" << setw(
											12) << "____________" << "|" << setw(
													23) << "________________________" << "|" << setw(
															14) << "______________" << "|" << setw(9) << "___________");
		}
		System.out.println(
				"========================================================================================================================================================================\n");
	}

	public boolean nameInListBook(String n) {

		for (int i = 0; i < listBook.size(); i++) {
			if (n.equals(listBook.get(i).getName())) {
				return true;
			}
		}

		return false;
	}

	public boolean codeInListBook(int code) {
		for (int i = 0; i < listBook.size(); i++) {
			if (code == listBook.get(i).getISBN()) {
				return true;
			}
		}

		return false;
	}

	void searchISBNSach(int quantity) {
		Scanner in = new Scanner(System.in);
		int code;
		System.out.println("\nNhap ISBN cua sach ma ban muon tim kiem: ");

		code = in.nextInt();

		while (cin.fail() || (codeInListBook(code) == false)) {
			// cin.clear();
			// cin.ignore(50, '\n');
			System.out.println("Ma ISBN khong tim thay. Vui long nhap lai!");
			int choose;
			System.out.println("1. Nhap lai ma ISBN");
			System.out.println("2. Thoat");
			System.out.println("\nNhap lua chon: ");
			choose = in.nextInt();
			switch (choose) {
			case 1:
				System.out.println("\nNhap ISBN cua sach ma ban muon tim kiem: ");
				choose = in.nextInt();
				break;

			case 2:
				return;
			}

		}

		for (int i = 0; i < quantity; i++) {
			if (code == listBook.get(i).getISBN()) {
				// system("cls");
				System.out.println(
						"========================================================================================================================================================================\n");
				System.out
						.println("|ISBN  |" << setw(39) << left << "Ten Sach" << setw(28) << left << "|Tac gia" << setw(
								28) << left << "|Nha xuat ban" << setw(12) << left << "|Nam xuat ban" << setw(
										25) << left << "|The loai" << setw(
												15) << left << "|Gia tien" << setw(9) << left << "|So luong");
				System.out.println("|" << setw(6) << "______" << "|" << setw(
						39) << "_______________________________________" << "|" << setw(
								27) << "___________________________" << "|" << setw(
										27) << "___________________________" << "|" << setw(
												12) << "____________" << "|" << setw(
														23) << "________________________" << "|" << setw(
																14) << "______________" << "|" << setw(
																		9) << "___________");
				System.out.println(
						"|" << setw(6) << left << y[i].ISBN << "|" << setw(39) << left << y[i].ten_sach << "|" << setw(
								27) << left << y[i].tac_gia << "|" << setw(
										27) << left << y[i].nha_xuat_ban << "|" << setw(
												12) << left << y[i].nam_xuat_ban << "|" << setw(
														24) << left << y[i].the_loai << "|" << setw(
																14) << left << y[i].gia_tien << "|" << setw(
																		9) << left << y[i].so_luong);
				System.out.println("|" << setw(6) << "______" << "|" << setw(
						39) << "_______________________________________" << "|" << setw(
								27) << "___________________________" << "|" << setw(
										27) << "___________________________" << "|" << setw(
												12) << "____________" << "|" << setw(
														23) << "________________________" << "|" << setw(
																14) << "______________" << "|" << setw(
																		9) << "___________");
				System.out.println(
						"========================================================================================================================================================================\n");
			}
		}

	}

	void editSach() {
		int quantity = listBook.size();
		int code;
		System.out.println("\nNhap ISBN cua sach ma ban muon chinh sua ");
		code = in.nextInt();
		while (cin.fail() || (codeInListBook(code, quantity, y) == false)) {
			cin.clear();
			cin.ignore(50, '\n');
			System.out.println("Ma ISBN khong tim thay. Vui long nhap lai!");
			int choose;
			System.out.println("1. Nhap lai ma ISBN");
			System.out.println("2. Thoat");
			System.out.println("\nNhap lua chon: ");
			choose = in.nextInt();
			switch (choose) {
			case 1:
				System.out.println("\nNhap ISBN cua sach ma ban muon chinh sua: ");
				code = in.nextInt();
				break;

			case 2:
				return;
			}
		}

		int choose;

		for (int i = 0; i < quantity; i++) {

			if (code == y[i].ISBN) {
				system("cls");
				System.out.println(
						"<<=======================================================================CHINH SUA THONG TIN SACH=====================================================================>>");

				System.out.println(
						"========================================================================================================================================================================\n");
				System.out
						.println("|ISBN  |" << setw(39) << left << "Ten Sach" << setw(28) << left << "|Tac gia" << setw(
								28) << left << "|Nha xuat ban" << setw(12) << left << "|Nam xuat ban" << setw(
										25) << left << "|The loai" << setw(
												15) << left << "|Gia tien" << setw(9) << left << "|So luong");
				System.out.println("|" << setw(6) << "______" << "|" << setw(
						39) << "_______________________________________" << "|" << setw(
								27) << "___________________________" << "|" << setw(
										27) << "___________________________" << "|" << setw(
												12) << "____________" << "|" << setw(
														23) << "________________________" << "|" << setw(
																14) << "______________" << "|" << setw(
																		9) << "___________");
				System.out.println(
						"|" << setw(6) << left << y[i].ISBN << "|" << setw(39) << left << y[i].ten_sach << "|" << setw(
								27) << left << y[i].tac_gia << "|" << setw(
										27) << left << y[i].nha_xuat_ban << "|" << setw(
												12) << left << y[i].nam_xuat_ban << "|" << setw(
														24) << left << y[i].the_loai << "|" << setw(
																14) << left << y[i].gia_tien << "|" << setw(
																		9) << left << y[i].so_luong);
				System.out.println("|" << setw(6) << "______" << "|" << setw(
						39) << "_______________________________________" << "|" << setw(
								27) << "___________________________" << "|" << setw(
										27) << "___________________________" << "|" << setw(
												12) << "____________" << "|" << setw(
														23) << "________________________" << "|" << setw(
																14) << "______________" << "|" << setw(
																		9) << "___________");
				System.out.println(
						"========================================================================================================================================================================\n");

				System.out.println("1. Chinh sua ten sach \n");
				System.out.println("2. Chinh sua ten tac gia \n");
				System.out.println("3. Chinh sua ten nha xuat ban \n");
				System.out.println("4. Chinh sua nam xuat ban \n");
				System.out.println("5. Chinh sua the loai \n");
				System.out.println("6. Chinh sua gia tien \n");
				System.out.println("7. Chinh sua so luong \n");
				System.out.println("0. Khong chinh sua \n");
				System.out.println("\nNhap lua chon (0->7) ");
				choose = in.nextInt();

				switch (choose) {
				case 0:
					break;
				case 1:
					System.out.println("Nhap ten sach (toi da 39 ki tu): ");
					cin.ignore();
					getline(cin, y[i].ten_sach);

					upperName(y[i].ten_sach);
					break;
				case 2:
					System.out.println("Nhap ten tac gia (toi da 27 ki tu): ");
//					cin.ignore();
//					getline(cin, y[i].tac_gia);
					in.nextLine();
					listBook.get(i).setAuthor(in.nextLine());

					upperAllName(y[i].tac_gia);
					break;
				case 3:
					System.out.println("Nhap ten nha xuat ban (toi da 27 ki tu): ");
//					cin.ignore();
//					getline(cin, y[i].nha_xuat_ban);
					in.nextLine();
					listBook.get(i).setPublisher(in.nextLine());

					upperAllName(y[i].nha_xuat_ban);
					break;
				case 4:
					System.out.println("Nhap nam xuat ban (4 so): ");
					listBook.get(i).setPublicYear(in.nextInt());
					while (y[i].nam_xuat_ban > 3000 || y[i].nam_xuat_ban < 2000) {
						System.out.println("Nam xuat ban (4 so): ");
						listBook.get(i).setPublicYear(in.nextInt());
					}
					break;
				case 5:
					System.out.println("Nhap the loai (toi da 24 ki tu): ");
//					cin.ignore();
//					getline(cin, y[i].the_loai);
					in.nextLine();
					listBook.get(i).setCategory(in.nextLine());

					upperAllName(y[i].the_loai);
					break;
				case 6:
					System.out.println("Nhap gia tien: ");
//					cin.ignore();
//					y[i].gia_tien = in.nextInt();
					in.nextLine();
					listBook.get(i).setPrice(in.nextInt());
					break;
				case 7:
					System.out.println("Chinh sua so luong: ");
//					y[i].so_luong = in.nextInt();
					in.nextLine();
					listBook.get(i).setQuantity(in.nextInt());
					break;
				default:
					System.out.println("Lua chon khong hop le. Vui long nhap lai!\n");
				}

				System.out.println("\nThong tin da duoc chinh sua!");
			}
		}

//		sach.open("sach.txt");
//
//		if(sach.is_open())
//		{
//			sach << quantity << endl;
//			for (int i = 0; i < quantity; i++)
//			{
//				sach << y[i].ISBN << "," << y[i].ISBN << "," << y[i].ten_sach << "," << y[i].tac_gia << "," << y[i].nha_xuat_ban << "," << y[i].nam_xuat_ban << "," << y[i].the_loai << "," << y[i].gia_tien << "," << y[i].so_luong << "," << y[i].BookIsBorrowing << endl;
//			}
//			sach.close();
//			System.out.println("\nCap nhat du lieu sach thanh cong...!");
//		}
//		else {
//			System.out.println("Khong the mo tep tin.");
//		}

		// errno_t sach2 = fopen_s(&sach, "sach.txt", "w");

		// if (sach != NULL)
		// {
		// fprintf(sach, "%d\n", quantity);
		// for (int i = 0; i < quantity; i++)
		// {
		// fprintf(sach, "%d,", y[i].ISBN);

		// fprintf(sach, "%s,", y[i].ten_sach);

		// fprintf(sach, "%s,", y[i].tac_gia);

		// fprintf(sach, "%s,", y[i].nha_xuat_ban);

		// fprintf(sach, "%d,", y[i].nam_xuat_ban);

		// fprintf(sach, "%s,", y[i].the_loai);

		// fprintf(sach, "%d,", y[i].gia_tien);

		// fprintf(sach, "%d,", y[i].so_luong);

		// fprintf(sach, "%d\n", y[i].BookIsBorrowing);

		// }
		// fclose(sach);

		// System.out.println("\nCap nhat du lieu sach thanh cong...!" << endl;
		// }
		// else {
		// System.out.println("Khong the mo tep tin." << endl;
		// }
	}

	void searchTenSach(int quantity)
	{
		string name;
		System.out.println("\nNhap ten sach ma ban muon tim kiem: ");
		cin.ignore();
		getline(cin, name);
		
		while (nameInListBook(name, quantity, y) == false)
		{
			System.out.println("Ten sach khong the duoc tim thay. Vui long nhap lai!");
			int choose;
			System.out.println("1. Nhap lai ten sach");
			System.out.println("2. Thoat");
			System.out.println("\nNhap lua chon: ");
			choose = in.nextInt();
			switch (choose)
			{
			case 1:
				cin.ignore();
				System.out.println("\nNhap ten sach ma ban muon tim kiem: ");
				getline(cin, name);
				// fgets(name, sizeof(name), stdin);
				// name[strlen(name) - 1] = '\0';
				break;

			case 2:
				return;
			}
		}

		for (int i = 0; i < quantity; i++)
		{
			if (name.compare(listBook.get(i).getName()) == 0)
			{
				//system("cls");
				System.out.println("========================================================================================================================================================================\n");
				System.out.println("|ISBN  |" << setw(39) << left << "Ten Sach" << setw(28) << left << "|Tac gia" << setw(28) << left << "|Nha xuat ban" << setw(12) << left << "|Nam xuat ban" << setw(25) << left << "|The loai" << setw(15) << left << "|Gia tien" << setw(9) << left << "|So luong" << endl;
				System.out.println("|" << setw(6) << "______" << "|" << setw(39) << "_______________________________________" << "|" << setw(27) << "___________________________" << "|" << setw(27) << "___________________________" << "|" << setw(12) << "____________" << "|" << setw(23) << "________________________" << "|" << setw(14) << "______________" << "|" << setw(9) << "___________" << endl;
				System.out.println("|" << setw(6) << left << y[i].ISBN << "|" << setw(39) << left << y[i].ten_sach << "|" << setw(27) << left << y[i].tac_gia << "|" << setw(27) << left << y[i].nha_xuat_ban << "|" << setw(12) << left << y[i].nam_xuat_ban << "|" << setw(24) << left << y[i].the_loai << "|" << setw(14) << left << y[i].gia_tien << "|" << setw(9) << left << y[i].so_luong << endl;
				System.out.println("|" << setw(6) << "______" << "|" << setw(39) << "_______________________________________" << "|" << setw(27) << "___________________________" << "|" << setw(27) << "___________________________" << "|" << setw(12) << "____________" << "|" << setw(23) << "________________________" << "|" << setw(14) << "______________" << "|" << setw(9) << "___________" << endl;
				System.out.println("========================================================================================================================================================================\n");
			}
		}
	}

	void deleteSach() {
		int quantity = listBook.size();
		int choose;
		System.out.println("0. Thoat ");
		System.out.println("1. Xoa toan bo thong tin sach ");
		System.out.println("2. Xoa thong tin 1 cuon sach ");

		System.out.println("\nNhap lua chon ");
		choose = in.nextInt();

		switch (choose) {
		case 0:
			return;
		case 1:
			quantity = 0;
			break;
		case 2:
			int code;
			System.out.println("\nNhap ma ISBN cua sach ma ban muon xoa ");
			code = in.nextInt();

			while (cin.fail() || (codeInListBook(code, quantity, y) == false)) {
				cin.clear();
				cin.ignore(50, '\n');
				System.out.println("Ma ISBN khong tim thay. Vui long nhap lai!");
				int choose;
				System.out.println("1. Nhap lai ma ISBN");
				System.out.println("2. Thoat");
				System.out.println("\nNhap lua chon: ");
				choose = in.nextInt();

				switch (choose) {
				case 1:
					System.out.println("\nNhap ISBN cua sach ma ban muon xoa: ");
					code = in.nextInt();
					break;

				case 2:
					return;
				}
			}

			for (int i = 0; i < quantity; i++) {
				if (code == listBook.get(i).getISBN()) {
					for (int j = quantity - 1; j > 0; j--) {
						for (int a = i; a < j; a++) {
							y[a].ISBN = y[a + 1].ISBN;
							y[a].ten_sach = y[a + 1].ten_sach;
							y[a].tac_gia = y[a + 1].tac_gia;
							y[a].nha_xuat_ban = y[a + 1].nha_xuat_ban;
							y[a].nam_xuat_ban = y[a + 1].nam_xuat_ban;
							y[a].the_loai = y[a + 1].the_loai;
							y[a].gia_tien = y[a + 1].gia_tien;
							y[a].so_luong = y[a + 1].so_luong;
						}
					}
				}
			}
			quantity--;
			break;

		}

		// sach.open("sach.txt");

		// if(sach.is_open()){sach<<quantity<<endl;for(int
		// i=0;i<quantity;i++){sach<<y[i].ISBN<<","<<y[i].ISBN<<","<<y[i].ten_sach<<","<<y[i].tac_gia<<","<<y[i].nha_xuat_ban<<","<<y[i].nam_xuat_ban<<","<<y[i].the_loai<<","<<y[i].gia_tien<<","<<y[i].so_luong<<","<<y[i].BookIsBorrowing<<endl;}sach.close();System.out.println("\nCap
		// nhat du lieu sach thanh cong...!"<<endl;}else{System.out.println("Khong the
		// mo tep tin."<<endl;}

		System.out.println("\nThong tin sach da bi xoa");

		// errno_t sach2 = fopen_s(&sach, "sach.txt", "w");

		// if (sach != NULL)
		// {
		// fprintf(sach, "%d\n", quantity);
		// for (int i = 0; i < quantity; i++)
		// {
		// fprintf(sach, "%d,", y[i].ISBN);

		// fprintf(sach, "%s,", y[i].ten_sach);

		// fprintf(sach, "%s,", y[i].tac_gia);

		// fprintf(sach, "%s,", y[i].nha_xuat_ban);

		// fprintf(sach, "%d,", y[i].nam_xuat_ban);

		// fprintf(sach, "%s,", y[i].the_loai);

		// fprintf(sach, "%d,", y[i].gia_tien);

		// fprintf(sach, "%d,", y[i].so_luong);

		// fprintf(sach, "%d\n", y[i].BookIsBorrowing);

		// }
		// fclose(sach);
		// System.out.println("\nCap nhat du lieu sach thanh cong...!" << endl;
		// }
		// else {
		// System.out.println("Khong the mo tep tin." << endl;
		// }

		// System.out.println("\nThong tin sach da bi xoa" << endl;
	}

	void statisticBorrowQuantity() {
		int quantity = listBook.size();
		System.out.println("<<================THONG KE SO LUONG SACH DANG DUOC MUON================>>");

		System.out.println("=========================================================================");
		System.out.println("|" << setw(6) << left << "ISBN" << "|" << setw(39) << left << "Ten sach" << "|" << setw(
				24) << left << "So sach dang duoc muon" << "|");
		System.out.println("|" << setw(6) << "______" << "|" << setw(
				39) << "_______________________________________" << "|" << setw(
						24) << "________________________" << "|");

		for (int j = 0; j < quantity; j++) {

			System.out.println("|" << setw(6) << left << listBook.get(j).getISBN() << "|" << setw(39) << listBook.get(j)
					.getName() << "|" << setw(24) << right << listBook.get(j).getBookIsBorrowing() << "|");
			System.out.println("|" << setw(6) << "______" << "|" << setw(
					39) << "_______________________________________" << "|" << setw(
							24) << "________________________" << "|");

		}
		System.out.println("========================================================================");
	}

	void statsiticCategoryQuantity() {
		int quantity = listBook.size();
		int S;
		System.out.println("<<===THONG KE SACH THEO THE LOAI==>>");
		System.out.println("====================================");
		System.out.println("|" << setw(24) << left << "The loai" << "|" << setw(9) << left << "So luong" << "|");
		System.out.println("|" << setw(24) << "________________________" << "|" << setw(9) << "_________" << "|");
		for (int i = 0; i < quantity; i++) {

			boolean nonExist = true;
			for (int j = 0; j < i; j++) {

				if (listBook.get(i).getCategory().compare(listBook.get(j).getCategory()) == 0) {
					nonExist = false;
					break;
				}

			}

			S = listBook.get(i).getQuantity();
			if (nonExist) {
				for (int k = i + 1; k < quantity; k++) {

					if (listBook.get(k).getCategory().compareTo(listBook.get(i).getCategory()) == 0) {
						S += listBook.get(k).getQuantity();

					}

				}
				System.out.println(
						"|" << setw(24) << left << listBook.get(i).getCategory() << "|" << setw(9) << left << S << "|");
				System.out
						.println("|" << setw(24) << "________________________" << "|" << setw(9) << "_________" << "|");

			}
		}
		System.out.println("====================================");

	}

	void statisticBookQuantity() {
		int quantity = listBook.size();
		int S = 0;
		System.out.println("<<========THONG KE SO LUONG SACH TRONG THU VIEN========>>");
		System.out.println("=========================================================");
		System.out.println("|" << setw(6) << left << "ISBN" << setw(39) << left << "|Ten sach" << setw(
				10) << left << "|So luong" << "|");
		System.out.println("|" << setw(6) << "______" << "|" << setw(
				38) << "______________________________________" << "|" << setw(9) << "_________" << "|");
		for (int i = 0; i < quantity; i++) {
			S += listBook.get(i).getQuantity();
			System.out
					.println("|" << setw(6) << left << listBook.get(i).getISBN() << "|" << setw(38) << left << listBook
							.get(i).getName() << "|" << setw(9) << right << listBook.get(i).getQuantity() << "|");
			System.out.println("|" << setw(6) << "______" << "|" << setw(
					38) << "______________________________________" << "|" << setw(9) << "_________" << "|");
		}
		System.out.println("=========================================================");

		System.out.printf("\nTong so luong sach trong thu vien la %d", S);
	}
}
