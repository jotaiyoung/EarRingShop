package com.shop.controller;



import java.io.File;

import javax.annotation.Resource;

import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
	
	@Resource(name="uploadPath")
	String uploadPath;

	@RequestMapping(value="/upload/uploadForm", method=RequestMethod.GET)
	public void uploadForm(){
		System.out.println("uploadPath :: " + uploadPath);
	}
	
	@RequestMapping(value="/upload/uploadForm", method=RequestMethod.POST)
	public ModelAndView uplodForm(ModelAndView mav, MultipartFile file) throws Exception{
		
		logger.info("fileName" + file.getOriginalFilename());
		logger.info("fileSize" + file.getSize());
		logger.info("contentType" + file.getContentType());
		
		String saveName = file.getOriginalFilename();
		
		File target= new File(uploadPath,saveName);
		
		FileCopyUtils.copy(file.getBytes(), target);
		
		mav.setViewName("upload/uploadResult");
		mav.addObject("saveName", saveName);
		
		return mav;
		
	}
	
}
