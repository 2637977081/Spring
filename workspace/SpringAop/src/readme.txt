����AOP����ʱ������ѡ��ʽ��xml���ú�Annotation����

1��xml����
          ��xml�����ļ���Ҫ���
	<aop:config>
   		<!-- �������� -->
   		<aop:aspect id="log" ref="logBean">
   			<!-- �������ӵ�,ɨ�� com.spring.Aop.demo ������������к��� ������id-->
   			<aop:pointcut expression="execution(* com.spring.Aop.demoXML.*.*(..))" id="point" />
   			
   			<!-- ����֮ǰִ�к��� before-->
   			<aop:before method="before" pointcut-ref="point"/>
   			
   			<!-- ֮�� -->
   			<aop:after method="after" pointcut-ref="point"/>
   			<!-- 
   				��Ŀ�귽�����֮��,��ǿ����(������Ŀ�귵��ֵ)
   				returning="retVal"���������ڷ���afterReturning()�ж�����Ϊresult���β�  
   			-->
   			<aop:after-returning method="afterReturning" pointcut-ref="point"  returning="result"/>
   			
   		</aop:aspect>
   	</aop:config>
   	
2��