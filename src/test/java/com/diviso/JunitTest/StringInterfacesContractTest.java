package com.diviso.JunitTest;

public class StringInterfacesContractTest implements ComparableContractTest<String>, EqualsContractTest<String> {

	@Override
	public String createValue() {
		return "foo";
	}

	@Override
	public String createNotEqualValue() {
		return "bar";
	}

	@Override
	public String createSmallerValue() {
		return "baz";
	}

}
