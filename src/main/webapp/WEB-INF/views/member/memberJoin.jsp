<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="./member" method="post">
		<h1> Member Join </h1>
			<div class="id">
      			<label for="id">ID:</label>
      			<input type="text" required="required" class="form-control" name="id">
    		</div><br>
    		
    		<div class="pw">
      			<label for="pw">PW:</label>
      			<input type="password" required="required" class="form-control" name="pw">
    		</div><br>
    		
    		<div class="name">
      			<label for="name">name:</label>
      			<input type="text" required="required" class="form-control" name="name">
    		</div><br>
    		
    		<div class="email">
      			<label for="email">E-mail:</label>
      			<input type="email" class="form-control" name="email">
    		</div><br>
    		
    		<div class="phone">
      			<label for="phone">Phone:</label>
      			<input type="tel" class="form-control" name="phone">
    		</div>
    		<button>JOIN</button>
    	</form>
</body>
</html>