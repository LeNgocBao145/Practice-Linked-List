package Library;

import java.util.Random;

public class Function {
	int geneId() {
		Random rand = new Random();

		int rand_int = rand.nextInt(9999 - 1000 + 1) + 1000;

		return rand_int;
	}

	public void ReadFileDocGia(fstream& docgia, Reader* &x, int &total)
	{
		string line;
		string tmp;
		
		docgia.open("docgia.txt", ios::in);

		if(docgia.is_open())
		{
			getline(docgia, line);

	//istringstream ss(line);
			getline(ss, tmp, ',');
			total = stoi(tmp);

			x = new Reader[total];
			
			for(int i = 0; i < total; i++)
			{
				getline(docgia, line);

	istringstream ss(line);
				getline(ss, tmp, ',');
				x[i].code = stoi(tmp);
				getline(ss, x[i].ho_ten, ',');
				getline(ss, x[i].cccd, ',');
				getline(ss, x[i].ngay_sinh, ',');
				getline(ss, x[i].gioi_tinh, ',');
				getline(ss, x[i].email, ',');
				getline(ss, x[i].dia_chi, ',');
				getline(ss, x[i].ngay_lap_the, ',');
				getline(ss, x[i].ngay_het_han, ',');
					
			}

	docgia.close();cout<<"\nDU LIEU DOC GIA DA DUOC TAI LEN CHUONG TRINH THANH CONG...!"<<endl;

	}else{cout<<"Khong mo duoc file"<<endl;return;}}

	void ReadFileSach(fstream& sach, Book* &y, int &quantity)
	{
		string line;
		string tmp;
		
		sach.open("sach.txt");

		if(sach.is_open())
		{
			getline(sach, line);

	istringstream ss(line);
			getline(ss, tmp, ',');
			quantity = stoi(tmp);
			
			
			y = new Book[quantity];
		

				for(int i = 0; i < quantity; i++)
				{
					getline(sach, line);

	istringstream ss(line);
					getline(ss, tmp, ',');
					y[i].ISBN = stoi(tmp);
					
					getline(ss, y[i].ten_sach, ',');
					getline(ss, y[i].tac_gia, ',');
					getline(ss, y[i].nha_xuat_ban, ',');
					getline(ss, tmp, ',');
					y[i].nam_xuat_ban = stoi(tmp);

					getline(ss, y[i].the_loai, ',');

					getline(ss, tmp, ',');
					y[i].gia_tien = stoi(tmp);

					getline(ss, tmp, ',');
					y[i].so_luong = stoi(tmp);

					getline(ss, tmp, ',');
					y[i].BookIsBorrowing = stoi(tmp);
				}

	sach.close();cout<<"\nDU LIEU SACH DA DUOC TAI LEN CHUONG TRINH THANH CONG...!"<<endl;

	}else{cout<<"Khong mo duoc file"<<endl;return;}

	}

	void ReadFilePhieu(fstream& phieu, Ticket* &z, int &so_Phieu)
	{
		string line;
		string tmp;
		
		phieu.open("phieu.txt");

		if(phieu.is_open())
		{
			getline(phieu, line);

	//istringstream ss(line);
			getline(ss, tmp, ',');
			so_Phieu = stoi(tmp);
			
			
			z = new Ticket[so_Phieu];

				for(int i = 0; i < so_Phieu; i++)
				{
					getline(phieu, line);

	//istringstream ss(line);
					getline(ss, tmp, ',');
					z[i].MaPhieu = stoi(tmp);
					getline(ss, tmp, ',');
					z[i].codeDGMuon = stoi(tmp);
					getline(ss, z[i].borrowDate, ',');
					getline(ss, z[i].expectPayDate, ',');
					getline(ss, z[i].actualPayDate, ',');
					getline(ss, tmp, ',');
					z[i].SLmuon = stoi(tmp);

					z[i].codeSachMuon = new int[z[i].SLmuon];

					for (int h = 0; h < z[i].SLmuon; h++)
					{
						getline(ss, tmp, ',');
						z[i].codeSachMuon[h] = stoi(tmp);
					}


					getline(ss, tmp, ',');
					z[i].SLmat = stoi(tmp);

					z[i].codeSachMat = new int[z[i].SLmat];

					for (int h = 0; h < z[i].SLmat; h++)
					{
						getline(ss, tmp, ',');
						z[i].codeSachMat[h] = stoi(tmp);
					}

					getline(ss, tmp, ',');
					z[i].TongTienPhat = stoi(tmp);
				}

	phieu.close();
	System.out.println("\nDU LIEU PHIEU MUON TRA DA DUOC TAI LEN CHUONG TRINH THANH CONG...!"<<endl;

	}else{
		System.out.println("Khong mo duoc file");
		return;}

	}

	public void ReaderManager() {
		cout<<"a. Xem danh sach doc gia trong thu vien\n";cout<<"\nb. Them doc gia\n";cout<<"\nc. Chinh sua thong tin mot doc gia\n";cout<<"\nd. Xoa thong tin doc gia\n";cout<<"\ne. Tim kiem doc gia theo CMND/CCCD\n";cout<<"\nf. Tim kiem thong tin doc gia theo ho ten\n";cout<<"\ng. Thoat\n";
	}

	public void BookManager() {
		cout<<"a. Xem danh sach cac sach trong thu vien\n";cout<<"\nb. Them sach\n";cout<<"\nc. Chinh sua thong tin mot quyen sach\n";cout<<"\nd. Xoa thong tin sach\n";cout<<"\ne. Tim kiem sach theo ISBN\n";cout<<"\nf. Tim kiem sach theo ten sach\n";cout<<"\ng. Thoat\n";
	}

	void BasicStatistic() {
		cout<<"a. Thong ke so luong sach trong thu vien\n";cout<<"\nb. Thong ke so luong sach theo the loai\n";cout<<"\nc. Thong ke so luong doc gia\n";cout<<"\nd. Thong ke so luong doc gia theo gioi tinh\n";cout<<"\ne. Thong ke so sach dang duoc muon\n";cout<<"\nf. Thong ke danh sach doc gia bi tre han\n";cout<<"\ng. Thoat\n";
	}

	void InputDayNow(string daynow) {
		system("cls");cout<<"Truoc khi bat dau chuong trinh. Xin ban vui long nhap ngay thang nam hien tai (dd/mm/yyyy): ";cin.ignore();getline(cin,daynow);while(checkFormatDate(daynow)==false){cout<<"Ngay thang nam (dd/mm/yyyy) khong hop le. Xin ban vui long nhap lai!!: ";getline(cin,daynow);}
	}

	// Ham dung de nhap lua chon a, b, c, d, e, f trong cac muc 1->6
	public void Luachon(Reader* x, Book* y, Ticket* z, int n, char choose, int& total, int& quantity, fstream& sach, fstream& docgia)
	{
		if (n == 1)
		{

			if (choose == 'b')
			{
				system("cls");
				addDocgia(x, total, docgia);
			}
			if (choose == 'a')
			{
				system("cls");
				printDocgia(x, total);
			}
			if (choose == 'c')
			{
				system("cls");
				editDocgia(x, total, docgia);
			}
			if (choose == 'd')
			{
				system("cls");
				deleteDocgia(x, total, docgia);
			}
			if (choose == 'e')
			{
				system("cls");
				searchDocgia(x, total);
			}
			if (choose == 'f')
			{
				system("cls");
				searchTenDocGia(x, total);
			}
			if (choose == 'g')
			{
				return;
			}

			if (choose != 'a' && choose != 'b' && choose != 'c' && choose != 'd' && choose != 'e' && choose != 'f' && choose != 'g')
			{
				System.out.println("Lua chon khong hop le. Vui long nhap lai!");
				return;
			}

		}


		if (n == 2)
		{

			if (choose == 'a')
			{
				system("cls");
				printSach(y, quantity);
			}
			if (choose == 'b')
			{
				system("cls");
				addSach(y, quantity, sach);
			}
			if (choose == 'c')
			{
				system("cls");
				editSach(y, quantity, sach);
			}
			if (choose == 'd')
			{
				system("cls");
				deleteSach(y, quantity, sach);
			}
			if (choose == 'e')
			{
				system("cls");
				searchISBNSach(y, quantity);
			}
			if (choose == 'f')
			{
				system("cls");
				searchTenSach(y, quantity);
			}
			if (choose == 'g')
			{
				return;
			}


			if (choose != 'a' && choose != 'b' && choose != 'c' && choose != 'd' && choose != 'e' && choose != 'f' && choose != 'g')
			{
				System.out.println("Lua chon khong hop le. Vui long nhap lai!");
				return;
			}
		}






		if (n == 5)
		{

			if (choose == 'a')
			{
				system("cls");
				statistic_quantity_book(y, quantity);

			}
			if (choose == 'b')
			{
				system("cls");
				statsitic_quantity_category(y, quantity);

			}
			if (choose == 'c')
			{
				system("cls");
				statistic_quantity_reader(x, total);

			}
			if (choose == 'd')
			{
				system("cls");
				statistic_quantity_gender(x, total);

			}
			if (choose == 'e')
			{
				system("cls");
				statistic_quantity_borrow(y, quantity);
			}
			if (choose == 'f')
			{
				system("cls");
				statistic_listReaders_late(z, x, n, total);
			}
			if (choose == 'g')
			{
				return;
			}

			if (choose != 'a' && choose != 'b' && choose != 'c' && choose != 'd' && choose != 'e' && choose != 'f' && choose != 'g')
			{
				System.out.println("Lua chon khong hop le. Vui long nhap lai!");
				return;
			}
		}


	}

	public boolean checkFormatDate(string date) {
		bool check = true;
		if (date.length() != 10 || date[2] != '/' || date[5] != '/') {
			check = false;
		}
		return check;
	}

	public boolean codeInListMaPhieu(int n, int j, Ticket* z)
	{
		bool check = false;
		for (int i = 0; i < j; i++)
		{
			if (n == z[i].MaPhieu)
			{
				check = true;
				break;
			}
		}

		return check;
	}

	public boolean codeInListDGMuon(int n, int j, Reader* x)
	{
		bool check = false;
		for (int i = 0; i < j; i++)
		{
			if (n == x[i].code)
			{
				check = true;
				break;
			}
		}

		return check;
	}

	public boolean codeInListSachMuon(int n, int j, Book* y)
	{
		bool check = false;
		for (int i = 0; i < j; i++)
		{
			if (n == y[i].ISBN)
			{
				check = true;
				break;
			}
		}

		return check;
	}

//	public boolean nameInListBook(string n, int j, Book* y)
//	{
//		bool check = false;
//		for (int i = 0; i < j; i++)
//		{
//			if (n.compare(y[i].ten_sach) == 0)
//			{
//				check = true;
//				break;
//			}
//		}
//
//		return check;
//	}
//
//	public boolean codeInListBook(int code, int j, Book* y)
//	{
//		bool check = false;
//		for (int i = 0; i < j; i++)
//		{
//			if (code == y[i].ISBN)
//			{
//				check = true;
//				break;
//			}
//		}
//
//		return check;
//	}

	// bool nameInList(string n[100], int j, string name[20][50])
	// {
//		bool check = false;
//		for (int i = 0; i < j; i++)
//		{
//			if (strcmp(n, name[i]) == 0)
//			{
//				check = true;
//				break;
//			}
//		}
	//
//		return check;
	// }

	public boolean cccdInListReader(string n, int j, Reader* x)
	{
		bool check = false;
		for (int i = 0; i < j; i++)
		{
			if (n.compare(x[i].cccd) == 0)
			{
				check = true;
				break;
			}
		}

		return check;
	}

	public boolean nameInListReader(string n, int j, Reader* x)
	{
		bool check = false;
		for (int i = 0; i < j; i++)
		{
			if (n.compare(x[i].ho_ten) == 0)
			{
				check = true;
				break;
			}
		}

		return check;
	}

	public boolean checkCCCD(string cccd) {
		bool check = true;
		if (cccd.length() != 12) {
			check = false;
		}
		return check;
	}

	public boolean checkEmail(string email) // Kiem tra email co ki tu @ hay khong neu khong thi nhap lai
	{
		boolean check = false;

		for (int i = 0; i < 50; i++) {
			if (email[i] == '@') {
				check = true;
				break;
			}
		}
		return check;
	}

	public boolean checkGender(String gender) {
		boolean check = true;
		if (gender.equals("Nam") != true && gender.equals("Nu") != true) {
			check = false;
		}
		return check;
	}

	public int Distance2Date(String expectPayDate, String actualPayDate) {
		int length = 0;
		String tmp;

		tmp = expectPayDate.substring(0, 2);
		int date = stoi(tmp);

		tmp = expectPayDate.substring(3, 2);
		int month = stoi(tmp);

		tmp = expectPayDate.substring(6, 4);
		int year = stoi(tmp);

		tmp = actualPayDate.substring(0, 2);
		int date2 = stoi(tmp);

		tmp = actualPayDate.substring(3, 2);
		int month2 = stoi(tmp);

		tmp = actualPayDate.substring(6, 4);
		int year2 = stoi(tmp);

		if (month2 - month != 0 && year == year2) {

			switch (month) {
			case 1:
				length = date2 + (31 - date);
				break;
			case 2:
				if (year % 4 == 0 && year % 100 != 0) {
					length = date2 + (29 - date);
					break;
				} else {
					length = date2 + (28 - date);
					break;
				}
			case 3:
				length = date2 + (31 - date);
				break;
			case 4:
				length = date2 + (30 - date);
				break;
			case 5:
				length = date2 + (31 - date);
				break;
			case 6:
				length = date2 + (30 - date);
				break;
			case 7:
				length = date2 + (31 - date);
				break;
			case 8:
				length = date2 + (31 - date);
				break;
			case 9:
				length = date2 + (30 - date);
				break;
			case 10:
				length = date2 + (31 - date);
				break;
			case 11:
				length = date2 + (30 - date);
				break;
			case 12:
				length = date2 + (31 - date);
				break;
			}

			for (int i = month + 1; i < month2; i++) {

				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					length += 31;

				} else if (i == 4 || i == 6 || i == 9 || i == 11) {
					length += 30;

				} else if (i == 2 && (year2 % 4 == 0 && year2 % 100 != 0)) {
					length += 29;

				} else {
					length += 28;

				}

			}

		}
		if (month2 - month == 0 && year == year2) {
			length = abs(date2 - date);
		}

		if (year2 - year != 0) {
			int minus = date;
			for (int i = 1; i < month; i++) {
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					minus += 31;

				} else if (i == 4 || i == 6 || i == 9 || i == 11) {
					minus += 30;

				} else if (i == 2 && (year % 4 == 0 && year % 100 != 0)) {
					minus += 29;

				} else {
					minus += 28;

				}

			}

			if (year % 4 == 0 && year % 100 != 0) {
				length += 366 - minus;
			} else {
				length += 365 - minus;
			}

			for (int i = year + 1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0) {
					length += 366;

				} else {
					length += 365;

				}
			}

			length += date2;
			for (int i = 1; i < month2; i++) {

				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					length += 31;

				} else if (i == 4 || i == 6 || i == 9 || i == 11) {
					length += 30;

				} else if (i == 2 && (year2 % 4 == 0 && year2 % 100 != 0)) {
					length += 29;

				} else {
					length += 28;

				}

			}
		}

		return length;
	}

	public boolean checkDsMuon(int n, ArrayList<Int> code) {
		boolean check = false;
		for (int i = 0; i < 5; i++) {
			if (n == code.get(i)) {
				check = true;
				break;
			}
		}

		return check;
	}

//	public boolean checkIsExistTicket(int ma, int n, Ticket* z)
//	{
//		bool check = false;
//		for (int i = 0; i < n; i++)
//		{
//			if (ma == z[i].MaPhieu)
//			{
//				if (z[i].actualPayDate.length() != 0 && checkFormatDate(z[i].actualPayDate) == true)
//				{
//					check = true;
//					break;
//				}
//			}
//		}
//		return check;
//	}

//	public boolean checkIsExistCCCD(string cmnd, int n, Reader* x)
//	{
//		bool check = true;
//		for (int i = 0; i < n - 1; i++)
//		{
//			if (cmnd.compare(x[i].cccd) == 0)
//			{
//				check = false;
//				break;
//			}
//		}
//		return check;
//	}

//	public boolean checkIsExistBook(String book, int n, Book[] y) {
//		boolean check = true;
//		for (int i = 0; i < n - 1; i++) {
//			if (book.compareTo(y[i].getName()) == 0) {
//				check = false;
//				break;
//			}
//		}
//		return check;
//	}

	public String upperName(String s) {
		if (s[0] > 'Z') {
			s[0] = toupper(s[0]);
		}

		for (int i = 0; i < s.length(); i++) {
			if (s[i] == ' ' && s[i + 1] != ' ') {
				s[i + 1] = toupper(s[i + 1]);
			}
		}
	}

	public String upperAllName(String s) {

		for (int i = 0; i < s.length(); i++) {

			s[i] = toupper(s[i]);
		}
	}

//	public boolean Login(string tendangnhap, string matkhau, fstream& Account) {
//		bool check = true;
//		
//		string line;
//		
//
//		string Username;
//		string Password;
//		
//		Account.open("Account.txt");
//		if(Account.is_open())
//		{
//			getline(Account, line);
//
//	//istringstream ss(line);
//			getline(ss, Username, ',');
//			getline(ss, Password, ',');
//			Account.close();
//		}
//
//	
//
//	System.out.println("<<==========DANG NHAP=========>>");
//	System.out.println("\nTen Dang Nhap: ");
//
//	getline(cin, tendangnhap);
//		
//		System.out.println("Mat Khau: ");
//		getline(cin, matkhau);
//		
//
//		while (tendangnhap.compare(Username) != 0 || matkhau.compare(Password) != 0)
//		{
//			system("cls");
//			System.out.println("Ten dang nhap hay mat khau khong hop le");
//			System.out.println("Vui long dang nhap lai!");
//			System.out.println("<<==========DANG NHAP=========>>");
//			System.out.println("\nTen Dang Nhap: ");
//			getline(cin, tendangnhap);
//			
//			System.out.println("Mat Khau: ");
//			getline(cin, matkhau);
//			
//		}
//
//		if (tendangnhap.compare(Username) != 0 || matkhau.compare(Password) != 0)
//		{
//			check = false;
//		}
//
//		return check;
//	}

	public void updateFileSach(Book* y, int quantity, fstream& sach)
	{
		sach.open("sach.txt", ios::out);

		if(sach.is_open())
		{
			sach << quantity << endl;
			for (int i = 0; i < quantity; i++)
			{
				sach << y[i].ISBN << "," << y[i].ISBN << "," << y[i].ten_sach << "," << y[i].tac_gia << "," << y[i].nha_xuat_ban << "," << y[i].nam_xuat_ban << "," << y[i].the_loai << "," << y[i].gia_tien << "," << y[i].so_luong << "," << y[i].BookIsBorrowing << endl;
			}
			sach.close();
			System.out.println("\nCap nhat du lieu sach thanh cong...!");
		}
		else {
			System.out.println("Khong the mo tep tin.");
		}
	}

	public void updateFileDocGia(Reader* x, int total, fstream& docgia)
	{
		docgia.open("docgia.txt", ios::out);

		if(docgia.is_open())
		{
			docgia << total << endl;
			for (int i = 0; i < total; i++)
			{
				docgia << x[i].code << "," << x[i].ho_ten << "," << x[i].cccd << "," << x[i].ngay_sinh << "," << x[i].gioi_tinh << "," << x[i].email << "," << x[i].dia_chi << "," << x[i].ngay_lap_the << "," << x[i].ngay_het_han << endl;
			}
			docgia.close();
			System.out.println("\nCap nhat du lieu doc gia thanh cong...!");
		}
		else {
			System.out.println("Khong the mo tep tin.");
		}
	}

	void updateFilePhieu(Ticket* z, int n, fstream& phieu)
	{
		phieu.open("phieu.txt", ios::out);

		if(phieu.is_open())
		{
			phieu << n << endl;
			for (int i = 0; i < n; i++)
			{
				phieu << z[i].MaPhieu << "," << z[i].codeDGMuon << "," << z[i].borrowDate << "," << z[i].expectPayDate << "," << z[i].actualPayDate << "," << z[i].SLmuon << ",";

				for (int i = 0; i < z[i].SLmuon; i++)
				{
					phieu << z[i].codeSachMuon[i] << ",";
				}

				phieu << z[i].SLmat << "," << z[i].codeSachMat << "," << z[i].TongTienPhat << endl;
			}
			phieu.close();
		}
		else {
			System.out.println("Khong the mo tep tin.");
		}
	}

	int sTOI(string s) {
		int n=s.length();
		cout<<n<<endl;
		int ans=0;
		int index;
		for(int i=0;i<n;i++)
		{
			if(s[i]=='0'){
				index=0;
				ans=ans*10+index;
			}else if(s[i]=='1'){
				index=1;
				ans=ans*10+index;
			}else if(s[i]=='2'){index=2;ans=ans*10+index;}else if(s[i]=='3'){index=3;ans=ans*10+index;}else if(s[i]=='4'){index=4;ans=ans*10+index;}else if(s[i]=='5'){index=5;ans=ans*10+index;}else if(s[i]=='6'){index=6;ans=ans*10+index;}else if(s[i]=='7'){index=7;ans=ans*10+index;}else if(s[i]=='8'){index=8;ans=ans*10+index;}else{index=9;ans=ans*10+index;}}return ans;
	}
}
