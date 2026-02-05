    public class Str1{  
    public static void main(String args[])
    {  
    	String s1="graphic";
    	char ch[]=s1.toCharArray(); // convert string into char array
    	for(int i=0;i<ch.length;i++)
    	{
    	System.out.println(ch[i]);
    }  
        //if s1 > s2, it returns positive number  
        //if s1 < s2, it returns negative number  
        //if s1 == s2, it returns 0  
    	System.out.println(s1.compareTo("graphic"));
    }}  