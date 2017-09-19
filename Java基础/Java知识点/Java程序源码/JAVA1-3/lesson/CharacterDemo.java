package lesson;

public class CharacterDemo {
	public static void main(String[] args) {
     Character ch1=new Character('a');
     Character ch2=new Character('A');
     System.out.println("char value of ch1:"+ch1.charValue());
     System.out.println("ch1 compare to ch2:"+ch1.compareTo(ch2));
     System.out.println("min value(int):"+(int)Character.MIN_VALUE);
     System.out.println("max value(int):"+(int)Character.MAX_VALUE);
     System.out.println("is digit'1':"+Character.isDigit('1'));
     System.out.println("is upper case 'a':"+Character.isUpperCase('a'));
     System.out.println("is letter'1':"+Character.isLetter('1'));
     System.out.println("is space char'':"+Character.isSpaceChar('0'));
     System.out.println("is letter or digit '好':"+Character.isLetterOrDigit('好'));
     System.out.println("to upper case'好':"+Character.toUpperCase('好'));
	}

}
