package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Controller�� DAO�� �̾��ִ� ��
@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopDao shopDao;//��ü �ڵ� ���� �� ����
	
	@Override
	public String insert(Map<String, Object> map) {
		int affectRowCount = this.shopDao.insert(map);
		if(affectRowCount==1)
			return map.get("shop_id").toString();
		return null;
	}
	
	
}










