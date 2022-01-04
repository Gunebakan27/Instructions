package practice;

public class Rough1 {

	
	  public static void main(String[] args) {
          byte b = getStatusValue(255);
          System.out.println(b);
          b = Rough2.getStatusValue(122);
          System.out.println(b);
  }
  static byte getStatusValue(Object obj){
      if (obj != null)
          return 127;
      else
          return -1;
  }
}
class Rough2 extends Rough1 {
  static byte getStatusValue(Object obj) {
      if (obj != null) {
          try {
              return (Byte) obj;
          } catch (Exception e) {
              System.out.println("Can't type cast");
          }
          }  else {
          return -1;
          }
      return (byte) 255;
  }
}
