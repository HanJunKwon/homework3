import java.util.*;

public class A02{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. ");
		double m2_area = sc.nextDouble();
		double pyung_area=m2_area/3.305;

		System.out.printf("아파트의 평형은 %.1f입니다.\n",pyung_area);

		if(pyung_area<15)
			System.out.print("소형 아파트 입니다.");
		else if(pyung_area<30)
			System.out.print("증소형 아파트 입니다.");
		else System.out.print("중형 아파트 입니다.");

	}
}
