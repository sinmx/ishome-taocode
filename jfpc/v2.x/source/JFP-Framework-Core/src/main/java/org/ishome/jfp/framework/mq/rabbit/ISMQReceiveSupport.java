package org.ishome.jfp.framework.mq.rabbit;

/**
 * MQ接受消息处理
 * @author Spook
 * @version 0.1
 * @since 0.1.0 2014/2/8
 */
public interface ISMQReceiveSupport {

	/**
	 * 接受信息
	 * @param message
	 */
	public void handleMessage(String message);
}
