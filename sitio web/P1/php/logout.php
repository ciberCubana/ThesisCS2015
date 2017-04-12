 <?php
    session_start();
	$usuario = $_SESSION['user'];
	include_once 'DBConection.php';
    $db = new DBConection();
	$sql = "UPDATE usuario SET" 
        . " user = '$usuario',"
		. " type = 0";
             $result = $db->consultaDB($sql);
             $_SESSION['rol'] = 1;
    session_destroy();
    header('Location: ../index.php');
?> 