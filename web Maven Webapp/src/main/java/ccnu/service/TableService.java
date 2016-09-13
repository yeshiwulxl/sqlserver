package ccnu.service;

import ccnu.model.TableTb;

public interface TableService {
	TableTb selectByPrimaryKey(Integer id);
	
	int insertIntoTable(String tableName);
}
