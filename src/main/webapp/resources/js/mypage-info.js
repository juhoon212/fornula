  function toggleEditMode() {
    const emailInput = document.getElementById("email-box");
    const changeEmailBtn = document.getElementById("changeEmailBtn");
    const saveEmailBtn = document.getElementById("saveEmailBtn");
    const errorMsg = document.querySelector(".error-msg");

    emailInput.value = ""; 
    emailInput.removeAttribute("readonly");
    changeEmailBtn.style.display = "none";
    saveEmailBtn.style.display = "block";
    errorMsg.style.display = "none"; 
  }

  function saveEmail() {
    const emailInput = document.getElementById("email-box");
    const changeEmailBtn = document.getElementById("changeEmailBtn");
    const saveEmailBtn = document.getElementById("saveEmailBtn");
    const errorMsg = document.querySelector(".error-msg");

    const newEmail = emailInput.value;
    const emailPattern = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/;

    if (!emailPattern.test(newEmail)) {
      errorMsg.textContent = "유효한 이메일 주소를 입력해주세요.";
      errorMsg.style.display = "block";
      return;
    }

    errorMsg.style.display = "none";
    emailInput.setAttribute("readonly", "readonly");
    changeEmailBtn.style.display = "block";
    saveEmailBtn.style.display = "none";
  }