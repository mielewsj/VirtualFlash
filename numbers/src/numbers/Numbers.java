package numbers;

public class Numbers {

	private double[] numbers = {1.11, 2.22, 3.33, 4.44, 5.55, 6.66, 7.77};
	private int size = 7;
	
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
	
	public boolean addNumber(int pos, double addedNumber) {
		boolean result = true;
		if (numbers[size-1] != 0.00) {
			result = false;
		} else {
			int top = size-1;
			int i = top;
			while (numbers[i] == 0.00) {
				i--;
			}
			top = i;
			for (int j=top; j>pos-1; j--) {
				numbers[j+1] = numbers[j];
			}
			numbers[pos] = addedNumber;
			result = true;
		}
		return result;
	}
}
