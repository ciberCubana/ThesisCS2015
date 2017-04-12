// Documento JavaScript
// Esta función cargará las paginas	
function definir() {
    if(varConf == "on"){
        document.getElementById('confer').style = "visibility: hidden;";
		document.getElementById('contents').style = "visibility: hidden;";
        varConf = "off";
    } else {
        document.getElementById('confer').style = "visibility: visible;";
		document.getElementById('contents').style = "visibility: visible;";
        varConf = "on";
    }
    document.save.conf.value = varConf;
	document.save.cp.value = varCp;
}
function definirCP() {
    if(varConf == "off"){
        document.getElementById('confer').style = "visibility: hidden;";
		document.getElementById('contents').style = "visibility: hidden;";
    } else {
        document.getElementById('confer').style = "visibility: visible;";
		document.getElementById('contents').style = "visibility: visible;";
    }
    if(varCp == "off"){
        varCp = "on";
    }else{
        varCp = "off";
		}
    document.save.cp.value = varCp;
	document.save.conf.value = varConf;
}
function modifica11(text) {
    if(var11 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var11 = 1;
    }else if(var11 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var11 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var11 = 0;
    }
}
function modifica12(text) {
    if(var12 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var12 = 1;
    }else if(var12 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var12 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var12 = 0;
    }
}
function modifica13(text) {
    if(var13 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var13 = 1;
    }else if(var13 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var13 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var13 = 0;
    }
}
function modifica14(text) {
    if(var14 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var14 = 1;
    }else if(var14 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var14 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var14 = 0;
    }
}
function modifica15(text) {
    if(var15 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var15 = 1;
    }else if(var15 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var15 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var15 = 0;
    }
}
function modifica21(text) {
    if(var21 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var21 = 1;
    }else if(var21 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var21 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var21 = 0;
    }
}
function modifica22(text) {
    if(var22 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var22 = 1;
    }else if(var22 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var22 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var22 = 0;
    }
}
function modifica23(text) {
    if(var23 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var23 = 1;
    }else if(var23 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var23 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var23 = 0;
    }
}
function modifica24(text) {
    if(var24 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var24 = 1;
    }else if(var24 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var24 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var24 = 0;
    }
}
function modifica25(text) {
    if(var25 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var25 = 1;
    }else if(var25 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var25 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var25 = 0;
    }
}
function modifica31(text) {
    if(var31 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var31 = 1;
    }else if(var31 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var31 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var31 = 0;
    }
}
function modifica32(text) {
    if(var32 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var32 = 1;
    }else if(var32 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var32 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var32 = 0;
    }
}
function modifica33(text) {
    if(var33 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var33 = 1;
    }else if(var33 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var33 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var33 = 0;
    }
}
function modifica34(text) {
    if(var34 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var34 = 1;
    }else if(var34 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var34 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var34 = 0;
    }
}
function modifica35(text) {
    if(var35 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var35 = 1;
    }else if(var35 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var35 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var35 = 0;
    }
}
function modifica41(text) {
    if(var41 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var41 = 1;
    }else if(var41 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var41 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var41 = 0;
    }
}
function modifica42(text) {
    if(var42 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var42 = 1;
    }else if(var42 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var42 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var42 = 0;
    }
}
function modifica43(text) {
    if(var43 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var43 = 1;
    }else if(var43== 1){
        document.getElementById(text).src = '../images/img3.ico';
        var43 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var43 = 0;
    }
}
function modifica44(text) {
    if(var44 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var44 = 1;
    }else if(var44 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var44 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var44 = 0;
    }
}
function modifica45(text) {
    if(var45 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var45 = 1;
    }else if(var45 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var45 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var45 = 0;
    }
}
function modifica51(text) {
    if(var51 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var51 = 1;
    }else if(var51 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var51 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var51 = 0;
    }
}
function modifica52(text) {
    if(var52 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var52 = 1;
    }else if(var52 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var52 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var52 = 0;
    }
}
function modifica53(text) {
    if(var53 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var53 = 1;
    }else if(var53 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var53 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var53 = 0;
    }
}
function modifica54(text) {
    if(var54 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var54 = 1;
    }else if(var54 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var54 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var54 = 0;
    }
}
function modifica55(text) {
    if(var55 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var55 = 1;
    }else if(var55 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var55 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var55 = 0;
    }
}
function modifica61(text) {
    if(var61 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var61 = 1;
    }else if(var61 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var61 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var61 = 0;
    }
}
function modifica62(text) {
    if(var62 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var62 = 1;
    }else if(var62 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var62 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var62 = 0;
    }
}
function modifica63(text) {
    if(var63 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var63 = 1;
    }else if(var63 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var63 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var63 = 0;
    }
}
function modifica64(text) {
    if(var64 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var64 = 1;
    }else if(var64 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var64 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var64 = 0;
    }
}
function modifica65(text) {
    if(var65 == 0){
        document.getElementById(text).src = '../images/img2.ico';
        var65 = 1;
    }else if(var65 == 1){
        document.getElementById(text).src = '../images/img3.ico';
        var65 = 2;
    } else {
        document.getElementById(text).src = '../images/img1.ico';
        var65 = 0;
    }
}            
function modificaL11(text) {
    if(varL11 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL11 = 1;		
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL11 = 0;
    }
}
function modificaL12(text) {
    if(varL12 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL12 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL12 = 0;
    }
}
function modificaL13(text) {
    if(varL13 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL13 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL13 = 0;
    }
}
function modificaL14(text) {
    if(varL14 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL14 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL14 = 0;
    }
}
function modificaL15(text) {
    if(varL15 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL15 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL15 = 0;
    }
}
function modificaL21(text) {
    if(varL21 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL21 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL21 = 0;
    }
}
function modificaL22(text) {
    if(varL22 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL22 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL22 = 0;
    }
}
function modificaL23(text) {
    if(varL23 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL23 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL23 = 0;
    }
}
function modificaL24(text) {
    if(varL24 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL24 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL24 = 0;
    }
}
function modificaL25(text) {
    if(varL25 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL25 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL25 = 0;
    }
}
function modificaL31(text) {
    if(varL31 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL31 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL31 = 0;
    }
}
function modificaL32(text) {
    if(varL32 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL32 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL32 = 0;
    }
}
function modificaL33(text) {
    if(varL33 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL33 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL33 = 0;
    }
}
function modificaL34(text) {
    if(varL34 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL34 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL34 = 0;
    }
}
function modificaL35(text) {
    if(varL35 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL35 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL35 = 0;
    }
}
function modificaL41(text) {
    if(varL41 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL41 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL41 = 0;
    }
}
function modificaL42(text) {
    if(varL42 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL42 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL42 = 0;
    }
}
function modificaL43(text) {
    if(varL43 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL43 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL43 = 0;
    }
}
function modificaL44(text) {
    if(varL44 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL44 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL44 = 0;
    }
}
function modificaL45(text) {
    if(varL45 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL45 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL45 = 0;
    }
}
function modificaL51(text) {
    if(varL51 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL51 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL51 = 0;
    }
}
function modificaL52(text) {
    if(varL52 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL52 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL52 = 0;
    }
}
function modificaL53(text) {
    if(varL53 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL53 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL53 = 0;
    }
}
function modificaL54(text) {
    if(varL54 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL54 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL54 = 0;
    }
}
function modificaL55(text) {
    if(varL55 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL55 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL55 = 0;
    }
}
function modificaL61(text) {
    if(varL61 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL621 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL61 = 0;
    }
}
function modificaL62(text) {
    if(varL62 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL62 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL62 = 0;
    }
}
function modificaL63(text) {
    if(varL63 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL63 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL63 = 0;
    }
}
function modificaL64(text) {
    if(varL64 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL64 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL64 = 0;
    }
}
function modificaL65(text) {
    if(varL65 == 0){
        document.getElementById(text).src = '../images/ocupado.ico';
        varL65 = 1;
    }else {
        document.getElementById(text).src = '../images/libre.ico';
        varL65 = 0;
    }
}

function inicializar(){
    var11 = 0;
    var12 = 0;
    var13 = 0;
    var14 = 0;
    var15 = 0;
    var21 = 0;
    var22 = 0;
    var23 = 0;
    var24 = 0;
    var25 = 0;
    var31 = 0;
    var32 = 0;
    var33 = 0;
    var34 = 0;
    var35 = 0;
    var41 = 0;
    var42 = 0;
    var43 = 0;
    var44 = 0;
    var45 = 0;
    var51 = 0;
    var52 = 0;
    var53 = 0;
    var54 = 0;
    var55 = 0;
    var61 = 0;
    var62 = 0;
    var63 = 0;
    var64 = 0;
    var65 = 0;
}

function inicializarL(){
    varL11 = 0;
    varL12 = 0;
    varL13 = 0;
    varL14 = 0;
    varL15 = 0;
    varL21 = 0;
    varL22 = 0;
    varL23 = 0;
    varL24 = 0;
    varL25 = 0;
    varL31 = 0;
    varL32 = 0;
    varL33 = 0;
    varL34 = 0;
    varL35 = 0;
    varL41 = 0;
    varL42 = 0;
    varL43 = 0;
    varL44 = 0;
    varL45 = 0;
    varL51 = 0;
    varL52 = 0;
    varL53 = 0;
    varL54 = 0;
    varL55 = 0;
    varL61 = 0;
    varL62 = 0;
    varL63 = 0;
    varL64 = 0;
    varL65 = 0;
}

function llamarasincrono(url, id_contenedor){
    var pagina_requerida = false
    document.save.A1lunesP.value = var11;
    document.save.A1lunesS.value = var21;
    document.save.A1lunesT.value = var31;
    document.save.A1lunesC.value = var41;
    document.save.A1lunesQ.value = var51;
    document.save.A1lunesX.value = var61;
    document.save.A1martesP.value = var12;
    document.save.A1martesS.value = var22;
    document.save.A1martesT.value = var32;
    document.save.A1martesC.value = var42;
    document.save.A1martesQ.value = var52;
    document.save.A1martesX.value = var62;
    document.save.A1miercolesP.value = var13;
    document.save.A1miercolesS.value = var23;
    document.save.A1miercolesT.value = var33;
    document.save.A1miercolesC.value = var43;
    document.save.A1miercolesQ.value = var53;
    document.save.A1miercolesX.value = var63;
    document.save.A1juevesP.value = var14;
    document.save.A1juevesS.value = var24;
    document.save.A1juevesT.value = var34;
    document.save.A1juevesC.value = var44;
    document.save.A1juevesQ.value = var54;
    document.save.A1juevesX.value = var64;
    document.save.A1viernesP.value = var15;
    document.save.A1viernesS.value = var25;
    document.save.A1viernesT.value = var35;
    document.save.A1viernesC.value = var45;
    document.save.A1viernesQ.value = var55;
    document.save.A1viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono2(url, id_contenedor){
    var pagina_requerida = false
    document.save.A2lunesP.value = var11;
    document.save.A2lunesS.value = var21;
    document.save.A2lunesT.value = var31;
    document.save.A2lunesC.value = var41;
    document.save.A2lunesQ.value = var51;
    document.save.A2lunesX.value = var61;
    document.save.A2martesP.value = var12;
    document.save.A2martesS.value = var22;
    document.save.A2martesT.value = var32;
    document.save.A2martesC.value = var42;
    document.save.A2martesQ.value = var52;
    document.save.A2martesX.value = var62;
    document.save.A2miercolesP.value = var13;
    document.save.A2miercolesS.value = var23;
    document.save.A2miercolesT.value = var33;
    document.save.A2miercolesC.value = var43;
    document.save.A2miercolesQ.value = var53;
    document.save.A2miercolesX.value = var63;
    document.save.A2juevesP.value = var14;
    document.save.A2juevesS.value = var24;
    document.save.A2juevesT.value = var34;
    document.save.A2juevesC.value = var44;
    document.save.A2juevesQ.value = var54;
    document.save.A2juevesX.value = var64;
    document.save.A2viernesP.value = var15;
    document.save.A2viernesS.value = var25;
    document.save.A2viernesT.value = var35;
    document.save.A2viernesC.value = var45;
    document.save.A2viernesQ.value = var55;
    document.save.A2viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono3(url, id_contenedor){
    var pagina_requerida = false
    document.save.A3lunesP.value = var11;
    document.save.A3lunesS.value = var21;
    document.save.A3lunesT.value = var31;
    document.save.A3lunesC.value = var41;
    document.save.A3lunesQ.value = var51;
    document.save.A3lunesX.value = var61;
    document.save.A3martesP.value = var12;
    document.save.A3martesS.value = var22;
    document.save.A3martesT.value = var32;
    document.save.A3martesC.value = var42;
    document.save.A3martesQ.value = var52;
    document.save.A3martesX.value = var62;
    document.save.A3miercolesP.value = var13;
    document.save.A3miercolesS.value = var23;
    document.save.A3miercolesT.value = var33;
    document.save.A3miercolesC.value = var43;
    document.save.A3miercolesQ.value = var53;
    document.save.A3miercolesX.value = var63;
    document.save.A3juevesP.value = var14;
    document.save.A3juevesS.value = var24;
    document.save.A3juevesT.value = var34;
    document.save.A3juevesC.value = var44;
    document.save.A3juevesQ.value = var54;
    document.save.A3juevesX.value = var64;
    document.save.A3viernesP.value = var15;
    document.save.A3viernesS.value = var25;
    document.save.A3viernesT.value = var35;
    document.save.A3viernesC.value = var45;
    document.save.A3viernesQ.value = var55;
    document.save.A3viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono4(url, id_contenedor){
    var pagina_requerida = false
    document.save.A4lunesP.value = var11;
    document.save.A4lunesS.value = var21;
    document.save.A4lunesT.value = var31;
    document.save.A4lunesC.value = var41;
    document.save.A4lunesQ.value = var51;
    document.save.A4lunesX.value = var61;
    document.save.A4martesP.value = var12;
    document.save.A4martesS.value = var22;
    document.save.A4martesT.value = var32;
    document.save.A4martesC.value = var42;
    document.save.A4martesQ.value = var52;
    document.save.A4martesX.value = var62;
    document.save.A4miercolesP.value = var13;
    document.save.A4miercolesS.value = var23;
    document.save.A4miercolesT.value = var33;
    document.save.A4miercolesC.value = var43;
    document.save.A4miercolesQ.value = var53;
    document.save.A4miercolesX.value = var63;
    document.save.A4juevesP.value = var14;
    document.save.A4juevesS.value = var24;
    document.save.A4juevesT.value = var34;
    document.save.A4juevesC.value = var44;
    document.save.A4juevesQ.value = var54;
    document.save.A4juevesX.value = var64;
    document.save.A4viernesP.value = var15;
    document.save.A4viernesS.value = var25;
    document.save.A4viernesT.value = var35;
    document.save.A4viernesC.value = var45;
    document.save.A4viernesQ.value = var55;
    document.save.A4viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono5(url, id_contenedor){
    var pagina_requerida = false
    document.save.A5lunesP.value = var11;
    document.save.A5lunesS.value = var21;
    document.save.A5lunesT.value = var31;
    document.save.A5lunesC.value = var41;
    document.save.A5lunesQ.value = var51;
    document.save.A5lunesX.value = var61;
    document.save.A5martesP.value = var12;
    document.save.A5martesS.value = var22;
    document.save.A5martesT.value = var32;
    document.save.A5martesC.value = var42;
    document.save.A5martesQ.value = var52;
    document.save.A5martesX.value = var62;
    document.save.A5miercolesP.value = var13;
    document.save.A5miercolesS.value = var23;
    document.save.A5miercolesT.value = var33;
    document.save.A5miercolesC.value = var43;
    document.save.A5miercolesQ.value = var53;
    document.save.A5miercolesX.value = var63;
    document.save.A5juevesP.value = var14;
    document.save.A5juevesS.value = var24;
    document.save.A5juevesT.value = var34;
    document.save.A5juevesC.value = var44;
    document.save.A5juevesQ.value = var54;
    document.save.A5juevesX.value = var64;
    document.save.A5viernesP.value = var15;
    document.save.A5viernesS.value = var25;
    document.save.A5viernesT.value = var35;
    document.save.A5viernesC.value = var45;
    document.save.A5viernesQ.value = var55;
    document.save.A5viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono6(url, id_contenedor){
    var pagina_requerida = false
    document.save.A6lunesP.value = var11;
    document.save.A6lunesS.value = var21;
    document.save.A6lunesT.value = var31;
    document.save.A6lunesC.value = var41;
    document.save.A6lunesQ.value = var51;
    document.save.A6lunesX.value = var61;
    document.save.A6martesP.value = var12;
    document.save.A6martesS.value = var22;
    document.save.A6martesT.value = var32;
    document.save.A6martesC.value = var42;
    document.save.A6martesQ.value = var52;
    document.save.A6martesX.value = var62;
    document.save.A6miercolesP.value = var13;
    document.save.A6miercolesS.value = var23;
    document.save.A6miercolesT.value = var33;
    document.save.A6miercolesC.value = var43;
    document.save.A6miercolesQ.value = var53;
    document.save.A6miercolesX.value = var63;
    document.save.A6juevesP.value = var14;
    document.save.A6juevesS.value = var24;
    document.save.A6juevesT.value = var34;
    document.save.A6juevesC.value = var44;
    document.save.A6juevesQ.value = var54;
    document.save.A6juevesX.value = var64;
    document.save.A6viernesP.value = var15;
    document.save.A6viernesS.value = var25;
    document.save.A6viernesT.value = var35;
    document.save.A6viernesC.value = var45;
    document.save.A6viernesQ.value = var55;
    document.save.A6viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono7(url, id_contenedor){
    var pagina_requerida = false
    document.save.A7lunesP.value = var11;
    document.save.A7lunesS.value = var21;
    document.save.A7lunesT.value = var31;
    document.save.A7lunesC.value = var41;
    document.save.A7lunesQ.value = var51;
    document.save.A7lunesX.value = var61;
    document.save.A7martesP.value = var12;
    document.save.A7martesS.value = var22;
    document.save.A7martesT.value = var32;
    document.save.A7martesC.value = var42;
    document.save.A7martesQ.value = var52;
    document.save.A7martesX.value = var62;
    document.save.A7miercolesP.value = var13;
    document.save.A7miercolesS.value = var23;
    document.save.A7miercolesT.value = var33;
    document.save.A7miercolesC.value = var43;
    document.save.A7miercolesQ.value = var53;
    document.save.A7miercolesX.value = var63;
    document.save.A7juevesP.value = var14;
    document.save.A7juevesS.value = var24;
    document.save.A7juevesT.value = var34;
    document.save.A7juevesC.value = var44;
    document.save.A7juevesQ.value = var54;
    document.save.A7juevesX.value = var64;
    document.save.A7viernesP.value = var15;
    document.save.A7viernesS.value = var25;
    document.save.A7viernesT.value = var35;
    document.save.A7viernesC.value = var45;
    document.save.A7viernesQ.value = var55;
    document.save.A7viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono8(url, id_contenedor){
    var pagina_requerida = false
    document.save.A8lunesP.value = var11;
    document.save.A8lunesS.value = var21;
    document.save.A8lunesT.value = var31;
    document.save.A8lunesC.value = var41;
    document.save.A8lunesQ.value = var51;
    document.save.A8lunesX.value = var61;
    document.save.A8martesP.value = var12;
    document.save.A8martesS.value = var22;
    document.save.A8martesT.value = var32;
    document.save.A8martesC.value = var42;
    document.save.A8martesQ.value = var52;
    document.save.A8martesX.value = var62;
    document.save.A8miercolesP.value = var13;
    document.save.A8miercolesS.value = var23;
    document.save.A8miercolesT.value = var33;
    document.save.A8miercolesC.value = var43;
    document.save.A8miercolesQ.value = var53;
    document.save.A8miercolesX.value = var63;
    document.save.A8juevesP.value = var14;
    document.save.A8juevesS.value = var24;
    document.save.A8juevesT.value = var34;
    document.save.A8juevesC.value = var44;
    document.save.A8juevesQ.value = var54;
    document.save.A8juevesX.value = var64;
    document.save.A8viernesP.value = var15;
    document.save.A8viernesS.value = var25;
    document.save.A8viernesT.value = var35;
    document.save.A8viernesC.value = var45;
    document.save.A8viernesQ.value = var55;
    document.save.A8viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono9(url, id_contenedor){
    var pagina_requerida = false
    document.save.A9lunesP.value = var11;
    document.save.A9lunesS.value = var21;
    document.save.A9lunesT.value = var31;
    document.save.A9lunesC.value = var41;
    document.save.A9lunesQ.value = var51;
    document.save.A9lunesX.value = var61;
    document.save.A9martesP.value = var12;
    document.save.A9martesS.value = var22;
    document.save.A9martesT.value = var32;
    document.save.A9martesC.value = var42;
    document.save.A9martesQ.value = var52;
    document.save.A9martesX.value = var62;
    document.save.A9miercolesP.value = var13;
    document.save.A9miercolesS.value = var23;
    document.save.A9miercolesT.value = var33;
    document.save.A9miercolesC.value = var43;
    document.save.A9miercolesQ.value = var53;
    document.save.A9miercolesX.value = var63;
    document.save.A9juevesP.value = var14;
    document.save.A9juevesS.value = var24;
    document.save.A9juevesT.value = var34;
    document.save.A9juevesC.value = var44;
    document.save.A9juevesQ.value = var54;
    document.save.A9juevesX.value = var64;
    document.save.A9viernesP.value = var15;
    document.save.A9viernesS.value = var25;
    document.save.A9viernesT.value = var35;
    document.save.A9viernesC.value = var45;
    document.save.A9viernesQ.value = var55;
    document.save.A9viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono10(url, id_contenedor){
    var pagina_requerida = false
    document.save.A10lunesP.value = var11;
    document.save.A10lunesS.value = var21;
    document.save.A10lunesT.value = var31;
    document.save.A10lunesC.value = var41;
    document.save.A10lunesQ.value = var51;
    document.save.A10lunesX.value = var61;
    document.save.A10martesP.value = var12;
    document.save.A10martesS.value = var22;
    document.save.A10martesT.value = var32;
    document.save.A10martesC.value = var42;
    document.save.A10martesQ.value = var52;
    document.save.A10martesX.value = var62;
    document.save.A10miercolesP.value = var13;
    document.save.A10miercolesS.value = var23;
    document.save.A10miercolesT.value = var33;
    document.save.A10miercolesC.value = var43;
    document.save.A10miercolesQ.value = var53;
    document.save.A10miercolesX.value = var63;
    document.save.A10juevesP.value = var14;
    document.save.A10juevesS.value = var24;
    document.save.A10juevesT.value = var34;
    document.save.A10juevesC.value = var44;
    document.save.A10juevesQ.value = var54;
    document.save.A10juevesX.value = var64;
    document.save.A10viernesP.value = var15;
    document.save.A10viernesS.value = var25;
    document.save.A10viernesT.value = var35;
    document.save.A10viernesC.value = var45;
    document.save.A10viernesQ.value = var55;
    document.save.A10viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono11(url, id_contenedor){
    var pagina_requerida = false
    document.save.A11lunesP.value = var11;
    document.save.A11lunesS.value = var21;
    document.save.A11lunesT.value = var31;
    document.save.A11lunesC.value = var41;
    document.save.A11lunesQ.value = var51;
    document.save.A11lunesX.value = var61;
    document.save.A11martesP.value = var12;
    document.save.A11martesS.value = var22;
    document.save.A11martesT.value = var32;
    document.save.A11martesC.value = var42;
    document.save.A11martesQ.value = var52;
    document.save.A11martesX.value = var62;
    document.save.A11miercolesP.value = var13;
    document.save.A11miercolesS.value = var23;
    document.save.A11miercolesT.value = var33;
    document.save.A11miercolesC.value = var43;
    document.save.A11miercolesQ.value = var53;
    document.save.A11miercolesX.value = var63;
    document.save.A11juevesP.value = var14;
    document.save.A11juevesS.value = var24;
    document.save.A11juevesT.value = var34;
    document.save.A11juevesC.value = var44;
    document.save.A11juevesQ.value = var54;
    document.save.A11juevesX.value = var64;
    document.save.A11viernesP.value = var15;
    document.save.A11viernesS.value = var25;
    document.save.A11viernesT.value = var35;
    document.save.A11viernesC.value = var45;
    document.save.A11viernesQ.value = var55;
    document.save.A11viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono12(url, id_contenedor){
    var pagina_requerida = false
    document.save.A12lunesP.value = var11;
    document.save.A12lunesS.value = var21;
    document.save.A12lunesT.value = var31;
    document.save.A12lunesC.value = var41;
    document.save.A12lunesQ.value = var51;
    document.save.A12lunesX.value = var61;
    document.save.A12martesP.value = var12;
    document.save.A12martesS.value = var22;
    document.save.A12martesT.value = var32;
    document.save.A12martesC.value = var42;
    document.save.A12martesQ.value = var52;
    document.save.A12martesX.value = var62;
    document.save.A12miercolesP.value = var13;
    document.save.A12miercolesS.value = var23;
    document.save.A12miercolesT.value = var33;
    document.save.A12miercolesC.value = var43;
    document.save.A12miercolesQ.value = var53;
    document.save.A12miercolesX.value = var63;
    document.save.A12juevesP.value = var14;
    document.save.A12juevesS.value = var24;
    document.save.A12juevesT.value = var34;
    document.save.A12juevesC.value = var44;
    document.save.A12juevesQ.value = var54;
    document.save.A12juevesX.value = var64;
    document.save.A12viernesP.value = var15;
    document.save.A12viernesS.value = var25;
    document.save.A12viernesT.value = var35;
    document.save.A12viernesC.value = var45;
    document.save.A12viernesQ.value = var55;
    document.save.A12viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono13(url, id_contenedor){
    var pagina_requerida = false
    document.save.A13lunesP.value = var11;
    document.save.A13lunesS.value = var21;
    document.save.A13lunesT.value = var31;
    document.save.A13lunesC.value = var41;
    document.save.A13lunesQ.value = var51;
    document.save.A13lunesX.value = var61;
    document.save.A13martesP.value = var12;
    document.save.A13martesS.value = var22;
    document.save.A13martesT.value = var32;
    document.save.A13martesC.value = var42;
    document.save.A13martesQ.value = var52;
    document.save.A13martesX.value = var62;
    document.save.A13miercolesP.value = var13;
    document.save.A13miercolesS.value = var23;
    document.save.A13miercolesT.value = var33;
    document.save.A13miercolesC.value = var43;
    document.save.A13miercolesQ.value = var53;
    document.save.A13miercolesX.value = var63;
    document.save.A13juevesP.value = var14;
    document.save.A13juevesS.value = var24;
    document.save.A13juevesT.value = var34;
    document.save.A13juevesC.value = var44;
    document.save.A13juevesQ.value = var54;
    document.save.A13juevesX.value = var64;
    document.save.A13viernesP.value = var15;
    document.save.A13viernesS.value = var25;
    document.save.A13viernesT.value = var35;
    document.save.A13viernesC.value = var45;
    document.save.A13viernesQ.value = var55;
    document.save.A13viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono14(url, id_contenedor){
    var pagina_requerida = false
    document.save.A14lunesP.value = var11;
    document.save.A14lunesS.value = var21;
    document.save.A14lunesT.value = var31;
    document.save.A14lunesC.value = var41;
    document.save.A14lunesQ.value = var51;
    document.save.A14lunesX.value = var61;
    document.save.A14martesP.value = var12;
    document.save.A14martesS.value = var22;
    document.save.A14martesT.value = var32;
    document.save.A14martesC.value = var42;
    document.save.A14martesQ.value = var52;
    document.save.A14martesX.value = var62;
    document.save.A14miercolesP.value = var13;
    document.save.A14miercolesS.value = var23;
    document.save.A14miercolesT.value = var33;
    document.save.A14miercolesC.value = var43;
    document.save.A14miercolesQ.value = var53;
    document.save.A14miercolesX.value = var63;
    document.save.A14juevesP.value = var14;
    document.save.A14juevesS.value = var24;
    document.save.A14juevesT.value = var34;
    document.save.A14juevesC.value = var44;
    document.save.A14juevesQ.value = var54;
    document.save.A14juevesX.value = var64;
    document.save.A14viernesP.value = var15;
    document.save.A14viernesS.value = var25;
    document.save.A14viernesT.value = var35;
    document.save.A14viernesC.value = var45;
    document.save.A14viernesQ.value = var55;
    document.save.A14viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono15(url, id_contenedor){
    var pagina_requerida = false
    document.save.A15lunesP.value = var11;
    document.save.A15lunesS.value = var21;
    document.save.A15lunesT.value = var31;
    document.save.A15lunesC.value = var41;
    document.save.A15lunesQ.value = var51;
    document.save.A15lunesX.value = var61;
    document.save.A15martesP.value = var12;
    document.save.A15martesS.value = var22;
    document.save.A15martesT.value = var32;
    document.save.A15martesC.value = var42;
    document.save.A15martesQ.value = var52;
    document.save.A15martesX.value = var62;
    document.save.A15miercolesP.value = var13;
    document.save.A15miercolesS.value = var23;
    document.save.A15miercolesT.value = var33;
    document.save.A15miercolesC.value = var43;
    document.save.A15miercolesQ.value = var53;
    document.save.A15miercolesX.value = var63;
    document.save.A15juevesP.value = var14;
    document.save.A15juevesS.value = var24;
    document.save.A15juevesT.value = var34;
    document.save.A15juevesC.value = var44;
    document.save.A15juevesQ.value = var54;
    document.save.A15juevesX.value = var64;
    document.save.A15viernesP.value = var15;
    document.save.A15viernesS.value = var25;
    document.save.A15viernesT.value = var35;
    document.save.A15viernesC.value = var45;
    document.save.A15viernesQ.value = var55;
    document.save.A15viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono16(url, id_contenedor){
    var pagina_requerida = false
    document.save.A16lunesP.value = var11;
    document.save.A16lunesS.value = var21;
    document.save.A16lunesT.value = var31;
    document.save.A16lunesC.value = var41;
    document.save.A16lunesQ.value = var51;
    document.save.A16lunesX.value = var61;
    document.save.A16martesP.value = var12;
    document.save.A16martesS.value = var22;
    document.save.A16martesT.value = var32;
    document.save.A16martesC.value = var42;
    document.save.A16martesQ.value = var52;
    document.save.A16martesX.value = var62;
    document.save.A16miercolesP.value = var13;
    document.save.A16miercolesS.value = var23;
    document.save.A16miercolesT.value = var33;
    document.save.A16miercolesC.value = var43;
    document.save.A16miercolesQ.value = var53;
    document.save.A16miercolesX.value = var63;
    document.save.A16juevesP.value = var14;
    document.save.A16juevesS.value = var24;
    document.save.A16juevesT.value = var34;
    document.save.A16juevesC.value = var44;
    document.save.A16juevesQ.value = var54;
    document.save.A16juevesX.value = var64;
    document.save.A16viernesP.value = var15;
    document.save.A16viernesS.value = var25;
    document.save.A16viernesT.value = var35;
    document.save.A16viernesC.value = var45;
    document.save.A16viernesQ.value = var55;
    document.save.A16viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincrono17(url, id_contenedor){
    var pagina_requerida = false
    document.save.A17lunesP.value = var11;
    document.save.A17lunesS.value = var21;
    document.save.A17lunesT.value = var31;
    document.save.A17lunesC.value = var41;
    document.save.A17lunesQ.value = var51;
    document.save.A17lunesX.value = var61;
    document.save.A17martesP.value = var12;
    document.save.A17martesS.value = var22;
    document.save.A17martesT.value = var32;
    document.save.A17martesC.value = var42;
    document.save.A17martesQ.value = var52;
    document.save.A17martesX.value = var62;
    document.save.A17miercolesP.value = var13;
    document.save.A17miercolesS.value = var23;
    document.save.A17miercolesT.value = var33;
    document.save.A17miercolesC.value = var43;
    document.save.A17miercolesQ.value = var53;
    document.save.A17miercolesX.value = var63;
    document.save.A17juevesP.value = var14;
    document.save.A17juevesS.value = var24;
    document.save.A17juevesT.value = var34;
    document.save.A17juevesC.value = var44;
    document.save.A17juevesQ.value = var54;
    document.save.A17juevesX.value = var64;
    document.save.A17viernesP.value = var15;
    document.save.A17viernesS.value = var25;
    document.save.A17viernesT.value = var35;
    document.save.A17viernesC.value = var45;
    document.save.A17viernesQ.value = var55;
    document.save.A17viernesX.value = var65;
    inicializar();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}



function llamarasincronoL1(url, id_contenedor){
    var pagina_requerida = false
    document.save.L1lunesP.value = varL11;
    document.save.L1lunesS.value = varL21;
    document.save.L1lunesT.value = varL31;
    document.save.L1lunesC.value = varL41;
    document.save.L1lunesQ.value = varL51;
    document.save.L1lunesX.value = varL61;
    document.save.L1martesP.value = varL12;
    document.save.L1martesS.value = varL22;
    document.save.L1martesT.value = varL32;
    document.save.L1martesC.value = varL42;
    document.save.L1martesQ.value = varL52;
    document.save.L1martesX.value = varL62;
    document.save.L1miercolesP.value = varL13;
    document.save.L1miercolesS.value = varL23;
    document.save.L1miercolesT.value = varL33;
    document.save.L1miercolesC.value = varL43;
    document.save.L1miercolesQ.value = varL53;
    document.save.L1miercolesX.value = varL63;
    document.save.L1juevesP.value = varL14;
    document.save.L1juevesS.value = varL24;
    document.save.L1juevesT.value = varL34;
    document.save.L1juevesC.value = varL44;
    document.save.L1juevesQ.value = varL54;
    document.save.L1juevesX.value = varL64;
    document.save.L1viernesP.value = varL15;
    document.save.L1viernesS.value = varL25;
    document.save.L1viernesT.value = varL35;
    document.save.L1viernesC.value = varL45;
    document.save.L1viernesQ.value = varL55;
    document.save.L1viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL2(url, id_contenedor){
    var pagina_requerida = false
    document.save.L2lunesP.value = varL11;
    document.save.L2lunesS.value = varL21;
    document.save.L2lunesT.value = varL31;
    document.save.L2lunesC.value = varL41;
    document.save.L2lunesQ.value = varL51;
    document.save.L2lunesX.value = varL61;
    document.save.L2martesP.value = varL12;
    document.save.L2martesS.value = varL22;
    document.save.L2martesT.value = varL32;
    document.save.L2martesC.value = varL42;
    document.save.L2martesQ.value = varL52;
    document.save.L2martesX.value = varL62;
    document.save.L2miercolesP.value = varL13;
    document.save.L2miercolesS.value = varL23;
    document.save.L2miercolesT.value = varL33;
    document.save.L2miercolesC.value = varL43;
    document.save.L2miercolesQ.value = varL53;
    document.save.L2miercolesX.value = varL63;
    document.save.L2juevesP.value = varL14;
    document.save.L2juevesS.value = varL24;
    document.save.L2juevesT.value = varL34;
    document.save.L2juevesC.value = varL44;
    document.save.L2juevesQ.value = varL54;
    document.save.L2juevesX.value = varL64;
    document.save.L2viernesP.value = varL15;
    document.save.L2viernesS.value = varL25;
    document.save.L2viernesT.value = varL35;
    document.save.L2viernesC.value = varL45;
    document.save.L2viernesQ.value = varL55;
    document.save.L2viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL3(url, id_contenedor){
    var pagina_requerida = false
    document.save.L3lunesP.value = varL11;
    document.save.L3lunesS.value = varL21;
    document.save.L3lunesT.value = varL31;
    document.save.L3lunesC.value = varL41;
    document.save.L3lunesQ.value = varL51;
    document.save.L3lunesX.value = varL61;
    document.save.L3martesP.value = varL12;
    document.save.L3martesS.value = varL22;
    document.save.L3martesT.value = varL32;
    document.save.L3martesC.value = varL42;
    document.save.L3martesQ.value = varL52;
    document.save.L3martesX.value = varL62;
    document.save.L3miercolesP.value = varL13;
    document.save.L3miercolesS.value = varL23;
    document.save.L3miercolesT.value = varL33;
    document.save.L3miercolesC.value = varL43;
    document.save.L3miercolesQ.value = varL53;
    document.save.L3miercolesX.value = varL63;
    document.save.L3juevesP.value = varL14;
    document.save.L3juevesS.value = varL24;
    document.save.L3juevesT.value = varL34;
    document.save.L3juevesC.value = varL44;
    document.save.L3juevesQ.value = varL54;
    document.save.L3juevesX.value = varL64;
    document.save.L3viernesP.value = varL15;
    document.save.L3viernesS.value = varL25;
    document.save.L3viernesT.value = varL35;
    document.save.L3viernesC.value = varL45;
    document.save.L3viernesQ.value = varL55;
    document.save.L3viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL4(url, id_contenedor){
    var pagina_requerida = false
    document.save.L4lunesP.value = varL11;
    document.save.L4lunesS.value = varL21;
    document.save.L4lunesT.value = varL31;
    document.save.L4lunesC.value = varL41;
    document.save.L4lunesQ.value = varL51;
    document.save.L4lunesX.value = varL61;
    document.save.L4martesP.value = varL12;
    document.save.L4martesS.value = varL22;
    document.save.L4martesT.value = varL32;
    document.save.L4martesC.value = varL42;
    document.save.L4martesQ.value = varL52;
    document.save.L4martesX.value = varL62;
    document.save.L4miercolesP.value = varL13;
    document.save.L4miercolesS.value = varL23;
    document.save.L4miercolesT.value = varL33;
    document.save.L4miercolesC.value = varL43;
    document.save.L4miercolesQ.value = varL53;
    document.save.L4miercolesX.value = varL63;
    document.save.L4juevesP.value = varL14;
    document.save.L4juevesS.value = varL24;
    document.save.L4juevesT.value = varL34;
    document.save.L4juevesC.value = varL44;
    document.save.L4juevesQ.value = varL54;
    document.save.L4juevesX.value = varL64;
    document.save.L4viernesP.value = varL15;
    document.save.L4viernesS.value = varL25;
    document.save.L4viernesT.value = varL35;
    document.save.L4viernesC.value = varL45;
    document.save.L4viernesQ.value = varL55;
    document.save.L4viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL5(url, id_contenedor){
    var pagina_requerida = false
    document.save.L5lunesP.value = varL11;
    document.save.L5lunesS.value = varL21;
    document.save.L5lunesT.value = varL31;
    document.save.L5lunesC.value = varL41;
    document.save.L5lunesQ.value = varL51;
    document.save.L5lunesX.value = varL61;
    document.save.L5martesP.value = varL12;
    document.save.L5martesS.value = varL22;
    document.save.L5martesT.value = varL32;
    document.save.L5martesC.value = varL42;
    document.save.L5martesQ.value = varL52;
    document.save.L5martesX.value = varL62;
    document.save.L5miercolesP.value = varL13;
    document.save.L5miercolesS.value = varL23;
    document.save.L5miercolesT.value = varL33;
    document.save.L5miercolesC.value = varL43;
    document.save.L5miercolesQ.value = varL53;
    document.save.L5miercolesX.value = varL63;
    document.save.L5juevesP.value = varL14;
    document.save.L5juevesS.value = varL24;
    document.save.L5juevesT.value = varL34;
    document.save.L5juevesC.value = varL44;
    document.save.L5juevesQ.value = varL54;
    document.save.L5juevesX.value = varL64;
    document.save.L5viernesP.value = varL15;
    document.save.L5viernesS.value = varL25;
    document.save.L5viernesT.value = varL35;
    document.save.L5viernesC.value = varL45;
    document.save.L5viernesQ.value = varL55;
    document.save.L5viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL6(url, id_contenedor){
    var pagina_requerida = false
    document.save.L6lunesP.value = varL11;
    document.save.L6lunesS.value = varL21;
    document.save.L6lunesT.value = varL31;
    document.save.L6lunesC.value = varL41;
    document.save.L6lunesQ.value = varL51;
    document.save.L6lunesX.value = varL61;
    document.save.L6martesP.value = varL12;
    document.save.L6martesS.value = varL22;
    document.save.L6martesT.value = varL32;
    document.save.L6martesC.value = varL42;
    document.save.L6martesQ.value = varL52;
    document.save.L6martesX.value = varL62;
    document.save.L6miercolesP.value = varL13;
    document.save.L6miercolesS.value = varL23;
    document.save.L6miercolesT.value = varL33;
    document.save.L6miercolesC.value = varL43;
    document.save.L6miercolesQ.value = varL53;
    document.save.L6miercolesX.value = varL63;
    document.save.L6juevesP.value = varL14;
    document.save.L6juevesS.value = varL24;
    document.save.L6juevesT.value = varL34;
    document.save.L6juevesC.value = varL44;
    document.save.L6juevesQ.value = varL54;
    document.save.L6juevesX.value = varL64;
    document.save.L6viernesP.value = varL15;
    document.save.L6viernesS.value = varL25;
    document.save.L6viernesT.value = varL35;
    document.save.L6viernesC.value = varL45;
    document.save.L6viernesQ.value = varL55;
    document.save.L6viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL7(url, id_contenedor){
    var pagina_requerida = false
    document.save.L7lunesP.value = varL11;
    document.save.L7lunesS.value = varL21;
    document.save.L7lunesT.value = varL31;
    document.save.L7lunesC.value = varL41;
    document.save.L7lunesQ.value = varL51;
    document.save.L7lunesX.value = varL61;
    document.save.L7martesP.value = varL12;
    document.save.L7martesS.value = varL22;
    document.save.L7martesT.value = varL32;
    document.save.L7martesC.value = varL42;
    document.save.L7martesQ.value = varL52;
    document.save.L7martesX.value = varL62;
    document.save.L7miercolesP.value = varL13;
    document.save.L7miercolesS.value = varL23;
    document.save.L7miercolesT.value = varL33;
    document.save.L7miercolesC.value = varL43;
    document.save.L7miercolesQ.value = varL53;
    document.save.L7miercolesX.value = varL63;
    document.save.L7juevesP.value = varL14;
    document.save.L7juevesS.value = varL24;
    document.save.L7juevesT.value = varL34;
    document.save.L7juevesC.value = varL44;
    document.save.L7juevesQ.value = varL54;
    document.save.L7juevesX.value = varL64;
    document.save.L7viernesP.value = varL15;
    document.save.L7viernesS.value = varL25;
    document.save.L7viernesT.value = varL35;
    document.save.L7viernesC.value = varL45;
    document.save.L7viernesQ.value = varL55;
    document.save.L7viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL8(url, id_contenedor){
    var pagina_requerida = false
    document.save.L8lunesP.value = varL11;
    document.save.L8lunesS.value = varL21;
    document.save.L8lunesT.value = varL31;
    document.save.L8lunesC.value = varL41;
    document.save.L8lunesQ.value = varL51;
    document.save.L8lunesX.value = varL61;
    document.save.L8martesP.value = varL12;
    document.save.L8martesS.value = varL22;
    document.save.L8martesT.value = varL32;
    document.save.L8martesC.value = varL42;
    document.save.L8martesQ.value = varL52;
    document.save.L8martesX.value = varL62;
    document.save.L8miercolesP.value = varL13;
    document.save.L8miercolesS.value = varL23;
    document.save.L8miercolesT.value = varL33;
    document.save.L8miercolesC.value = varL43;
    document.save.L8miercolesQ.value = varL53;
    document.save.L8miercolesX.value = varL63;
    document.save.L8juevesP.value = varL14;
    document.save.L8juevesS.value = varL24;
    document.save.L8juevesT.value = varL34;
    document.save.L8juevesC.value = varL44;
    document.save.L8juevesQ.value = varL54;
    document.save.L8juevesX.value = varL64;
    document.save.L8viernesP.value = varL15;
    document.save.L8viernesS.value = varL25;
    document.save.L8viernesT.value = varL35;
    document.save.L8viernesC.value = varL45;
    document.save.L8viernesQ.value = varL55;
    document.save.L8viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL9(url, id_contenedor){
    var pagina_requerida = false
    document.save.L9lunesP.value = varL11;
    document.save.L9lunesS.value = varL21;
    document.save.L9lunesT.value = varL31;
    document.save.L9lunesC.value = varL41;
    document.save.L9lunesQ.value = varL51;
    document.save.L9lunesX.value = varL61;
    document.save.L9martesP.value = varL12;
    document.save.L9martesS.value = varL22;
    document.save.L9martesT.value = varL32;
    document.save.L9martesC.value = varL42;
    document.save.L9martesQ.value = varL52;
    document.save.L9martesX.value = varL62;
    document.save.L9miercolesP.value = varL13;
    document.save.L9miercolesS.value = varL23;
    document.save.L9miercolesT.value = varL33;
    document.save.L9miercolesC.value = varL43;
    document.save.L9miercolesQ.value = varL53;
    document.save.L9miercolesX.value = varL63;
    document.save.L9juevesP.value = varL14;
    document.save.L9juevesS.value = varL24;
    document.save.L9juevesT.value = varL34;
    document.save.L9juevesC.value = varL44;
    document.save.L9juevesQ.value = varL54;
    document.save.L9juevesX.value = varL64;
    document.save.L9viernesP.value = varL15;
    document.save.L9viernesS.value = varL25;
    document.save.L9viernesT.value = varL35;
    document.save.L9viernesC.value = varL45;
    document.save.L9viernesQ.value = varL55;
    document.save.L9viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL10(url, id_contenedor){
    var pagina_requerida = false
    document.save.L10lunesP.value = varL11;
    document.save.L10lunesS.value = varL21;
    document.save.L10lunesT.value = varL31;
    document.save.L10lunesC.value = varL41;
    document.save.L10lunesQ.value = varL51;
    document.save.L10lunesX.value = varL61;
    document.save.L10martesP.value = varL12;
    document.save.L10martesS.value = varL22;
    document.save.L10martesT.value = varL32;
    document.save.L10martesC.value = varL42;
    document.save.L10martesQ.value = varL52;
    document.save.L10martesX.value = varL62;
    document.save.L10miercolesP.value = varL13;
    document.save.L10miercolesS.value = varL23;
    document.save.L10miercolesT.value = varL33;
    document.save.L10miercolesC.value = varL43;
    document.save.L10miercolesQ.value = varL53;
    document.save.L10miercolesX.value = varL63;
    document.save.L10juevesP.value = varL14;
    document.save.L10juevesS.value = varL24;
    document.save.L10juevesT.value = varL34;
    document.save.L10juevesC.value = varL44;
    document.save.L10juevesQ.value = varL54;
    document.save.L10juevesX.value = varL64;
    document.save.L10viernesP.value = varL15;
    document.save.L10viernesS.value = varL25;
    document.save.L10viernesT.value = varL35;
    document.save.L10viernesC.value = varL45;
    document.save.L10viernesQ.value = varL55;
    document.save.L10viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL11(url, id_contenedor){
    var pagina_requerida = false
    document.save.L11lunesP.value = varL11;
    document.save.L11lunesS.value = varL21;
    document.save.L11lunesT.value = varL31;
    document.save.L11lunesC.value = varL41;
    document.save.L11lunesQ.value = varL51;
    document.save.L11lunesX.value = varL61;
    document.save.L11martesP.value = varL12;
    document.save.L11martesS.value = varL22;
    document.save.L11martesT.value = varL32;
    document.save.L11martesC.value = varL42;
    document.save.L11martesQ.value = varL52;
    document.save.L11martesX.value = varL62;
    document.save.L11miercolesP.value = varL13;
    document.save.L11miercolesS.value = varL23;
    document.save.L11miercolesT.value = varL33;
    document.save.L11miercolesC.value = varL43;
    document.save.L11miercolesQ.value = varL53;
    document.save.L11miercolesX.value = varL63;
    document.save.L11juevesP.value = varL14;
    document.save.L11juevesS.value = varL24;
    document.save.L11juevesT.value = varL34;
    document.save.L11juevesC.value = varL44;
    document.save.L11juevesQ.value = varL54;
    document.save.L11juevesX.value = varL64;
    document.save.L11viernesP.value = varL15;
    document.save.L11viernesS.value = varL25;
    document.save.L11viernesT.value = varL35;
    document.save.L11viernesC.value = varL45;
    document.save.L11viernesQ.value = varL55;
    document.save.L11viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL12(url, id_contenedor){
    var pagina_requerida = false
    document.save.L12lunesP.value = varL11;
    document.save.L12lunesS.value = varL21;
    document.save.L12lunesT.value = varL31;
    document.save.L12lunesC.value = varL41;
    document.save.L12lunesQ.value = varL51;
    document.save.L12lunesX.value = varL61;
    document.save.L12martesP.value = varL12;
    document.save.L12martesS.value = varL22;
    document.save.L12martesT.value = varL32;
    document.save.L12martesC.value = varL42;
    document.save.L12martesQ.value = varL52;
    document.save.L12martesX.value = varL62;
    document.save.L12miercolesP.value = varL13;
    document.save.L12miercolesS.value = varL23;
    document.save.L12miercolesT.value = varL33;
    document.save.L12miercolesC.value = varL43;
    document.save.L12miercolesQ.value = varL53;
    document.save.L12miercolesX.value = varL63;
    document.save.L12juevesP.value = varL14;
    document.save.L12juevesS.value = varL24;
    document.save.L12juevesT.value = varL34;
    document.save.L12juevesC.value = varL44;
    document.save.L12juevesQ.value = varL54;
    document.save.L12juevesX.value = varL64;
    document.save.L12viernesP.value = varL15;
    document.save.L12viernesS.value = varL25;
    document.save.L12viernesT.value = varL35;
    document.save.L12viernesC.value = varL45;
    document.save.L12viernesQ.value = varL55;
    document.save.L12viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL13(url, id_contenedor){
    var pagina_requerida = false
    document.save.L13lunesP.value = varL11;
    document.save.L13lunesS.value = varL21;
    document.save.L13lunesT.value = varL31;
    document.save.L13lunesC.value = varL41;
    document.save.L13lunesQ.value = varL51;
    document.save.L13lunesX.value = varL61;
    document.save.L13martesP.value = varL12;
    document.save.L13martesS.value = varL22;
    document.save.L13martesT.value = varL32;
    document.save.L13martesC.value = varL42;
    document.save.L13martesQ.value = varL52;
    document.save.L13martesX.value = varL62;
    document.save.L13miercolesP.value = varL13;
    document.save.L13miercolesS.value = varL23;
    document.save.L13miercolesT.value = varL33;
    document.save.L13miercolesC.value = varL43;
    document.save.L13miercolesQ.value = varL53;
    document.save.L13miercolesX.value = varL63;
    document.save.L13juevesP.value = varL14;
    document.save.L13juevesS.value = varL24;
    document.save.L13juevesT.value = varL34;
    document.save.L13juevesC.value = varL44;
    document.save.L13juevesQ.value = varL54;
    document.save.L13juevesX.value = varL64;
    document.save.L13viernesP.value = varL15;
    document.save.L13viernesS.value = varL25;
    document.save.L13viernesT.value = varL35;
    document.save.L13viernesC.value = varL45;
    document.save.L13viernesQ.value = varL55;
    document.save.L13viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}

function llamarasincronoL14(url, id_contenedor){
    var pagina_requerida = false
    document.save.L14lunesP.value = varL11;
    document.save.L14lunesS.value = varL21;
    document.save.L14lunesT.value = varL31;
    document.save.L14lunesC.value = varL41;
    document.save.L14lunesQ.value = varL51;
    document.save.L14lunesX.value = varL61;
    document.save.L14martesP.value = varL12;
    document.save.L14martesS.value = varL22;
    document.save.L14martesT.value = varL32;
    document.save.L14martesC.value = varL42;
    document.save.L14martesQ.value = varL52;
    document.save.L14martesX.value = varL62;
    document.save.L14miercolesP.value = varL13;
    document.save.L14miercolesS.value = varL23;
    document.save.L14miercolesT.value = varL33;
    document.save.L14miercolesC.value = varL43;
    document.save.L14miercolesQ.value = varL53;
    document.save.L14miercolesX.value = varL63;
    document.save.L14juevesP.value = varL14;
    document.save.L14juevesS.value = varL24;
    document.save.L14juevesT.value = varL34;
    document.save.L14juevesC.value = varL44;
    document.save.L14juevesQ.value = varL54;
    document.save.L14juevesX.value = varL64;
    document.save.L14viernesP.value = varL15;
    document.save.L14viernesS.value = varL25;
    document.save.L14viernesT.value = varL35;
    document.save.L14viernesC.value = varL45;
    document.save.L14viernesQ.value = varL55;
    document.save.L14viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL15(url, id_contenedor){
    var pagina_requerida = false
    document.save.L15lunesP.value = varL11;
    document.save.L15lunesS.value = varL21;
    document.save.L15lunesT.value = varL31;
    document.save.L15lunesC.value = varL41;
    document.save.L15lunesQ.value = varL51;
    document.save.L15lunesX.value = varL61;
    document.save.L15martesP.value = varL12;
    document.save.L15martesS.value = varL22;
    document.save.L15martesT.value = varL32;
    document.save.L15martesC.value = varL42;
    document.save.L15martesQ.value = varL52;
    document.save.L15martesX.value = varL62;
    document.save.L15miercolesP.value = varL13;
    document.save.L15miercolesS.value = varL23;
    document.save.L15miercolesT.value = varL33;
    document.save.L15miercolesC.value = varL43;
    document.save.L15miercolesQ.value = varL53;
    document.save.L15miercolesX.value = varL63;
    document.save.L15juevesP.value = varL14;
    document.save.L15juevesS.value = varL24;
    document.save.L15juevesT.value = varL34;
    document.save.L15juevesC.value = varL44;
    document.save.L15juevesQ.value = varL54;
    document.save.L15juevesX.value = varL64;
    document.save.L15viernesP.value = varL15;
    document.save.L15viernesS.value = varL25;
    document.save.L15viernesT.value = varL35;
    document.save.L15viernesC.value = varL45;
    document.save.L15viernesQ.value = varL55;
    document.save.L15viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL16(url, id_contenedor){
    var pagina_requerida = false
    document.save.L16lunesP.value = varL11;
    document.save.L16lunesS.value = varL21;
    document.save.L16lunesT.value = varL31;
    document.save.L16lunesC.value = varL41;
    document.save.L16lunesQ.value = varL51;
    document.save.L16lunesX.value = varL61;
    document.save.L16martesP.value = varL12;
    document.save.L16martesS.value = varL22;
    document.save.L16martesT.value = varL32;
    document.save.L16martesC.value = varL42;
    document.save.L16martesQ.value = varL52;
    document.save.L16martesX.value = varL62;
    document.save.L16miercolesP.value = varL13;
    document.save.L16miercolesS.value = varL23;
    document.save.L16miercolesT.value = varL33;
    document.save.L16miercolesC.value = varL43;
    document.save.L16miercolesQ.value = varL53;
    document.save.L16miercolesX.value = varL63;
    document.save.L16juevesP.value = varL14;
    document.save.L16juevesS.value = varL24;
    document.save.L16juevesT.value = varL34;
    document.save.L16juevesC.value = varL44;
    document.save.L16juevesQ.value = varL54;
    document.save.L16juevesX.value = varL64;
    document.save.L16viernesP.value = varL15;
    document.save.L16viernesS.value = varL25;
    document.save.L16viernesT.value = varL35;
    document.save.L16viernesC.value = varL45;
    document.save.L16viernesQ.value = varL55;
    document.save.L16viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}
function llamarasincronoL17(url, id_contenedor){
    var pagina_requerida = false
    document.save.L17lunesP.value = varL11;
    document.save.L17lunesS.value = varL21;
    document.save.L17lunesT.value = varL31;
    document.save.L17lunesC.value = varL41;
    document.save.L17lunesQ.value = varL51;
    document.save.L17lunesX.value = varL61;
    document.save.L17martesP.value = varL12;
    document.save.L17martesS.value = varL22;
    document.save.L17martesT.value = varL32;
    document.save.L17martesC.value = varL42;
    document.save.L17martesQ.value = varL52;
    document.save.L17martesX.value = varL62;
    document.save.L17miercolesP.value = varL13;
    document.save.L17miercolesS.value = varL23;
    document.save.L17miercolesT.value = varL33;
    document.save.L17miercolesC.value = varL43;
    document.save.L17miercolesQ.value = varL53;
    document.save.L17miercolesX.value = varL63;
    document.save.L17juevesP.value = varL14;
    document.save.L17juevesS.value = varL24;
    document.save.L17juevesT.value = varL34;
    document.save.L17juevesC.value = varL44;
    document.save.L17juevesQ.value = varL54;
    document.save.L17juevesX.value = varL64;
    document.save.L17viernesP.value = varL15;
    document.save.L17viernesS.value = varL25;
    document.save.L17viernesT.value = varL35;
    document.save.L17viernesC.value = varL45;
    document.save.L17viernesQ.value = varL55;
    document.save.L17viernesX.value = varL65;
    inicializarL();
    if (window.XMLHttpRequest) {// Si es Mozilla, Safari etc
        pagina_requerida = new XMLHttpRequest()
    } else if (window.ActiveXObject){ // pero si es IE
        try {
            pagina_requerida = new ActiveXObject("Msxml2.XMLHTTP")
        } 
        catch (e){ // en caso que sea una versión antigua
            try{
                pagina_requerida = new ActiveXObject("Microsoft.XMLHTTP")
            }
            catch (e){}
        }
    }
    else
        return false
    pagina_requerida.onreadystatechange=function(){ // función de respuesta
        cargarpagina(pagina_requerida, id_contenedor)
    }
    pagina_requerida.open('GET', url, true) // asignamos los métodos open y send
    pagina_requerida.send(null)
}


// todo es correcto y ha llegado el momento de poner la información requerida
// en su sitio en la pagina xhtml
function cargarpagina(pagina_requerida, id_contenedor){
    if (pagina_requerida.readyState == 4 && (pagina_requerida.status==200 || window.location.href.indexOf("http")==-1))
        document.getElementById(id_contenedor).innerHTML=pagina_requerida.responseText
}