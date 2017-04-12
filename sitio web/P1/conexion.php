<?php
class Conexion {

  
public $_conexion;

    public function __construct() {
       if (! $this->_conexion = mysql_connect('localhost', 'root', '')) {
           echo "<a href=index.html>Error al conectar</a>";
          
            exit;
            }        
       if (! mysql_select_db("horario")) {
          echo "<a href=index.html>Error al seleccionar BDD</a>";
            exit;
            }  
             
        }
    
    
       
    public function __destruct() {
        mysql_close($this->_conexion); 
    }
    
    public function getConexion(){
        
      return  $this->_conexion;
    }
 }
?>
