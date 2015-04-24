package com.sam.ds;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class BlockingQueue{
	public static ArrayList<Integer> queue ;
	public static int limit;
	private final Semaphore availItem = new Semaphore(0);
	private final Semaphore availSpace = new Semaphore(limit);
	
	
	public BlockingQueue(int limit){
		queue = new ArrayList<Integer>();
		this.limit = limit;
	}
	
	public void enqueue(int x) throws InterruptedException{
		availSpace.acquire();
		boolean isAdded = false;
		
		synchronized (this){
			isAdded = queue.add(x);
			if(isAdded){
				availItem.release();
			}
			else{
				availSpace.release();
			}
		}
		
	}
	
}