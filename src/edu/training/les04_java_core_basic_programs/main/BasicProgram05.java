package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram05 {

	public static void main(String[] args) {
		// 5. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		double r = 5;
		double l, s;

        l = 2 * Math.PI * r;
        s = Math.PI * Math.pow(r, 2);

        System.out.println("Длина окружности: " + l);
        System.out.println("Площадь круга: " + s);

	}

}
