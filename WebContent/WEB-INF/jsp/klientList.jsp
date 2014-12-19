    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
     pageEncoding="ISO-8859-1"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <html>  
    <head>  
    <title>Lista klientów</title>  
    <style>  
    body {  
     font-size: 20px;  
     color: teal;  
     font-family: Calibri;  
    }  
      
    td {  
     font-size: 15px;  
     color: black;  
     width: 100px;  
     height: 22px;  
     text-align: center;  
    }  
    .heading {  
     font-size: 18px;  
     color: white;  
     font: bold;  
     background-color: orange;  
     border: thick;  
    }  
    </style>  
    </head>  
    <body>  
     <center>  
        
       
       
     <b>Klienci</b>  
       
      
      <table border="1">  
       <tr>  
        <td class="heading">Klient Id</td>  
        <td class="heading">Imie</td>  
        <td class="heading">Nazwisko</td>  
        <td class="heading">Telefon</td>  
        <td class="heading">Ulica</td>  
        <td class="heading">Numer</td>  
        <td class="heading">Miasto</td> 
        <td class="heading">Edytuj</td>  
        <td class="heading">Usun</td>    
       </tr>  
       <c:forEach var="klient" items="${klientList}">  
        <tr>  
         <td>${klient.id_klienta}</td>  
         <td>${klient.imie}</td>  
         <td>${klient.nazwisko}</td>  
         <td>${klient.telefon}</td>  
         <td>${klient.ulica}</td>
         <td>${klient.numer}</td>
         <td>${klient.miasto}</td>  
         <td><a href="edit?id=${klient.id_klienta}">Edytuj</a></td>  
         <td><a href="delete?id=${klient.id_klienta}">Usun</a></td>  
        </tr>  
       </c:forEach>  
       <tr><td colspan="10"><a href="register">Dodaj nowego klienta</a></td></tr>  
      </table>  
      
     </center>  
    </body>  
    </html>  