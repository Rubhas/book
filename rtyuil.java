
public class rtyuil {

	public static void reverseSentance(String str) {
	    StringBuilder revStr = new StringBuilder("");
	    int end = str.length(); 
	    int counter = str.length()-1;
	    for (int i = str.length()-1; i >= 0; i--) {     
	        if (str.charAt(i) == ' ' || i == 0) {
	            if (i != 0) {
	                revStr.append(str.substring(i+1, end));
	                revStr.append(" ");
	            }
	            else {
	                revStr.append(str.substring(i,end));
	            }
	            end = counter;
	        }
	        counter--;
	    }
	    System.out.println(revStr);
	}}
