package ccnu.mapping;

import ccnu.model.TableTb;

public interface TableTbMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TableTb record);

    int insertSelective(TableTb record);
    
    //通过id选择table记录
    TableTb selectByPrimaryKey(Integer id);
    
    //通过table_name插入记录
    int insertIntoTable(String tableName);

    int updateByPrimaryKeySelective(TableTb record);

    int updateByPrimaryKey(TableTb record);
}