package ccnu.service.Impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ccnu.model.TableTb;
import ccnu.service.TableService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TableServiceImplTest {
	@Autowired
	TableService tableService;
	
	@Test
	public void testSelectByPrimaryKey() {
		TableTb table = tableService.selectByPrimaryKey(1);
		System.out.println(table);
	}
	
	@Test
	public void testInsertIntoTable() {
		tableService.insertIntoTable("girls_tb");
	}

}
