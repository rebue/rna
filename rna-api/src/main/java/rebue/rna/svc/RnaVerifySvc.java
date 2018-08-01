package rebue.rna.svc;
import com.github.pagehelper.PageInfo;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.to.RnaVerifyTo;
import rebue.robotech.svc.MybatisBaseSvc;

public interface RnaVerifySvc extends MybatisBaseSvc<RnaVerifyMo, java.lang.Long>{
	
	
	/**
	 * 分页查询，没有使用封装好的是因为请求参数类型和返回的不一样
	 * @param record
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<RnaVerifyMo> selectVerifyList(RnaVerifyTo record, int pageNum,
			int pageSize);
	
	/**
	 * 根据用户id去获取用户实名认证状态
	 * @param userId
	 * @return
	 */
	int  getByUserId(String userId);

}
