package com.qq.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	//memberLogin POST 
	@RequestMapping(value= "memberLogin", method =RequestMethod.POST)
	public String memberLogin() {
		
		return "redirect:../home";
	}
	//memberLogin GET
		@RequestMapping(value= "memberLogin",method=RequestMethod.GET)
		public void memberLogin2() {
			
		}
	
	//memberJoin POST 
	@RequestMapping(value = "memberJoin",method=RequestMethod.POST)
	public String memberJoin() {
		
		return "redirect:../home";
	}
	
	//memberJoin GET
		@RequestMapping(value = "memberJoin",method=RequestMethod.GET)
		public void memberJoin2() {
			
		}
	
}
