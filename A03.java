import java.util.*;

public class A03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하시오. ");
		int month = sc.nextInt();

		System.out.print("일을 입력하시오. ");
		int day = sc.nextInt();
		if(!(month>=1 && month<=12))
			Exit();

		int day_count=0;
		for(int i=1; i<=month; ++i){
			switch(i){
			case 2:
				if(day<1||day>28)
					Exit();
				else if(i==month)
					day_count+=day;
				else
					day_count+=28;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day<1||day>31)
					Exit();
				else if(i==month)
					day_count+=day;
				else day_count+=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day<1||day>30)
					Exit();
				else if(i==month)
					day_count+=day;
				else day_count+=30;
				break;
			default :
				Exit();
			
			}
		}
		System.out.printf("이 날짜는 1년 중 %d 번째 날에 해당됩니다.",day_count);
	}
	
	
	
	public static void Exit(){
		System.out.print("잘못 입력하셨습니다.\n");
		System.exit(1);
	}
}
