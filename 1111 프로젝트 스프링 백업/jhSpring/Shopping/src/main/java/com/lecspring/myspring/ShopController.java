package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//������̼�
//�����Ϸ����ٰ� ����� �˷���
//��ǥ���� ������̼�
//�������̵� deprecated ��...
//MVC�߿��� Controller�� �ش��Ѵٰ� �˷���
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












