package com.neo.util;

import java.io.IOException;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

public class NoCacheMappingJacksonHttpMessageConverter extends
					MappingJackson2HttpMessageConverter {

	@Override
	protected void writeInternal(Object object, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		outputMessage.getHeaders().set("Cache-Control", "no-cache");  
        super.writeInternal(object, outputMessage);
	}
}
