spring ���� ��Ҫ��ָjdbc����

��һ������ִ����ʱ,��Ҫ�ύcommit,���������ݿ������ִ��,
��һ�������е�ĳ������ʱ��,��Ҫ�����ع�rollback()

��SQLִ�б���ʱ��,����rollback����,commit����ȡ��
��û��commit����ʱ��,���ݿ����ݲ��ᷢ���ı�,rollback������Ч

1��JdbcTemplate.query/update ->  
2��PlatformTransactionManager.commit ->  
3��PlatformTransactionManager.rollback

1ִ�гɹ���,JdbcTemplate�����ݶ������ı�,�����ݿ�����δ�����ı�
2ִ�гɹ���,JdbcTemplate�������ύ�����ݿ�,���ݿ����ݷ����ı�
3ִ�гɹ���,�������ݻ�ԭ��commit֮ǰ