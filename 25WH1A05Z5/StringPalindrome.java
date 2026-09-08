package jasmitha;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=new String("jasmitha");
      String reversed=new String("");
      for(int i=s.length()-1;i>=0;i--) {
    	  reversed +=s.charAt(i);
      }
	if(s==reversed) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
	}

}
