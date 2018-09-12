配置AOP切面时有两种选择方式，xml配置和Annotation配置

1、xml配置
          中xml配置文件需要添加
	<aop:config>
   		<!-- 定义切面 -->
   		<aop:aspect id="log" ref="logBean">
   			<!-- 定义连接点,扫描 com.spring.Aop.demo 下所有类的所有函数 并声明id-->
   			<aop:pointcut expression="execution(* com.spring.Aop.demoXML.*.*(..))" id="point" />
   			
   			<!-- 调用之前执行函数 before-->
   			<aop:before method="before" pointcut-ref="point"/>
   			
   			<!-- 之后 -->
   			<aop:after method="after" pointcut-ref="point"/>
   			<!-- 
   				在目标方法完成之后,增强处理(会限制目标返回值)
   				returning="retVal"表明允许在方法afterReturning()中定义名为result的形参  
   			-->
   			<aop:after-returning method="afterReturning" pointcut-ref="point"  returning="result"/>
   			
   		</aop:aspect>
   	</aop:config>
   	
2、