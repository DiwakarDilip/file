package program.com;

public class repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=146698877;
		int count=0;
		String strnum=Integer.toString(num);
		for(int i=0;i<strnum.length();i++) {
			for(int j=i+1;j<strnum.length();j++) {
				if(strnum.charAt(i)==strnum.charAt(j)) {
					count++;
					break;
				}
			}
			
		}
		System.out.println(count+" is security code");
	}

}