
public class BubbleSort {

	public static void main(String[] args) {// �ϥή�w�ƧǪk�m�ߡA�Ѥj��p�ƦC
		int array[] = { 5, 4, 8, 3, 9, 6, 7 };

		for (int i = array.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (array[j] < array[j + 1]) {

					int data = array[j];// �ƭȥ洫

					array[j] = array[j + 1];

					array[j + 1] = data;
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
}
