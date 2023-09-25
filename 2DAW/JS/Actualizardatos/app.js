var persona = {
    nombre : '',
    apellido : '',
    correo : '',
    dni : '',
    asignaturas : ['DWC','DWS','...']
}

function obtenerValor() {
    const valor = document.getElementById('miInput').value
    const valor2 = document.getElementById('miInput2').value
    
    if (valor2 == 'hola123') {
        
        alert("Has iniciado sesion correctamente")
        window.location.href = "datos.html";
    }else{
        alert("Contraseña incorrecta")
    }

}

function guardarDatos(){

    const nombre = document.getElementById('nombre').value
    const apellido = document.getElementById('apellido').value
    const correo = document.getElementById('correo').value
    const dni = document.getElementById('dni').value

    persona.nombre =nombre
    persona.apellido = apellido
    persona.correo = correo
    persona.dni = dni

    

}


function mostrarPersona(){

    console.log(persona)
}

//prueva
