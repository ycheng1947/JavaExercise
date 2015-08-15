package com.exercise.json;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonTest {

	public static void main(String[] args) throws JsonProcessingException,
			IOException {

		String data = "[ {\"1\":\"2,3,4,5,6,7,8,9,10\"},{\"2\":\"11,12,13,14\"},{\"3\":\"15,16\"},{\"11\":\"18,19,20\"}]";

		ObjectMapper mapper = new ObjectMapper();

		JsonNode nodes = mapper.readTree(data);
		
		JsonNode relatedID = nodes.path("1");

		
		for(int i =0;i<relatedID.size();i++){
			String companyId = relatedID.get(i).getTextValue(); 
			System.out.println(companyId);
		}
		
	}
}