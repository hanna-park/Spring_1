package com.qq.s1;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qq.notice.NoticeDTO;
import com.qq.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Inject
	private NoticeService noticeService;
	
	//noticeWirte POST
	@RequestMapping(value="noticeWrite", method=RequestMethod.POST)
	public String noticeWrite2(NoticeDTO noticeDTO) {
		
		return "redirect:./noticeList";
	}
	
	
	//noticeWrite GET
	@RequestMapping(value= "noticeWrite", method = RequestMethod.GET/*, params = {"num=1, name=iu"}*/)
	public String noticeWrite() {

		return "notice/noticeWrite";
	}
	
	//SelectOne
	@RequestMapping(value="noticeSelect", method= {RequestMethod.GET,RequestMethod.POST})
	public Model noticeSelect(Model model,/*@RequestParam(value="n", required = false, defaultValue = "1")*/ int num) throws Exception {	// 파라미터 이름과 변수명이 똑같아야 됨
		NoticeDTO noticeDTO = noticeService.selectOne(num);
		model.addAttribute("dto",noticeDTO);
		
		return model;
	}
	
	
	//List
	@RequestMapping("noticeList")	// 절대경로로 적어야 함
	public ModelAndView noticeList() throws Exception{
		
		List<NoticeDTO> ar = noticeService.noticeList();
		
		//URL notice/ noticeList
		//return notice/noticeList
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
		
	}
	
	
}
