package jp.co.flm.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/user")
	public List<String> test() {
		return Arrays.asList("未実装", "未実装", "未実装");
	}
}