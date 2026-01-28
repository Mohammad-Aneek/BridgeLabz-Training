package com.collections.Implementation.PolicySystem;

import java.time.LocalDate;
import java.util.Objects;

public final class Policy implements Comparable<Policy> {
	private String policyNumber;
	private String policyholderName;
	private LocalDate expiryDate;
	private String coverageType;
	private double premiumAmount;

	public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType,
			double premiumAmount) {
		this.policyNumber = policyNumber;
		this.policyholderName = policyholderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	@Override
	public int compareTo(Policy other) {
		int dateCompare = this.expiryDate.compareTo(other.expiryDate);
		return (dateCompare != 0) ? dateCompare : this.policyNumber.compareTo(other.policyNumber);
	}

	@Override
	public String toString() {
		return this.policyholderName + " [" + policyNumber + ", " + expiryDate + "]";
	}

	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Policy) {
			Policy other = (Policy) o;
			return this.policyNumber.equals(other.policyNumber);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(policyNumber);
	}
}
