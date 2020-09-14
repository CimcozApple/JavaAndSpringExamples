package com.varun.compare.model;

import java.util.List;

public class ComparisonRequest {

	private List<String> original;
	private List<String> modified;

	public List<String> getOriginal() {
		return original;
	}

	public void setOriginal(List<String> original) {
		this.original = original;
	}

	public List<String> getModified() {
		return modified;
	}

	public void setModified(List<String> modified) {
		this.modified = modified;
	}
}
