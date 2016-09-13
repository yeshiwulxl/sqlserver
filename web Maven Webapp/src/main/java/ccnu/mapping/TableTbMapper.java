package ccnu.mapping;

import ccnu.model.TableTb;

public interface TableTbMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TableTb record);

    int insertSelective(TableTb record);
    
    //ͨ��idѡ��table��¼
    TableTb selectByPrimaryKey(Integer id);
    
    //ͨ��table_name�����¼
    int insertIntoTable(String tableName);

    int updateByPrimaryKeySelective(TableTb record);

    int updateByPrimaryKey(TableTb record);
}