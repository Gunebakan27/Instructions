package practice;

public class OCA1 {

	public static void main(String[] args) {
				
			//
			String str = "M ";
			//M
			
			
			
			str = str.concat("E ");
			//M E
			
			
			
			String add = "S ";
			//S
			
			str = str.concat(add);
			//M E S
			
			
			str.replace("S","T");//There is NO CHANGE
			//M E S
			
			
			
			str = str.concat(add);
			//M E S S
			
			
			System.out.println(str);
		
	}

}
