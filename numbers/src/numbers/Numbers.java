package numbers;

public class Numbers {

	private double[] numbers = {1.11, 2.22, 3.33, 4.44};
	private int size = 4;
	
	public void removeNumber(int pos) {
		for (int i=pos+1; i<size; i++) {
			numbers[i-1] = numbers[i];
		}
		numbers[size-1]= 0.00;
	}

	public double[] getNumbers() {
		return numbers;
	}

	public int getSize() {
		return size;
	}
}
