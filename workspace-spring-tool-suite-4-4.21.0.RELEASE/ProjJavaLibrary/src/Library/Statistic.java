package Library;

public class Statistic {

//	void statisticBookQuantity()
//	{
//		int quantity = listBook.size();
//		int S = 0;
//		System.out.println( "<<========THONG KE SO LUONG SACH TRONG THU VIEN========>>" );
//		System.out.println( "=========================================================" );
//		System.out.println( "|" << setw(6) << left << "ISBN" << setw(39) << left << "|Ten sach" << setw(10) << left << "|So luong" << "|" );
//		System.out.println( "|" << setw(6) << "______" << "|" << setw(38) << "______________________________________" << "|" << setw(9) << "_________" << "|" );
//		for (int i = 0; i < quantity; i++)
//		{
//			S += listBook.get(i).getQuantity();
//			System.out.println( "|" << setw(6) << left << listBook.get(i).getISBN() << "|" << setw(38) << left << listBook.get(i).getName() << "|" << setw(9) << right << listBook.get(i).getQuantity() << "|" );
//			System.out.println( "|" << setw(6) << "______" << "|" << setw(38) << "______________________________________" << "|" << setw(9) << "_________" << "|" );
//		}
//		System.out.println( "=========================================================" );
//
//		System.out.printf( "\nTong so luong sach trong thu vien la %d", S);
//	}

//	void statsiticCategoryQuantity()
//	{
//		int quantity = listBook.size();
//		int S;
//		System.out.println( "<<===THONG KE SACH THEO THE LOAI==>>" );
//		System.out.println( "====================================" );
//		System.out.println( "|" << setw(24) << left << "The loai" << "|" << setw(9) << left << "So luong" << "|" );
//		System.out.println( "|" << setw(24) << "________________________" << "|" << setw(9) << "_________" << "|" );
//		for (int i = 0; i < quantity; i++)
//		{
//
//			boolean nonExist = true;
//			for (int j = 0; j < i; j++)
//			{
//
//				if (listBook.get(i).category.compare(listBook.get(j).category) == 0)
//				{
//					nonExist = false;
//					break;
//				}
//
//			}
//
//
//			S = listBook.get(i).quantity;
//			if (nonExist)
//			{
//				for (int k = i + 1; k < quantity; k++)
//				{
//
//					if (listBook.get(k).category.compareTo(listBook.get(i).category) == 0)
//					{
//						S += listBook.get(k).quantity;
//
//					}
//
//				}
//				System.out.println( "|" << setw(24) << left << listBook.get(i).category << "|" << setw(9) << left << S << "|" );
//				System.out.println( "|" << setw(24) << "________________________" << "|" << setw(9) << "_________" << "|" );
//
//			}
//		}
//		System.out.println( "====================================" );
//
//	}

//	void statisticReaderQuantity()
//	{
//		int total = listReader.size();
//		System.out.println( "<<THONG KE SO LUONG DOC GIA>>" );
//
//		System.out.println( "=============================" );
//		System.out.println( "|" << setw(6) << left << "Ma" << "|" << setw(20) << left << "Ho va Ten" << "|" );
//		System.out.println( "|" << setw(6) << "______" << "|" << setw(20) << "____________________" << "|" );
//		for (int i = 0; i < total; i++)
//		{
//			System.out.println( "|" << setw(6) << left << listReader.get(i).code << "|" << setw(20) << left << listReader.get(i).name << "|" );
//			System.out.println( "|" << setw(6) << "______" << "|" << setw(20) << "____________________" << "|" );
//
//		}
//		System.out.println( "=============================" );
//
//		System.out.printf( "\nTong so luong doc gia la %d\n", total);
//	}

//	void statisticGenderQuantity(int total)
//	{
//		int total = listReader.size();
//		int male = 0;
//		int female = 0;
//		for (int i = 0; i < total; i++)
//			if (listReader.get(i).gender.compare("Nam")==0)
//			{
//				male++;
//			}
//			else
//			{
//				female++;
//			}
//		System.out.println( "<<THONG KE SO LUONG DOC GIA THEO GIOI TINH>>" );
//		System.out.println( "============================================" );
//		System.out.println( "|" << setw(21) << left << "Nam" << "|" << setw(20) << left << "Nu" << "|" );
//		System.out.println( "|" << setw(21) << "_____________________" << "|" << setw(20) << "____________________" << "|" );
//		System.out.println( "|" << setw(21) << right << male << "|" << setw(20) << right << female << "|" );
//		System.out.println( "============================================" );
//	}

//	void statisticBorrowQuantity(int quantity)
//	{
//		System.out.println( "<<================THONG KE SO LUONG SACH DANG DUOC MUON================>>" );
//
//		System.out.println( "=========================================================================" );
//		System.out.println( "|" << setw(6) << left << "ISBN" << "|" << setw(39) << left << "Ten sach" << "|" << setw(24) << left << "So sach dang duoc muon" << "|" );
//		System.out.println( "|" << setw(6) << "______" << "|" << setw(39) << "_______________________________________" << "|" << setw(24) << "________________________" << "|" );
//
//		for (int j = 0; j < quantity; j++)
//		{
//
//			System.out.println( "|" << setw(6) << left << y[j].ISBN << "|" << setw(39) << y[j].ten_sach << "|" << setw(24) << right << y[j].BookIsBorrowing << "|" );
//			System.out.println( "|" << setw(6) << "______" << "|" << setw(39) << "_______________________________________" << "|" << setw(24) << "________________________" << "|" );
//
//		}
//		System.out.println( "========================================================================" );
//	}

	void statistic_listReaders_late(Ticket* z, Reader* x, int n, int total)
	{
		System.out.println( "<<THONG KE DANH SACH DOC GIA DANG BI TRE HAN>>" );

		System.out.println( "=======================================================" );
		System.out.println( "|" << setw(7) << left << "Ma DG" << "|" << setw(29) << left << "Ho va ten" << "|" << setw(15) << left << "So ngay tre han" << "|" );
		System.out.println( "|" << setw(7) << "_______" << "|" << setw(29) << "_____________________________" << "|" << setw(15) << "_______________" << "|" );
		for (int i = 0; i < n; i++)
		{
			if (z[i].actualPayDate.length() != 0 && checkFormatDate(z[i].actualPayDate) == true)
			{

				if (Distance2Date(z[i].expectPayDate, z[i].actualPayDate) > 7)
				{
					for (int j = 0; j < total; j++)
					{
						if (z[i].codeDGMuon == x[j].code)
						{
							System.out.println( "|" << setw(7) << left << z[i].codeDGMuon << "|" << setw(29) << left << x[j].ho_ten << "|" << setw(15) << right << Distance2Date(z[i].expectPayDate, z[i].actualPayDate) << "|" );
							System.out.println( "|" << setw(7) << "_______" << "|" << setw(24) << "_____________________________" << "|" << setw(15) << "_______________" << "|" );
							break;
						}
					}
				}
			}
		}
		System.out.println( "=======================================================" );


	}
}
