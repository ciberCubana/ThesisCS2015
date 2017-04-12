<?php
session_start();
    //datos para establecer la conexion con la base de mysql.
   mysql_connect('localhost','root','')or die ('Ha fallado la conexi&oacute;n: '.mysql_error());
    mysql_select_db('horario')or die ('Error al seleccionar la Base de Datos: '.mysql_error());

    $cont=$HTTP_GET_VARS['contador'];
	$index = 0;
	$val;
  	for($i=1;$i<=$cont;){
	$val = $HTTP_GET_VARS[$index];
	if($val == ""){
		$index++;
	}else{
		$i++;
	}
	mysql_query('DELETE * FROM profesor WHERE Correo="'.$val.'"');
	}
	
       mysql_close();
	   
	   header('Location: ../start.php');
?>