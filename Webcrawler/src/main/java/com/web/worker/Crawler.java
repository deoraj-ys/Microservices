package com.web.worker;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler implements Runnable{
	
	private Set<String> visitedPages;
	private Queue<String> taskQueue; 	
	private String URL;
	public Crawler(String URL,Set<String>visitedPages,Queue<String> taskQueue)
	{
		this.visitedPages=visitedPages;
		this.URL=URL;
		this.taskQueue=taskQueue;
		
	}
	public Crawler()
	{
		
	}
	
	public void run() 
	{
		if(!visitedPages.contains(URL))
		{
			try {
				System.out.println("Thread Name and URL =="+Thread.currentThread().getName()+"\t"+URL);
				processPage(URL);
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public   void processPage(String URL) throws Exception
	{
		
		    try {
		    	if(URL != null && !visitedPages.contains(URL)) {
		    		System.out.println("Processing URL==="+URL);
		    	
		     Document doc = Jsoup.connect(URL).get();
			 Elements links = doc.select("a[href]");
			 Elements images=doc.select("img[src]");
			 for(Element image:images)
			 {
				
				System.out.println("image fil=="+image.attr("abs:src"));
				 visitedPages.add(image.attr("abs:src"));
			 }
				for(Element link: links){					
					if(!link.attr("href").contains("#") && isvalidLink(link.attr("abs:href")))
					{
						     taskQueue.add(link.attr("abs:href"));
						    
						     				    									
					}
				}
				
		    }	
		    }
	   catch(Exception e)
	   {
		   visitedPages.add(URL);
		 //  e.printStackTrace();
	   }
		  
	   visitedPages.add(URL);	
		
	}
	
	public boolean isvalidLink(String URL) throws URISyntaxException
	{
		if((URL.startsWith("https") || URL.startsWith("http")) && isDomainValid(URL) ) {
	        return true;
		}
		else
			return false;
	}
	
	public boolean isDomainValid(String URL) throws URISyntaxException
	{
		URI uri = new URI(URL);
	    String domain = uri.getHost();
	   // System.out.println("Domain===="+domain);
	    if(domain.contains("prudential.co.uk") || domain.contains("prudentialcorporation-asia.com") || domain.contains("pru.co.uk")
	    		|| domain.contains("mypru.pru.co.uk") || domain.contains("login.pru.co.uk")
	    		)
	    {
	    	return true;
	    }
	    else
	    	return false;
	}
	
	}


