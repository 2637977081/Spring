spring 事务 主要是指jdbc事务

当一组事务执行完时,需要提交commit,才能在数据库中完成执行,
当一组事务中的某个错误时候,需要撤销回滚rollback()

当SQL执行报错时候,调用rollback函数,commit操作取消
当没有commit操作时候,数据库数据不会发生改变,rollback操作无效

1、JdbcTemplate.query/update ->  
2、PlatformTransactionManager.commit ->  
3、PlatformTransactionManager.rollback

1执行成功后,JdbcTemplate内数据对象发生改变,但数据库数据未发生改变
2执行成功后,JdbcTemplate内数据提交到数据库,数据库数据发生改变
3执行成功后,数据数据还原到commit之前