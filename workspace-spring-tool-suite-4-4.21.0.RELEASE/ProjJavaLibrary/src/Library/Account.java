package Library;

import java.util.Scanner;

public class Account {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account() {
	}

	public boolean Login() {
		boolean check = true;

		String line;

//		Account.open("Account.txt");
//		if (Account.is_open()) {
//			getline(Account, line);
//
//			// istringstream ss(line);
//			getline(ss, Username, ',');
//			getline(ss, Password, ',');
//			Account.close();
//		}

		String user, pass;

		Scanner in = new Scanner(System.in);

		System.out.println("<<==========DANG NHAP=========>>");
		System.out.println("\nTen Dang Nhap: ");

		user = in.nextLine();

		System.out.println("Mat Khau: ");
		pass = in.nextLine();

		while (user.compareTo(username) != 0 || pass.compareTo(password) != 0) {
			// system("cls");
			System.out.println("Ten dang nhap hay mat khau khong hop le");
			System.out.println("Vui long dang nhap lai!");
			System.out.println("<<==========DANG NHAP=========>>");
			System.out.println("\nTen Dang Nhap: ");
			user = in.nextLine();

			System.out.println("Mat Khau: ");
			pass = in.nextLine();

		}

		if (user.compareTo(username) != 0 || pass.compareTo(password) != 0) {
			check = false;
		}

		return check;
	}
}
