package com.woniuxy.d_dao;

import java.util.List;

/*
 �ýӿڱ��룺
 1. ���ֱ������Ӧ��UserMapper.xml����һ�£�������׺��
 2. �ӿ��еķ�����������UserMapper.xml�е�����idһ��
 3. �ӿ��еķ����Ĳ���������ֵ���ͣ�Ҳ������UserMapper.xml�е�����parameterTyp��resultTypeһ��
*/

public interface UserMapper {
	void save(User user);
	
	List<User> findAll();
	User findOne(Integer id);
}
