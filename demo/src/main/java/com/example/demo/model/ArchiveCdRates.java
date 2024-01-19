package com.example.demo.model;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import jakarta.persistence.Table;

@Table
public class ArchiveCdRates {

	@PrimaryKey
	private String id;
	private String termLength;
	private Double intrstRate;
	private Double managerRate;
	private Double APY;
	private Integer mindo;
	private Integer maxdp;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	private String updatedBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTermLength() {
		return termLength;
	}

	public void setTermLength(String termLength) {
		this.termLength = termLength;
	}

	public Double getIntrstRate() {
		return intrstRate;
	}

	public void setIntrstRate(Double intrstRate) {
		this.intrstRate = intrstRate;
	}

	public Double getManagerRate() {
		return managerRate;
	}

	public void setManagerRate(Double managerRate) {
		this.managerRate = managerRate;
	}

	public Double getAPY() {
		return APY;
	}

	public void setAPY(Double aPY) {
		APY = aPY;
	}

	public Integer getMindo() {
		return mindo;
	}

	public void setMindo(Integer mindo) {
		this.mindo = mindo;
	}

	public Integer getMaxdp() {
		return maxdp;
	}

	public void setMaxdp(Integer maxdp) {
		this.maxdp = maxdp;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "CdHostoryRates [id=" + id + ", termLength=" + termLength + ", intrstRate=" + intrstRate
				+ ", managerRate=" + managerRate + ", APY=" + APY + ", mindo=" + mindo + ", maxdp=" + maxdp
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + "]";
	}
}
