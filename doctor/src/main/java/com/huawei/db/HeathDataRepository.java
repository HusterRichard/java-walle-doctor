package com.huawei.db;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.huawei.model.HeathData;

public interface HeathDataRepository extends MongoRepository<HeathData, String>{
	// TODO:Ϊʲô���������ϲ�ѯ��
	//	public HeathData findByNameAndTime(String userName, String collectTime);
}
