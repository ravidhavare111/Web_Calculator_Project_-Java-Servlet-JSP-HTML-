<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator-Home Page</title>
<link rel="stylesheet" href="style.css">
</head>


<body class="BodyTag">
<header>
<img src="Images\LuaghingRobo.gif" class="image"></img>
<h2 class="h3">Random Joke = <%=request.getParameter("joke") %></h2><br>
</header>

<section>
<form action="MyServlet">
<input name="num1" placeholder="Enter 1st number" class="input"></input>
<input name="num2" placeholder="Enter 2nd number" class="input"></input><br><br>
<button name="btn" value="1" class="button">+</button> 
<button name="btn" value="2" class="button">-</button>
<button name="btn" value="3" class="button">*</button>
<button name="btn" value="4" class="button">/</button>
</form>

<h1 class="answer">Answer=<%=request.getParameter("ans") %> </h1>
</section>



<aside>
<a href="index.html" class="Home">Home</a>
</aside>

<br>
<br>
<br><br>

<footer>

<h4>&copy  |  Contact: 7768914979  |  Email: ravidhavare111@gmail.com</h4>

</footer>





</body>
</html>
</body>
</html>