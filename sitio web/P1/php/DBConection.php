<?php


class DBConection {

    private $driver;
    private $server;
    private $user;
    private $password;
    private $database;

    function __construct($driver = 'mysql', $server = 'localhost', $user = 'root', $password = '', $database = 'horario') {
        $this->driver = $driver;
        $this->server = $server;
        $this->user = $user;
        $this->password = $password;
        $this->database = $database;
    }

    function consultaDB($sql) {
        if ($this->driver == 'mysql') {
            mysql_connect($this->server, $this->user, $this->password) or
                    die("Could not connect: " . mysql_error());
            mysql_select_db($this->database);
            $result = mysql_query($sql);
            
            
            if(!$result)
                return 0; 
            $array = array();
            while ($row = mysql_fetch_array($result)) {
                $array[]=$row;
            }
            return $array;
        }
        if ($this->driver == 'postgres') {            
            pg_connect($this->server, 5432, $this->database, $this->user, $this->password) or
                    die ("Error de conexion.". pg_last_error());            
            $result = pg_query($sql);
            if(!$result)
                return 0;           
            $array = array();
            while ($row = pg_fetch_assoc($result)) {
                $array[]=$row;
            }
            return $array;
            
        }
    }

}

?>
