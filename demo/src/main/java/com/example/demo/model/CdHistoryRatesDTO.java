package com.example.demo.model;

public class CdHistoryRatesDTO {

	private String termLength;
	private Double historyIntrstRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;

	public String getTermLength() {
		return termLength;
	}

	public void setTermLength(String termLength) {
		this.termLength = termLength;
	}

	public Double getHistoryIntrstRate() {
		return historyIntrstRate;
	}

	public void setHistoryIntrstRate(Double historyIntrstRate) {
		this.historyIntrstRate = historyIntrstRate;
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
		return "CdHistoryRatesDTO [termLength=" + termLength + ", historyIntrstRate=" + historyIntrstRate
				+ ", minDepositOpen=" + minDepositOpen + ", maxDepositPermit=" + maxDepositPermit + "]";
	}
}
