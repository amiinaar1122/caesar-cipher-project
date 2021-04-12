import java.util.Scanner;
public class EncryptionDecryption {
	

	public static void main(String[] orgs) {
		try (Scanner input = new Scanner(System.in)) {
			String word=" ",pTex=" " ,  newWord="";
			
			System.out.printf("Enter the String you would like to encrypt:");
			pTex = input.nextLine();
			word = Cipher(pTex);
			newWord = deCipher(word);
			System.out.printf("plain text: %s%n " + 
			                   "cipher Text:%s%n"+
					           "plain Text:%s%n%n", pTex,word,newWord
					);
			
			
			System.out.printf("Enter the string you would like to decrypt");
			word=input.nextLine();
			//pTex = deCipher(word);

			System.out.printf	("%n%nCipher Text: %s%n " + 
			           "plain Text:%s%n", word,pTex	);
		}

		
	}
	public static String Cipher(String pTex) {
		String word ="";
		for(int i =0; i<pTex.length(); i++)
		{
		
			char code =Character.toLowerCase(pTex.charAt(i));
			switch(code)
			
			
			{
			case'e':
				word +="!";
				break;
			case't':
				word +="@";
				break;
			case'a':
				word +="#";
				break;
			case'o':
				word +="$";
				break;
			case'i':
				word +="%";
				break;
			case'n':
				word +="^";
				break;
			case's':
				word +="&";
				break;
			case'r':
				word +="*";
				break;
				default:
					word +=pTex.charAt(i);
					break;
				
			
				
			
				
			
				
			
				
			
				
			
				
			
					}	
			
		
			
			
			
		
   
		
		}
		return word;
	}
	public static String deCipher(String deText) {
		
		String newWord="";
	
		for(int i= 0; i<deText.length();i++)
			
		{
			char code=Character.toLowerCase(deText.charAt(i));
			switch(code) {
			
			
		
			}
			
		}
		return newWord;
		
	}

	}


