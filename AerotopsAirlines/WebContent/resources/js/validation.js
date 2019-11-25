function validatePassword(){
	
	var password = document.getElementById("pwd");
	var confirm_password = document.getElementById("cpwd");
  if(password.value != confirm_password.value) {
	  document.getElementById('valid').innerHTML = 'not match';
  } else {
	  document.getElementById('valid').innerHTML = 'match';
  }
}