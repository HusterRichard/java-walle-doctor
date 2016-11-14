package com.huawei.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 * �����������̿�<br>
 * @author zhangxincheng
 *
 */
@Component
public class SicknessProcess {
	
	@Id
	private String id;

	// #region Fields
	
	// �������� 
	private String sickness;
	
	// �������ڣ�����"everyday/week/hour"
	private String processCycle;
	
	// ��������
	private String processDetail;
	
	// Ӧ������
	private String emergencyDetail;
	
	// #endregion
	
	// #region getter/setter

	public String getSickness() {
		return sickness;
	}

	public void setSickness(String sickness) {
		this.sickness = sickness;
	}

	public String getProcessCycle() {
		return processCycle;
	}

	public void setProcessCycle(String processCycle) {
		this.processCycle = processCycle;
	}

	public String getProcessDetail() {
		return processDetail;
	}

	public void setProcessDetail(String processDetail) {
		this.processDetail = processDetail;
	}

	public String getEmergencyDetail() {
		return emergencyDetail;
	}

	public void setEmergencyDetail(String emergencyDetail) {
		this.emergencyDetail = emergencyDetail;
	}
	
	// #endregion
	
	// #region Constructor
	
	public SicknessProcess(){
	}
	
	public SicknessProcess(String sickness){
		this.sickness = sickness;
	}
	
	// #endregion
	
}
