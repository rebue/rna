package rebue.rna.svc.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.rna.mapper.RnaVerifyMapper;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.svc.RnaVerifySvc;
import rebue.rna.to.RnaVerifyTo;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 用户实名认证审核
 *
 * 在单独使用不带任何参数的 @Transactional 注释时，
 * propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED，
 * 而且事务不会针对受控异常（checked exception）回滚。
 *
 * 注意：
 * 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Service
public class RnaVerifySvcImpl extends MybatisBaseSvcImpl<RnaVerifyMo, java.lang.Long, RnaVerifyMapper> implements RnaVerifySvc {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(RnaVerifyMo mo) {
        _log.info("添加用户实名认证审核");
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private static final Logger _log = LoggerFactory.getLogger(RnaVerifySvcImpl.class);

    /**
     *  分页查询实名认证用户信息
     */
    @Override
    public PageInfo<RnaVerifyMo> selectVerifyList(RnaVerifyTo to, int pageNum, int pageSize) {
        _log.info("selectVerifyList: ro-{}; pageNum-{}; pageSize-{}", to, pageNum, pageSize);
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> _mapper.selectVerifyList(to));
    }

    /**
     *  根据用户id获取用户实名认证状态
     */
    @Override
    public RnaVerifyMo getByUserId(java.lang.String userId) {
        List<RnaVerifyMo> user = _mapper.getByUserId(userId);
        if (user == null) {
            return null;
        } else {
            for (RnaVerifyMo rnaVerifyMo : user) {
                if (rnaVerifyMo.getApplyState() == 2) {
                    return rnaVerifyMo;
                }
            }
            for (RnaVerifyMo rnaVerifyMo : user) {
                if (rnaVerifyMo.getApplyState() == 1) {
                    return rnaVerifyMo;
                }
            }
            for (RnaVerifyMo rnaVerifyMo : user) {
                if (rnaVerifyMo.getApplyState() == 3) {
                    return rnaVerifyMo;
                }
            }
        }
        return null;
    }
}
