spring�¼�����,

class A implements ApplicationListener<Context???Event>{
	public void onApplicationEvent(){
		xxx
	}
}

ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
1��ContextStartedEvent 		context.start()		����ʱ���¼�������
2��ContextRefreshedEvent 	context.refresh()	��ʼ��������ˢ��ʱ�¼�������
3��ContextStoppedEvent		context.stop()		ֹͣʱ�¼�������
4��ContextClosedEvent 		context.close()		�ر�ʱ�¼�������,�����ٽ�����������
5��RequestHandledEvent							web�˷���http����ʱ����
