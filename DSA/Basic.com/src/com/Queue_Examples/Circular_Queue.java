package com.Queue_Examples;

public class Circular_Queue {
	int queue[],MaxSize,front,rear,counter;
	void createQueue(int size)
	{
		MaxSize=size;
		front=0;
		rear=-1;
		queue=new int[MaxSize];
	}
	void enqueue(int e)//with every enqueue rear+1

	{
		counter++;
		rear=(rear+1)%MaxSize;
		queue[rear]=e;
		
	}

	boolean is_full()
	{
		return (counter==MaxSize);//boundry condition
	}
	int dequeue()
	//removes element from front ,front+1
	{
		//		rear--;
		counter--;
		int temp=queue[front];
		front=(front+1)%MaxSize;
//		queue[rear]=e;
		return temp;

	}

	boolean is_empty()
	{
		return counter==0;
	}

	void print_queue()
	{
		int c=0,i=front;
		while(c<counter) {
			System.out.print(queue[i]+" - ");
			i=(i+1)%MaxSize;
			c++;
			
		}
	}
}
