package numbers;

public class TestNumbers {

	public static void main(String[] args) {
		
		Numbers num = new Numbers();
		int size = num.getSize();
		double[] numbers = num.getNumbers();
		num.removeNumber(1);
		for (int i=0; i<size; i++) {
			System.out.println(numbers[i]);
		}
	}

}
