package com.fjrm.samples.java9api.inmutableset;

import java.util.Set;

public class InmutableSet {

	public Set<Object> createInmutableEmptySet() {
		return Set.of();
	}

	public Set<String> createInmutableStringSet(String... strings) {
		return Set.of(strings);
	}

	public static void main(String[] args) {
		InmutableSet inmutableSet = new InmutableSet();
		System.out.println(inmutableSet.createInmutableEmptySet());
		System.out.println(inmutableSet.createInmutableStringSet("H", "ola", "1", "2", "4", "5", "6", "76", "56", "56776", "567567", "sss", "cvfvv",
				"jhjh", "vbvcbcv", "xxcxc", "6234646", "").size());
	}

}
