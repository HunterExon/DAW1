package com.everisfpdual.testfinal.util;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public final class FileUtil {
	
	private static final String FILE_NAME = "Excel_";
	private static final String ATTACHMENT = "attachment";
	private static final String DATE_FORMAT_FILE = "dd_MM_yyyy_HH-mm";

	public static ResponseEntity<InputStreamResource> okWithFile(ByteArrayInputStream response) {
		
		if(response == null) {
			return ResponseEntity.noContent().build();
		}
		
		HttpHeaders headers = null;
		
		headers = new HttpHeaders();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT_FILE);  
		LocalDateTime now = LocalDateTime.now();  
		
		headers.setContentType(MediaType.parseMediaType(Constant.CONTENT_TYPE_XLSX));
		headers.setContentDisposition(ContentDisposition.builder(ATTACHMENT)
				.filename(FILE_NAME + dtf.format(now) + Constant.XLSX_EXT).build());
		
		return new ResponseEntity<>(new InputStreamResource(response), headers, HttpStatus.OK);
	}
	
}
