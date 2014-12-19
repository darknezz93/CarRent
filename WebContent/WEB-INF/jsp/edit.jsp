    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
    <html>  
    <head>  
    <title>Edycja</title>  
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
        
       
       
     <b>Edytowanie danych klienta</b>  
       
      
      <div>  
       <form:form method="post" action="update" modelAttribute="klient">  
        <table>  
         <tr>  
          <td>Imie :</td>  
          <td><form:input path="imie"  
            value="${map.klient.imie}" />  
          </td>  
         </tr>  
         <tr>  
          <td>Nazwisko :</td>  
          <td><form:input path="nazwisko" value="${map.klient.nazwisko}" />  
          </td>  
         </tr>  
         <tr>  
          <td>Telefon :</td>  
          <td><form:input path="telefon" value="${map.klient.telefon}" />  
          </td>  
         </tr>  
         <tr>
         <tr>  
          <td>Ulica:</td>  
          <td><form:input path="ulica" value="${map.klient.ulica}" />  
          </td>  
         </tr>  
         <tr>
         <tr>  
          <td>Numer :</td>  
          <td><form:input path="numer" value="${map.klient.numer}" />  
          </td>  
         </tr>  
         <tr>
         <tr>  
          <td>Miasto :</td>  
          <td><form:input path="miasto" value="${map.klient.miasto}" />  
          </td>  
         </tr>  
 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" />  
          </td>  
         </tr>  
        </table>  
        <form:hidden path="id_klienta" value="${map.klient.id_klienta}" />  
      
       </form:form>  
      </div>  
     </center>  
    </body>  
    </html>  