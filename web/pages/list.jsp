<%@page import="com.project.impot.model.Maison" %>
<% 
    Maison[] maisons = new Maison[0];

    try {
        maisons = Maison.getAll();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <ul>
        <% for (Maison maison : maisons) { %>
            <li><%= maison.getId() %></li>
        <% } %>
    </ul>
</body>
</html>