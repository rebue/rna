 package rebue.rna.svc.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.rna.dic.VerifyRealNameApplyDic;
import rebue.rna.mapper.RnaRealnameMapper;
import rebue.rna.mo.RnaRealnameMo;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.ro.VerifyRealNameApplyRo;
import rebue.rna.svc.RnaRealnameSvc;
import rebue.robotech.svc.impl.MybatisBaseSvcImpl;

/**
 * 认证成功用户信息表
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
public class RnaRealnameSvcImpl extends MybatisBaseSvcImpl<RnaRealnameMo, java.lang.Long, RnaRealnameMapper> implements RnaRealnameSvc {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(RnaRealnameMo mo) {
        _log.info("添加认证成功用户信息表");
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    private static final Logger _log = LoggerFactory.getLogger(RnaRealnameSvcImpl.class);


}
