package com.employee.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends XmlAdapter<String, Date> {
	private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   
	public Date unmarshal(String xml) throws Exception
	{ 
		return dateFormat.parse(xml); 
	}
	 public String marshal(Date object) throws Exception
	{ 
		return dateFormat.format(object);
	}

	

}
