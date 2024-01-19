package com.example.demo.model;

public class CdRatesDTO {

	private String termLength;
	private Double intrstRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;

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

	public Integer getMinDepositOpen() {
		return minDepositOpen;
	}

	public void setMinDepositOpen(Integer minDepositOpen) {
		this.minDepositOpen = minDepositOpen;
	}

	public Integer getMaxDepositPermit() {
		return maxDepositPermit;
	}

	public void setMaxDepositPermit(Integer maxDepositPermit) {
		this.maxDepositPermit = maxDepositPermit;
	}

	@Override
	public String toString() {
		return "CdRatesDTO [termLength=" + termLength + ", intrstRate=" + intrstRate + ", minDepositOpen="
				+ minDepositOpen + ", maxDepositPermit=" + maxDepositPermit + "]";
	}
}
