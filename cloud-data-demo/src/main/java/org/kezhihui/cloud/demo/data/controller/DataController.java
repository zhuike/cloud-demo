package org.kezhihui.cloud.demo.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author kezhihui
 *@createTime 2025/08/06 17:22
 */
@RestController
@RequestMapping("/data/demo")
public class DataController {

	@GetMapping("/detail")
	public String hello() {
		return "Hello World";
	}

}
