window.onload = function () {

    var android = Android;

    var btn = document.getElementById("button");
    var title = document.getElementById("title");

    // Variante 1: alt, IE8 konform
    // Nachteil: wir können nur ein CallBack zuweisen
    /*
    btn.onclick = function () {
        btn.innerHTML = "Geklickt";
    }
    */

    // Variante 2: neu, mit einem "Event"
    btn.addEventListener(
        "click", // Event-Typ
        function() {
            btn.innerHTML = "Geklickt";
            title.innerHTML = android.getData();
            android.showToast("Hallo von Javascript!");
        }
     );

}