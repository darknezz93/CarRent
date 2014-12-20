// JavaScript Document

$(document).ready(function(){ 
						   
	$("div").mouseenter(function(){
		$(this).css("background-color", "rgba(191,191,175, 0.7)");
		}
		)
});



$(document).ready(function(){ 
						   
	$("div").mouseleave(function(){
		$(this).css("background-color", "rgba(252,252,232, 0)");
		})
});


$(document).ready(function(){
	$("h1").mouseenter(function(){

		$(this).css("background-color", "rgba(252,252,232, 0.65)");
	})
});


$(document).ready(function(){
	$("h1").mouseleave(function(){

		$(this).css("background-color", "rgba(252,252,232, 0.55)");

	})
});

function validateComment(input){
	if(input.value.length <20){
		input.setCustomValidity("Teks musi mieć minimum 20 znaków");
	}
	else{
		input.setCustomValidity("");
	}
}


function validateForm() {

  if (!Modernizr.input.required) {
    // Jeśli przeglądarka nie rozpoznaje atrybutu required, należy samodzielnie sprawdzić, 
    // czy wymagane pola zostały poprawnie wypełnione.

    // Najpierw, stwórz tablicę ze wszystkimi elementami.
    var inputElements = document.getElementById("contactDetails").elements;

    // Następnie, przeszukaj tablicę element po elemencie.
    for(var i = 0; i < inputElements.length; i++) {

      // Sprawdź czy element posiada atrybut required.
      if (inputElements[i].hasAttribute("required")) {
        // Jeśli znaleziono atrybut required, sprawdź, jaką ma wartość.
        // Jeśli nie zidentyfikowano go, formularz nie przechodzi walidacji, 
		// a cała funkcja zwraca wartość false (fałsz).
        if (inputElements[i].value == "") {
          alert("Niestandardowy mechanizm walidacji wykrył błąd. Formularz nie został wysłany.");
          return false;
        }
      }
    }

    // Jeśli przeglądarka dodarła do tego punktu, walidacja się powiodła, 
    // i formularz może zostać wysłany.
    return true;
  }
}

