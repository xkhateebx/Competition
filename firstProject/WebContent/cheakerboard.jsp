<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./style.css">
<meta charset="UTF-8">
<title>CheakerBoard</title>
</head>
<body>

	<!-- getting the value for the Height parameter -->
    <%int height = Integer.parseInt(request.getParameter("height")); %>
    <!-- displaying the value -->
    <!-- getting the value for the Width parameter -->

    
    <%int width = Integer.parseInt(request.getParameter("width")); %>
    <!-- displaying the value -->

    
    <main style="grid-template-columns: repeat(<%= height%>, 65px);">
    <% for(int index = 0; index < width  ; index++) { %>
    <%if(index % 2 == 0){ %>
        <% for(int index1 = 0; index1 < width/2  ; index1++) { %>
        
            <div class="white"></div>
    		<div class="black"></div>
    	<% }} %>
    	<%if(index % 2 != 0){ %>
    	<% for(int index2 = 0; index2 < width/2  ; index2++) { %>
        
            <div class="black"></div>
    		<div class="white"></div>
    	<% }}} %>
    	
</main>
</body>
</html>