package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Controller랑 DAO를 이어주는 것
@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopDao shopDao;//객체 자동 생성 및 관리
	
	@Override
	public String insert(Map<String, Object> map) {
		int affectRowCount = this.shopDao.insert(map);
		if(affectRowCount==1)
			return map.get("shop_id").toString();
		return null;
	}
	
	
}










