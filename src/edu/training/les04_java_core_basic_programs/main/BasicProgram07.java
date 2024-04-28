package edu.training.les04_java_core_basic_programs.main;

public class BasicProgram07 {

	public static void main(String[] args) {
		// 7. Найти произведение цифр заданного четырехзначного числа.
		int n = 1234, digit = n;
		int x = 1;
		
		while (n > 0) {
			int d = n % 10;
			x *= d;
			n /= 10;
		}
		
		System.out.println("Произведение цифр числа " + digit + ": " + x);
		
	}

}
