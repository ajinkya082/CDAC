package com.Queue_Examples;

public class Priority_Queue {
	int queue[],MaxSize,front,rear;
	void createQueue(int size)
	{
		MaxSize=size;
		rear=-1;
		front=0;
		queue=new int[MaxSize];
	}
	void enqueue(int e)//with every enqueue rear+1
	{
		queue[++rear]=e;
		for(int i=front;i<rear;i++) {
			for(int j=front;j<rear;j++) {
				if(queue[j]>queue[j+1]) {
					int temp=queue[j];
					queue[j]=queue[j+1];
					queue[j+1]=temp;
				}
			}
		}
	}

	boolean is_full()
	{
		return (rear==MaxSize-1);//boundry condition
	}
	int dequeue()
	//removes element from front ,front+1
	{
		return queue[front++];
	}

	boolean is_empty()
	{
		return front>rear;
	}
	void print_queue()
	{
		for(int i=front; i<=rear; i++) {
		    System.out.print(queue[i]+"-");
		}
	}
}


