<?php
session_start();
if ((isset($_SESSION['rol'])) && ($_SESSION['rol'] != 1)) {
    header('Location: start.php');
} else {
    ?>
    <!DOCTYPE html>
    <html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.0.0.58475 -->
            <meta charset="utf-8">
            <title>Inicio</title>
            <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
            <link rel="stylesheet" href="style.css" media="screen">
            <!--[if lte IE 7]><link rel="stylesheet" href="style.ie7.css" media="screen" /><![endif]-->
            <link rel="stylesheet" href="style.responsive.css" media="all">


            <script src="jquery.js"></script>
            <script src="script.js"></script>
            <script src="script.responsive.js"></script>


            <style>.art-content .art-postcontent-0 .layout-item-0 { padding-right: 10px;padding-left: 10px;  }
                .ie7 .post .layout-cell {border:none !important; padding:0 !important; }
                .ie6 .post .layout-cell {border:none !important; padding:0 !important; }

            </style></head>
        <body>
            <div id="art-main">
                <div id="art-hmenu-bg" class="art-bar art-nav clearfix">
                </div>
                <div class="art-sheet clearfix">

                    <header class="art-header clearfix">


                        <div class="art-shapes">
                            <h1 class="art-headline" data-left="2.86%">
                                Formulario P-1
                            </h1>
                            <h2 class="art-slogan" data-left="2.86%">Ayúdenos a generar un nuevo horario.</h2>


                        </div>



                    </header>
                    <div class="art-layout-wrapper clearfix">
                        <div class="art-content-layout">
                            <div class="art-content-layout-row">
                                <div class="art-layout-cell art-content clearfix"><article class="art-post art-article">


                                        <div class="art-postcontent art-postcontent-0 clearfix"><div class="art-content-layout">
                                                <div class="art-content-layout-row">

                                                    <div class="art-layout-cell layout-item-0" style="width: 40%" >
                                                        <p><span style="font-weight: bold; font-size: 24px; text-shadow: rgba(23, 23, 23, 0.984375) 0px 0px 6px; color: #946310;">Inicio</span></p>
                                                        <div class="art-block clearfix">
                                                            <div class="art-blockcontent"><form action="" method="post" name="login" id="form-login">
                                                                    <fieldset class="input" style="border: 0 none;">
                                                                        <?php
// session_start(); //session_start() crea una sesión para ser usada mediante una petición GET o POST, o pasado por una cookie 
                                                                        include_once 'php/DBConection.php'; //es la sentencia q usaremos para incluir el archivo de conexión a la base de datos que creamos anteriormente.
                                                                        /* Función verificar_login() --> Vamos a crear una función llamada verificar_login, esta se encargara de hacer una consulta a la base de datos para saber si el usuario ingresado es correcto o no. */

                                                                        function verificar_login($usuario, $password, &$result) {
                                                                            $usuario = $_POST['username'];
                                                                            $password = $_POST['password'];
                                                                            try {
                                                                                $db = new DBConection();
                                                                                $sql = "Select * FROM usuario WHERE user='$usuario' AND password='$password'";
                                                                                $result = $db->consultaDB($sql);
                                                                                $tmp = count($result);

                                                                                if ($tmp == 1) {
                                                                                    $value = $result[0];
                                                                                    $roool = $value['type'];
                                                                                    session_start();
                                                                                    $sql = "UPDATE usuario SET"
                                                                                            . " user = '$usuario',"
                                                                                            . " type = 1";
                                                                                    $result = $db->consultaDB($sql);
                                                                                    $_SESSION['rol'] = $roool;
                                                                                    $_SESSION['user'] = $usuario;
                                                                                    return 1;
                                                                                } else {
                                                                                    return 0;
                                                                                }
                                                                            } catch (Exception $exc) {
                                                                                echo $exc->getTraceAsString();
                                                                                header('Location: ../index.php?page=notification_error');
                                                                                echo '<div class="error">Su usuario es incorrecto, intente nuevamente.</div>';
                                                                            }
                                                                        }

                                                                        /* Luego haremos una serie de condicionales que identificaran el momento en el boton de login es presionado y cuando este sea presionado llamaremos a la función verificar_login() pasandole los parámetros ingresados: */
                                                                        if (isset($_POST['login'])) { //Si la primera condición no pasa, haremos otra preguntando si el boton de login fue presionado
                                                                            if (verificar_login($_POST['username'], $_POST['password'], $result) == 1) { //Si el boton fue presionado llamamos a la función verificar_login() dentro de otra condición preguntando si resulta verdadero y le pasamos los valores ingresados como parámetros.
                                                                                /* Si el login fue correcto, registramos la variable de sesión y al mismo tiempo refrescamos la pagina index.php. */
                                                                                $value = $result[0];
                                                                                header("location: start.php");
                                                                            } else {
                                                                                echo '<div class="error">Su usuario o contraseña es incorrecto, intente nuevamente.</div>'; //Si la función verificar_login() no pasa, que se muestre un mensaje de error.
                                                                            }
                                                                        }
                                                                        ?>
                                                                        <form action="" method="post" class="login">
                                                                            <div><label>Usuario</label><input name="username" type="text" ></div>
                                                                            <div><label>Contraseña</label><input name="password" type="password"></div>
                                                                            <div><input name="login" type="submit" value="Aceptar"></div>
                                                                        </form>
                                                                    </fieldset>
                                                                    <ul>
                                                                        <li>
                                                                            <a href="#"> ¿Olvidó la contraseña?</a>
                                                                        </li>
                                                                        <li>
                                                                            <a href="conf.php">¿Cambiar la contraseña?</a>
                                                                        </li>
                                                                    </ul>
                                                                </form></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </article></div>
                            </div>
                        </div>
                    </div><footer class="art-footer clearfix">
                        <p><span style="text-shadow: #171717 0px 0px 12px; font-size: 14px; color: #6D6D37;">UCLV-MFC</span></p>
                    </footer>

                </div>
                <p class="art-page-footer">
                    <span id="art-footnote-links"><a href="//intranet.uclv.edu.cu" target="_blank">UCLV</a> </span>
                </p>
            </div>


        </body></html>
    <?php
}
?>