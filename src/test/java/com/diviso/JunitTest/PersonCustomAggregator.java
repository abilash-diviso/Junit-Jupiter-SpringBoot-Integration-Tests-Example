package com.diviso.JunitTest;

import java.time.LocalDate;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class PersonCustomAggregator implements ArgumentsAggregator {

	@Override
	public Person aggregateArguments(ArgumentsAccessor accessor, ParameterContext context)
			throws ArgumentsAggregationException {
		return new Person(accessor.getString(0), accessor.getString(1), accessor.get(2, Gender.class),
				accessor.get(3, LocalDate.class));
	}

}
