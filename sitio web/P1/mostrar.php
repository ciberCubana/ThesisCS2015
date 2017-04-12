<?php

session_start();
//datos para establecer la conexion con la base de mysql.
mysql_connect('localhost', 'root', '')or die('Ha fallado la conexi&oacute;n: ' . mysql_error());
mysql_select_db('horario')or die('Error al seleccionar la Base de Datos: ' . mysql_error());

$carreraMostrar = $_REQUEST["carrera"];
$anoMostrar = $_REQUEST["ano"];

$result = mysql_query('SELECT profesor.Nombre,profesor.Apellidos, profesor.Asignatura, profesor.Correo FROM profesor WHERE carrera = "' . $carreraMostrar . '" and ano="' . $anoMostrar . '"')or die(mysql_error());

echo "<h1>";
echo "<br>";
echo "<TABLE BORDER=1>";
$filas = mysql_num_rows($result);
echo "<TR><TD>Nombre</TD><TD>Asignatura</TD><TD>Correo</TD><TD>Seleccionar</TD>";
for ($i = 0; $i < $filas; $i++) {
    $nombre = mysql_result($result, $i, "Nombre") . "  " . mysql_result($result, $i, "Apellidos");
    $correo = mysql_result($result, $i, "Correo");
    echo "<TR bgcolor='white'>";
    print("<TD>" . $nombre . "</TD>");
    print("<TD>" . mysql_result($result, $i, "Asignatura") . "</TD>");
    print("<TD>" . $correo . "</TD>");
    echo "<TD>";
    echo '<input type="checkbox" name="select"  id="' . $correo . '">';
    echo "</TD>";
    echo "</TR>";
}
echo "</TABLE>";
echo "<br>";
echo "<br>";
echo "<input type='submit' value='eliminar' name='Eliminar' onclick=\"eliminar();\" />";
echo "</h1>";
echo "<br>";
echo "<br>";

mysql_close();
?>

