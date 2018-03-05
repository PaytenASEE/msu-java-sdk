package com.github.msu.sdk.request.model;

import java.math.BigDecimal;

public class Point {
	private String name;
	private BigDecimal value;

	private Point(String name, BigDecimal value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public static class PointBuilder {
		private String name;
		private BigDecimal value;

		public PointBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public PointBuilder withValue(BigDecimal value) {
			this.value = value;
			return this;
		}

		public Point build() {
			return new Point(name, value);
		}
	}

	public static PointBuilder point() {
		return new PointBuilder();
	}

}
