package homework5;

public class AuthCode extends RandomNumber{
	
	public void genAuthCode(){
		
		int[] authCode = repeatRandomNumber(8, 48, 110);
		System.out.println("本次隨機產生驗證碼為 :");
		for(int i = 0; i < authCode.length; i++) {
			if( authCode[i] > 57 && authCode[i] < 84) {
				authCode[i] += 7;	
			}
			else {
				if(authCode[i] >= 84 && authCode[i] <= 109) {
					authCode[i] += 13;
				}
			}
			System.out.printf("%c", authCode[i]);
		}
		
	}	
	
}
