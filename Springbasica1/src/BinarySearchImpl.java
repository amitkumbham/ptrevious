
public class BinarySearchImpl {
	private SortAlgorithum sortAlgo;
	private int[] sort;
	
	public BinarySearchImpl(SortAlgorithum sortAlgo) {
		super();
		this.sortAlgo=sortAlgo;
	}
	public int binarySearch(int numbers[], int numberToSearch){
	          int[] sort= sortAlgo.sort(numbers);
	          System.out.println(sortAlgo);
		return 3;
	}

}
