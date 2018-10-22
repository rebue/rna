package rebue.rna.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.rna.mo.RnaRealnameMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface RnaRealnameMapper extends MybatisBaseMapper<RnaRealnameMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(RnaRealnameMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(RnaRealnameMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    RnaRealnameMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(RnaRealnameMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(RnaRealnameMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<RnaRealnameMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<RnaRealnameMo> selectSelective(RnaRealnameMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(RnaRealnameMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(RnaRealnameMo record);
}
