package OOP;

import java.util.Scanner;

public class OOP2 {
	private String name, birthday;
	private float score1, score2, score3;
	
	public OOP2() {
		super();
	}

	public OOP2(String name, String birthday, float score1, float score2, float score3) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getScore1() {
		return score1;
	}

	public void setScore1(float score1) {
		this.score1 = score1;
	}

	public float getScore2() {
		return score2;
	}

	public void setScore2(float score2) {
		this.score2 = score2;
	}

	public float getScore3() {
		return score3;
	}

	public void setScore3(float score3) {
		this.score3 = score3;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		birthday = sc.nextLine();
		score1 = Float.parseFloat(sc.nextLine());
		score2 = Float.parseFloat(sc.nextLine());
		score3 = Float.parseFloat(sc.nextLine());
	}

	public void output() {
		float sum = score1 + score2 + score3;
		System.out.print(name + " " + birthday + " ");
		System.out.printf("%.1f", sum);
	}
	
	public static void main(String[] args) {
		OOP2 bai2 = new OOP2();
		bai2.input();
		bai2.output();
	}
}
