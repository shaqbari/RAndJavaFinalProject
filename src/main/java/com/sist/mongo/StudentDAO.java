package com.sist.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
//public class StudentDAO implements Student{//원래는 이렇게 해야 한다.
public class StudentDAO implements Student{
	@Autowired
	private MongoTemplate mt;
	
	public List<StudentVO> stdAllData(){
		Query query=new Query(); //{name:''}
		List<StudentVO> list=mt.find(query, StudentVO.class, "student");//쿼리가 없으면 전체를 가지고 온다.
		
		return list;
	}
	
	public List<StudentVO> stdFindData(String fs, String ss){
		System.out.println(fs+" : "+ss);

		
		//{name:}
		//{subject:}
		//db.getCollection('student').find({name:{$regex:'.*이'}})        %이%
		BasicQuery query=new BasicQuery("{"+fs+":{$regex:'.*"+ss+"'}}");
		
		System.out.println(query.toString());
		List<StudentVO> list=mt.find(query, StudentVO.class, "student");
		
		return list;
	}
	
}
