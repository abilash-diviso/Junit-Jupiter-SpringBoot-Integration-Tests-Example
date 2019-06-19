package com.diviso.JunitTest;

import java.util.stream.Stream;

public class StringProviders {

	static Stream<String> tinyStrings() {
		return Stream.of("aaa", "bbb", "ccc");
	}

}
