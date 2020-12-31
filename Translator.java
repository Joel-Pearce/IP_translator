public class Translator {
	
	  public static int countBits(Long l) {
		    int count = 0;
		    while (l != 0) 
		        { 
		            count++; 
		            l >>= 1; 
		        } 
		          
		        return count; 
		  }
		  
	  public static String longToIP(long ip) {
		           
		           String s = Long.toBinaryString(ip);
		           
		           int bits = countBits(ip);
		           
		           StringBuilder sb;
		           
		           while(bits < 32) {
		             sb = new StringBuilder(s);
		             sb.insert(0, "0");
		             s = sb.toString();
		             bits++;
		           }
		           
		           
		           String s1 = s.substring(0, 8);
		           String s2 = s.substring(8, 16);
		           String s3 = s.substring(16, 24);
		           String s4 = s.substring(24, 32);

		           int part1 =Integer.parseInt(s1, 2); 
		           int part2 =Integer.parseInt(s2, 2); 
		           int part3 =Integer.parseInt(s3, 2); 
		           int part4 =Integer.parseInt(s4, 2); 
		           
		           String output = part1 + "." + part2 + "." + part3 + "." + part4;
		    
		           return output;
		 
		    
		  }

}
