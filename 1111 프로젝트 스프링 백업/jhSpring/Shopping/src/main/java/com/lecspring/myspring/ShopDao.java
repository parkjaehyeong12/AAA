package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * BookDao를 Bean으로 등록함
 * DB연결 관련된 Bean 객체 = @Repository
 * */
@Repository
public class ShopDao {

	//bean객체를 생성하는 데, 적절한 인스턴스를 생성해 줌(자동)
	//new 키워드 없어도 자동으로 만들어 줌
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		//mapper(=book_SQL.xml)에 있는 id가 insert인
		//쿼리를 수행함
		return 
		this.sqlSessionTemplate.insert
		("shop.insert",map);
	}
	
	

}









