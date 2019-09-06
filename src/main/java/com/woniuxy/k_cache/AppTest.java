package com.woniuxy.k_cache;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/*
 hibernate��һ�����棬��Ѷ��󻺴�2�ݸ�����һ���ǿ��գ���һ���ǻ��档
 mybatis��һ�����棬ֻ��Ż��档û�п��ա�����mybatis��û�ж��������״̬!
*/

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
		UserMapper mapper = s.getMapper(UserMapper.class);
		
		User user = mapper.findOne(6);
		User user2 = mapper.findOne(6);
		User user3 = mapper.findOne(6);
		
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		
		// ======================================================================
		s.close();
		
		
		System.out.println("======================================================");
		
		
		SqlSession s2 = MybatisUtils.openSession(); 
		// ======================================================================
		
		UserMapper mapper2 = s2.getMapper(UserMapper.class);
		
		User user4 = mapper2.findOne(6);
		User user5 = mapper2.findOne(6);
		User user6 = mapper2.findOne(6);
		
		System.out.println(user4);
		System.out.println(user5);
		System.out.println(user6);
		
		// ======================================================================
		s2.close();
		
	}
	
	
}
