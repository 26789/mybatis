package com.woniuxy.j_dynamicsql;

import java.util.List;

import lombok.Data;

// ���ڷ�װ��������

@Data
public class UserExample {
	private Integer id;
	private String name;
	private Integer minId,maxId;
	private List<Integer> ids;
}
