
/** 카테고리  */
function categorySelect1(e) {
    var design = ["그래픽", "제품"];
    var language = ["영어", "중국어"];
    var hair = ["헤어메이크업", "제품홍보사진"];
    var tax = ["사업자", "개인"];
    var marketing = ["SNS홍보", "해외마케팅"];
    var target = document.getElementById("mcategory1");

    if(e.value == "a") {
      var z = design;
      var index=1;
   }
    else if(e.value == "b") {
      var z = language;
      var index=3;
   }
    else if(e.value == "c") {
       var z = hair;
       var index=5;   
   }   
    else if(e.value == "d") {
      var z = tax;
       var index=7;   
   }
    else if(e.value == "e") {
      var z = marketing;
       var index=9;   
   }
    target.options.length = 0;

    for (x in z) {
        var opt = document.createElement("option");
        opt.value = parseInt(index)+parseInt(x);
        opt.innerHTML = z[x];
        target.appendChild(opt);
    }
}

/** 카테고리  */
function categorySelect2(e) {
    var design = ["그래픽", "제품"];
    var language = ["영어", "중국어"];
    var hair = ["헤어메이크업", "제품홍보사진"];
    var tax = ["사업자", "개인"];
    var marketing = ["SNS홍보", "해외마케팅"];
    var target = document.getElementById("mcategory2");

    if(e.value == "a") {
      var z = design;
      var index=1;
   }
    else if(e.value == "b") {
      var z = language;
      var index=3;
   }
    else if(e.value == "c") {
       var z = hair;
       var index=5;   
   }   
    else if(e.value == "d") {
      var z = tax;
       var index=7;   
   }
    else if(e.value == "e") {
      var z = marketing;
       var index=9;   
   }
    target.options.length = 0;

    for (x in z) {
        var opt = document.createElement("option");
        opt.value = parseInt(index)+parseInt(x);
        opt.innerHTML = z[x];
        target.appendChild(opt);
    }
}

/** 카테고리  */
function categorySelect3(e) {
    var design = ["그래픽", "제품"];
    var language = ["영어", "중국어"];
    var hair = ["헤어메이크업", "제품홍보사진"];
    var tax = ["사업자", "개인"];
    var marketing = ["SNS홍보", "해외마케팅"];
    var target = document.getElementById("mcategory3");

    if(e.value == "a") {
      var z = design;
      var index=1;
   }
    else if(e.value == "b") {
      var z = language;
      var index=3;
   }
    else if(e.value == "c") {
       var z = hair;
       var index=5;   
   }   
    else if(e.value == "d") {
      var z = tax;
       var index=7;   
   }
    else if(e.value == "e") {
      var z = marketing;
       var index=9;   
   }
    target.options.length = 0;

    for (x in z) {
        var opt = document.createElement("option");
        opt.value = parseInt(index)+parseInt(x);
        opt.innerHTML = z[x];
        target.appendChild(opt);
    }
}

/** 가입하기 */


// 에러 메세지 객체
const errMsg = {
    id: { 
        invalid: "6~20자의 영문 소문자와 숫자만 사용 가능합니다",
        success: "사용 가능한 아이디입니다",
        fail: "사용할 수 없는 아이디입니다"
    },
    pw: "8~20자의 영문, 숫자, 특수문자를 모두 포함한 비밀번호를 입력해주세요",
    pwRe: {
        success: "비밀번호가 일치합니다",
        fail: "비밀번호가 일치하지 않습니다"
    },
    email : { 
        invalid: "이메일 형식이 아닙니다",
        success: "사용 가능한 이메일입니다",
        fail: "사용할 수 없는 이메일입니다"
    }
}

// 계정 정보 객체
const account = {
    id: null,
    pw: null,
    email: null
}

/** 아이디*/
const idInputEl = document.querySelector('#info__id input')
const idErrorMsgEl = document.querySelector('#info__id .error-msg')
idInputEl.addEventListener('change', () => {
    const idRegExp = /^[a-zA-Z0-9]{6,20}$/
    if(idRegExp.test(idInputEl.value)) { // 정규식 조건 만족 O
        idErrorMsgEl.textContent = ""
        account.id = idInputEl.value
    } else { // 정규식 조건 만족 X
        idErrorMsgEl.style.color = "red"
        idErrorMsgEl.textContent = errMsg.id.invalid
        account.id = null
    }
    console.log(account)
});

/** 비밀번호*/
// pwVal: 패스워드, pwReVal: 패스워드 재입력, isPwValid: 패스워드 유효 여부
let pwVal = "", pwReVal = "", isPwValid = false
// 비밀번호와 재입력 값 일치 여부
function checkPwValid() {
    account.pw = null
    if(pwReVal === "") { // 미입력
        pwReErrorMsgEl.textContent = ""
    }
    else if(pwVal === pwReVal) { // 비밀번호 재입력 일치
        if(isPwValid)
        account.pw = pwVal
    pwReErrorMsgEl.style.color = "green"
    pwReErrorMsgEl.textContent = errMsg.pwRe.success
}
else { // 비밀번호 재입력 불일치
    pwReErrorMsgEl.style.color = "red"
    pwReErrorMsgEl.textContent = errMsg.pwRe.fail
}
}

const pwInputEl = document.querySelector('#info__pw input')
const pwErrorMsgEl = document.querySelector('#info__pw .error-msg')
pwInputEl.addEventListener('change', () => {
    const pwRegExp = /^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$/
    pwVal = pwInputEl.value
  if(pwRegExp.test(pwVal)) { // 유효성 검사 성공
    isPwValid = true
    pwErrorMsgEl.textContent = ""
} 
else { // 유효성 검사 실패
    isPwValid = false
    pwErrorMsgEl.textContent = errMsg.pw
}
checkPwValid()
console.log(pwVal, pwReVal, isPwValid, account)
});

/** 비밀번호 확인 */
const pwReInputEl = document.querySelector('#info__pwRe input')
const pwReErrorMsgEl = document.querySelector('#info__pwRe .error-msg')
pwReInputEl.addEventListener('change', () => {
    pwReVal = pwReInputEl.value
    checkPwValid()
    console.log(pwVal, pwReVal, isPwValid, account)
});

/** 이메일 */
const emailInputEl = document.querySelector('#info__email input')
const emailErrorMsgEl = document.querySelector('#info__email .error-msg')
emailInputEl.addEventListener('change', () => {
  const idRegExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/
  if(idRegExp.test(emailInputEl.value)) { // 정규식 조건 만족 O
    emailErrorMsgEl.textContent = ""
    account.email = emailInputEl.value
  } else { // 정규식 조건 만족 X
    emailErrorMsgEl.style.color = "red"
    emailErrorMsgEl.textContent = errMsg.email.invalid
    account.email = null
  }
  console.log(account)
});

/** SUBMIT */
/*
const submitBtn = document.querySelector('#submit')
const resultFailEl = document.querySelector('#result-fail')
submitBtn.addEventListener('click', function() {
    let isAllFilled = true
    const word = {  
        id: "아이디를",
        pw: "비밀번호를",
        email: "이메일을"
       
    }
    for(element in account) {
        if(account[element] === null) {
            resultFailEl.textContent = word[element] + " 다시 한번 확인해주세요"
            isAllFilled = false
            break
        }
    }
    if (isAllFilled === true) {
        resultFailEl.textContent = ""
        setTimeout(function() {
            alert("서버 전송 데이터 : " + JSON.stringify(account))
        }, 300)
    }
})

*/




