1������beans.xml�����ļ�
      ��Ҫjar��
       spring-jdbc-release.jar
       mysql-connect-java.jar
   <!-- ��ʼ�����ݿ������ļ� -->
   <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
      <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
      <property name="url" value="jdbc:mysql://localhost:3306/test"/>
      <property name="username" value="root"/>
      <property name="password" value=""/>
   </bean>
	
	<!-- ע��jdbc����ʵ���� -->
   <bean id="userJdbcTemplate" class="com.spring.jdbc.demo.UserJdbcTemplate" >
   		<!-- ע�����ݿ������ļ� ��Ȼ��ʵ��ʱ����ָ��-->
   		<property name="dataSource"  ref="dataSource" /> 
   </bean>
   
2������ʵ����
	private JdbcTemplate jdbcTemplate;
	
	private DataSource dataSource;
	//JdbcTemplate ��Ҫ�ṩjdbc�������ݣ�����ʹ��ʱ��ָ���쳣
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
3��   	1>JdbcTemplate�������ݿ������:�������ݿ�(insert,update,delete)�Ͳ�ѯ���ݿ�(select)
		
	2>sql���,����ʹ��"id = ?" ��  "id = "+ id ����
		"id = ?"	��jdbcTemplateִ�в���ʱ,��Ҫ��ֵ;
		"id = "+ id ֻ��Ҫִ��SQL���
   