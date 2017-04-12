<?php


    $usuario = $_POST['username'];
    $password = $_POST['oldpassword'];
    $newpassword = $_POST['newpassword'];
    $confpassword = $_POST['confpassword'];
    if (!isset($usuario) && !isset($password) && !isset($newpassword) && !isset($confpassword))
{
    die('No ha intoducido todos los datos');
}else
            try {
             include_once 'DBConection.php';
             $db = new DBConection();
             $sql = "Select * FROM usuario WHERE user='$usuario' AND password='$password'";
             $result = $db->consultaDB($sql);
	     $tmp = count($result);

            if ($tmp == 1) {
                if($newpassword == $confpassword){
              $value=$result[0];
	      $roool=$value['type'];
	      session_start();			   
              $_SESSION['rol'] = $roool;    
              $sql = "UPDATE usuario SET" 
        . " user = '$usuario',"
		. " password = '$newpassword'";
             $result = $db->consultaDB($sql);
             header('Location: ../start.php');
                }else{
                    header('Location: ../conf.php');
                }
            }
             else {
                  header('Location: ../conf.php');
            }
            }
            catch (Exception $exc) {
            echo $exc->getTraceAsString();
            header('Location: ../index.php?page=notification_error');
        }
?>
