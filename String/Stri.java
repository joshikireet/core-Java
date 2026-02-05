
public class Stri {
public static void main(String[] args) {
	String s="graphic";
	s=s.concat(" era");
	System.out.println(s);
	s=s+" university";
	System.out.println(s);
	System.out.println(s.charAt(8));
	String s1="hello";
	System.out.println(s1.equals("HELLO"));
	System.out.println(s1.equalsIgnoreCase("HELLO"));
	System.out.println(s1.isEmpty());
	System.out.println(s1.length());
	System.out.println(s1.replace('l','P'));
	//System.out.println(s1);
	System.out.println(s1.substring(2));
	System.out.println(s1.substring(2, 4)); // begin to n-1
	System.out.println(s1.indexOf('l'));//  return first index
	System.out.println(s1.lastIndexOf('l'));
	System.out.println(s1.toUpperCase());
	String s2= " india  ";
	System.out.println(s2.trim());
	System.out.println(s1.replaceAll("llo","india123"));
System.out.println(s1.endsWith("llo"));
	
}}
