package Library;

import java.util.ArrayList;

public class ReaderList {
	private ArrayList<Reader> listReader;

	public ReaderList() {
		this.listReader = new ArrayList<Reader>();
	}

	public ReaderList(ArrayList<Reader> _listReader) {
		this.listReader = _listReader;
	}

	public boolean checkIsExistCCCD(String cmnd) {
		for (int i = 0; i < n - 1; i++) {
			if (cmnd.equals(x[i].cccd)) {
				return true;
			}
		}
		return false;
	}

	void addReader(int &j)
	{
		System.out.println("<<==============================THEM THONG TIN DOC GIA==============================>>");

		j++;


			x[j - 1].code = MaDocGia();

			System.out.println("\nHo va ten (toi da 24 ki tu): ");
			//cin.ignore();
			/

			getline(cin, x[j - 1].ho_ten);
			
			upperName(x[j - 1].ho_ten);

			System.out.println("CMND/CCCD (12 numbers): ");

			getline(cin, x[j - 1].cccd);
			

			while (checkCCCD(x[j - 1].cccd) == false)
			{
				System.out.println("CMND/CCCD (12 so): ");
				cin.ignore();
				getline(cin, x[j - 1].cccd);
				
			}

			while (checkIsExistCCCD(x[j - 1].cccd, j, x) == false)
			{

				System.out.println("\nMa CMND/CCCD da ton tai. Xin vui long nhap lai!");

				int choose;
				System.out.println("1. Nhap lai CCCD/CMND");
				System.out.println("2. Thoat");
				System.out.println("\nNhap lua chon: ");
				choose = in.nextInt();
				switch (choose)
				{
				case 1:
					System.out.println("Ban vui long nhap CMND/CCCD: ");
					//cin.ignore();
					getline(cin, x[j - 1].cccd);
					// fgets(x[j - 1].cccd, sizeof(x[j - 1].cccd), stdin);
					// x[j - 1].cccd[strlen(x[j - 1].cccd) - 1] = '\0';
					while (checkCCCD(x[j - 1].cccd) == false)
					{
						System.out.println("CMND/CCCD (12 so): ");
						//cin.ignore();
						getline(cin, x[j - 1].cccd);
						// fgets(x[j - 1].cccd, sizeof(x[j - 1].cccd), stdin);
						// x[j - 1].cccd[strlen(x[j - 1].cccd) - 1] = '\0';
					}
					break;

				case 2:
					j--;
					return;
				}

			}

			

			System.out.println("Ngay thang nam sinh (dd/mm/yyyy): ");
			getline(cin, x[j - 1].ngay_sinh);
			// fgets(x[j - 1].ngay_sinh, sizeof(x[j - 1].ngay_sinh), stdin);
			// x[j - 1].ngay_sinh[strlen(x[j - 1].ngay_sinh) - 1] = '\0';

			while (checkFormatDate(x[j - 1].ngay_sinh) == false)
			{ //Kiem tra xem ngay thang nhap co dung dinh dang (dd/mm/yyyy) neu khac thi nhap lai
				System.out.println( "Ngay thang nam sinh (dd/mm/yyyy): ");
				getline(cin, x[j - 1].ngay_sinh);
				// fgets(x[j - 1].ngay_sinh, sizeof(x[j - 1].ngay_sinh), stdin);
				// x[j - 1].ngay_sinh[strlen(x[j - 1].ngay_sinh) - 1] = '\0';
			}

			

			System.out.println( "Gioi tinh (Nam/Nu): ");
			getline(cin, x[j - 1].gioi_tinh);
			// fgets(x[j - 1].gioi_tinh, sizeof(x[j - 1].gioi_tinh), stdin);
			// x[j - 1].gioi_tinh[strlen(x[j - 1].gioi_tinh) - 1] = '\0';

			while (checkGender(x[j - 1].gioi_tinh) == false)		//Kiem tra xem gioi tinh co phai Nam hay nu neu khac th� nhap lai
			{
				System.out.println( "Gioi tinh (Nam/Nu): ");
				cin.ignore();
				getline(cin, x[j - 1].gioi_tinh);
				// fgets(x[j - 1].gioi_tinh, sizeof(x[j - 1].gioi_tinh), stdin);
				// x[j - 1].gioi_tinh[strlen(x[j - 1].gioi_tinh) - 1] = '\0';
			}

			

			System.out.println( "Email (toi da 26 ki tu): ");
			getline(cin, x[j - 1].email);
			// fgets(x[j - 1].email, sizeof(x[j - 1].email), stdin);
			// x[j - 1].email[strlen(x[j - 1].email) - 1] = '\0';

			while (checkEmail(x[j - 1].email) == false)
			{
				System.out.println( "Email (toi da 26 ki tu): ");
				cin.ignore();
				getline(cin, x[j - 1].email);
				// fgets(x[j - 1].email, sizeof(x[j - 1].email), stdin);
				// x[j - 1].email[strlen(x[j - 1].email) - 1] = '\0';
			}

			

			System.out.println( "Dia chi (toi da 44 ki tu): ");
			cin.ignore();
			getline(cin, x[j - 1].dia_chi);
			// fgets(x[j - 1].dia_chi, sizeof(x[j - 1].dia_chi), stdin);
			// x[j - 1].dia_chi[strlen(x[j - 1].dia_chi) - 1] = '\0';

			

			System.out.println( "Ngay lap the (dd/mm/yyyy): ");
			getline(cin, x[j - 1].dia_chi);
			// fgets(x[j - 1].ngay_lap_the, sizeof(x[j - 1].ngay_lap_the), stdin);
			// x[j - 1].ngay_lap_the[strlen(x[j - 1].ngay_lap_the) - 1] = '\0';
			while (checkFormatDate(x[j - 1].ngay_lap_the) == false)
			{
				System.out.println( "Ngay lap the (dd/mm/yyyy): ");
				cin.ignore();
				getline(cin, x[j - 1].ngay_lap_the);
				// fgets(x[j - 1].ngay_lap_the, sizeof(x[j - 1].ngay_lap_the), stdin);
				// x[j - 1].ngay_lap_the[strlen(x[j - 1].ngay_lap_the) - 1] = '\0';
			}

			


			x[j - 1].ngay_het_han = x[j - 1].ngay_lap_the;

			string tmp;
			tmp = x[j - 1].ngay_het_han.substr(6, 4);
			int year = stoi(tmp);
			
			// for (int i = 6; i < 10; i++)
			// {
			// 	num = x[j - 1].ngay_het_han[i];
			// 	year = year * 10 + (static_cast<int>(num) - 48);
			// }
			year += 4;
			// for (int i = 9; i > 5; i--)
			// {
			// 	num2 = static_cast<string>((year % 10) + 48);
			// 	year /= 10;
			// 	x[j - 1].ngay_het_han[i] = num2;
			// }



			
			System.out.println( "Ngay het han cua the: " << x[j - 1].ngay_het_han << endl;


		docgia.open("docgia.txt", ios::app);

		if(docgia.is_open())
		{
			
			docgia << x[j - 1].code << "," << x[j - 1].ho_ten << "," << x[j - 1].cccd << "," << x[j - 1].ngay_sinh << "," << x[j - 1].gioi_tinh << "," << x[j - 1].email << "," << x[j - 1].dia_chi << "," << x[j - 1].ngay_lap_the << "," << x[j - 1].ngay_het_han << endl;
			
			docgia.close();
			System.out.println( "\nCap nhat du lieu doc gia thanh cong...!" << endl;
		}
		else {
			System.out.println( "Khong the mo tep tin." << endl;
		}

		// errno_t docgia2 = fopen_s(&docgia, "docgia.txt", "r+");
		// if (docgia != NULL)
		// {
		// 	fprintf(docgia, "%d\n", j);
		// 	fclose(docgia);
		// }

		// errno_t docgia3 = fopen_s(&docgia, "docgia.txt", "a");
		// if (docgia != NULL)
		// {
		// 	fprintf(docgia, "%d,", x[j - 1].code);

		// 	fprintf(docgia, "%s,", x[j - 1].ho_ten);

		// 	fprintf(docgia, "%s,", x[j - 1].cccd);

		// 	fprintf(docgia, "%s,", x[j - 1].ngay_sinh);

		// 	fprintf(docgia, "%s,", x[j - 1].gioi_tinh);

		// 	fprintf(docgia, "%s,", x[j - 1].email);

		// 	fprintf(docgia, "%s,", x[j - 1].dia_chi);

		// 	fprintf(docgia, "%s,", x[j - 1].ngay_lap_the);

		// 	fprintf(docgia, "%s\n", x[j - 1].ngay_het_han);

		// 	fclose(docgia);

		// 	System.out.println( "\nCap nhat du lieu doc gia thanh cong...!" << endl;
		// }

		System.out.println( "\nThong tin doc gia da duoc them!" << endl;
	}

	void printDocgia(Reader* x, int j)
	{
		System.out.println( "<<==================================================================DANH SACH THONG TIN DOC GIA=======================================================================>>" << endl;


		System.out.println( "========================================================================================================================================================================\n";
		System.out.println( "|Ma   |" << setw(24) << left << "Ho va Ten" << setw(14) << left << "|CMND/CCCD" << setw(12) << left << "|Ngay sinh" << setw(11) << left << "|Gioi tinh" << setw(27) << left << "|Email" << setw(45) << left << "|Dia chi" << setw(14) << left << "|Ngay lap the" << setw(10) << left << "|Ngay het han" << endl;
		System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
		for (int i = 0; i < j; i++) {

			System.out.println( "|" << setw(5) << left << x[i].code << "|" << setw(24) << left << x[i].ho_ten << "|" << setw(13) << left << x[i].cccd << "|" << setw(11) << left << x[i].ngay_sinh << "|" << setw(10) << left << x[i].gioi_tinh << "|" << setw(26) << left << x[i].email << "|" << setw(44) << left << x[i].dia_chi << "|" << setw(13) << left << x[i].ngay_lap_the << "|" << setw(13) << left << x[i].ngay_het_han << endl;
			System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
		}
		System.out.println( "========================================================================================================================================================================\n";
	}

	void searchDocgia(Reader* x, int j)
	{
		string cmnd;
		System.out.println( "\nNhap CCCD/CMND doc gia ma ban muon tim kiem: ";
		cin.ignore();
		getline(cin, cmnd);
		// fgets(cmnd, sizeof(cmnd), stdin);
		// cmnd[strlen(cmnd) - 1] = '\0';
		while (cccdInListReader(cmnd, j, x) == false)
		{
			System.out.println( "\nKhong tim thay CCCD/CMND cua doc gia.Ban vui long nhap lai!" << endl;

			int choose;
			System.out.println( "1. Nhap lai CCCD/CMND doc gia" << endl;
			System.out.println( "2. Thoat" << endl;
			System.out.println( "\nNhap lua chon: ";
			cin >> choose;
			switch (choose)
			{
			case 1:
				System.out.println( "Nhap CCCD/CMND doc gia ma ban muon tim kiem: ";
				//cin.ignore();
				cin.ignore();
				getline(cin, cmnd);
				// fgets(cmnd, sizeof(cmnd), stdin);
				// cmnd[strlen(cmnd) - 1] = '\0';
				break;

			case 2:
				return;
			}

		}
		for (int i = 0; i < j; i++)
		{
			if (cmnd.compare(x[i].cccd) == 0)
			{
				system("cls");
				System.out.println( "========================================================================================================================================================================\n";
				System.out.println( "|Ma   |" << setw(24) << left << "Ho va Ten" << setw(14) << left << "|CMND/CCCD" << setw(12) << left << "|Ngay sinh" << setw(11) << left << "|Gioi tinh" << setw(27) << left << "|Email" << setw(45) << left << "|Dia chi" << setw(14) << left << "|Ngay lap the" << setw(10) << left << "|Ngay het han" << endl;
				System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
				System.out.println( "|" << setw(5) << left << x[i].code << "|" << setw(24) << left << x[i].ho_ten << "|" << setw(13) << left << x[i].cccd << "|" << setw(11) << left << x[i].ngay_sinh << "|" << setw(10) << left << x[i].gioi_tinh << "|" << setw(26) << left << x[i].email << "|" << setw(44) << left << x[i].dia_chi << "|" << setw(13) << left << x[i].ngay_lap_the << "|" << setw(13) << left << x[i].ngay_het_han << endl;
				System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
				System.out.println( "========================================================================================================================================================================\n";
			}
		}

	}

	void editDocgia(Reader* x, int j, fstream& docgia)
	{
		string cmnd;
		System.out.println( "\nNhap CCCD/CMND cua doc gia ma ban muon chinh sua ";
		cin.ignore();
		getline(cin, cmnd);
		// fgets(cmnd, sizeof(cmnd), stdin);
		// cmnd[strlen(cmnd) - 1] = '\0';

		while (cccdInListReader(cmnd, j, x) == false)
		{
			System.out.println( "\nKhong tim thay CCCD/CMND cua doc gia.Ban vui long nhap lai!" << endl;

			int choose;
			System.out.println( "1. Nhap lai CCCD/CMND doc gia" << endl;
			System.out.println( "2. Thoat" << endl;
			System.out.println( "\nNhap lua chon: ";
			cin >> choose;
			switch (choose)
			{
			case 1:
				System.out.println( "Nhap CCCD/CMND doc gia ma ban muon chinh sua: ";
				//cin.ignore();
				cin.ignore();
				getline(cin, cmnd);
				// fgets(cmnd, sizeof(cmnd), stdin);
				// cmnd[strlen(cmnd) - 1] = '\0';
				break;

			case 2:
				return;
			}
		}

		int choose;


		for (int i = 0; i < j; i++)
		{

			if (cmnd.compare(x[i].cccd) == 0)
			{
				system("cls");
				System.out.println( "<<=====================================================================CHINH SUA THONG TIN DOC GIA====================================================================>>" << endl;


				System.out.println( "========================================================================================================================================================================\n";
				System.out.println( "|Ma   |" << setw(24) << left << "Ho va Ten" << setw(14) << left << "|CMND/CCCD" << setw(12) << left << "|Ngay sinh" << setw(11) << left << "|Gioi tinh" << setw(27) << left << "|Email" << setw(45) << left << "|Dia chi" << setw(14) << left << "|Ngay lap the" << setw(10) << left << "|Ngay het han" << endl;
				System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
				System.out.println( "|" << setw(5) << left << x[i].code << "|" << setw(24) << left << x[i].ho_ten << "|" << setw(13) << left << x[i].cccd << "|" << setw(11) << left << x[i].ngay_sinh << "|" << setw(10) << left << x[i].gioi_tinh << "|" << setw(26) << left << x[i].email << "|" << setw(44) << left << x[i].dia_chi << "|" << setw(13) << left << x[i].ngay_lap_the << "|" << setw(13) << left << x[i].ngay_het_han << endl;
				System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
				System.out.println( "========================================================================================================================================================================\n";

				System.out.println( "1. Chinh sua ho ten \n";
				System.out.println( "2. Chinh sua CCCD/CMND \n";
				System.out.println( "3. Chinh sua ngay thang nam sinh \n";
				System.out.println( "4. Chinh sua gioi tinh \n";
				System.out.println( "5. Chinh sua email \n";
				System.out.println( "6. Chinh sua dia chi \n";
				System.out.println( "0. Khong chinh sua \n";
				System.out.println( "Nhap lua chon (0->6) ";
				cin >> choose;


				switch (choose)
				{
				case 0:
					break;
				case 1:
					System.out.println( "Nhap ho va ten (toi da 24 ki tu): ";
					cin.ignore();
					getline(cin, x[i].ho_ten);
					// fgets(x[i].ho_ten, sizeof(x[i].ho_ten), stdin);
					// x[i].ho_ten[strlen(x[i].ho_ten) - 1] = '\0';
					break;
				case 2:
					System.out.println( "Nhap CMND/CCCD(12 so): ";
					cin.ignore();
					getline(cin, x[i].cccd);
					// fgets(x[i].cccd, sizeof(x[i].cccd), stdin);
					// x[i].cccd[strlen(x[i].cccd) - 1] = '\0';
					while (checkCCCD(x[i].cccd) == false) {
						System.out.println( "CMND/CCCD (12 so): ";
						//cin.ignore();
						cin.ignore();
						getline(cin, x[i].cccd);
						// fgets(x[i].cccd, sizeof(x[i].cccd), stdin);
						// x[i].cccd[strlen(x[i].cccd) - 1] = '\0';
					}
					break;
				case 3:
					System.out.println( "Nhap ngay thang nam sinh (dd/mm/yyyy): ";
					cin.ignore();
					getline(cin, x[i].ngay_sinh);
					// fgets(x[i].ngay_sinh, sizeof(x[i].ngay_sinh), stdin);
					// x[i].ngay_sinh[strlen(x[i].ngay_sinh) - 1] = '\0';
					while (checkFormatDate(x[i].ngay_sinh) == false)
					{ //Kiem tra xem ngay thang nhap co dung dinh dang (dd/mm/yyyy) neu khac thi nhap lai
						System.out.println( "Ngay thang nam sinh (dd/mm/yyyy): ";
						getline(cin, x[i].ngay_sinh);
						// fgets(x[i].ngay_sinh, sizeof(x[i].ngay_sinh), stdin);
						// x[i].ngay_sinh[strlen(x[i].ngay_sinh) - 1] = '\0';
					}
					break;
				case 4:
					System.out.println( "Nhap gioi tinh (Nam/Nu): ";
					cin.ignore();
					getline(cin, x[i].gioi_tinh);
					// fgets(x[i].gioi_tinh, sizeof(x[i].gioi_tinh), stdin);
					// x[i].gioi_tinh[strlen(x[i].gioi_tinh) - 1] = '\0';
					while (checkGender(x[i].gioi_tinh)==false) 		//Kiem tra xem gioi tinh co phai Nam hay nu neu khac th� nhap lai
					{
						System.out.println( "Gioi tinh (Nam/Nu): ";
						//cin.ignore();
						cin.ignore();
						getline(cin, x[i].gioi_tinh);
						// fgets(x[i].gioi_tinh, sizeof(x[i].gioi_tinh), stdin);
						// x[i].gioi_tinh[strlen(x[i].gioi_tinh) - 1] = '\0';
					}
					break;
				case 5:
					System.out.println( "Nhap email (toi da 26 ki tu): ";
					cin.ignore();
					getline(cin, x[i].email);
					// fgets(x[i].email, sizeof(x[i].email), stdin);
					// x[i].email[strlen(x[i].email) - 1] = '\0';
					while (checkEmail(x[i].email) == false)
					{
						System.out.println( "Email (toi da 26 ki tu): ";
						//cin.ignore();
						cin.ignore();
						getline(cin, x[i].email);
						// fgets(x[i].email, sizeof(x[i].email), stdin);
						// x[i].email[strlen(x[i].email) - 1] = '\0';
					}
					break;
				case 6:
					System.out.println( "Nhap dia chi (toi da 44 ki tu): ";
					cin.ignore();
					getline(cin, x[i].dia_chi);
					// fgets(x[i].dia_chi, sizeof(x[i].dia_chi), stdin);
					// x[i].dia_chi[strlen(x[i].dia_chi) - 1] = '\0';
					break;
				default:
					System.out.println( "\nLua chon khong hop le. Vui long nhap lai!" << endl;

				}
			}

		}

		docgia.open("docgia.txt");

		if(docgia.is_open())
		{
			docgia << j << endl;
			for (int i = 0; i < j; i++)
			{
				docgia << x[i].code << "," << x[i].ho_ten << "," << x[i].cccd << "," << x[i].ngay_sinh << "," << x[i].gioi_tinh << "," << x[i].email << "," << x[i].dia_chi << "," << x[i].ngay_lap_the << "," << x[i].ngay_het_han << endl;
			}
			docgia.close();
			System.out.println( "\nCap nhat du lieu doc gia thanh cong...!" << endl;
		}
		else {
			System.out.println( "Khong the mo tep tin." << endl;
		}

		// errno_t docgia2 = fopen_s(&docgia, "docgia.txt", "w");

		// if (docgia != NULL)
		// {
		// 	fprintf(docgia, "%d\n", j);
		// 	for (int i = 0; i < j; i++)
		// 	{
		// 		fprintf(docgia, "%d,", x[i].code);

		// 		fprintf(docgia, "%s,", x[i].ho_ten);

		// 		fprintf(docgia, "%s,", x[i].cccd);

		// 		fprintf(docgia, "%s,", x[i].ngay_sinh);

		// 		fprintf(docgia, "%s,", x[i].gioi_tinh);

		// 		fprintf(docgia, "%s,", x[i].email);

		// 		fprintf(docgia, "%s,", x[i].dia_chi);

		// 		fprintf(docgia, "%s,", x[i].ngay_lap_the);

		// 		fprintf(docgia, "%s\n", x[i].ngay_het_han);

		// 	}
		// 	fclose(docgia);
		// 	System.out.println( "\nCap nhat du lieu doc gia thanh cong...!" << endl;
		// }
		// else {
		// 	System.out.println( "Khong the mo tep tin." << endl;
		// }

		System.out.println( "\nThong tin da duoc chinh sua!" << endl;
	}

	void searchTenDocGia(Reader* x, int j)
	{
		string name;
		System.out.println( "\nNhap ho va ten doc gia ma ban muon tim kiem: ";
		//cin.ignore();
		cin.ignore();
		getline(cin, name);
		// fgets(name, sizeof(name), stdin);
		// name[strlen(name) - 1] = '\0';

		while (nameInListReader(name, j, x) == false)
		{

			System.out.println( "\nKhong tim thay ten cua doc gia.Ban vui long nhap lai!" << endl;

			int choose;
			System.out.println( "1. Nhap lai ho va ten doc gia" << endl;
			System.out.println( "2. Thoat" << endl;
			System.out.println( "\nNhap lua chon: ";
			cin >> choose;
			switch (choose)
			{
			case 1:
				System.out.println( "Nhap ho va ten doc gia ma ban muon tim kiem: ";
				//cin.ignore();
				cin.ignore();
				getline(cin, name);
				// fgets(name, sizeof(name), stdin);
				// name[strlen(name) - 1] = '\0';
				break;

			case 2:
				return;
			}

		}

		for (int i = 0; i < j; i++)
		{
			if (name.compare(x[i].ho_ten) == 0)
			{
				system("cls");
				System.out.println( "========================================================================================================================================================================\n";
				System.out.println( "|Ma   |" << setw(24) << left << "Ho va Ten" << setw(14) << left << "|CMND/CCCD" << setw(12) << left << "|Ngay sinh" << setw(11) << left << "|Gioi tinh" << setw(27) << left << "|Email" << setw(45) << left << "|Dia chi" << setw(14) << left << "|Ngay lap the" << setw(10) << left << "|Ngay het han" << endl;
				System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
				System.out.println( "|" << setw(5) << left << x[i].code << "|" << setw(24) << left << x[i].ho_ten << "|" << setw(13) << left << x[i].cccd << "|" << setw(11) << left << x[i].ngay_sinh << "|" << setw(10) << left << x[i].gioi_tinh << "|" << setw(26) << left << x[i].email << "|" << setw(44) << left << x[i].dia_chi << "|" << setw(13) << left << x[i].ngay_lap_the << "|" << setw(13) << left << x[i].ngay_het_han << endl;
				System.out.println( "|" << setw(5) << "_____" << "|" << setw(24) << "________________________" << "|" << setw(12) << "_____________" << "|" << setw(11) << "___________" << "|" << setw(10) << "__________" << "|" << setw(22) << "__________________________" << "|" << setw(44) << "____________________________________________" << "|" << setw(11) << "_____________" << "|" << setw(12) << "_____________" << endl;
				System.out.println( "========================================================================================================================================================================\n";
			}
		}
	}

//	int MaDocGia() {
//		srand(static_cast < unsigned > (time(0)));
//		int random = rand();
//		while (random > 9999) {
//			random /= 10;
//		}
//		return random;
//	}

	void deleteDocgia(Reader*x,int&total,fstream&docgia) {
		int choose;cout<<"0. Thoat "<<endl;cout<<"1. Xoa toan bo thong tin doc gia "<<endl;cout<<"2. Xoa thong tin 1 doc gia "<<endl;

		cout<<"\nNhap lua chon ";cin>>choose;

		while(choose!=0&&choose!=1&&choose!=2){cout<<"\nLua chon khong hop le. Vui long nhap lai!"<<endl;cout<<"\nNhap lua chon ";cin>>choose;}switch(choose){case 0:return;case 1:total=0;break;case 2:string cmnd;cout<<"\nNhap CCCD/CMND cua doc gia ma ban muon xoa ";
		// cin.ignore();
		cin.ignore();getline(cin,cmnd);
		// fgets(cmnd, sizeof(cmnd), stdin);
		// cmnd[strlen(cmnd) - 1] = '\0';
		while(cccdInListReader(cmnd,total,x)==false){cout<<"CCCD/CMND khong the duoc tim thay. Vui long nhap lai!"<<endl;int choose;cout<<"1. Nhap lai CCCD/CMND doc gia"<<endl;cout<<"2. Thoat"<<endl;cout<<"\nNhap lua chon: ";cin>>choose;switch(choose){case 1:cout<<"Nhap CCCD/CMND doc gia ma ban muon xoa: ";
		// cin.ignore();
		cin.ignore();getline(cin,cmnd);
		// fgets(cmnd, sizeof(cmnd), stdin);
		// cmnd[strlen(cmnd) - 1] = '\0';
		break;

		case 2:return;}}for(int i=0;i<total;i++){if(cmnd.compare(x[i].cccd)==0){for(int j=i;j<total-1;j++){x[j].code=x[j+1].code;x[j].ho_ten=x[j+1].ho_ten;x[j].cccd=x[j+1].cccd;x[j].ngay_sinh=x[j+1].ngay_sinh;x[j].gioi_tinh=x[j+1].gioi_tinh;x[j].email=x[j+1].email;x[j].dia_chi=x[j+1].dia_chi;x[j].ngay_lap_the=x[j+1].ngay_lap_the;x[j].ngay_het_han=x[j+1].ngay_het_han;}break;}}total--;break;

		}

		docgia.open("docgia.txt");

		if(docgia.is_open()){docgia<<total<<endl;for(int i=0;i<total;i++){docgia<<x[i].code<<","<<x[i].ho_ten<<","<<x[i].cccd<<","<<x[i].ngay_sinh<<","<<x[i].gioi_tinh<<","<<x[i].email<<","<<x[i].dia_chi<<","<<x[i].ngay_lap_the<<","<<x[i].ngay_het_han<<endl;}docgia.close();cout<<"\nCap nhat du lieu doc gia thanh cong...!"<<endl;}else{cout<<"Khong the mo tep tin."<<endl;}

		// errno_t docgia2 = fopen_s(&docgia, "docgia.txt", "w");

		// if (docgia != NULL)
		// {
		// fprintf(docgia, "%d\n", total);
		// for (int i = 0; i < total; i++)
		// {
		// fprintf(docgia, "%d,", x[i].code);

		// fprintf(docgia, "%s,", x[i].ho_ten);

		// fprintf(docgia, "%s,", x[i].cccd);

		// fprintf(docgia, "%s,", x[i].ngay_sinh);

		// fprintf(docgia, "%s,", x[i].gioi_tinh);

		// fprintf(docgia, "%s,", x[i].email);

		// fprintf(docgia, "%s,", x[i].dia_chi);

		// fprintf(docgia, "%s,", x[i].ngay_lap_the);

		// fprintf(docgia, "%s\n", x[i].ngay_het_han);

		// }
		// fclose(docgia);
		// System.out.println( "\nCap nhat du lieu doc gia thanh cong...!" << endl;
		// }
		// else {
		// System.out.println( "Khong the mo tep tin." << endl;
		// }

		System.out.println("\nThong tin doc gia da bi xoa");}
	}

	void statisticGenderQuantity() {
		int total = listReader.size();
		int male = 0;
		int female = 0;
		for (int i = 0; i < total; i++)
			if (listReader.get(i).gender.compare("Nam") == 0) {
				male++;
			} else {
				female++;
			}
		System.out.println("<<THONG KE SO LUONG DOC GIA THEO GIOI TINH>>");
		System.out.println("============================================");
		System.out.println("|" << setw(21) << left << "Nam" << "|" << setw(20) << left << "Nu" << "|");
		System.out.println(
				"|" << setw(21) << "_____________________" << "|" << setw(20) << "____________________" << "|");
		System.out.println("|" << setw(21) << right << male << "|" << setw(20) << right << female << "|");
		System.out.println("============================================");
	}

	void statisticReaderQuantity() {
		int total = listReader.size();
		System.out.println("<<THONG KE SO LUONG DOC GIA>>");

		System.out.println("=============================");
		System.out.println("|" << setw(6) << left << "Ma" << "|" << setw(20) << left << "Ho va Ten" << "|");
		System.out.println("|" << setw(6) << "______" << "|" << setw(20) << "____________________" << "|");
		for (int i = 0; i < total; i++) {
			System.out.println("|" << setw(6) << left << listReader.get(i).code << "|" << setw(
					20) << left << listReader.get(i).name << "|");
			System.out.println("|" << setw(6) << "______" << "|" << setw(20) << "____________________" << "|");

		}
		System.out.println("=============================");

		System.out.printf("\nTong so luong doc gia la %d\n", total);
	}
}
