package com.Queue_Examples;

public class Queue_Class {
	int queue[],MaxSize,front,rear;
	void createQueue(int size)
	{
		MaxSize=size;
		front=0;
		rear=-1;
		queue=new int[MaxSize];
	}
	void enqueue(int e)//with every enqueue rear+1

	{
		queue[++rear]=e;
	}

	boolean is_full()
	{
		return (rear==MaxSize-1);//boundry condition
	}
	int dequeue()
	//removes element from front ,front+1
	{
//		rear--;
		return queue[front++];
		
	}

	boolean is_empty()
	{
		return front>rear;
	}
	
	void print_queue()
	{
		for(int i=front;i<=rear;i++)
			System.out.print(queue[i] + "-");
	}

}
