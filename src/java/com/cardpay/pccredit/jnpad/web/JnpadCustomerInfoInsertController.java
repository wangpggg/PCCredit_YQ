package com.cardpay.pccredit.jnpad.web;


import java.util.Date;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cardpay.pccredit.common.IdCardValidate;
import com.cardpay.pccredit.customer.constant.CustomerInforConstant;
import com.cardpay.pccredit.customer.filter.CustomerInforFilter;
import com.cardpay.pccredit.customer.model.CustomerInfor;
import com.cardpay.pccredit.datapri.constant.DataPriConstants;
import com.cardpay.pccredit.ipad.util.JsonDateValueProcessor;
import com.cardpay.pccredit.jnpad.model.CustomerInfo;
import com.cardpay.pccredit.jnpad.model.CustomerInfoForm;
import com.cardpay.pccredit.jnpad.service.JnpadCustomerInfoInsertServ‎ice;
import com.cardpay.pccredit.jnpad.service.JnpadCustomerSelectService;
import com.cardpay.pccredit.riskControl.model.RiskCustomer;
import com.cardpay.pccredit.system.model.SystemUser;
import com.wicresoft.jrad.base.constant.JRadConstants;
import com.wicresoft.jrad.base.web.controller.BaseController;
import com.wicresoft.jrad.base.web.result.JRadReturnMap;
import com.wicresoft.jrad.base.web.security.LoginManager;
import com.wicresoft.jrad.modules.privilege.model.User;
import com.wicresoft.util.spring.Beans;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
/**
 * 
 * 新建客户
 * @author sealy
 *
 */
@Controller
public class JnpadCustomerInfoInsertController extends BaseController {
	
	@Autowired
	private JnpadCustomerInfoInsertServ‎ice JnpadCustomerInfoInsertServ‎ice;
	@Autowired
	private JnpadCustomerSelectService jnpadCustomerSelectService; 
	
	
	@ResponseBody
	@RequestMapping(value="/ipad/product/customerInsert.json" ,method = { RequestMethod.GET })
	public String customerInsert(@ModelAttribute CustomerInfoForm customerinfoForm ,HttpServletRequest request){
		
		customerinfoForm.setChineseName(request.getParameter("chineseName"));
		customerinfoForm.setCardType(request.getParameter("cardType"));
		customerinfoForm.setCardId(request.getParameter("cardId"));
		customerinfoForm.setSpmc(request.getParameter("spmc"));
		JRadReturnMap returnMap = new JRadReturnMap();
		if (returnMap.isSuccess()) {
			try {
				CustomerInforFilter filter = new CustomerInforFilter();
				filter.setCardId(customerinfoForm.getCardId());
				//身份证号码验证
				String msg = IdCardValidate.IDCardValidate(customerinfoForm.getCardId());
				if(msg !="" && msg != null){
					returnMap.put(JRadConstants.MESSAGE, msg);
					returnMap.put(JRadConstants.SUCCESS, false);
					
					JsonConfig jsonConfig = new JsonConfig();
					jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
					JSONObject json = JSONObject.fromObject(returnMap, jsonConfig);
					return json.toString();
				}
				CustomerInfo ls = jnpadCustomerSelectService.selectCustomerInfoByCardId(filter.getCardId());
				if(ls != null ){
					String message = "";
					String gId = ls.getUserId();
					if(gId==null){
						message = "保存失败，此客户已存在，请线下及时联系!";
					}else{
						message = "保存失败，此客户已挂在客户经理"+gId+"下!";
					}
					//查询是否为风险名单
//					List<RiskCustomer> riskCustomers = customerInforService.findRiskByCardId(customerinfoForm.getCardId());
//					if(riskCustomers.size()>0){
//						SystemUser user = customerInforService.getUseById(riskCustomers.get(0).getCreatedBy());
//						DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//						String dateString = format.format(riskCustomers.get(0).getCreatedTime());
//						message+="此客户于"+dateString+"被"+user.getDisplayName()+"拒绝，原因为"+riskCustomers.get(0).getRefuseReason();
//					}
//					returnMap.put(JRadConstants.MESSAGE, message);
//					returnMap.put(JRadConstants.SUCCESS, false);
//					
//					JsonConfig jsonConfig = new JsonConfig();
//					jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
//					JSONObject json = JSONObject.fromObject(returnMap, jsonConfig);
//					return json.toString();				
					}else{
					returnMap.put(JRadConstants.SUCCESS, true);

				
				CustomerInfo customerinfor = customerinfoForm.createModel(CustomerInfo.class);
//				User user = (User) Beans.get(LoginManager.class).getLoggedInUser(request);
				User user = new User();
				
				user.setId(request.getParameter("id"));
				customerinfor.setCreatedBy(user.getId());
				customerinfor.setUserId(user.getId());
				String id =  JnpadCustomerInfoInsertServ‎ice.customerInforInsert(customerinfor);
				returnMap.put(RECORD_ID, id);
				returnMap.addGlobalMessage(CREATE_SUCCESS);
					}
			}catch (Exception e) {
				returnMap.put(JRadConstants.MESSAGE, DataPriConstants.SYS_EXCEPTION_MSG);
				returnMap.put(JRadConstants.SUCCESS, false);
				JsonConfig jsonConfig = new JsonConfig();
				jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
				JSONObject json = JSONObject.fromObject(returnMap, jsonConfig);
				return json.toString();			}
		}else{
			returnMap.setSuccess(false);
			returnMap.addGlobalError(CustomerInforConstant.CREATEERROR);
		}
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
		JSONObject json = JSONObject.fromObject(returnMap, jsonConfig);
		return json.toString();

	}
	
	

}
