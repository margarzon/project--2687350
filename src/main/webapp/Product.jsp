<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.beans.Product" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products</title>
</head>
<body>
<h1>Products</h1>
<table>
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Value</th>
        <th>Category ID</th>
    </tr>
    <% Product[] products = new Product[0];
        for (Product product : products) { %>
    <tr>
        <td><%= product.getProductId() %></td>
        <td><%= product.getProductName() %></td>
        <td><%= product.getProductValue() %></td>
        <td><%= product.getCategoryId() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>
