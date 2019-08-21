package com.saxiao.niceviewmodel.model;

import android.support.v4.app.SupportActivity;

/**
 * 用户权限信息
 */
public class FunctionsBean {
    /**
     * code : appStockManager
     * dbid : 1865
     * functionLevel : PAGE_JSP_FRONT
     * icon :
     * id : 39fcea62-5036-4406-a1d5-aa64e1892211
     * level : 4
     * levelName : PAGE_JSP_FRONT
     * name : 库存管理
     * pid : f0a1dd1b-12c5-41e7-bbfe-310ca867a1b6
     * remark :
     * thisOrder : 2
     * url : appStockManager
     */

    private String code;
    private int dbid;
    private String functionLevel;
    private String icon;
    private String id;
    private int level;
    private String levelName;
    private String name;
    private String pid;
    private String remark;
    private int thisOrder;
    private String url;

    private int img;
    private Class<? extends SupportActivity> activity;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Class<? extends SupportActivity> getActivity() {
        return activity;
    }

    public void setActivity(Class<? extends SupportActivity> activity) {
        this.activity = activity;
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

    public String getFunctionLevel() {
        return functionLevel;
    }

    public void setFunctionLevel(String functionLevel) {
        this.functionLevel = functionLevel;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getThisOrder() {
        return thisOrder;
    }

    public void setThisOrder(int thisOrder) {
        this.thisOrder = thisOrder;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}