package com.web.crawler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.web.worker.Crawler;

public class CrawlerHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExecutorService es=Executors.newFixedThreadPool(10);
		
		Set<String> visitedPages=new HashSet<String>();
		BlockingQueue<String> taskQueue=new ArrayBlockingQueue<String>(1000);
		taskQueue.add("http://www.prudential.co.uk/");
		while(true)
		{
			es.execute(new Crawler(taskQueue.poll(),visitedPages, taskQueue));
			
			
		}
		
		
	}

}
