package java_8;

import java.util.Objects;

public class java1 {

	private int i = 123;
	private String s = "java";
	private Double d = 123.12;
	private Boolean b = true;

	public java1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java1(int i, String s, Double d, Boolean b) {
		super();
		this.i = i;
		this.s = s;
		this.d = d;
		this.b = b;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public Boolean getB() {
		return b;
	}

	public void setB(Boolean b) {
		this.b = b;
	}

	@Override
	public int hashCode() {
		return Objects.hash(b, d, i, s);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		java1 other = (java1) obj;
		return Objects.equals(b, other.b) && Objects.equals(d, other.d) && i == other.i && Objects.equals(s, other.s);
	}

	@Override
	public String toString() {

		return "java1 [i=" + i + ", s=" + s + ", d=" + d + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java1 j = new java1();
		System.out.println(j);

	}

}
