

  const emailInput = document.querySelector('.boxEmail');
  const changeEmailBtn = document.getElementById('changeEmail');
  const errorMsg = document.querySelector('.error-msg');
  let originalEmail = emailInput.value; // 원래 이메일 값을 저장

  function enableEmailEditing() {
    emailInput.removeAttribute('readonly');
    changeEmailBtn.textContent = '저장'; // 버튼 텍스트 변경
    changeEmailBtn.removeEventListener('click', enableEmailEditing); // 클릭 이벤트 제거
    changeEmailBtn.addEventListener('click', saveEmail); // 저장 함수 등록
  }

  function saveEmail() {
    const newEmail = emailInput.value; // 편집된 이메일 값
    const emailPattern = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/;

    if (!emailPattern.test(newEmail)) {
      errorMsg.textContent = '유효한 이메일 주소 형식이 아닙니다.';
      return;
    } else {
      errorMsg.textContent = '가능한 이메일입니다.'
      errorMsg.style.color = "green";
    }

    // 여기에 수정한 값을 저장하는 로직 추가 가능

    errorMsg.textContent = ''; // 이전 오류 메시지 제거
    emailInput.setAttribute('readonly', true); // 읽기 전용으로 변경
    originalEmail = newEmail; // 원래 값 업데이트
    changeEmailBtn.textContent = '수정'; // 버튼 텍스트 변경
    changeEmailBtn.removeEventListener('click', saveEmail); // 클릭 이벤트 제거
    changeEmailBtn.addEventListener('click', enableEmailEditing); // 수정 함수 등록
  }

  changeEmailBtn.addEventListener('click', enableEmailEditing);