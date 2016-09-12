package ccnu.service.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ccnu.model.UserT;
import ccnu.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceImplTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testInsert() {
		UserT userInfo = new UserT();
		userInfo.setUserName("xiaoming");
		userInfo.setAge(22);
		userInfo.setPassword("12345");
		int result = userService.insert(userInfo);
		System.out.println(result);
	}

	@Test
	public void testSelectByPrimaryKey() {
		@SuppressWarnings("unused")
		UserT userInfo = new UserT();
		UserT user=userService.selectByPrimaryKey(1);
		System.out.println(user);
	}
	
	@Test
	public void testFindByIds() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);list.add(4);
		System.out.println(userService.findByIds(list));
	}
	
	@Test
	public void findByIdsAndNames() {
		List<Integer> idList = Arrays.asList(1,3,4);
		List<Integer> namelist = Arrays.asList(22,23);
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("idList", idList);
        params.put("agelist", namelist);
		System.out.println(userService.findByIdsAndAges(params));
	}
	
	
	@Test
	public void testCreatTableAndInsert() {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("a", "safd");
        params.put("b", "dsjaf");
        params.put("c", "123456");
        params.put("d", "风景的撒娇房顶上经费等快速拉进房间空间上");
         
        String[] keys = new String[params.size()];
        Set<String> sset = params.keySet();
        int i = 0;
        for (String os : sset) {
            keys[i++] = os;
        }

        Map map = new HashMap<String, Object>();
        map.put("tablename", "pay_o_tb");
        map.put("keys", keys);
        map.put("params", params);

        userService.creatTableAndInsert(map);
	}

}
