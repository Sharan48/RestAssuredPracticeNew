package com.javaproject_serialization_And_deseriliaztion;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationProject {
	
	public void deserializeproject() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper=new ObjectMapper();
		FirstProject result = mapper.readValue(new File("./project.json"), FirstProject.class);
		
		System.out.println(result.ProjectManager);
	}


}
