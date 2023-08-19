/**
 * 
 */
 
let loginButton = document.querySelector('#loginButton');
let close = document.querySelector('.close');
    

    loginButton.addEventListener('click', () => {
        document.querySelector('.black-bg').classList.add('show-modal');
    })

    close.addEventListener('click', () => {
        document.querySelector('.black-bg').classList.remove('show-modal');
    })