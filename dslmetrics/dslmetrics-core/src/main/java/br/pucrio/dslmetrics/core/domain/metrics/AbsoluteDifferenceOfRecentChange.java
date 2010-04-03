package br.pucrio.dslmetrics.core.domain.metrics;

import br.pucrio.dslmetrics.core.mtbl.calculatedMetric;

public class AbsoluteDifferenceOfRecentChange extends
		ChangeHistorySensitiveMetric {

	public static final String GENERAL_NAME = "Absolute Difference of Recent Change";
	public static final String GENERAL_NICKNAME = "adrc";

	public AbsoluteDifferenceOfRecentChange(calculatedMetric conventionalMetric) {
		super(conventionalMetric);
	}

	@Override
	public String getGeneralName() {
		return GENERAL_NAME;
	}

	@Override
	public String getGeneralNickname() {
		return GENERAL_NICKNAME;
	}

	@Override
	protected Double calculateMetricValueForOneVersion(
			Double firstVersionMetricValue, Double previousMetricValue,
			Double currentMetricValue) {

		if (previousMetricValue == null || currentMetricValue == null)
			return null;

		return Math.abs(previousMetricValue - currentMetricValue);
	}

}