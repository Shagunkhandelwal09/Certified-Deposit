package com.example.demo.model;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import jakarta.persistence.Table;

//@Entity
//@Table(name = "CD_RATES")
@Table
public class CdRates {

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKey
	private String id;
	private String termLength;
	private Double intrstRate;
	private Double managerRate;
	private Double APY;
	private Integer mindo;
	private Integer maxdp;
	private Integer penlDays;
	private Double penPer;
	private String cdTypes;
	private String status;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	private String updatedBy;

	// @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	// @JoinColumn(name = "CD_RATE_STATUS_id")
	// private CdRatesStatus CdRatesStatus;

	public CdRates() {
		super();
	}

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

	public Integer getPenlDays() {
		return penlDays;
	}

	public void setPenlDays(Integer penlDays) {
		this.penlDays = penlDays;
	}

	public Double getPenPer() {
		return penPer;
	}

	public void setPenPer(Double penPer) {
		this.penPer = penPer;
	}

	public String getCdTypes() {
		return cdTypes;
	}

	public void setCdTypes(String cdTypes) {
		this.cdTypes = cdTypes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "CdRates [id=" + id + ", termLength=" + termLength + ", intrstRate=" + intrstRate + ", managerRate="
				+ managerRate + ", APY=" + APY + ", mindo=" + mindo + ", maxdp=" + maxdp + ", penlDays=" + penlDays
				+ ", penPer=" + penPer + ", cdTypes=" + cdTypes + ", status=" + status + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
}
