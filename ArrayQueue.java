//**********************************************************
// ArrayQueue.java
// Sevdenur Arican.
// An array-based implementation of the classic FIFO queue interface.
//**********************************************************
public class ArrayQueue implements QueueADT
{
private final int DEFAULT_SIZE = 5;
private Object[] elements;
private int numElements;
private int front, back;
//---------------------------------------------
// Constructor; creates array of default size.
//---------------------------------------------
public ArrayQueue()
{
	//this(DEFAULT_SIZE);
	//numElements=0;
	elements=new Object[5];	//default_size
}
//---------------------------------------------
// Puts item on end of queue.
//---------------------------------------------
public void enqueue(Object item)
{
	if(numElements+1<=5){
	//if (DEFAULT_SIZE >= elements.length){
	elements[back] = item;
	back=(back+1)%DEFAULT_SIZE;
	//if (back >= elements.length) back = 0;
	numElements++;
	System.out.println(item + " is now in queue");
}else{
	System.out.println(item+ " can't be added");
}
}
//---------------------------------------------
// Removes and returns object from front of queue.
//---------------------------------------------
public Object dequeue()
{
	if (0<numElements){
	Object item = elements[front];
	elements[front]=null;
	front=(front+1)%5;
	numElements--;
	//if (front >= elements.length) front = 0;
	return item;
}else{
	System.out.println("sorry but the queue is empty");
	return null;
}
}
//---------------------------------------------
// Returns true if queue is empty.
//---------------------------------------------
public boolean isEmpty()
{
 	return numElements == 0? true:false;//if number of elements equals to 0, it returns true, if not it returns false
}
//-----------------------------------------
// Returns true if queue is full.
//-----------------------------------------
public boolean isFull()
{
	return (numElements == DEFAULT_SIZE)?true:false;//if the number of elements is Defaultsize which is equal to 5 then it returns true
}//if it is not true, it returns false
//--------------------------------------------- 
// Returns the number of elements in the queue.
//---------------------------------------------
public int size()
{
	return numElements;
}
//---------------------------------------------
// Returns a string containing the elements of the queue
// from first to last
//---------------------------------------------
public String toString()
{
String result = "\n";
for (int i = front, count=0; count < numElements;
 i=(i+1)%elements.length,count++)
 result = result + elements[i]+ "\n";
return result;
}
}
