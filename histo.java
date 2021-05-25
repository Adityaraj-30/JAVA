import java.util.Scanner;
public class histo {

    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[26]; 
	    String s;
	    System.out.println("Enter the text");
	    s=sc.nextLine();
	    generate_freq(s,a); 
	    printTable(a); 
	    print_horiz_histo(a); 
	    print_vert_histo(a); 
        sc.close();
	}
	static char toLower(char ch)  //Function to convert character to lower case. 
	{ 
	    if(ch>=65&&ch<=90) 
	        ch=(char) (ch+32); 
	    return ch;     
	}
	static boolean isAlpha(char ch)  //Function to check if character is alphabet. 
	{ 
	    if(ch>=97&&ch<=122) 
	        return true; 
	    else if(ch>=65&&ch<=90) 
	        return true; 
	    else 
	        return false;         
	} 
	static void generate_freq(String s,int ctr[])     //Generating Frequency from Text file 
	{ 
	    char ch,ch1; 
 
	    for(int i=0;i<s.length();i++) 
	    { 
	    	ch=s.charAt(i);
	        if(isAlpha(ch)) 
	        { 
	        ch1=toLower(ch); 
	        ctr[(int)ch1-97]++;       //Counting frequency of letters 
	        } 
	    }      
	}
	static void printTable(int a[])     //Function to print Frequency Table 
	{ 
	    System.out.println("Frequency Table \n\nLetter \t"+(char)166+" Frequency"); 
	    for(int i=1;i<=26;i++) 
	        System.out.println((char)(i+96)+"\t"+(char)166+a[i-1]); 
	}
	static void print_horiz_histo(int ctr[])     //Function to print Horizontal Histogram 
	{ 
	    System.out.println("\n Horizontal Histogram \n"); 
	    for(int i=1;i<=26;i++) 
	    { 
	        System.out.print((char)(i+96));
	        System.out.print((char)166); 
	        for(int j=1;j<=ctr[i-1];j++) 
	            System.out.print("*"); 
	        System.out.println(); 
	    } 
	} 
	static void print_vert_histo(int ctr[])   //Function to print Vertical Histogram 
	{ 
	    System.out.println("\n Vertical Histogram \n"); 
	    for(int i=25;i>=0;i--) 
	    { 
	        for(int j=0;j<26;j++) 
	        { 
	            if(ctr[j]-i>0) 
	                System.out.print("* "); 
	            else  
	               System.out.print("  "); 
	        } 
	        System.out.println();     
	    } 
	    for(int k=0;k<26*2;k++) 
	        System.out.print((char)45); 
	    System.out.println();     
	    for(int l=0;l<26;l++) 
	        System.out.print((char)(l+97)+" ");     
            
	}
    
}
