package ccnu.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccnu.mapping.TableTbMapper;
import ccnu.model.TableTb;
import ccnu.service.TableService;

@Service("tableService")
public class TableServiceImpl implements TableService{
	@Autowired
	TableTbMapper tableTbMapper;
	
	public TableTb selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tableTbMapper.selectByPrimaryKey(id);
	}

	public int insertIntoTable(String tableName) {
		// TODO Auto-generated method stub
		return tableTbMapper.insertIntoTable(tableName);
	}

}
