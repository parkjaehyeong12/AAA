package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//어노테이션
//컴파일러에다가 기능을 알려줌
//대표적인 어노테이션
//오버라이딩 deprecated 등...
//MVC중에서 Controller에 해당한다고 알려줌
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ShopController {
	
	ShopService shopService;
	
	@RequestMapping(value="/insert", 
			method = RequestMethod.POST) 
	public ModelAndView insertMem
	(@RequestParam Map<String,Object>map) {
		ModelAndView mav = new ModelAndView();
		System.out.println(map.toString());
		String shopId = this.shopService.insert(map);
		if(shopId==null)
			mav.setViewName("redirect:/insert");
		else
			mav.setViewName
			("redirect:/detail?shop="+shopId);
		return mav;
	}
	
}












