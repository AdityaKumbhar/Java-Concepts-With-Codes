/********************************************************
*
*  1.This program demonstrate that every class in java is
*	directly or indirectly inherited from Object class	
*
*  2.Object class is super class of all classess
*
********************************************************/



import java.lang.*;

// Object class is super class of all classes
class Demo1
{
	public void fun()
	{
		System.out.println("In Demo1 fun");
	}
}

class Object_Class
{
	public static void main(String args[])
	{
		
		

		Demo1 obj1 = new Demo1();
		obj1.fun();

		Demo1 obj2 = new Demo1();

		// getClass() method is used to get the class name
		// for the object

		System.out.println("Class Name is " +obj1.getClass());

		Demo1 obj3 = obj2;

		// equals() is the method of class Object
		// this method is used to check the hashCode()
		// of two objects.

		if(obj3.equals(obj2))
		{
			System.out.println("Both objects are same");
		}
		else
		{
			System.out.println("Both objects are diffrent");
		}
	
	}
}

/**************************************************************
*
*	OUTPUT :
*		In Demo1 fun
*		Class Name is class Demo1
*		Both objects are same
**************************************************************/

public final Class getClass()	returns the Class class object of this object. The Class class can further be used to get the metadata of this class.
public int hashCode()	returns the hashcode number for this object.
public boolean equals(Object obj)	compares the given object to this object.
protected Object clone() throws CloneNotSupportedException	creates and returns the exact copy (clone) of this object.
public String toString()	returns the string representation of this object.
public final void notify()	wakes up single thread, waiting on this object's monitor.
public final void notifyAll()	wakes up all the threads, waiting on this object's monitor.
public final void wait(long timeout)throws InterruptedException	causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).
public final void wait(long timeout,int nanos)throws InterruptedException	causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).
public final void wait()throws InterruptedException	causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).
protected void finalize()throws Throwable	is invoked by the garbage collector before object is being garbage collected.
