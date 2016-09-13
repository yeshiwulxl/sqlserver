package ccnu.model;

public class TableTb {
    private Integer id;

    private String tableName;

    @Override
	public String toString() {
		return "TableTb [id=" + id + ", tableName=" + tableName + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }
}