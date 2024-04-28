package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram03 {

	public static void main(String[] args) {
		// 3. Вычислить расстояние между двумя точками с данными координатами (х1, у1) и (x2, у2).
		double x1 = 4, x2 = -8, y1 = -6, y2 = 10;
		double r;
		
		r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Расстояние между двумя точками: " + r);

	}

}
