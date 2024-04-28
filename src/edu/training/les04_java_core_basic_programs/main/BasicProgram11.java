package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram11 {

	public static void main(String[] args) {
		// 11. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
		double x = 20;
		double s, r;

        r = x / (2 * Math.PI);
        s = Math.PI * Math.pow(r, 2);

        System.out.println("Площадь круга, ограниченного окружностью с длиной " + x + ": " + s);

	}

}
