package aula57;

public class Wrappers {

	public static void main(String[] args) {
		
		double num1 = 3.555;
		long num2 = 1557L;
		float num3 = 13.2F;
		int num4 = 145;
		
		
		Integer num5 = 1000;
		
		Long num6 = num5.longValue();
		System.out.println(num6);
		
		int num7 = Integer.parseInt("5000");
		System.out.println(num7);
		
		double num8 = Double.parseDouble("3.456");
		System.out.println(num8);
		
		Integer num9 = Integer.valueOf(1500);
		System.out.println(num9);
		
		Integer num10 = 1500;
		Double num11 = 4.678;
		
		
		if(num7 == num8) {
			System.out.println("Num 7 e Num 8 são iguais");
		} else {
			System.out.println("Num 7 e Num 8 são diferentes");
		}
		
		if(num9.equals(num10)) {
			System.out.println("Num 9 e Num 10 são iguais");
		} else {
			System.out.println("Num 9 e Num 10 são diferentes");
		}


	}

}
