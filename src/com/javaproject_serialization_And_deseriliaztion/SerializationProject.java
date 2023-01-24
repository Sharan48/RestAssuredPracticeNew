package com.javaproject_serialization_And_deseriliaztion;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.internal.mapping.Jackson1Mapper;

public class SerializationProject {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		FirstProject project=new FirstProject("Innovation", "SNS", "Sharan", 8, 9000000);
		
		ObjectMapper mapper=new ObjectMapper();
		 mapper.writeValue(new File("./project.json"), project );
		
	}
}
