function pwdvalidate(){
		var pwd=document.getElementById('pwd').value;
		var isCaps=false;
		var isNum=false;
		var isSmall=false;
		var isSpl=false;
		if(pwd.length<16){
			return false;
		}
		else{
			for(i=0;i<pwd.length;i++){
				if(pwd[i]>='A'&&pwd[i]<='Z'){
					isCaps=true;
					break;
				}
			}
			for(i=0;i<pwd.length;i++){
				if(pwd[i]>='a'&&pwd[i]<='z'){
					isSmall=true;
					break;
				}
			}
			for(i=0;i<pwd.length;i++){
				if(!(pwd[i]>='a'&&pwd[i]<='z')||(pwd[i]>='0'&&pwd[i]<='9')||(pwd[i]>='A'&&pwd[i]<='Z')){
					isSpl=true;
					break;
				}
			}
			if(isNum && isCaps && isSmall && isSpl){
				alert('password accepted');
				return true;
			}
			else{
				alert('Invalid password');
				return false;
			}
		}
	}



