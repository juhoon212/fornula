// 에러 메세지 객체
const errMsg = {

  newPassword: "8~20자의 영문, 숫자, 특수문자를 모두 포함한 비밀번호를 입력해주세요",
  reNewPassword: {
      success: "비밀번호가 일치합니다",
      fail: "비밀번호가 일치하지 않습니다"
  }
}

// 계정 정보 객체
const account = {
 
  newPassword: null,
  
}


/** 비밀번호*/
// pwVal: 패스워드, reNewPasswordVal: 패스워드 재입력, isPwValid: 패스워드 유효 여부
let pwVal = "", reNewPasswordVal = "", isPwValid = false
// 비밀번호와 재입력 값 일치 여부
function checkPwValid() {
    account.newPassword = null
    if(reNewPasswordVal === "") { // 미입력
        reNewPasswordErrorMsgEl.textContent = ""
    }
    else if(pwVal === reNewPasswordVal) { // 비밀번호 재입력 일치
        if(isPwValid)
        account.newPassword = pwVal
    reNewPasswordErrorMsgEl.style.color = "green"
    reNewPasswordErrorMsgEl.textContent = errMsg.reNewPassword.success
}
else { // 비밀번호 재입력 불일치
    reNewPasswordErrorMsgEl.style.color = "red"
    reNewPasswordErrorMsgEl.textContent = errMsg.reNewPassword.fail
}
}

const pwInputEl = document.querySelector('#info__newPassword input')
const pwErrorMsgEl = document.querySelector('#info__newPassword .error-msg')
pwInputEl.addEventListener('change', () => {
    const reNewPasswordgExp = /^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$/
    pwVal = pwInputEl.value
  if(reNewPasswordgExp.test(pwVal)) { // 유효성 검사 성공
    isPwValid = true
    pwErrorMsgEl.textContent = ""
} 
else { // 유효성 검사 실패
    isPwValid = false
    pwErrorMsgEl.textContent = errMsg.newPassword
}
checkPwValid()
console.log(pwVal, reNewPasswordVal, isPwValid, account)
});

/** 비밀번호 확인 */
const reNewPasswordInputEl = document.querySelector('#info__reNewPassword input')
const reNewPasswordErrorMsgEl = document.querySelector('#info__reNewPassword .error-msg')
reNewPasswordInputEl.addEventListener('change', () => {
    reNewPasswordVal = reNewPasswordInputEl.value
    checkPwValid()
    console.log(pwVal, reNewPasswordVal, isPwValid, account)
});