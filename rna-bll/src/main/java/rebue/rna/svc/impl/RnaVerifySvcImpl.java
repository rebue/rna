package rebue.rna.svc.impl;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import rebue.rna.mapper.RnaVerifyMapper;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.svc.RnaVerifySvc;
import rebue.rna.to.RnaVerifyTo;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class RnaVerifySvcImpl extends MybatisBaseSvcImpl<RnaVerifyMo, java.lang.Long, RnaVerifyMapper>
implements RnaVerifySvc  {

		
	private final static Logger _log = LoggerFactory.getLogger(RnaVerifySvcImpl.class);
	/**
	 * 分页查询实名认证用户信息
	 */
	@Override
	public PageInfo<RnaVerifyMo> selectVerifyList(RnaVerifyTo to, int pageNum, int pageSize) {
		_log.info("selectVerifyList: ro-{}; pageNum-{}; pageSize-{}", to, pageNum, pageSize);
		return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> _mapper.selectVerifyList(to));
	}
	/**
	 * 根据用户id获取用户实名认证状态
	 */
	@Override
	public RnaVerifyMo getByUserId(java.lang.String userId) {
		List<RnaVerifyMo> user =_mapper.getByUserId(userId);
		if(user==null) {
			return null;
		}else {
			for (RnaVerifyMo rnaVerifyMo : user) {
				if(rnaVerifyMo.getApplyState()==1) {
					return rnaVerifyMo;
				}
			}
			for (RnaVerifyMo rnaVerifyMo : user) {
				if(rnaVerifyMo.getApplyState()==2) {
					return rnaVerifyMo;
				}
			}
			for (RnaVerifyMo rnaVerifyMo : user) {
				if(rnaVerifyMo.getApplyState()==3) {
					return rnaVerifyMo;
				}
			}
		}
		return null;
	}

}
