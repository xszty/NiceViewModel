package com.saxiao.niceviewmodel.model;

import java.util.List;

/**
 * 用户对象
 */

public class UserBean {


    /**
     * functions : [{"code":"appStockManager","dbid":1865,"functionLevel":"PAGE_JSP_FRONT","icon":"","id":"39fcea62-5036-4406-a1d5-aa64e1892211","level":4,"levelName":"PAGE_JSP_FRONT","name":"库存管理","pid":"f0a1dd1b-12c5-41e7-bbfe-310ca867a1b6","remark":"","thisOrder":2,"url":"appStockManager"},{"code":"appmeetingInspectionManager","dbid":1867,"functionLevel":"PAGE_JSP_FRONT","icon":"","id":"dc58e078-ae28-4945-b2f9-eaeb78cd7eef","level":4,"levelName":"PAGE_JSP_FRONT","name":"会检提料管理","pid":"f0a1dd1b-12c5-41e7-bbfe-310ca867a1b6","remark":"","thisOrder":3,"url":"appmeetingInspectionManager"}]
     * staff : {"code":"cj","dbid":11,"departmentId":"dfd4001e-b4e4-46dd-89ae-f015cf77960c","departmentName":"材料科","id":"b295c406-1454-455c-8606-ef3ff246421e","mobilePhone":"","name":"陈君","remark":"","roleId":"53e5357f-3412-4ec8-8c5d-2be5847e426a","roleName":"仓库管理员","tag":"管库员","userName":"cj"}
     * token : SjdAUxSkf3pmK/OIGRb+Rg==
     */

    private StaffBean staff;
    private String token;
    private List<FunctionsBean> functions;
    private boolean success;
    private String msg;

    public StaffBean getStaff() {
        return staff;
    }

    public void setStaff(StaffBean staff) {
        this.staff = staff;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<FunctionsBean> getFunctions() {
        return functions;
    }

    public void setFunctions(List<FunctionsBean> functions) {
        this.functions = functions;
    }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
