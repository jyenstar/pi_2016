//package work1;

public class String_name {

	static final String first=new String("walt");//  First name
	static final String last=new String("savitch");//  Last name
	static final String add=new String("ay"); //Add word
	static final String word_Change=new String("love"); //Change to keyword
	static String keyword=new String("I hate you");//Input of the text

	
	/*	Reconstruct the name function	*/
	public static String Name_change(){
		
		String answer_Return=null;// The answer of name
		char  array[]=new char[4];// The buffer of character's 
		int length[]=new int[2];  // The length buffer of first and last
			
		array[0]=first.charAt(0); //Store first character of first
		array[1]=last.charAt(0);  //Store first character of last 
		array[2]=first.toUpperCase().charAt(1); //Store and upper the second character of first 
		array[3]=last.toUpperCase().charAt(1);  //Store and upper the second character of last

		length[0]=first.length(); //Store first string length
		length[1]=last.length();  //Store last string length
		
		answer_Return=array[2]+first.substring(2,length[0])+array[0]+add+" "+array[3]+last.substring(2,length[1])+array[1]+add;
		//Store the reconstructive name
		
		return answer_Return;  //Return new name to main 
	}
	
	/*	Change the keyword function	*/
	public static void Keyword_change(){
		
		
		if(keyword.contains("hate")){  //If contain the keyword then
			keyword=keyword.replace("hate",word_Change); //Replace the keyword
		}
		else{  //If not
			System.out.println("Not match the keyword!");
		}
		
	}
	
	/*	Main	*/
	public static void main(String[] args){

		
		String answer=null; //Receive the Reconstructive name
		
		answer=Name_change(); //Jump to Name_change function
		System.out.println("=====First====="+'\n'+"first: "+first+", last: "+last+'\n'+answer+'\n');
		
		System.out.println("=====Second===="+'\n'+"The line of text to be changed is:");
		System.out.println(keyword);
		
		Keyword_change(); //Jump to Keyword_change function

		System.out.println("I have rephrased that line to read:");
		System.out.println(keyword);

	}
		
}
