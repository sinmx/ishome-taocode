package com.mcookies.qxy.common.UTeacher;

import java.util.List;

import org.isotope.jfp.framework.beans.common.FrameworkDataBean;
import org.isotope.jfp.framework.beans.page.PageVOSupport;
import org.isotope.jfp.framework.support.IDatabaseSupport;

/** 教师表 */
public interface UTeacherDao extends IDatabaseSupport {
	List<? extends FrameworkDataBean> doSelectPageTeacherOnLabel(PageVOSupport formParamPageModel);
}
