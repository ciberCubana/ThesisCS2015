<?php
session_start();
include_once 'DBConection.php';
//datos para establecer la conexion con la base de mysql.
mysql_connect('localhost', 'root', '') or die('Ha fallado la conexi&oacute;n: ' . mysql_error());
mysql_select_db('horario') or die('Error al seleccionar la Base de Datos: ' . mysql_error());

$name = $_POST['name'];
$l11 = $_POST['A1lunesP'];
$l12 = $_POST['A1lunesS'];
$l13 = $_POST['A1lunesT'];
$l14 = $_POST['A1lunesC'];
$l15 = $_POST['A1lunesQ'];
$l16 = $_POST['A1lunesX'];
$m11 = $_POST['A1martesP'];
$m12 = $_POST['A1martesS'];
$m13 = $_POST['A1martesT'];
$m14 = $_POST['A1martesC'];
$m15 = $_POST['A1martesQ'];
$m16 = $_POST['A1martesX'];
$mi11 = $_POST['A1miercolesP'];
$mi12 = $_POST['A1miercolesS'];
$mi13 = $_POST['A1miercolesT'];
$mi14 = $_POST['A1miercolesC'];
$mi15 = $_POST['A1miercolesQ'];;
$mi16 = $_POST['A1miercolesX'];
$j11 = $_POST['A1juevesP'];
$j12 = $_POST['A1juevesS'];
$j13 = $_POST['A1juevesT'];
$j14 = $_POST['A1juevesC'];
$j15 = $_POST['A1juevesQ'];
$j16 = $_POST['A1juevesX'];
$v11 = $_POST['A1viernesP'];
$v12 = $_POST['A1viernesS'];
$v13 = $_POST['A1viernesT'];
$v14 = $_POST['A1viernesC'];
$v15 = $_POST['A1viernesQ'];
$v16 = $_POST['A1viernesX'];
mysql_query('INSERT INTO afectsem1 (
nombreProf ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $name . '", "' . $l11 . '" , "' . $l12 . '", "' . $l13 . '" , "' . $l14 . '", "' . $l15 . '" , "' . $l16 . '", "' 
. $m11 . '" , "' . $m12 . '", "' . $m13 . '" , "' . $m14 . '", "' . $m15 . '" , "' . $m16 . '", "' 
. $mi11 . '" , "' . $mi12 . '", "' . $mi13 . '" , "' . $mi14 . '", "' . $mi15 . '" , "' . $mi16 . '", "' 
. $j11 . '" , "' . $j12 . '", "' . $j13 . '" , "' . $j14 . '", "' . $j15 . '" , "' . $j16 . '", "' 
. $v11 . '" , "' . $v12 . '", "' . $v13 . '" , "' . $v14 . '", "' . $v15 . '" , "' . $v16 . '"
)');
$db = new DBConection();
$sql = "Select * FROM afectsem1";
$result = $db->consultaDB($sql);
$tmp = count($result);
if($tmp != 0){
echo 'Todo salio bien';
mysql_close();
}else
    echo $tmp;
?>