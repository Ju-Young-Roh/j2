package com.j2.templetemethod.comparator;

import java.util.Comparator;

public class CompareDuck implements Comparator<Duck>{

	public int compare(Duck o1, Duck o2) {
		return o1.name.compareTo(o2.name);
	}
}
