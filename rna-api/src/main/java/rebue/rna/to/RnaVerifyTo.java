package rebue.rna.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Database Table Remarks:
 *   用户实名认证请求参数

 */
@ApiModel(value = "RnaVerifyMo", description = "用户实名认证审核")
@JsonInclude(Include.NON_NULL)
public class RnaVerifyTo implements Serializable {


    /**
     * Database Column Remarks:
     *   用户ID
     *
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户真名
     *
     */
    @ApiModelProperty(value = "用户真名")
    private String realName;

    /**
     * Database Column Remarks:
     *   身份证号
     *
     */
    @ApiModelProperty(value = "身份证号")
    private String idCard;

    /**
     * Database Column Remarks:
     *   申请状态：-1 取消申请，1 待审核 ，2 审核中，3 已拒绝 ，4 已通过
     *
     */
    @ApiModelProperty(value = "申请状态：1 待审核 ，2 已通过 3 已拒绝 ，")
    private Byte applyState;

    /**
     * Database Column Remarks:
     *   申请时间开始
     *
     */
    @ApiModelProperty(value = "申请时间开始")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startApplyTime;
    
    
    /**
     * Database Column Remarks:
     *   申请时间结束
     *
     */
    @ApiModelProperty(value = "申请时间结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endApplyTime;


    private static final long serialVersionUID = 1L;


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public Byte getApplyState() {
		return applyState;
	}


	public void setApplyState(Byte applyState) {
		this.applyState = applyState;
	}


	public Date getStartApplyTime() {
		return startApplyTime;
	}


	public void setStartApplyTime(Date startApplyTime) {
		this.startApplyTime = startApplyTime;
	}


	public Date getEndApplyTime() {
		return endApplyTime;
	}


	public void setEndApplyTime(Date endApplyTime) {
		this.endApplyTime = endApplyTime;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", realName=").append(realName);
        sb.append(", startApplyTime=").append(startApplyTime);
        sb.append(", endApplyTime=").append(endApplyTime);
        sb.append(", idCard=").append(idCard);
        sb.append(", applyState=").append(applyState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    
    
  
}