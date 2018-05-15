
public class Springin5steps {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
		int result =binarySearch.binarySearch(new int[] {2,15,4}, 3);
		System.out.println(result);
	}

}
