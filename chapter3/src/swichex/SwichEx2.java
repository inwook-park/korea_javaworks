package swichex;

public class SwichEx2 {

	public static void main(String[] args) {
		int month = 6;
		int day = 0;
		 
		switch(month){
		case 1: case 3: case 5:case 7:case 8:case 10:case 12:
			day = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			day = 28;
			break;
			
			case 2:
				day = 28;
				break;
				default:
					System.out.println("지원되지 않는 기능입니다");
		return;
		} 
		System.out.println(month + "월은"+ day +"일까지 있습니다");
	}

}
