package ccnu.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ccnu.mapping.UserTMapper;



public class TestSqlSession {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "ccnu/test/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  // do work
			UserTMapper mapper = session.getMapper(UserTMapper.class);
		} finally {
		  session.close();
		}
	}

}
