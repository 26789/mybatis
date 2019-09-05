package com.woniuxy.d_dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
		User user = new User();
		user.setName("��������");
		user.setBirthday(new Date());
		user.setMoney(10d);
		
		// ����ӿ��ֽ��룬������һ��������󣬸ô������ֱ��ʵ���˽ӿڡ�
		UserMapper mapper = s.getMapper(UserMapper.class);
		
//		mapper.save(user);
		
//		List<User> list = mapper.findAll();
//		
//		for (User user2 : list) {
//			System.out.println(user2);
//		}
		
		User user2 = mapper.findOne(11);
		System.out.println(user2);
		
		System.out.println(mapper.getClass());
		
		// ======================================================================
		s.close();
		
	}
	
	
}
