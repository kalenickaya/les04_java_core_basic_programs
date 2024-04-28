package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram01 {

	public static void main(String[] args) {
		// 1. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		double a = 4, b = 16, c = 32;
		double x;
		
		x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("Значение выражения: " + x);

	}

}
