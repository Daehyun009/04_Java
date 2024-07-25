package pkg3.dto;

import java.util.Scanner;

// 인터페이스 상속 키워드 : implements (구현하다)

public class KDHCalculator implements Calculator{

	@Override
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public int div(int a, int b) {
		int result = a / b;
		return result;
	}

	@Override
	public int mod(int a, int b) {
		int result = a % b;
		return result;
	}

	@Override
	public int pow(int a, int x) {
		int result = (int) Math.pow(a, x);
		return result;
	}

	@Override
	public int areaOfCircle(double r) {
		int result = (int) (PI * Math.pow(r, 2));
		return result;
	}

	@Override
	public String toBinary(int num) {
		String result = Integer.toBinaryString(num);
		return result;
	}

	@Override
	public String toHexadecimal(int num) {
		String result = Integer.toHexString(num);
		return result;
	}
}
