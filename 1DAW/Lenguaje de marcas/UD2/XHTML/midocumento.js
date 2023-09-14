function a(){
   
    var b = document.getElementById("title");
    alert(b.firstChild.nodeValue);
    b.firstChild.nodeValue = "No hace falta practicar mas";

    // Coge el atributo clase de el id rama
    var a = document.getElementById("rama");

    alert(a.className);

    //cambiar valor de nodo atrubuto

    a.className = "rafa";

    //añadir nodos
    var c = document.createElement("p");
    c.id = "parrafo";

    var text = document.createTextNode("Hola mundo");

    c.appendChild(text);
    document.body.appendChild(c);

    //borrar un nodo
    var borrar = document.getElementById("borrar");
    document.body.removeChild(borrar)

    
}   

