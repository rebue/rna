package rebue.rna.ctrl;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.ro.RnaVerifyRo;
import rebue.rna.svc.RnaVerifySvc;
import rebue.rna.to.RnaVerifyTo;

@RestController
public class RnaVerifyCtrl {

	private final static Logger _log = LoggerFactory.getLogger(RnaVerifyCtrl.class);

	@Resource
	private RnaVerifySvc svc;

	/**
	 * 修改实名认证信息
	 * @param mo
	 * @return
	 * @throws Exception
	 */
	@PutMapping("/rna/realname")
	RnaVerifyRo modify(@RequestBody RnaVerifyMo mo) throws Exception {
		_log.info("modify RnaVerifyMo:" + mo);
		RnaVerifyRo ro = new RnaVerifyRo();
		String fail = "修改失败";
		String success = "修改成功";
		int result = svc.modify(mo);
		if (result < 1) {
			_log.error(fail + "mo: {}", mo);
			ro.setMsg(fail);
			ro.setResult((byte) -1);
			return ro;
		} else {
			_log.info(success + "mo: {}", mo);
			ro.setMsg(success);
			ro.setResult((byte) 1);
			return ro;
		}

	}

	/**
	 * 查询实名认证信息
	 * 
	 * @mbg.generated
	 */
	@GetMapping("/rna/realname")
	PageInfo<RnaVerifyMo> list(RnaVerifyTo to, @RequestParam("pageNum") int pageNum,
			@RequestParam("pageSize") int pageSize) {
		_log.info("list OrdOrderMo:" + to + ", pageNum = " + pageNum + ", pageSize = " + pageSize);

		if (pageSize > 50) {
			String msg = "pageSize不能大于50";
			_log.error(msg);
			throw new IllegalArgumentException(msg);
		}

		PageInfo<RnaVerifyMo> result = svc.selectVerifyList(to, pageNum, pageSize);
		_log.info("result: " + result);
		return result;

	}


	
	/**
	 * 获取单个实名认证用户信息
	 * 
	 * 
	 */
	@GetMapping("/rna/realname/getbyid")
	RnaVerifyRo getById(@RequestParam("id") java.lang.Long id) {
		_log.info("get PfmSysMo by id: " + id);
		RnaVerifyMo result = svc.getById(id);
		_log.info("get: " + result);
		RnaVerifyRo ro = new RnaVerifyRo();
		if (result == null) {
			String msg = "获取失败，没有找到该条记录";
			_log.error("{}: id-{}", msg, id);
			ro.setMsg(msg);
			ro.setResult((byte) -1);
			return ro;
		} else {
			String msg = "获取成功";
			_log.info("{}: id-{}", msg, id);
			ro.setMsg(msg);
			ro.setResult((byte) 1);
			ro.setRecord(result);
			return ro;
		}
	}
	
	/**
	 * 根据用户id获取用户实名认证状态  
	 * @return 0：没有申请过  1：以通过 2：待审核 3以拒绝
	 */
	@GetMapping("/rna/getbyuserid")
	int getByUserId(@RequestParam("userId") java.lang.String userId) {
		_log.info(" 请求的userId: {}", userId);
		int  result =svc.getByUserId(userId);
		_log.info("返回的用户实名认证状态为 : {}", userId);
		return result;
	}
	

}
