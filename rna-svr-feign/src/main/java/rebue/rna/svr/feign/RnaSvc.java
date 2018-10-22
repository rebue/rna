package rebue.rna.svr.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import rebue.rna.mo.RnaRealnameMo;
import rebue.robotech.ro.Ro;
import rebue.sbs.feign.FeignConfig;

@FeignClient(name = "rna-svr", configuration = FeignConfig.class)
public interface RnaSvc {
	
	/**
	 * 添加实名认证
	 * @param mo
	 * @return
	 */
    @PostMapping("/rna/realname")
    Ro add(@RequestBody RnaRealnameMo mo);
    
    /**
     * 修改认证成功用户信息表
     *
     *
     */
    @PutMapping("/rna/realname")
    Ro modify(@RequestBody RnaRealnameMo mo);
	
    /**
     * 获取单个认证成功用户信息表
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/rna/realname/getbyid")
    RnaRealnameMo getById(@RequestParam("id") java.lang.Long id);
}
