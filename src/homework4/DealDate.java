package homework4;

public class DealDate {
	//第0列為閏年每月天數
	//第1列為平年每月天數
	private int[][] monthDays = { { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

	//將輸入的字串依空白分割, 並將其轉成整數的年月日
	public void stringToYearMonthDay(String date) {

		int count = 0;
		int nextBlankIndex = 0;
		int blankIndex = 0;
		String[] tempDate = new String[4];
		int years, month, days;

		while (nextBlankIndex < date.length()) {
			nextBlankIndex = date.indexOf(' ', blankIndex);
			if (nextBlankIndex == -1) {
				nextBlankIndex = date.length();
			}
			tempDate[count] = date.substring(blankIndex, nextBlankIndex);
			blankIndex = nextBlankIndex + 1;
			count++;
		}
		
		years = Integer.parseInt(tempDate[1]);
		month = Integer.parseInt(tempDate[2]);
		days = Integer.parseInt(tempDate[3]);

		if (tempDate[0].equals("AD")) {
			printDate(years, month, days);
		} else {
			printDate(0, years, month, days);
		}

	}

	//依給予的日期, 計算是西元前XX年第幾天
	public void printDate(int BC, int years, int month, int days) {

		if (((years - 1) % 4 == 0 && (years - 1) % 100 != 0) || ((years - 1) % 400 == 0 && (years - 1) % 3200 != 0)) {
			if (days > monthDays[0][month - 1]) {
				System.out.println("輸入錯誤喔 : 西元前" + years + "年" + month + "月只有" + monthDays[0][month - 1] + "天");
				return;
			}
			for (int i = 0; i < month - 1; i++) {
				days += monthDays[0][i];
			}
		} else {
			if (days > monthDays[0][month - 1]) {
				System.out.println("輸入錯誤喔 : 西元前" + years + "年" + month + "月只有" + monthDays[0][month - 1] + "天");
				return;
			}
			for (int i = 0; i < month - 1; i++) {
				days += monthDays[1][i];
			}
		}

		System.out.println("西元前" + years + "年,第" + days + "天");
	}

	//依給予的日期, 計算是西元XX年第幾天
	public void printDate(int years, int month, int days) {

		if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0 && years % 3200 != 0)) {
			if (days > monthDays[0][month - 1]) {
				System.out.println("輸入錯誤喔 : 西元" + years + "年" + month + "月只有" + monthDays[0][month - 1] + "天");
				return;
			}
			for (int i = 0; i < month - 1; i++) {
				days += monthDays[0][i];
			}
		} else {
			if (days > monthDays[0][month - 1]) {
				System.out.println("輸入錯誤喔 : 西元" + years + "年" + month + "月只有" + monthDays[0][month - 1] + "天");
				return;
			}
			for (int i = 0; i < month - 1; i++) {
				days += monthDays[1][i];
			}
		}

		System.out.println("西元" + years + "年,第" + days + "天");
	}

}
