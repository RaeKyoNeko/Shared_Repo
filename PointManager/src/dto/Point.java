package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point {

	// field
	private double x;
	private double y;

	// constructors
	public Point() {
	}

	public Point(Point p) {
		x = p.getX();
		y = p.getY();
	}

	// parameterized constructors ( formal parameter, dummy parameter)
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// method
	public void inputPoint() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("X = ");
			x = sc.nextDouble();
			

			System.out.print("Y = ");
			y = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Bad input");
		}
	}

	public void outputPoint() {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	public double getDistance(double x2, double y2) {
		return Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
	}

	public double getDistance(Point toPoint) {
		return getDistance(toPoint.getX(), toPoint.getY());
	}

	// setter
	public void setX(double x) {
		try{
			this.x = x;
		}catch(InputMismatchException e){
			System.out.println("ERROR: Bad input");
		}
	}

	public void setY(double y) {
		try{
			this.y = y;
		}catch(InputMismatchException e){
			System.out.println("ERROR: Bad input");
		}
	}

	// getter
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}// end Point
