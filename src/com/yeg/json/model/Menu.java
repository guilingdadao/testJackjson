package com.yeg.json.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu implements Serializable {
	private Integer id;

	private String name;

	private String path;

	private Integer pid;

	private String menuDesc;

	private Integer createBy;

	private Date createDate;

	private Integer updateBy;

	private Date updateDate;

	private static final long serialVersionUID = 1L;

	private List<Menu> children = new ArrayList<Menu>();

	/***
	 * 
	 * @param e
	 */
	public void addChildren(List<Menu> menuList) {

		this.children.addAll(menuList);

	}

	public void addChild(Menu e) {

		this.children.add(e);

	}

	public List<Menu> getChildren() {

		return this.children;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path == null ? null : path.trim();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getMenuDesc() {
		return menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc == null ? null : menuDesc.trim();
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}