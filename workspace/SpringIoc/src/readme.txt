容器将创建对象，把它们连接在一起，配置它们，并管理他们的整个生命周期从创建到销毁。
Spring 容器使用依赖注入（DI）来管理组成一个应用程序的组件。这些对象被称为 Spring Beans

1、主程序启动入口
	1>通过读取beans.xml文件，获取生成工厂 bean
	
	2>获取beans.xml中注册的【目标对象】
	
	3>由于beans.xml已经对【目标对象】的部分属性进行赋值操作，可以直接获取该赋值
	
2、beans.xml 文件
	一个bean对应一个对象，id是唯一标志，class是类的包路径
		property对应属性，name是属性名，value是属性值
	<bean id="" class=""> 
		<property name="" value=""/>
	</bean>
	
3、beans.xml配置
	beans.xml
	<!-- 基础bean -->
   	<bean id="..." class="...">
   		<property name="..." value="..."/>
   	</bean>
   
   	<!-- 延迟初始化 -->
   	<bean id="..." class="..." lazy-init="true">
    	  
   	</bean>

   	<!-- 初始化方法 -->
   	<bean id="..." class="..." init-method="...">
    	  
   	</bean>

   <!-- 销毁方法 -->
   <bean id="..." class="..." destroy-method="...">
      
   </bean>
   
4、生命周期
	init-method -> method -> destroy-method
   