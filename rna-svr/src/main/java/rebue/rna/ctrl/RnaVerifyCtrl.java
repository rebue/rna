package rebue.rna.ctrl;

import com.github.pagehelper.PageInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.svc.RnaVerifySvc;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;

/**
 * 用户实名认证审核
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
public class RnaVerifyCtrl {
    private static final Logger _log = LoggerFactory.getLogger(RnaVerifyCtrl.class);
    /**
     * 有唯一约束的字段名称
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String _uniqueFilesName = "某字段内容";
    
    @Resource
    private RnaVerifySvc svc;

    /**
     * 添加用户实名认证审核
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/rna/verify")
    Ro add(@RequestBody RnaVerifyMo mo) throws Exception {
        _log.info("add RnaVerifyMo: {}", mo);
        Ro ro = new Ro();
        try {
            int result = svc.add(mo);
            if (result == 1) {
                String msg = "添加成功";
                _log.info("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.SUCCESS);
                return ro;
            } else {
                String msg = "添加失败";
                _log.error("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.FAIL);
                return ro;
            }
        } catch (DuplicateKeyException e) {
            String msg = "添加失败，" + _uniqueFilesName + "已存在，不允许出现重复";
            _log.error("{}: mo-{}", msg, mo);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        } catch (RuntimeException e) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String msg = "添加失败，出现运行时异常(" + sdf.format(new Date()) + ")";
            _log.error(msg + ": mo=" + mo, e);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 删除用户实名认证审核
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/rna/verify")
    Ro del(@RequestParam("id") java.lang.Long id) {
        _log.info("del RnaVerifyMo by id: {}", id);
        int result = svc.del(id);
        Ro ro = new Ro();
        if (result == 1) {
            String msg = "删除成功";
            _log.info("{}: id-{}", msg, id);
            ro.setMsg(msg);
            ro.setResult(ResultDic.SUCCESS);
            return ro;
        } else {
            String msg = "删除失败，找不到该记录";
            _log.error("{}: id-{}", msg, id);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 查询用户实名认证审核
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/rna/verify")
    PageInfo<RnaVerifyMo> list(RnaVerifyMo mo, @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 5;
        _log.info("list RnaVerifyMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            String msg = "pageSize不能大于50";
            _log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        PageInfo<RnaVerifyMo> result = svc.list(mo, pageNum, pageSize);
        _log.info("result: " + result);
        return result;
    }



//    /**
//     *  查询实名认证信息
//     */
//    @GetMapping("/rna/realname")
//    PageInfo<RnaVerifyMo> list(RnaVerifyTo to, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
//        _log.info("list OrdOrderMo:" + to + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
//        if (pageSize > 50) {
//            String msg = "pageSize不能大于50";
//            _log.error(msg);
//            throw new IllegalArgumentException(msg);
//        }
//        PageInfo<RnaVerifyMo> result = svc.selectVerifyList(to, pageNum, pageSize);
//        _log.info("result: " + result);
//        return result;
//    }



    /**
     *  根据用户id获取用户实名认证申请信息
     *  @return
     */
    @GetMapping("/rna/getbyuserid")
    RnaVerifyMo getByUserId(@RequestParam("userId") java.lang.String userId) {
        _log.info(" 请求的userId: {}", userId);
        RnaVerifyMo result = svc.getByUserId(userId);
        _log.info("返回的用户实名 : {}", result);
        return result;
    }

    // 根据条件查询用户是否已申请实名认证
    @GetMapping("/rna/rnaverify/exist")
    Boolean exist(RnaVerifyMo mo) {
        _log.info("根据条件查询用户是否已实名认证的参数为：{}", mo);
        return svc.existSelective(mo);
    }
}
