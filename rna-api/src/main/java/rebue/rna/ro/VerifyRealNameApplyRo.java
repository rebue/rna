package rebue.rna.ro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import rebue.rna.dic.VerifyRealNameApplyDic;

/**
 * 实名认证申请返回类
 * @author jjl
 *
 */
@JsonInclude(Include.NON_NULL)
public class VerifyRealNameApplyRo {
	/**实名认证申请返回值字典**/
	private VerifyRealNameApplyDic result;
	
	/**实名认证申请返回值信息**/
	private String msg;

	public VerifyRealNameApplyDic getResult() {
		return result;
	}

	public void setResult(VerifyRealNameApplyDic result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "VerifyRealNameApplyRo [result=" + result + ", msg=" + msg + "]";
	}
	
}
