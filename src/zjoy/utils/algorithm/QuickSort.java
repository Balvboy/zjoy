package zjoy.utils.algorithm;

public class QuickSort {

	public void sort(int[] arr, int start, int end) {
		if (arr == null || (end - start + 1) < 2) {  
            return;  
        }  
		int keypos = partition(arr,start, end);
		sort(arr, start, keypos-1);
		sort(arr, keypos+1, end);

	}

	/**
	 * 
	 * @param arr
	 *            需要排序的数组
	 * @param start
	 *            数组的起始下表
	 * @param end
	 *            数组的结束下表
	 * @return 分组之后的关键字的下标
	 */
	public int partition(int[] arr, int start, int end) {
		
		int s = start;
		int e = end;
		int keypos = start;
		boolean isStart = true;
		boolean isEnd = true;
		// 默认起始关键字为 第一个位置的数字
		int key = arr[start];
		while(s<e){
			if(isEnd){
				if(s<e&&key>arr[e]){
					exchange(arr, keypos, e);
					keypos = e;
					s++;
					isStart = true;
				}else{
					e--;
					isStart = false;
				}
			}
			if(isStart){
				if(s<e&&key<arr[s]){
					exchange(arr, s, keypos);
					keypos = s;
					e--;
					isEnd = true;
				}else{
					s++;
					isEnd=false;
				}
			}
		}
		return keypos;
	}

	public void exchange(int[] arr, int index, int position) {
		int temp = arr[index];
		arr[index] = arr[position];
		arr[position] = temp;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 10, 6, 7, 88, 99, 6, 8, 1, 3 };
		
//		int[] arr = { 1,2,3,4,5,6};

		new QuickSort().sort(arr, 0, arr.length-1);

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
