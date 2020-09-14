package com.varun.compare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.difflib.DiffUtils;
import com.github.difflib.patch.Patch;

@Service
public class DifferenceChecker {

	public Patch<String> diffChecker(List<String> original, List<String> revised) {
		Patch<String> difference = DiffUtils.diff(original, revised);
		return difference;
	}
}
