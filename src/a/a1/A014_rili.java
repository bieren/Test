package a.a1;

public class A014_rili {
	
	
	public static void main(String[] args) {
		int sum = 0;
		int thisYear = 2016;
		
		for (int year = 1900; year <= 2015; year++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				sum += 366;
			} else {
				sum += 365;
			}

		}
		for (int month = 1; month <= 4; month++) {
			if (month == 2) {
				if (thisYear % 4 == 0 && thisYear % 100 != 0 || thisYear % 400 == 0) {
					sum += 29;
				} else {
					sum += 28;
				}
			}else if (month == 4 || month == 6 || month == 9 || month == 11) {
				
				sum+=30;
			}else {
				sum+=31;
			}

		}
		sum+=7;
		System.out.println("1900年到2016年4月7日一共"+sum+"天");
	}
}
