package rebue.rna.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.rna.mo.RnaVerifyMo;
import rebue.rna.to.RnaVerifyTo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface RnaVerifyMapper extends MybatisBaseMapper<RnaVerifyMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(RnaVerifyMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(RnaVerifyMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    RnaVerifyMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(RnaVerifyMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(RnaVerifyMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<RnaVerifyMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<RnaVerifyMo> selectSelective(RnaVerifyMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(RnaVerifyMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(RnaVerifyMo record);

    /**
     * 分页查询实名认证用户信息
     * @param record
     * @return
     */
    List<RnaVerifyMo> selectVerifyList(RnaVerifyTo record);

    /**
     *  根据用户id获取用户实名认证状态。
     *  @param userId
     *  @return
     */
    List<RnaVerifyMo> getByUserId(String userId);
}
