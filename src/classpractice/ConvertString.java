package classpractice;

public class ConvertString {

	 public void  convert(String s)
	 {
		 char str[] = s.toCharArray();
		 StringBuffer br = new StringBuffer(s);
		 for(int i=0;i<str.length;i++)
		 {
			 if(Character.isLowerCase(str[i]))
			 {
				 br.setCharAt(i, Character.toUpperCase(str[i]));
			 }
			 else
				 br.setCharAt(i,Character.toLowerCase(str[i]));
		 }
		 System.out.println("String after case conversion : "+ br);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "ProGraMS";
		 ConvertString obj = new ConvertString();
		 obj.convert(s);
	}

}
