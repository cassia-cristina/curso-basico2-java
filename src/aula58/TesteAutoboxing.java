package aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing
		Short num1 = 1;
		Byte num2 = 40;
		Integer num3 = 4000;
		Long num4 = 5000L;
		Float num5 = 4.33F;
		Double num6 = 23.05;
		Boolean flag = false;
		
		//auto un-boxing
		int num7 = num3; //num3.intValue();
		
		//autoboxing em expressões
		num3++;
		System.out.println(num3);
		
		
		Integer num8 = num7/num3;
		System.out.println(num8);

	}

}
