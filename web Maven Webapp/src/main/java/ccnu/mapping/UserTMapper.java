package ccnu.mapping;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import ccnu.model.UserT;

public interface UserTMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);

    UserT selectByPrimaryKey(Integer id);
    

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
    
    List<UserT> findByIds(@Param("ids") List<Integer> ids);
    
    List<UserT> findByIdsArray(int[] ids); //可以用@Param("ids")指定参数
    
    List<UserT> findByIdsAndAges(Map<String,Object> params); 
}