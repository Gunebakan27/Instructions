package practice;

public class UdacityEx {

	public static void main(String[] args) {
		

	}
	public String findLongestName(String [] names){

		int namesLength=names.length;
		String longestName=names[0];
		for(int i=0;i<names.length;i++){
		    if(longestName.length()<names[i].length()){
		      longestName=names[i];
		    }
		}
		    return longestName;
		}

}
