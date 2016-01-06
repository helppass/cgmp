package icity.cgmp.server;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 启动类.
 * <p>
 * Copyright: Copyright (c) 2013-1-4 下午3:16:43
 * <p>
 * Company: 北京宽连十方数字技术有限公司
 * <p>
 * 
 * @author chengfan@c-platform.com
 * @version 1.0.0
 */
public class MainEntryApp {

	/** LOG4J_RELOAD_DELAY */
	private static final long LOG4J_RELOAD_DELAY = 1000 * 5;

	/**
	 * main函数.
	 * 
	 * @param args
	 *            启动参数
	 * @throws Exception
	 *             Exception
	 */
	public static void main(String... args) throws Throwable {
		Logger logger = null;
		try {
			// 初始化Logger
			DOMConfigurator.configureAndWatch("./config/log4j.xml", LOG4J_RELOAD_DELAY);
			logger = Logger.getLogger(MainEntryApp.class);

			// 初始化ApplicationContext
			String path = "classpath:/app-*.xml";
			@SuppressWarnings("resource")
			AbstractApplicationContext appContext = new GenericXmlApplicationContext(path);
			appContext.registerShutdownHook();
			{
				org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean a;
			}
			// 启动成功
			logger.info("程序启动成功...");
		}
		catch (Throwable ex) {
			// CHECKSTYLE:OFF
			if (logger != null) {
				logger.error("程序启动失败..." + ex, ex);
				LogManager.shutdown();
			} else {
				System.out.println("程序启动失败");
				ex.printStackTrace(System.out);
			}
			System.exit(-1);
			// CHECKSTYLE:ON
			throw ex;
		}
	}

	/** 构造函数（隐藏） */
	private MainEntryApp() {
	}
}
