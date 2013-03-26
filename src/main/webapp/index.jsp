<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
	
 </head>

<body>
<center>
<h3> Spring Framework - E-mail Gönderme Uygulaması </h3>

<form class="form-horizontal" method='post' action="sending"><br>

Kime
<input type="text" class="input-xlarge" id="to" name="to"><br>
Konu
<input type="text" class="input-xlarge" id="subject" name="subject"><br>
Mesaj
<textarea class="input-xlarge" id="message" name="message" rows="15"></textarea><br>
<input type="submit" value="Gonder">
</form>
</center>

</body>
</html>
