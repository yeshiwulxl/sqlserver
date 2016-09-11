package ccnu.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import ccnu.model.UserT;

public interface UserService {
	UserT selectByPrimaryKey(int id);
	
	int insert(UserT userInfo);
	
	List<UserT> findByIds(@Param("ids")List<Integer> ids);
	
	List<UserT> findByIdsArray(int[] ids);
	
	List<UserT> findByIdsAndAges(Map<String,Object> params); 
}
