package rebue.rna.svc;

import com.github.pagehelper.PageInfo;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.to.RnaVerifyTo;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 用户实名认证审核
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface RnaVerifySvc extends MybatisBaseSvc<RnaVerifyMo, java.lang.Long> {

    /**
     *  分页查询，没有使用封装好的是因为请求参数类型和返回的不一样
     *  @param record
     *  @param pageNum
     *  @param pageSize
     *  @return
     */
    PageInfo<RnaVerifyMo> selectVerifyList(RnaVerifyTo record, int pageNum, int pageSize);

    /**
     *  根据用户id去获取用户实名认证状态
     *  @param userId
     *  @return
     */
    RnaVerifyMo getByUserId(String userId);
}
