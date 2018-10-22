package rebue.rna.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户实名认证审核
 *
 * 数据库表: RNA_VERIFY
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class RnaVerifyMo implements Serializable {

    /**
     *    ID
     *
     *    数据库字段: RNA_VERIFY.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    用户ID
     *
     *    数据库字段: RNA_VERIFY.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long userId;

    /**
     *    用户真名
     *
     *    数据库字段: RNA_VERIFY.REAL_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String realName;

    /**
     *    身份证号
     *
     *    数据库字段: RNA_VERIFY.ID_CARD
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String idCard;

    /**
     *    申请状态：1 待审核 ，2 审核中，3 已拒绝
     *
     *    数据库字段: RNA_VERIFY.APPLY_STATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Byte applyState;

    /**
     *    申请时间
     *
     *    数据库字段: RNA_VERIFY.APPLY_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applyTime;

    /**
     *    申请类型
     *
     *    数据库字段: RNA_VERIFY.APPLY_TYPE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Byte applyType;

    /**
     *    审核人ID
     *
     *    数据库字段: RNA_VERIFY.VERIFYER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long verifyerId;

    /**
     *    审核时间
     *
     *    数据库字段: RNA_VERIFY.VERIFY_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date verifyTime;

    /**
     *    拒绝原因
     *
     *    数据库字段: RNA_VERIFY.REJECT_REASON
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String rejectReason;

    /**
     *    审核图片1
     *
     *    数据库字段: RNA_VERIFY.PIC_ONE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String picOne;

    /**
     *    审核图片2
     *
     *    数据库字段: RNA_VERIFY.PIC_TWO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String picTwo;

    /**
     *    审核图片3
     *
     *    数据库字段: RNA_VERIFY.PIC_THREE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String picThree;

    /**
     *    审核图片4
     *
     *    数据库字段: RNA_VERIFY.PIC_FOUR
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String picFour;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    ID
     *
     *    数据库字段: RNA_VERIFY.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    ID
     *
     *    数据库字段: RNA_VERIFY.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    用户ID
     *
     *    数据库字段: RNA_VERIFY.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *    用户ID
     *
     *    数据库字段: RNA_VERIFY.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *    用户真名
     *
     *    数据库字段: RNA_VERIFY.REAL_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRealName() {
        return realName;
    }

    /**
     *    用户真名
     *
     *    数据库字段: RNA_VERIFY.REAL_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     *    身份证号
     *
     *    数据库字段: RNA_VERIFY.ID_CARD
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     *    身份证号
     *
     *    数据库字段: RNA_VERIFY.ID_CARD
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     *    申请状态：1 待审核 ，2 审核中，3 已拒绝
     *
     *    数据库字段: RNA_VERIFY.APPLY_STATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getApplyState() {
        return applyState;
    }

    /**
     *    申请状态：1 待审核 ，2 审核中，3 已拒绝
     *
     *    数据库字段: RNA_VERIFY.APPLY_STATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setApplyState(Byte applyState) {
        this.applyState = applyState;
    }

    /**
     *    申请时间
     *
     *    数据库字段: RNA_VERIFY.APPLY_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     *    申请时间
     *
     *    数据库字段: RNA_VERIFY.APPLY_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     *    申请类型
     *
     *    数据库字段: RNA_VERIFY.APPLY_TYPE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getApplyType() {
        return applyType;
    }

    /**
     *    申请类型
     *
     *    数据库字段: RNA_VERIFY.APPLY_TYPE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setApplyType(Byte applyType) {
        this.applyType = applyType;
    }

    /**
     *    审核人ID
     *
     *    数据库字段: RNA_VERIFY.VERIFYER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getVerifyerId() {
        return verifyerId;
    }

    /**
     *    审核人ID
     *
     *    数据库字段: RNA_VERIFY.VERIFYER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setVerifyerId(Long verifyerId) {
        this.verifyerId = verifyerId;
    }

    /**
     *    审核时间
     *
     *    数据库字段: RNA_VERIFY.VERIFY_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getVerifyTime() {
        return verifyTime;
    }

    /**
     *    审核时间
     *
     *    数据库字段: RNA_VERIFY.VERIFY_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    /**
     *    拒绝原因
     *
     *    数据库字段: RNA_VERIFY.REJECT_REASON
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     *    拒绝原因
     *
     *    数据库字段: RNA_VERIFY.REJECT_REASON
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     *    审核图片1
     *
     *    数据库字段: RNA_VERIFY.PIC_ONE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getPicOne() {
        return picOne;
    }

    /**
     *    审核图片1
     *
     *    数据库字段: RNA_VERIFY.PIC_ONE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPicOne(String picOne) {
        this.picOne = picOne;
    }

    /**
     *    审核图片2
     *
     *    数据库字段: RNA_VERIFY.PIC_TWO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getPicTwo() {
        return picTwo;
    }

    /**
     *    审核图片2
     *
     *    数据库字段: RNA_VERIFY.PIC_TWO
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPicTwo(String picTwo) {
        this.picTwo = picTwo;
    }

    /**
     *    审核图片3
     *
     *    数据库字段: RNA_VERIFY.PIC_THREE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getPicThree() {
        return picThree;
    }

    /**
     *    审核图片3
     *
     *    数据库字段: RNA_VERIFY.PIC_THREE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPicThree(String picThree) {
        this.picThree = picThree;
    }

    /**
     *    审核图片4
     *
     *    数据库字段: RNA_VERIFY.PIC_FOUR
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getPicFour() {
        return picFour;
    }

    /**
     *    审核图片4
     *
     *    数据库字段: RNA_VERIFY.PIC_FOUR
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPicFour(String picFour) {
        this.picFour = picFour;
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
        sb.append(", userId=").append(userId);
        sb.append(", realName=").append(realName);
        sb.append(", idCard=").append(idCard);
        sb.append(", applyState=").append(applyState);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyType=").append(applyType);
        sb.append(", verifyerId=").append(verifyerId);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append(", rejectReason=").append(rejectReason);
        sb.append(", picOne=").append(picOne);
        sb.append(", picTwo=").append(picTwo);
        sb.append(", picThree=").append(picThree);
        sb.append(", picFour=").append(picFour);
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
        RnaVerifyMo other = (RnaVerifyMo) that;
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
