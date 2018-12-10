// ***************************************************************
// DoubleLinked.java
// Author:Sevdenur A. (w/ help of multiple tutors)
// A class using a doubly linked list to represent a list of integers.
//
// ***************************************************************
public class DoubleLinked
{
private IntNode list;//builds empty list
// ----------------------------------------------
// Constructor -- initializes list
// ----------------------------------------------
public DoubleLinked()
{
list = null;//makes the first link
}
// ----------------------------------------------
// Prints the list elements
// ----------------------------------------------
public void print()
{
for (IntNode temp = list; temp != null; temp = temp.next)
 System.out.println(temp.val);
}
// ----------------------------------------------
// Adds new element to front of list
// ----------------------------------------------
public void addToFront(int val)
{
IntNode newNode = new IntNode(val);
newNode.next = list;
if (list != null)
 list.prev = newNode;
list = newNode;
} 
//***************************************************************
// An inner class that represents a list element.
//***************************************************************
private class IntNode
{
public int val;
public IntNode next;
public IntNode prev;
public IntNode end;
public IntNode(int val)
{
this.val = val;
this.next = null;
this.prev = null;
this.end=null;
}
}
public void addToEnd(int val){
IntNode newNode1 = new IntNode(val);
//newNode.next = list;
if(list==null)//the list is null
list=newNode1;
else{//if not
	IntNode temp=list;//then the number is added to the end of the number
	while(temp.next!=null )//temp stores temporary value.
temp=temp.next;//the code scans numbers one by one and adds the last number to end of list
	temp.next=newNode1;

}
}

public void removeFirst(){//removes the first value from the list. If the list is empty, does nothing.
if(list!=null){//if list is not null
	list=list.next;//removes first input
}
}
public void removeLast(){//removes the last element of the list. If the list is empty, does nothing.
	if(list!=null){//if list is not null
	IntNode temp=list;//stores numbers that are in the list the user made
IntNode thirdNode=null;//null because it is not taking #
while (temp.next != null){//scans list for the last number
thirdNode=temp;
temp=temp.next;}
if (thirdNode!=null)//compares if it has values
	thirdNode.next=null;//if its null it won't remove anything
else
	list=null;}
}
public void remove(int oldVal){//removes the first occurrence of oldVal in the list.
	IntNode c,old;
	c=old=list;
	
	while(c.val != oldVal){//comapres old and new
        if(c.next == null){//if user doesnt enter or there is no value
            System.out.println("No match");//then this prints out
            return;

        } else {//loop, checks whether the value are there or not
            old=c;//then previous # is equal to the current one, so it's the samething
            c=c.next;
        }

    }//The 2 lines directly under this comment are attempts to write the if statement in a short way
	//c==list != null ? list=list.next: (old.next=c.next);
	//(c==list && list=list.next)||old.next=c.next;
    if(c == list){//compares the whole list and increments
        list=list.next;
    } else{
        old.next=c.next;
    }


	
	
}





}
