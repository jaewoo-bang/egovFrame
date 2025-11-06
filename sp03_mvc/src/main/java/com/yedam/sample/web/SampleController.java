package com.yedam.sample.web;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@GetMapping("/success")
	public String success() {
		return "/success";
	}
	
	@RequestMapping(value = { "insert", "/" }, method = { RequestMethod.POST, RequestMethod.GET }) // /sample
	public void basic() {
		log.info("basic...");
	}

	@GetMapping("/ex01") // ex01?name=aaa&age=15 void return값 안받음
	public String ex01(@ModelAttribute("sample") SampleDTO sample, RedirectAttributes ra) {
		log.info("sampleDTO: " + sample);
		ra.addFlashAttribute("msg", "가입축하");
		ra.addAttribute("name", sample.getName());
		//return "redirect:/success";  // 절대경로: http://localhost:81/success
									   // redirect 뒤에는 매칭 url을 적어줌
									   // forward 뒤에는 페이지명
		//return "redirect:success";   // 상대경로: http://localhost:81/sample/success
		return "redirect:/sample/success";
	}

	@GetMapping("/ex02") // ex02?name=aaa&age=
	public String ex02(@ModelAttribute("name")
					   @RequestParam("name") String name,
						
					   @DateTimeFormat(pattern = "yyyy-MM-dd")
					   @RequestParam(value = "birth") Date birth,
					   
					   @RequestParam(value = "age",
					   				 required = false,
					   				 defaultValue = "10") int age, 
					   Model model) {
		log.info(name + ":" + age + ":" + birth );
		model.addAttribute("name", name);
		return "ex02";
	}

	@GetMapping("/ex02Array") // ex02Array?ids=3&ids=4&ids=10 //체크박스
	public void ex02Array(@RequestParam("ids") List<String> ids) {
		log.info("ids:" + ids);
	}
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mv = new ModelAndView("/hello", "greet", "hi");
		mv.setViewName("/hello");
		mv.addObject("greet", "hi");
		return mv;
	}
	
}
