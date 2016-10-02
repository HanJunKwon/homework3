import java.util.*;
public class A01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		for(int i=0; i<arr.length; ++i){
			System.out.print(i+1+"번째 숫자를 입력하세요");
			arr[i]=sc.nextInt();
		}

		int min=arr[0], max=arr[0];

		for(int i=0; i<arr.length; ++i){
			if(min>arr[i]) min=arr[i];
			else if(max<arr[i]) max=arr[i];
		}
		System.out.printf("가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.",max,min);
	}
}
