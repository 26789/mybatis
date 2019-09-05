package com.woniuxy.c_aliases;

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
		
		User user = new User();
		user.setName("ơ��");
		user.setBirthday(new Date());
		user.setMoney(999d);
		s.insert("com.woniuxy.c_aliases.UserMapper.save",user);
		
		
		// ======================================================================
		s.close();
		
	}
	
	
}
