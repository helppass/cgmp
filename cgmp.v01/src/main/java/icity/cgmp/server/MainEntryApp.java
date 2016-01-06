package icity.cgmp.server;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * ������.
 * <p>
 * Copyright: Copyright (c) 2013-1-4 ����3:16:43
 * <p>
 * Company: ��������ʮ�����ּ������޹�˾
 * <p>
 * 
 * @author chengfan@c-platform.com
 * @version 1.0.0
 */
public class MainEntryApp {

	/** LOG4J_RELOAD_DELAY */
	private static final long LOG4J_RELOAD_DELAY = 1000 * 5;

	/**
	 * main����.
	 * 
	 * @param args
	 *            ��������
	 * @throws Exception
	 *             Exception
	 */
	public static void main(String... args) throws Throwable {
		Logger logger = null;
		try {
			// ��ʼ��Logger
			DOMConfigurator.configureAndWatch("./config/log4j.xml", LOG4J_RELOAD_DELAY);
			logger = Logger.getLogger(MainEntryApp.class);

			// ��ʼ��ApplicationContext
			String path = "classpath:/app-*.xml";
			@SuppressWarnings("resource")
			AbstractApplicationContext appContext = new GenericXmlApplicationContext(path);
			appContext.registerShutdownHook();
			{
				org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean a;
			}
			// �����ɹ�
			logger.info("���������ɹ�...");
		}
		catch (Throwable ex) {
			// CHECKSTYLE:OFF
			if (logger != null) {
				logger.error("��������ʧ��..." + ex, ex);
				LogManager.shutdown();
			} else {
				System.out.println("��������ʧ��");
				ex.printStackTrace(System.out);
			}
			System.exit(-1);
			// CHECKSTYLE:ON
			throw ex;
		}
	}

	/** ���캯�������أ� */
	private MainEntryApp() {
	}
}
