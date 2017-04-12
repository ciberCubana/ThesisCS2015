<?php


    session_start();
    $usuario = $_POST['username'];
    $password = $_POST['password'];
            try {
             include_once 'DBConection.php';
             $db = new DBConection();
             $sql = "Select * FROM usuario WHERE user='$usuario' AND password='$password'";
             $result = $db->consultaDB($sql);
	     $tmp = count($result);

            if ($tmp == 1) {
              $value=$result[0];
	      $roool=$value['type'];
	      session_start();		
			$sql = "UPDATE usuario SET" 
        . " user = '$usuario',"
		. " type = 1";
             $result = $db->consultaDB($sql);
              $_SESSION['rol'] = $roool;    
             header('Location: ../start.php');
            }
             else {
                  header('Location: ../index.html');
                    echo '<div class="error">Su usuario es incorrecto, intente nuevamente.</div>';
            }
            }
            catch (Exception $exc) {
            echo $exc->getTraceAsString();
            header('Location: ../index.html?page=notification_error');
			  echo '<div class="error">Su usuario es incorrecto, intente nuevamente.</div>';
        }
?>
