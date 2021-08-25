/**
 * 管理者登録画面の入力値チェック
 */

'use strict';

// name mailAddress password

$('#register_btn').on('click', function(){
	let nameValue = $('#name').val();
	
	if(nameValue == ''){
		alert('名前を入力してください！');
	} else if (emailValue == ''){
		alert('メールアドレスを入力してください！');
	} else if (passValue == ''){
		alert('パスワードを入力してください！');
	} else {
		$('#insert').prop('disabled', true);
	}

});
