function checkEmail(myEmail){
	if (myEmail){//ist myUserid ein sinnvoller String?
		return "";
	}else{
		return "Die E-Mail darf nicht leer sein";
	}
}

function checkPassword(myPassword){
	if (myPassword){
		if (myPassword.length >= 6){
			return ""; //keine Fehlermeldung
		}
	}
	return "Das Password muss mindestens 6 Zeichen lang sein";
}

function checkUserid(myUserid){
	if (myUserid){//ist myUserid ein sinnvoller String?
		return ""; //keine Fehlermeldung
	}else{
		return "Der Nickname darf nicht leer sein";
	}
}