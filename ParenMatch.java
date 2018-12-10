// ********************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************
import java.util.*;
import java.util.Scanner;
public class ParenMatch{
	//Author: S.Arican w/ help of tutors
	//i think i couldve used a TreeMap , not sure
	final String Left="(";
	final String Right=")";
public static void main (String[] args)
{
Stack <Integer>s = new Stack();
String line; // the string of characters to be checked
Scanner scan = new Scanner(System.in);
System.out.println ("\nParenthesis Matching");
System.out.print ("Enter a parenthesized expression: ");
line = scan.nextLine();
int l = line.length();
for (int j = 0; j < l; j++)//takes the whole sentence, 
{    //l is length
	//j is where it's stored(for comparing)
    char chr = line.charAt(j);
    if (chr == '(')
        s.push(j);//Pushes an item onto the top of this stack. move back to particular location, Tutor helped with this one
    else if (chr == ')')//if caracter is that specifc character
    {
        try//push adds element
        //pop adds element
        {
            int q = s.pop() + 1;//Removes the object at the top of this stack and returns that object as the value of this function.
           System.out.println("')' at character "+(j+1)+" matched with '(' at character "+q);
        }
        catch(Exception e)//catches error and implements to something else
        {
            System.out.println("')' at character "+(j+1)+" is unmatched");
        }
    }            
}
//while ("".equals(s))
while (!s.isEmpty() )//if stack is not empty
    System.out.println("'(' at character "+(s.pop() +1)+" is unmatched");

}
}
/* char sentenceLine[]=new char[line.length()];//checks the whole line
 //Attempt2
int x;//total length
while(x<sentenceLine.length){//less than whole line
	sentenceLine[x]=line.charAt(x);//compares characters
	x++;//to the next character
}
int left,right,i=0;
while(i<sentenceLine.length){
	if(sentenceLine[i]=='(');
	left++;
	if(line.charAt(i)==')');
	right++;

// loop to process the line one character at a time
// print the results
}*/
