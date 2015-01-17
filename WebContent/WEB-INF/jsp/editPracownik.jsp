    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
    <html>  
    <head> 
    
    
     <link href='http://fonts.googleapis.com/css?family=Michroma' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
	 <script src="//code.jquery.com/jquery-1.10.2.js"></script>
	 <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
	 <link rel="stylesheet" href="/resources/demos/style.css">
	 
	 
	  <script>
	  $(function() {
		$( "#data_zatrudnienia" ).datepicker({dateFormat: "yy-mm-dd"});
	  });
	 </script>
	 
	 
	 
	
	<script type="text/javascript">
            function validate()
            {
                var imie = document.getElementById("imie");
                var nazwisko = document.getElementById("nazwisko");
                var dataZatrudnienia = document.getElementById("data_zatrudnienia");
                var pensja = document.getElementById("pensja");
                var telefon = document.getElementById("telefon");
                
                var imieVal = document.getElementById("imie").value;
                var nazwiskoVal = document.getElementById("nazwisko").value;
                var dataZatrudnieniaVal = document.getElementById("data_zatrudnienia").value;
                var pensjaVal = document.getElementById("pensja").value;
                var telefonVal = document.getElementById("telefon").value;
                
                
        		//Date.format = 'yyyy-mm-dd';
        		//var sprawdz = Date.fromString(dataZatrudnieniaVal); //zwraca true lub false w zaleznosci czy pasuje fo formatu

                var valid = true;
                if(imie.value.length<=0 || nazwisko.value.length<=0 || dataZatrudnienia.value.length<=0 || pensja.value.length<=0 || telefon.value.length<=0)
                {
                    alert("Nie zostawiaj pustych pól!");
                    valid = false;
                }
                else{
                    if(isNaN(pensjaVal))
                    {
                        alert("Podaj poprawne wartość pola Pensja.");
                		valid = false;
                	}
                    else if(isNaN(telefonVal))
                    	{
                    		alert("Podaj poprawnie Telefon.");
                    		valid= false;
                    	}
                    else if(telefonVal.length != 9)
                    	{
                    		alert("Wartość pola Telefon powinna składać się z 9 cyfr.");
                    		valid = false;
                    	}
                    else if(!isNaN(imieVal))
                    	{
                    		alert("Podaj poprawnie wartość pola Imie.");
                    		valid = false;
                    	}
                    else if(!isNaN(nazwiskoVal))
                    	{
                    		alert("Podaj poprawnie wartość pola Nazwisko.");
                    		valid = false;
                    	}
            }
            return valid;
          };

        </script>
    
    
     
    <title>Edycja</title>  
    <style>
    
    header{
	text-align:center;
	background-color:rgba(252,252,232, 0.8);    #19A7FF
	height: 30px;
	padding:20px;
	margin: 0 auto;
	max-width:100%;
	font-family: Michroma;
	margin-top:-8px;
	margin-left:-8px;
	margin-right: -8px;
	
}

body{

	background-image:url("css/scena.jpg");
	background-size: cover;
}


#menu{
	background-color:##19A7FF;
    transition: background-color 0.4s ease;
    display:inline; 
    font-size:21px;
    padding:20px;
    margin-top:10px;

}

#rounded_box_1{
	background-color: rgba(252,252,232, 0.55);  rgba(252,252,232, 0.55)
	text-align: left;
	font-family: 'Patrick Hand SC', cursive;
	font-size:24px;
	color: #05011C;
	margin: 0 auto;
	width: 70%;
	height: 40%;
	margin-top: 100px;
	padding-top:7%;
	padding-bottom:7%;
	padding-left:30px;
	padding-right:30px;
	margin-bottom:50px;
	box-shadow: 6px 6px 10px gray;

}

#face_image{
	float: right;
	padding-left: 20px;
	padding-right: 10px;
	padding-top: 35px;
	padding-bottom:20px;
	margin-top:-90px;

}

a{
	text-decoration: none;
	color: black;
}

fieldset{
	font-family: Michroma;
	font-size: 24px;
	width: 500px;
	height: 50%;
	margin: 10% auto;	
	border-color: #FFFEC8;
	padding: 20px; 	
	background-color: rgba(252,252,232, 0.55) ;

}

label{
	margin: 6px;
	display: inline-block;
	vertical-align: top;
}

legend{
	font-weight: bold;
	color: rgb(255,255,255);
}

#email{
	margin-left:40px;
	width: 200px;
}

#message{
	width:350px;
	
}

textarea{
	height: 100px;
	margin-top:15px;
}

#send_button{
	margin-left:65%;
	height: 30px;
	font-family: Michroma;
}


.gallery img{
	margin: 5px;
	padding: 5px;
	width: 20%;
	border: solid 1px black;
	background: white;
	margin-left:9%;
	margin-bottom: 40px;
	margin-top: 60px;
	-moz-transition: all 0.7s;
	-webkit-transition: all 0.7s;
	-o-transition: all 0.7s;
}

.gallery img:hover{
	-webkit-transform: scale(1.5);
	-moz-transform: scale(1.5) ;
	-o-tranform: scale(1.5);
}




#rounded_box_2{
	background-color: rgba(252,252,232, 0.55);  rgba(252,252,232, 0.55)
	text-align: center;
	font-family: 'Patrick Hand SC', cursive;
	font-size:24px;
	color: #05011C;
	margin: 0 auto;
	width: 70%;
	height: 40%;
	margin-top: 50px;
	padding-top:4%;
	padding-bottom:7%;
	padding-left:30px;
	padding-right:30px;
	box-shadow: 6px 6px 10px gray;

}

#rounded_box_3{
	background-color: rgba(252,252,232, 0.55);  rgba(252,252,232, 0.55)
	text-align: center;
	font-family: 'Patrick Hand SC', cursive;
	font-size:24px;
	color: #05011C;
	margin: 0 auto;
	margin-bottom:50px;
	width: 40%;
	height: 40%;
	margin-top: 50px;
	padding-top:3%;
	padding-bottom:4%;
	padding-left:30px;
	padding-right:30px;
	box-shadow: 6px 6px 10px gray;

}


iframe{
	
	padding-top:100px;
	padding-bottom:50px;	
	padding-left:100px;
	margin-left:5%;
	text-align:center;
	width:640px;
	height:360px;
}


@media (max-width: 1366px){

	iframe{
	padding-top:100px;
	padding-left:100px;
	padding-bottom:50px;
	margin-left:5%;
	text-align:center;
	width:460px;
	height:280px;
}}


#resume_header{
	font-size: 28px;
	color: #F6FFB2;
	font-weight: bold;

}

#resume_content{
	font-size: 24px;
}
    
    </style>  
    </head>
    
    <center>
    <header>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getKlient">Klienci</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getSamochod">Samochody</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getMiejsce">Lokalizacje</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getPracownik">Pracownicy</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/registerKlient">Wypożyczenia</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/registerKlient">Utwórz wypożyczenie</a></div>
	</header>
	</center>
      
    <body>  
     <center>  
        
       
       
     <b>Edytowanie danych pracownika</b>  
       
      
      <div>  
       <form:form method="post" action="updatePracownik" modelAttribute="pracownik" onsubmit="return validate()">  
        <table>  
         <tr>  
          <td>Imie :</td>  
          <td><form:input path="imie"  
            value="${map.pracownik.imie}" />  
          </td>  
         </tr>  
         <tr>  
          <td>Nazwisko :</td>  
          <td><form:input path="nazwisko" value="${map.pracownik.nazwisko}" id="nazwisko" />  
          </td>  
         </tr>  
         <tr>  
          <td>Data zatrudnienia :</td>  
          <td><form:input path="data_zatrudnienia" value="${map.pracownik.data_zatrudnienia}" id="data_zatrudnienia" />  
          </td>  
         </tr>  
         <tr>
         <tr>  
          <td>Pensja:</td>  
          <td><form:input path="pensja" value="${map.pracownik.pensja}" id="pensja" />  
          </td>  
         </tr>  
         <tr>
         <tr>  
          <td>Telefon :</td>  
          <td><form:input path="telefon" value="${map.pracownik.telefon}" id="telefon" />  
          </td>  
         </tr>   
 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Zapisz" />  
          </td>  
         </tr>  
        </table>  
        <form:hidden path="id_pracownika" value="${map.pracownik.id_pracownika}" id="id_pracownika" />  
      
       </form:form>  
      </div>  
     </center>  
    </body>  
    </html>  