import java.util.Scanner;

public class B04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("연봉을 원단위로 입력하세요");
		int sal=sc.nextInt();
		
		float income_tax;
		if(sal<10000000)
			income_tax=(float) (sal*0.095);
		else if(sal<40000000)
			income_tax = (float)(sal*0.19);
		else if(sal<80000000)
			income_tax = (float) (sal*0.28);
		else
			income_tax= (float) (sal*0.37);
		System.out.printf("연봉 금액에 대한 소득세는 %.0f 입니다",income_tax);
	}
}
