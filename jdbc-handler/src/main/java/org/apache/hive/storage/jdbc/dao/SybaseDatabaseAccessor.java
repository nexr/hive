package org.apache.hive.storage.jdbc.dao;

public class SybaseDatabaseAccessor extends GenericJdbcDatabaseAccessor {

    @Override
    protected String addLimitAndOffsetToQuery(String sql, int limit, int offset) {
        if (offset == 0) {
            return addLimitToQuery(sql, limit);
        } else {
            return sql + " LIMIT " + limit + " OFFSET " + offset;
        }
    }

    @Override
    protected String addLimitToQuery(String sql, int limit) {
        return sql + " LIMIT " + limit;
    }
}
