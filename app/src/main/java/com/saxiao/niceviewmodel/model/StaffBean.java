package com.saxiao.niceviewmodel.model;

import java.io.Serializable;

/**
 * 用户基本信息
 */
public  class StaffBean implements Serializable{
    /**
     * code : cj
     * dbid : 11
     * departmentId : dfd4001e-b4e4-46dd-89ae-f015cf77960c
     * departmentName : 材料科
     * id : b295c406-1454-455c-8606-ef3ff246421e
     * mobilePhone :
     * name : 陈君
     * remark :
     * roleId : 53e5357f-3412-4ec8-8c5d-2be5847e426a
     * roleName : 仓库管理员
     * tag : 管库员
     * userName : cj
     */

    private String code;
    private int dbid;
    private String departmentId;
    private String departmentName;
    private String id;
    //zz
    private String userid;
    private String mobilePhone;
    private String name;
    private String remark;
    private String roleId;
    private String roleName;
    private String tag;
    private String userName;
    private boolean select;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public boolean isSelect() {
		return select;
	}

	public void setSelect(boolean select) {
		this.select = select;
	}

	public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDbid() {
        return dbid;
    }

    public void setDbid(int dbid) {
        this.dbid = dbid;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
