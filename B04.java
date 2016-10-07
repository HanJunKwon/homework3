import java.util.*;

public class B04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int salary=0;
		System.out.print("연봉을 원단위로 입력하세요");
		salary = sc.nextInt();
		if(salary<10000000)
			System.out.printf("연봉 금액에 대한 소득세는 %d입니다",salary/9.5);
		else if(salary<40000000)
			System.out.printf("연봉 금액에 대한 소득세는 %d입니다",salary/19);
		else if(salary<80000000)
			System.out.printf("연봉 금액에 대한 소득세는 %d입니다",salary/28);
		else
			System.out.printf("연봉 금액에 대한 소득세는 %d입니다",salary/37);






	}
}
