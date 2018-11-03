package homework4;

public class DealString {
	
	//反轉字串
	public String reverseString(String inputToReverse) {

		char[] inputChar = inputToReverse.toCharArray();
		int lastIndex = inputChar.length - 1;
		int midIndex = inputChar.length / 2;
		char temp;
		for (int i = 0; i < midIndex; i++) {
			temp = inputChar[i];
			inputChar[i] = inputChar[lastIndex - i];
			inputChar[lastIndex - i] = temp;
		}

		return String.valueOf(inputChar);
	}
	
	//計算字串陣列中的字串共有多少個母音(a, e, i, o, u)
	public void countStringVowel(String[] countString) {
		
		int countVowel = 0;
		for( int i = 0; i < countString.length; i++) {
			for(int j = 0; j < countString[i].length(); j++) {
				switch( countString[i].charAt(j) ) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					countVowel++;
				}
			}
		}
		System.out.println("母音有" + countVowel + "個");	
	}
}
