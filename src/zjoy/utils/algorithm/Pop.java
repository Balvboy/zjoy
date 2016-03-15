package zjoy.utils.algorithm;

public class Pop {

	public static void main(String[] args) {
		
		int num = 0;
		
		int [] arr = {2,9,6,7,4,5,6,8,1,3};
		
		for(int i = 0;i<arr.length;i++){
			
			for(int j = i + 1 ; j<arr.length;j++){
				
				//如果后面一个数比这个数大，那么交换
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					num++;
				}
				
				
			}
			
		}
		
		for(int w : arr){
			System.out.println(w);
		}
		System.out.println("交换 "+num+"次");
		
	}
}
