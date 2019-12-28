//使用双重循环实现"十年"，公转10圈，自转365圈
public class TenYears{
	public static void main(String[] args){
		//外循环
		for(int i=1;i<=10;i++){
			System.out.println("---第"+i+"年---");
			//内循环
			for(int j=1;j<=365;j++){
				System.out.println("第"+j+"天");
			}
		}
	}
}