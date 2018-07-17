package rebue.rna.svc;

import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.ro.VerifyRealNameApplyRo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface RnaVerifyRealNameSvc extends MybatisBaseSvc<RnaVerifyMo, java.lang.Long>{
	
	/**
	 * 增加实名认证申请记录
	 */
	
	VerifyRealNameApplyRo addVerifyRealNameApply(RnaVerifyMo mo);
	
	
}
