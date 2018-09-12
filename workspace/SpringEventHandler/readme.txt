spring事件处理,

class A implements ApplicationListener<Context???Event>{
	public void onApplicationEvent(){
		xxx
	}
}

ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
1、ContextStartedEvent 		context.start()		启动时该事件被发布
2、ContextRefreshedEvent 	context.refresh()	初始化或重新刷新时事件被发布
3、ContextStoppedEvent		context.stop()		停止时事件被发布
4、ContextClosedEvent 		context.close()		关闭时事件被发布,不能再进行上述操作
5、RequestHandledEvent							web端发送http请求时调用
