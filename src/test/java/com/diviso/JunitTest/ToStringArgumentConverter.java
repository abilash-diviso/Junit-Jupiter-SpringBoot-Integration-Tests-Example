package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class ToStringArgumentConverter extends SimpleArgumentConverter {

	@Override
	protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
		System.out.println("enter into ToStringArgumentConverter");
		assertEquals(String.class, targetType, "Can only convert to String");
		return String.valueOf(source);
	}

}
