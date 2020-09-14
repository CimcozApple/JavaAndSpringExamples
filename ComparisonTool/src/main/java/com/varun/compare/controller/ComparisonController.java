package com.varun.compare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.difflib.patch.Patch;
import com.varun.compare.model.ComparisonRequest;
import com.varun.compare.service.DifferenceChecker;

@RestController
public class ComparisonController {

	@Autowired
	private DifferenceChecker diffService;

	@PostMapping("/diff")
	public Patch<String> compare(@RequestBody ComparisonRequest request) {
		return diffService.diffChecker(request.getOriginal(), request.getModified());
	}
}
