package com.notification.csv.CSVReader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.notification.csv.CSVReader.Response.CsvContentResponse;
import com.notification.csv.CSVReader.service.ReadCsvService;

@RestController
public class ReadCsvController {
	@Autowired
	private ReadCsvService readservice;
	
	@RequestMapping(value="${restservice.operation.readCsv}",method=RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	@ResponseStatus
	public CsvContentResponse findContent(@RequestParam("entityInput") String entityInput ){
		
		return readservice.getCsvContent(entityInput);
	}
	
	

}
