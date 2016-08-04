package com.mcookies.qxy.common.SDuty;

import javax.inject.Named;

import org.isotope.jfp.framework.support.MyDataBaseObjectSupport;

@Named
/** 岗位设置表 */
public class SDutyDBO extends MyDataBaseObjectSupport {
	/**
	 * 岗位id
	 */
	private Long dutyId = null;

	/**
	 * 学校id
	 */
	private Long sid = null;

	/**
	 * 岗位名称
	 */
	private String dutyName = null;

	/**
	 * 是否启用
	 */
	private Integer isUse = null;

	/**
	 * 获取岗位id
	 *
	 * @return Duty_id 岗位id
	 */
	public Long getDutyId() {
		return this.dutyId;
	}

	/**
	 * 获取学校id
	 *
	 * @return Sid 学校id
	 */
	public Long getSid() {
		return this.sid;
	}

	/**
	 * 获取岗位名称
	 *
	 * @return Duty_name 岗位名称
	 */
	public String getDutyName() {
		return this.dutyName;
	}

	/**
	 * 获取是否启用
	 *
	 * @return Is_use 是否启用
	 */
	public Integer getIsUse() {
		return this.isUse;
	}

	/**
	 * 设置岗位id
	 *
	 * @param Duty_id
	 *            岗位id
	 */
	public void setDutyId(Long dutyid) {
		this.dutyId = dutyid;
	}

	/**
	 * 设置学校id
	 *
	 * @param Sid
	 *            学校id
	 */
	public void setSid(Long sid) {
		this.sid = sid;
	}

	/**
	 * 设置岗位名称
	 *
	 * @param Duty_name
	 *            岗位名称
	 */
	public void setDutyName(String dutyname) {
		this.dutyName = dutyname;
	}

	/**
	 * 设置是否启用
	 *
	 * @param Is_use
	 *            是否启用
	 */
	public void setIsUse(Integer isuse) {
		this.isUse = isuse;
	}

}
