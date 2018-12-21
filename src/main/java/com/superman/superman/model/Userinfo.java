package com.superman.superman.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@ToString
public class Userinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userName
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.loginName
     *
     * @mbggenerated
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.loginPwd
     *
     * @mbggenerated
     */
    private String loginpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.loginSecret
     *
     * @mbggenerated
     */
    private Long loginsecret;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userSex
     *
     * @mbggenerated
     */
    private Integer usersex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userScore
     *
     * @mbggenerated
     */
    private Integer userscore;
    private Integer roleId;

    private String userphoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userStatus
     *
     * @mbggenerated
     */
    private Integer userstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userTotalScore
     *
     * @mbggenerated
     */
    private Long usertotalscore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.jdPid
     *
     * @mbggenerated
     */
    private String jdpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.pddPid
     *
     * @mbggenerated
     */
    private String pddpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.tbPid
     *
     * @mbggenerated
     */
    private Long tbpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.wphPid
     *
     * @mbggenerated
     */
    private String wphpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.createTime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.updateTime
     *
     * @mbggenerated
     */
    private Date updatetime;


    private Byte status;

    private String userphone;

    private Integer score;

    public Integer getScore() {
        return score;
    }

    private String wxopenid;






}