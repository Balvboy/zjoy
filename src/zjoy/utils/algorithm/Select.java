package zjoy.utils.algorithm;

public class Select {

	public void sort(int[] v) {
		
		int num = 0;
		
		for (int i = 0; i < v.length; i++) {
			int min = v[i];
			int temp;
			int index = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < min) {
					min = v[j];
					index = j;
					num++;
					
				}
			}

			temp = v[i];
			v[i] = min;
			v[index] = temp;
			num ++;
		}
		
		System.out.println("交换次数："+num);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {2,9,6,7,4,5,6,8,1,3};
		
		new Select().sort(arr);
		
		for(int i :arr){
			System.out.println(i);
		}
		
	}
}
