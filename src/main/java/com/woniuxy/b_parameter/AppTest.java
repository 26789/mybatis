package com.woniuxy.b_parameter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		
		
		SqlSession s = MybatisUtils.openSession();
		// ======================================================================
		
//		User user = new User();
//		user.setName("��������");
//		user.setBirthday(new Date());
//		user.setMoney(999d);
//		
//		s.insert("com.woniuxy.b_parameter.UserMapper.save",user);
		
//		Foo f = new Foo(11,"��«��", new Date(),1000d);
//		s.insert("com.woniuxy.b_parameter.UserMapper.save",f);
		
		Map<String, Object> map = new HashMap<>();
		map.put("id",23);
		map.put("name","֩����");
		map.put("birthday",new Date());
		map.put("money", 2000d);
		
		s.insert("com.woniuxy.b_parameter.UserMapper.save",map);
		
		
		
		
		// ======================================================================
		// �ύ����
		// s.commit();
		// �رջỰ
		s.close();
		
	}
	
	
}
