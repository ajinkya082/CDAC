function check(){
    let name=document.myform.fname.value;
    let regname="^[a-zA-Z ]{3,20}$";

    let uemail=document.myform.uemail.value;

    let upass=document.myform.pass.value;
    let regupass= /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

    let uedu=document.myform.edu;
    let ucourse=document.myform.course.value;

    if(name==""){
        window.alert("Full name is required");
        document.myform.fname.focus();
        return false;
    }
    if(!name.match(regname)){
        window.alert("Name should contain minimum 3 characters and maximum 20 character");
        document.myform.fname.focus();
        return false;
    }
    if(uemail==""){
        window.alert("Please Enter your email!");
        document.myform.fname.focus();
        return false;
    }
    if(upass==""){
        window.alert("Please enter password");
        document.myform.fname.focus();
        return false;
    }
    if(!upass.match(regupass)){
        window.alert("Please enter password with min 8 digit and a special character , uppercase ,lowercase character !");
        document.myform.fname.focus();
        return false;
    }
    if(uedu[0].checked==false && uedu[1].checked==false && uedu[2].checked==false && uedu[3].checked==false ){
        window.alert("Select Your qualification");
        document.myform.fname.focus();
        return false;
    }
    if(ucourse==""){
        window.alert("Please select your course!");
        document.myform.fname.focus();
        return false;
    }
}