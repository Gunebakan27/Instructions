package Projects_01;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .

        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"


         */
        Scanner dp = new Scanner(System.in);
        
        System.out.println("iki kelime girin");

        String  allElements = dp.nextLine();

        String[] elements = allElements.split(" ");

        String s1 = elements[0];

        String s2 = elements[1];

        // code start here use s1 and s2 as words
        // kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın
      
        
        if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
        	s1=s1+s2.substring(1);
        }else {
        	s1=s1+s2;
        }

System.out.println(s1);

    }
}