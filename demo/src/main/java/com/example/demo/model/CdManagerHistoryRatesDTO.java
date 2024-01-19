package com.example.demo.model;

public class CdManagerHistoryRatesDTO {

	private String termLength;
	private Double managerHistoryIntrstRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;

	public String getTermLength() {
		return termLength;
	}

	public void setTermLength(String termLength) {
		this.termLength = termLength;
	}

	public Double getManagerHistoryIntrstRate() {
		return managerHistoryIntrstRate;
	}

	public void setManagerHistoryIntrstRate(Double managerHistoryIntrstRate) {
		this.managerHistoryIntrstRate = managerHistoryIntrstRate;
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
		return "CdManagerHistoryRatesDTO [termLength=" + termLength + ", managerHistoryIntrstRate="
				+ managerHistoryIntrstRate + ", minDepositOpen=" + minDepositOpen + ", maxDepositPermit="
				+ maxDepositPermit + "]";
	}
}
