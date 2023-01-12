function check()
{
    var phno_int=parseInt(document.getElementsByName("Phone_no")[0].value);
    if(document.getElementsByName("FirstName")[0].value=="")
    {
        window.alert("Please Enter the FirstName");
    }
    if(document.getElementsByName("LastName")[0].value==""){window.alert("Please Enter The LastName");}
    if(document.getElementsById("email")[0].value=="")
        {window.alert("Please Enter The Emailid");}
    if(document.getElementsByName("Phone_no")[0].value==""){window.alert("Please Enter the Phone_no");} 
    if(Number.isInteger(phno_int)==false)
    {
        window.alert("Invalid PhoneNumber");
    } 
    else if(document.getElementsByName("Phone_no")[0].value.length>10){window.alert("Phone_no is greater_than 10 digit");}
    if(document.getElementsByName("CreatePassword")[0].value==""){window.alert("Please CreatePassword");}
    if(document.getElementsByName("RetypePassword")[0].value==""){window.alert("Please RetypePassword");}
    if(document.getElementsByName("CreatePassword")[0].value!=document.getElementsByName("RetypePassword")[0].value){window.alert("Passwords do not match");}
}