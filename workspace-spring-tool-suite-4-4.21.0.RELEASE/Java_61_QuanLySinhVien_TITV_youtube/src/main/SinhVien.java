package main;

public class SinhVien {
	private String id;
	private String name;
	private int birthYear;
	private float gpa;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public SinhVien(String id, String name, int birthYear, float gpa) {
		// super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.gpa = gpa;
	}

	public SinhVien() {

	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", birthYear=" + birthYear + ", gpa=" + gpa + "]";
	}

}
