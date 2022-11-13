package OOP;

import java.util.Scanner;

public class OOP6 {
	private double width, height;
	private String color;
	
	public OOP6() {
		super();
	}

	public OOP6(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		this.width = sc.nextDouble();
		this.height = sc.nextDouble();
		this.color = sc.nextLine();
	}
	
	public double findArea() {
		return getHeight() * getWidth();
	}
	
	public double findPerimeter() {
		return ((getHeight() + getWidth()) * 2);
	}
	
	public static void main(String[] args) {
		OOP6 bai6 = new OOP6();
		bai6.input();
		if(bai6.getHeight() > 0 && bai6.getWidth() > 0) {
			System.out.print((long)bai6.findPerimeter() + " " + (long)bai6.findArea() + "" + bai6.getColor());
		} else {
			System.out.println("INVALID");
		}
	}
}
