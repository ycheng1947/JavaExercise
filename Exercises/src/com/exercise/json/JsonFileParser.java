package com.exercise.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;

public class JsonFileParser {
	
	public static void main(String[] args){
	
	JsonTest jsonObj = new JsonTest();
	
	ObjectMapper mapper = new ObjectMapper();
	
	System.out.println("Convert Java object to JSON format and save to file");
	 
	try {
	 
	     mapper.writeValue(new File("d:\\jackson.json"), jsonObj);
	 
	} catch (JsonGenerationException e) {
	 
	} catch (JsonMappingException e) {
	 
	} catch (IOException e) {
	 
	}
	}
}