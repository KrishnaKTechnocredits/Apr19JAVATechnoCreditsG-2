package punamK.assignment3String;

public class SeparateNumFromStringArray {
	public static void main(String[] args){
		findStringAndNumeric();
	}
	static void findStringAndNumeric(){
		String alpha="";
		String digits="";
		Object[] mixArray = {"1110", "aaa","444","gggg","43fd"};
		for (int i= 0; i< mixArray.length; i++){
			String objArrayElement= (String)mixArray[i];
			for (int j= 0; j<objArrayElement.length(); j++){
				if(Character.isAlphabetic(objArrayElement.charAt(j)))
				{
					alpha= alpha + objArrayElement.charAt(j);
			
				}else{
					digits= digits  + objArrayElement.charAt(j);
				}
			
		}System.out.println("Numeric = " + digits);
		System.out.println("String = " + alpha);
		}
 	}
	
}
