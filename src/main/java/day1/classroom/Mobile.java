package day1.classroom;

public class Mobile {
   public int makeCall(int number) {
	   System.out.println("Typed number successfully");
	   return number;
   }
   public String sendSMS(String text) {
	   System.out.println("Hi! How are you");
	   return text;
   }
   public boolean shutDown() {
	System.err.println("closed successfully");
	   return true;
   }
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		int phNumber = obj.makeCall(123456789);
		System.err.println(phNumber);
		String textUser = obj.sendSMS("Hello");
		System.out.println(textUser);
		boolean close = obj.shutDown();
		System.out.println(close);
	}
}
