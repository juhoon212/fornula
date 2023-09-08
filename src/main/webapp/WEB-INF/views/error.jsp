<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
    <link
	href="https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap"
	rel="stylesheet">

</head>

<style>
    .ca {
        margin-top: 300px;
        margin-left: auto;
        margin-right: auto;
        text-align: center;
        font-family: 'Permanent Marker', cursive;
        display: flex;
        flex-direction: column;
        flex-wrap: wrap;
        align-content: space-around;
        align-items: center;
    }
    
    .ca a{
        font-size: 100px;
        color: black;
        text-decoration: none;
        
    }
    
    .ca button {
        font-family: 'Do+Hyeon';
        margin-top: 50px;
        background-color: #fff;
        border: none;
        font-size: 20px;
    }

    .ca button:hover {
        color: #fdbb42;;
        transition: 0.3s;
    }

    span {
        margin-top: 20px;
        font-family: 'Do+Hyeon';
    }
</style>
<body>
    
    <div class = "ca">
        <a href="<c:url value="/"/>">FORNUAL </a>
        <span>잘못된 접근입니다</span>
        <div>${message}</div>
        <button onclick="history.back()">Back</button>
    </div>
</body>
</html>
