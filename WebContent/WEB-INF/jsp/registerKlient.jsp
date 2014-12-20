    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <html>  
    <head>  
    <title>Dodawanie klienta</title>  
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
     text-align: left;  
    }  
      
    .heading {  
     font-size: 18px;  
     color: white;  
     font: bold;  
     background-color: green;  
     border: thick;  
    }  
    </style>  
    </head>  
    <body>  
     <center>  
        
     <b>Dodaj nowego klienta</b>   
      
        
      
      <div>  
       <form:form method="post" action="insertKlient" modelAttribute="klient">  
        <table>  
         <tr>  
          <td>Imie :</td>  
          <td><form:input path="imie" /></td>  
         </tr>  
         <tr>  
          <td>Nazwisko :</td>  
          <td><form:input path="nazwisko" /></td>  
         </tr>  
         <tr>  
          <td>Telefon :</td>  
          <td><form:input path="telefon" /></td>  
         </tr>   
         <tr>  
          <td>Ulica :</td>  
          <td><form:input path="ulica" /></td>  
         </tr>
         <tr>  
          <td>Numer :</td>  
          <td><form:input path="numer" /></td>  
         </tr>
         <tr>  
          <td>Miasto :</td>  
          <td><form:input path="miasto" /></td>  
         </tr>
         <tr> 
          <td> </td>  
          <td><input type="submit" value="Zapisz" /></td>  
         </tr>  
         <tr>  
            
          <td colspan="10"><a href="getKlient">Zobacz obecna liste klientow</a></td>  
         </tr>  
        </table>  
       </form:form>  
      </div>  
     </center>  
    </body>  
    </html>  