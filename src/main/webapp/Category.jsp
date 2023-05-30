<%@ page import="model.beans.Category" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Categories</title>
</head>
<body>
<h1>Categories</h1>
<table>
    <tr>
        <th>Category ID</th>
        <th>Category Name</th>
    </tr>
    <% Category[] categories = new Category[0];
        for (Category category : categories) { %>
    <tr>
        <td><%= category.getCategoryId() %></td>
        <td><%= category.getCategoryName() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>
