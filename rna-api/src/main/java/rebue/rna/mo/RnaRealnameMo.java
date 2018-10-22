package rebue.rna.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 认证成功用户信息表
 *
 * 数据库表: RNA_REALNAME
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class RnaRealnameMo implements Serializable {

    /**
     *    ID
     *
     *    数据库字段: RNA_REALNAME.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    用户真名
     *
     *    数据库字段: RNA_REALNAME.REAL_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String realName;

    /**
     *    身份证号
     *
     *    数据库字段: RNA_REALNAME.ID_CARD
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String idCard;

    /**
     *    是否正确
     *
     *    数据库字段: RNA_REALNAME.IS_CORRECT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Boolean isCorrect;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    ID
     *
     *    数据库字段: RNA_REALNAME.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    ID
     *
     *    数据库字段: RNA_REALNAME.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    用户真名
     *
     *    数据库字段: RNA_REALNAME.REAL_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRealName() {
        return realName;
    }

    /**
     *    用户真名
     *
     *    数据库字段: RNA_REALNAME.REAL_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     *    身份证号
     *
     *    数据库字段: RNA_REALNAME.ID_CARD
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     *    身份证号
     *
     *    数据库字段: RNA_REALNAME.ID_CARD
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     *    是否正确
     *
     *    数据库字段: RNA_REALNAME.IS_CORRECT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Boolean getIsCorrect() {
        return isCorrect;
    }

    /**
     *    是否正确
     *
     *    数据库字段: RNA_REALNAME.IS_CORRECT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realName=").append(realName);
        sb.append(", idCard=").append(idCard);
        sb.append(", isCorrect=").append(isCorrect);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RnaRealnameMo other = (RnaRealnameMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}
