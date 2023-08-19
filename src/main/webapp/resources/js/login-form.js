/**
 * 
 */
 
let loginButton = document.querySelector('#loginButton');
let close = document.querySelector('.close');
    
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/juhoon
    loginButton.addEventListener('click', () => {
        document.querySelector('.black-bg').classList.add('show-modal');
    })

    close.addEventListener('click', () => {
        document.querySelector('.black-bg').classList.remove('show-modal');
<<<<<<< HEAD
    })
    
    loginSubmit.addEventListener('click', (e) => {
   		
		if(id.value == "" || id.value == null) {
			e.preventDefault();s
            document.querySelector('.front-error').innerHtml = "아이디 비밀번호가 맞지 않습니다."
            return;
		}
		
		if(password.value == "" || password.value == null) {
			e.preventDefault();
            document.querySelector('.front-error').innerHtml = "아이디 비밀번호가 맞지 않습니다."
            return;
		}
	});
=======
    })
>>>>>>> refs/remotes/origin/juhoon
