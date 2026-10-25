function Replace(){
    let message=document.getElementById("t1").value;
    let oldmessage=document.getElementById("t2").value;
    let newMessage=document.getElementById("t3").value;

    if(message==""){
        alert("Enter message!");
        return false;
    }
    if(oldmessage==""){
        alert("Enter old text");
        return false;
    }

    let result=message.replace(oldmessage,newMessage);
    document.getElementById("t1").value=result;
}
function ReplaceAll(){
    let message=document.getElementById("t1").value;
    let oldText=document.getElementById("t2").value;
    let newText=document.getElementById("t3").value;

    if(message==""){
        alert("Enter message!");
        return false;

    }
    if(oldText==""){
        alert("Enter old text");
        return;
    }

    let result=message.replaceAll(oldText,newText);

    document.getElementById("t1").value=result;
}