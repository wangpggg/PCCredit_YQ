/*
 * Copyright 2013 Wicresoft, Inc. All rights reserved.
 */

package com.cardpay.pccredit.sample2.model;

import java.util.Date;

import com.wicresoft.jrad.base.database.model.ModelParam;
import com.wicresoft.jrad.base.database.model.BusinessModel;

/**
 * Description of Sample1
 * 
 * @author Vincent
 * @created on Dec 26, 2013
 * 
 * @version $Id: Sample2.java 1650 2014-10-09 14:55:25Z vincent $
 */
@ModelParam(table = "sample")
public class Sample2 extends BusinessModel {

	private static final long serialVersionUID = 1L;

	private String name;

	private String type;

	private String nativeName;

	private Date sampleDate;

	private Date sampleTime;

	private String description;

	private Double floatValue;

	private Double price;

	private String richTextId;

	private String fileId;

	private String photoId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

	public Date getSampleDate() {
		return sampleDate;
	}

	public void setSampleDate(Date sampleDate) {
		this.sampleDate = sampleDate;
	}

	public Date getSampleTime() {
		return sampleTime;
	}

	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(Double floatValue) {
		this.floatValue = floatValue;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getRichTextId() {
		return richTextId;
	}

	public void setRichTextId(String richTextId) {
		this.richTextId = richTextId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

}
