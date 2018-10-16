

public class ReverseWords {

	public static void main(String[] args) {
		String s = "This is it.";
				
		String[] brr = s.split(" ");
		
		String sentence = "";
		for(int i=0; i < brr.length; i++) {			
			sentence += brr[brr.length-1-i] + " ";
		}
		System.out.println(sentence.trim());
	}
}
