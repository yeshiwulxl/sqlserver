package ccnu.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccnu.mapping.UserTMapper;
import ccnu.model.UserT;
import ccnu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	public UserTMapper userInfoMapper;
	
	public UserT selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return userInfoMapper.selectByPrimaryKey(id);
	}

	public int insert(UserT userInfo) {
		// TODO Auto-generated method stub
		int result = userInfoMapper.insert(userInfo);
		
		System.out.println(result);
		return result;
	}

	public List<UserT> findByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return userInfoMapper.findByIds(ids);
	}

	public List<UserT> findByIdsArray(int[] ids) {
		// TODO Auto-generated method stub
		return userInfoMapper.findByIdsArray(ids);
	}
	public List<UserT> findByIdsAndAges(Map<String,Object> params) {
		// TODO Auto-generated method stub
		return userInfoMapper.findByIdsAndAges(params);
	}
}
