
public class Search {

	public int binarySearch(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low){
			int mid = (low + high) / 2;
			
			if(list[mid] < key){
				low = mid;
			}else if(list[mid] > key){
				high = mid;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public void selectionSort(double[] list){
		for(int i = 0; i < list.length; i++){
			int index = i;
			for(int j = i; j < list.length; j++){
				if (list[index] < list[j]){
					index = j;
				}
			}
			double temp = list[index];
			list[index] = list[i];
			list[i] = temp;
		}
	}
}