package com.huawei._1_model.body_pro;

import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * ���������<br>
 * @author zhangxincheng
 *
 */
public class BodyProblem {
	
	@Id
	private String id;
	
	// #region Fields
	
	// �����ؼ����б�
	private List<String> lstKeyWord;
	
	// �����
	private String answer;
	
	// #endregion
	
	// #region getter/setter

	public List<String> getLstKeyWord() {
		return lstKeyWord;
	}

	public void setLstKeyWord(List<String> lstKeyWord) {
		this.lstKeyWord = lstKeyWord;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	// #endregion
	
	// #region Constructor
	
	public BodyProblem(){
		
	}
	
	// #endregion
	
}

