package jp.co.sample.emp_management.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insert")
public class CheckPasswordApiController {
	
	@ResponseBody
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public Map<String, String> check(String password, String confirmationPassword) {
		Map<String, String> map = new HashMap<>();

		// 8文字以上チェック
		final int PASSWORD_MAX_LENGTH = 8;
		String robustnessMessage = null;
		if (password.length() >= PASSWORD_MAX_LENGTH) {
			robustnessMessage = "パスワード入力OK!";
		} else {
			robustnessMessage = "パスワードは" + PASSWORD_MAX_LENGTH + "文字以上で入力してください";
		}
		map.put("robustnessMessage", robustnessMessage);

		// パスワード一致チェック
		String disagreementMessage = null;
		if (password.equals(confirmationPassword)) {
			disagreementMessage = "確認用パスワード入力OK!";
		} else {
			disagreementMessage = "パスワードが一致していません";
		}
		map.put("disagreementMessage", disagreementMessage);
		
		System.out.println(password + ":" + confirmationPassword);
		
		return map;
	}

}
