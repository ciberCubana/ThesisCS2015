function save() {
    var nombre = $('#nombre').val();

    $.ajax({
        type: "POST",
        url: "afectaciones.php",
        data: {nombre: nombre},
        typedata: text,
        success: function(text) {
            alert(text);
        }
    })
}

  