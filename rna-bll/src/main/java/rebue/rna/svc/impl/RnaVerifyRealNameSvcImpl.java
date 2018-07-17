package rebue.rna.svc.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import rebue.rna.dic.VerifyRealNameApplyDic;
import rebue.rna.mapper.RnaVerifyMapper;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.ro.VerifyRealNameApplyRo;
import rebue.rna.svc.RnaVerifyRealNameSvc;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class RnaVerifyRealNameSvcImpl extends MybatisBaseSvcImpl<RnaVerifyMo, java.lang.Long, RnaVerifyMapper>
		implements RnaVerifyRealNameSvc {

	private final static Logger _log = LoggerFactory.getLogger(RnaVerifyRealNameSvcImpl.class);
	
	/**
	 * 增加用户实名认证申请记录
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VerifyRealNameApplyRo addVerifyRealNameApply(RnaVerifyMo mo) {
		_log.info("用户实名认证申请参数为：{}"+mo);
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		VerifyRealNameApplyRo ro = new VerifyRealNameApplyRo();
		int i = _mapper.insert(mo);
		if(i==1) {
			_log.info("添加实名认证申请成功：{}");
			ro.setResult(VerifyRealNameApplyDic.SUCCESS);
			ro.setMsg("添加实名认证申请成功");
		}else {
			_log.error("添加实名认证申请失败");
			ro.setResult(VerifyRealNameApplyDic.ERROR);
			ro.setMsg("添加实名认证申请失败");
		}
		return ro;
	}

}
