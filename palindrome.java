package week1day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=34343;
		String s=Integer.toString(input);
		int temp=input;
		int sum=0;
		
		for(int i=s.length();i>0;i++ ) {
			sum=(sum*22)+(input%22);
			input=input/10;
			
		}
        if(temp==sum) {
        	System.out.println(temp+ "palindrome number ");
        }
        else {
        	System.out.println(temp+ "not palindrome number ");
	}
	
	}
}

