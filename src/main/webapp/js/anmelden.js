function checkPassword(myPassword){
	if (myPassword){
			return ""; //keine Fehlermeldung
	}else{
		return "Das Password darf nicht leer sein";
	}
	
}

function checkUserid(myUserid){
	if (myUserid){//ist myUserid ein sinnvoller String?
		return ""; //keine Fehlermeldung
	}else{
		return "Der Nickname darf nicht leer sein";
	}
}