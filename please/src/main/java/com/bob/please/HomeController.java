package com.bob.please;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.base.Stopwatch;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	Connection conn;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws IOException 
	 * @throws ServletException 
	 */
		@RequestMapping("/home")
		public ModelAndView home() {
			//오늘의 공지 사항
			List<String> noticeList=new ArrayList<>();
			noticeList.add("곧 겨울 입니다.");
			noticeList.add("수료가 얼마 남지 않았군요~");
			noticeList.add("어쩌구...");
			noticeList.add("저쩌구...");
			
			ModelAndView mView=new ModelAndView();
			mView.addObject("noticeList", noticeList);
			mView.setViewName("home");
			return mView;
		}    
	}
	

