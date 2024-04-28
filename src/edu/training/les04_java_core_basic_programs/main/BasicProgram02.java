package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram02 {

	public static void main(String[] args) {
		// 2. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		double a = 2, b = 4;
		double p, s, c;
		
        c = Math.sqrt(a * a + b * b);
        p = a + b + c;
        s = 0.5 * a * b;

        System.out.println("Периметр треугольника: " + p);
        System.out.println("Площадь треугольника: " + s);
		
	}

}
