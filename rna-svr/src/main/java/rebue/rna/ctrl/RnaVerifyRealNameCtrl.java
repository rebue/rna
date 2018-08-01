package rebue.rna.ctrl;
import java.util.Date;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.ro.VerifyRealNameApplyRo;
import rebue.rna.svc.RnaVerifyRealNameSvc;
@RestController
public class RnaVerifyRealNameCtrl {

	private final static Logger _log = LoggerFactory.getLogger(RnaVerifyRealNameCtrl.class);

	@Resource
	private RnaVerifyRealNameSvc svc;

	/**
	 * 添加用户实名认证申请记录
	 * 
	 * @param mo
	 * @return
	 */
	@PostMapping("/verifyRealName/apply")
	VerifyRealNameApplyRo verifyRealNameApply(RnaVerifyMo mo) {
		// 设置状态默认值
		mo.setApplyState((byte) 2);
		//设置当前时间为申请时间
		mo.setApplyTime(new Date());
		_log.info("实名认证申请的参数为：{}" + mo);
		VerifyRealNameApplyRo ro = new VerifyRealNameApplyRo();
		ro = svc.addVerifyRealNameApply(mo);
		return ro;
	}



}
