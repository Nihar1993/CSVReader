package com.notification.csv.CSVReader.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.notification.csv.CSVReader.Response.CsvContentResponse;
@Service
public class ReadCsvService {
	
	
	public CsvContentResponse getCsvContent(String entityInput) {
		CsvContentResponse response=new CsvContentResponse();
		// TODO Auto-generated method stub
		String [] data=null;
		String row=null;
		BufferedReader csvReader=null;
		
		try {
			csvReader = new BufferedReader(new FileReader("C:/Users/nrout/workspace/CSVReader/Notification.csv"));
			row=csvReader.readLine();
			while((row=csvReader.readLine()) != null){
				data=processCsvElement(row);
				if(data[2].equalsIgnoreCase(entityInput)){
					
					response.setUser(data[0]);
					response.setDate(data[1]);
					response.setBusinessEntity(data[2]);
					response.setStatus(data[3]);
					response.setTimeAvailability(data[4]);
					response.setMessage(data[5]);
					response.setAuditTimeStamp(data[6]);
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				csvReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return response;
	}
	private String[] processCsvElement(String row) {
		// TODO Auto-generated method stub
		return null;
	}

}
