

var ref;
var ref1;
 var carrera;
 var ano;
 
function inicializar() {
    carrera = document.getElementById("carreraMostrar").value;
    ano = document.getElementById("anoMostrar").value;
    
      loadS(carrera,ano);
    addEvent(ref, 'submit', enviarDatos, false);
}

function eliminar() {
    retornarDatos();
	document.getElementById('form').action="delete.php";
}

function enviarDatos(e) {

    if (window.event)
        window.event.returnValue = false;
    else {
        if (e)
            e.preventDefault();
        enviarFormulario();
    }
}

function enviarDatos1(e) {

    if (window.event)
        window.event.returnValue = false;
    else {
        if (e)
            e.preventDefault();
        enviarFormularioDel();
    }
}

var conexion1;
function enviarFormulario()
{

    conexion1 = crearXMLHttpRequest();
    conexion1.onreadystatechange = procesarEventos;
    conexion1.open('GET', "mostrar.php?", true);
    conexion1.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    conexion1.send();
}

var conexion2;
function enviarFormularioDel()
{

    conexion2 = crearXMLHttpRequest();
    conexion2.onreadystatechange = procesarEventos;
    conexion2.open('GET', "delete.php?", false);
    conexion2.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    conexion2.send();
}

function procesarEventos()
{
    if (conexion1.readyState == 4)
    {
        if (conexion1.status != 200)
            alert(conexion1.statusText);
        if (conexion1.responseText == "")
            parent.alert("Seleccione los profesores que desea eliminar");
        else
            parent.alert(conexion1.responseText);
    }
    loadS();
}

function retornarDatos() {
    var c = 0;
    var arrayCajas = ["nosirve"];
    var cajas = document.getElementsByName("select");
    for (i in cajas) {
        if (cajas[i].checked) {
            arrAux = arrayCajas.concat(cajas[i].id);
            arrayCajas = arrAux;
            c++;
        }
    }
    for (i in arrayCajas) {
        if (i == 0) {
            cadAux = $i + '=' + encodeURIComponent(arrayCajas[i]);
            cad = cad + cadAux;
        } else {
            cadAux = '&' + $i + '=' + encodeURIComponent(arrayCajas[i]);
            cad = cad + cadAux;
        }
    }
    cad = cad + '&contador=' + encodeURIComponent(c);
    $cadena = cad;
 //   loadDel($cadena);
//    return cad;
}

///funciones comunes
function addEvent(elemento, nomevento, funcion, captura)
{
    if (elemento.attachEvent)
    {
        elemento.attachEvent('on' + nomevento, funcion);
        return true;
    }
    else
    if (elemento.addEventListener)
    {
        elemento.addEventListener(nomevento, funcion, captura);
        return true;
    }
    else
        return false;
}
function crearXMLHttpRequest()
{
    var xmlHttp = null;
    if (window.ActiveXObject)
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    else
    if (window.XMLHttpRequest)
        xmlHttp = new XMLHttpRequest();
    return xmlHttp;
}

//---------------------------------
// Cragar una pagina dentro de un div
var pagina_requerida;

function loadS(carrera,ano) {
    pagina_requerida = crearXMLHttpRequest();
    pagina_requerida.onreadystatechange = function() { // funcion de respuesta
        cargarpagina(pagina_requerida, "contenidos");
    }
    pagina_requerida.open('GET', "mostrar.php?"+"carrera="+carrera+"&ano="+ano, true); // asignamos los metodos open y send
    pagina_requerida.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    pagina_requerida.send();
}

var pagina_requeridaD;

function loadDel($cadena) {
    pagina_requeridaD = crearXMLHttpRequest();
    pagina_requeridaD.open('GET', "delete.php" + $cadena, false); // asignamos los metodos open y send
    pagina_requeridaD.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    pagina_requeridaD.send();
}

function cargarpagina(pagina_requerida, id_contenedor) {
    if (pagina_requerida.readyState == 4 && (pagina_requerida.status == 200 || window.location.href.indexOf("http") == -1))
        document.getElementById(id_contenedor).innerHTML = pagina_requerida.responseText;

}

function div_Ocultos(id_form, id_div) {
    var forms = document.getElementsByTagName("form");
    for (i = 0; i < forms.length; i++) {
        if (i != id_form)
            document.getElementById(i).hidden = "true";
    }

}

function inhabilitar (este){
    
}