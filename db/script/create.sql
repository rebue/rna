/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/6/8 14:24:38                            */
/*==============================================================*/


drop table if exists RNA_REALNAME;

drop table if exists RNA_VERIFY;

/*==============================================================*/
/* Table: RNA_REALNAME                                          */
/*==============================================================*/
create table RNA_REALNAME
(
   ID                   bigint not null comment 'ID',
   REAL_NAME            varchar(100) not null comment '用户真名',
   ID_CARD              varchar(18) not null comment '身份证号',
   primary key (ID),
   key AK_ID_CARD (ID_CARD)
);

alter table RNA_REALNAME comment '认证成功用户信息表';

/*==============================================================*/
/* Table: RNA_VERIFY                                            */
/*==============================================================*/
create table RNA_VERIFY
(
   ID                   bigint not null comment 'ID',
   USER_ID              bigint not null comment '用户ID',
   REAL_NAME            varchar(100) not null comment '用户真名',
   ID_CARD              varchar(18) not null comment '身份证号',
   APPLY_STATE          tinyint comment '申请状态：-1 取消申请，1 待审核 ，2 审核中，3 已拒绝 ，4 已通过',
   APPLY_TIME           datetime comment '申请时间',
   APPLY_TYPE           tinyint comment '申请类型',
   VERIFYER_ID          bigint comment '审核人ID',
   VERIFY_TIME          datetime comment '审核时间',
   REJECT_REASON        varchar(200) comment '拒绝原因',
   PIC_ONE              varchar(150) comment '审核图片1',
   PIC_TWO              varchar(150) comment '审核图片2',
   PIC_THREE            varchar(150) comment '审核图片3',
   PIC_FOUR             varchar(150) comment '审核图片4',
   primary key (ID)
);

alter table RNA_VERIFY comment '用户实名认证审核';

