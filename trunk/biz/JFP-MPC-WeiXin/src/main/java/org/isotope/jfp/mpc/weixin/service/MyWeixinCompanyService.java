package org.isotope.jfp.mpc.weixin.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.isotope.jfp.common.weixin.WeiXinCompanyDBO;
import org.isotope.jfp.common.weixin.WeixinService;
import org.isotope.jfp.framework.constants.ISFrameworkConstants;
import org.isotope.jfp.mpc.weixin.beans.recever.WeiXinCompanyTagReceverBean;
import org.isotope.jfp.mpc.weixin.beans.sender.WeiXinCompanySenderBean;
import org.isotope.jfp.mpc.weixin.token.WeiXinCompanyTokenService;
import org.isotope.jfp.mpc.weixin.token.beans.WeiXinCompanyTokenBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 微信数据管理服务<br>
 * 企业信息(接收者)
 * 
 * @author spookfcy
 * @since 3.3.1
 * @version 3.3.1.20160825
 * 
 */
@Service("MyWeixinCompanyService")
public class MyWeixinCompanyService implements ISFrameworkConstants {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	WeixinService WeixinService_;
	@Resource
	WeiXinCompanyTokenService WeiXinCompanyTokenService_;
	
	public WeiXinCompanyTokenBean loadCompanyToken(String companyId) {
		return WeiXinCompanyTokenService_.loadCompanyToken(loadWeiXinCompanySenderBean(companyId));
	}
	
	/**
	 * 同步数据持久化内容
	 */
	public WeiXinCompanySenderBean loadWeiXinCompanySenderBean(String companyId) {
		HashMap<String, String> comyany = new HashMap<String, String> ();
		comyany.put("companyId", companyId);
		List<WeiXinCompanyDBO> comanys = WeixinService_.loadCompany(comyany);
		if(comanys!=null && comanys.size()==1){
			WeiXinCompanyDBO comanyDBO = comanys.get(0);
			WeiXinCompanySenderBean sender = new WeiXinCompanySenderBean();
			sender.setCompanyId(comanyDBO.getCompanyId());
			sender.setAppId(comanyDBO.getAppId());
			sender.setAppSecret(comanyDBO.getAppSecret());
			return sender;
		}
			
		return null;
	}

	public WeiXinCompanyTagReceverBean loadWeiXinCompanyTagReceverBean(String companyId) {
		HashMap<String, String> comyany = new HashMap<String, String> ();
		comyany.put("companyId", companyId);
		List<WeiXinCompanyDBO> comanys = WeixinService_.loadCompany(comyany);
		if(comanys!=null && comanys.size()==1){
			WeiXinCompanyDBO comanyDBO = comanys.get(0);
			WeiXinCompanyTagReceverBean recever = new WeiXinCompanyTagReceverBean();
			recever.setCompanyId(comanyDBO.getCompanyId());
			recever.setWxId(comanyDBO.getWxId());

			return recever;
		}
			
		return null;
	}

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

	public Object companyIdSync() {
		// TODO Auto-generated method stub
		return null;
	}

}
