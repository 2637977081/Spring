�������������󣬰�����������һ���������ǣ����������ǵ������������ڴӴ��������١�
Spring ����ʹ������ע�루DI�����������һ��Ӧ�ó�����������Щ���󱻳�Ϊ Spring Beans

1���������������
	1>ͨ����ȡbeans.xml�ļ�����ȡ���ɹ��� bean
	
	2>��ȡbeans.xml��ע��ġ�Ŀ�����
	
	3>����beans.xml�Ѿ��ԡ�Ŀ����󡿵Ĳ������Խ��и�ֵ����������ֱ�ӻ�ȡ�ø�ֵ
	
2��beans.xml �ļ�
	һ��bean��Ӧһ������id��Ψһ��־��class����İ�·��
		property��Ӧ���ԣ�name����������value������ֵ
	<bean id="" class=""> 
		<property name="" value=""/>
	</bean>
	
3��beans.xml����
	beans.xml
	<!-- ����bean -->
   	<bean id="..." class="...">
   		<property name="..." value="..."/>
   	</bean>
   
   	<!-- �ӳٳ�ʼ�� -->
   	<bean id="..." class="..." lazy-init="true">
    	  
   	</bean>

   	<!-- ��ʼ������ -->
   	<bean id="..." class="..." init-method="...">
    	  
   	</bean>

   <!-- ���ٷ��� -->
   <bean id="..." class="..." destroy-method="...">
      
   </bean>
   
4����������
	init-method -> method -> destroy-method
   