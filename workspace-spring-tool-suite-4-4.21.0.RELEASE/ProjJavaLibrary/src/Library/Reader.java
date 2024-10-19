package Library;

public class Reader {
	int code;
	private String ho_ten;
	private String cccd;
	private String dateOfBirth;
	private String gender;
	private String email;
	private String address;
	private String ngay_lap_the;
	private String ngay_het_han;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNgay_lap_the() {
		return ngay_lap_the;
	}

	public void setNgay_lap_the(String ngay_lap_the) {
		this.ngay_lap_the = ngay_lap_the;
	}

	public String getNgay_het_han() {
		return ngay_het_han;
	}

	public void setNgay_het_han(String ngay_het_han) {
		this.ngay_het_han = ngay_het_han;
	}

	public Reader() {

	}

	public Reader(String ho_ten, String cccd, String dateOfBirth, String gender, String email, String address,
			String ngay_lap_the, String ngay_het_han) {
		this.ho_ten = ho_ten;
		this.cccd = cccd;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.ngay_lap_the = ngay_lap_the;
		this.ngay_het_han = ngay_het_han;
	}

}
