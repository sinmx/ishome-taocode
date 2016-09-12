package org.isotope.jfp.mpc.weixin.service;

import javax.annotation.Resource;

import org.isotope.jfp.common.weixin.WeixinService;
import org.isotope.jfp.framework.constants.ISFrameworkConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 微信数据管理服务<br>
 * 企业信息
 * @author spookfcy
 * @since 3.3.1
 * @version 3.3.1.20160825
 * 
 */
public class MyWeixinCompanyBusiness implements ISFrameworkConstants {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	WeixinService WeixinService_;
	@Resource
	WeixinService TXWeixinService_;

	public Object companyIdSync(String companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object companyIdDelete(String companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object companyIdAdd(String companyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
