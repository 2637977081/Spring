1、配置beans.xml配置文件
      需要jar包
       spring-jdbc-release.jar
       mysql-connect-java.jar
   <!-- 初始化数据库配置文件 -->
   <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
      <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
      <property name="url" value="jdbc:mysql://localhost:3306/test"/>
      <property name="username" value="root"/>
      <property name="password" value=""/>
   </bean>
	
	<!-- 注册jdbc核心实现类 -->
   <bean id="userJdbcTemplate" class="com.spring.jdbc.demo.UserJdbcTemplate" >
   		<!-- 注入数据库配置文件 不然在实现时报空指针-->
   		<property name="dataSource"  ref="dataSource" /> 
   </bean>
   
2、核心实现类
	private JdbcTemplate jdbcTemplate;
	
	private DataSource dataSource;
	//JdbcTemplate 需要提供jdbc配置数据，否则使用时空指针异常
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
3、   	1>JdbcTemplate操作数据库分两种:更新数据库(insert,update,delete)和查询数据库(select)
		
	2>sql语句,可以使用"id = ?" 和  "id = "+ id 两种
		"id = ?"	在jdbcTemplate执行操作时,需要另赋值;
		"id = "+ id 只需要执行SQL便可
   