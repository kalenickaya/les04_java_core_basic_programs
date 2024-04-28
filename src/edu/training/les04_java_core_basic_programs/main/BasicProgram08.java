package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram08 {

	public static void main(String[] args) {
		// 8. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
		int n1 = 2, n2 = 3;
		double sAr, sG;

        sAr = (Math.pow(n1, 3) + Math.pow(n2, 3)) / 2;
        sG = Math.sqrt(Math.abs(n1) * Math.abs(n2));

        System.out.println("Среднее арифметическое кубов чисел: " + sAr);
        System.out.println("Среднее геометрическое модулей чисел: " + sG);

	}

}
