package myweb.controller;

import myweb.RequestMapping;
import myweb.ResponseBody;

public class HelloController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
