package aula57;

public class Wrappers {

	public static void main(String[] args) {
		
		double num1 = 3.555;
		long num2 = 1557L;
		float num3 = 13.2F;
		int num4 = 145;
		
		@SuppressWarnings("deprecation")
		Short num5 = new Short((short) 2);
		@SuppressWarnings("deprecation")
		Byte num6 = new Byte((byte) 10);
		@SuppressWarnings("deprecation")
		Integer num7 = new Integer(45);
		@SuppressWarnings("deprecation")
		Float num8 = new Float(3.1F);
		@SuppressWarnings("deprecation")
		Double num9 = new Double(4.11);
		@SuppressWarnings("deprecation")
		Boolean flag = new Boolean(true);
		@SuppressWarnings("deprecation")
		Character a = new Character('a');
		
		@SuppressWarnings("deprecation")
		Integer num10 = new Integer("1000");
		
		Long num11 = num10.longValue();
		System.out.println(num11);
		
		int num12 = Integer.parseInt("5000");
		System.out.println(num12);
		
		double num13 = Double.parseDouble("3.567");
		System.out.println(num13);
		
		Integer num14 = Integer.valueOf(1500);
		System.out.println(num14);
		
		Integer num15 = 1500;
		Double num16 = 4.678;
		
		
		if(num12 == num13) {
			System.out.println("Num 12 e Num 13 são iguais");
		} else {
			System.out.println("Num 12 e Num 13 são diferentes");
		}
		
		if(num14.equals(num15)) {
			System.out.println("Num 14 e Num 15 são iguais");
		} else {
			System.out.println("Num 14 e Num 15 são diferentes");
		}


	}

}
