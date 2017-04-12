<?php
session_start();
if ((!isset($_SESSION['rol'])) || ($_SESSION['rol'] != 0)) {
    header('Location: index.php');
}
?>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head>
        <meta charset="utf-8">
        <title>Principal</title>
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
                <nav class="art-nav clearfix"> 
                    <div class="art-nav-inner"> 
                        <ul class="art-hmenu"><li><a href="start.php" class="active">Inicio</a></li>
                            <li><a href="Blog Posts/new-post-3.php">P-1</a></li>
                            <li><a href="mostrar.html">Eliminar</a></li>
                            <li><a href="contactos.php">Contactos</a></li></ul> 
                    </div>
                </nav>
                <header class="art-header clearfix">


                    <div class="art-shapes">
                        <h1 class="art-headline" data-left="2.86%">
                            <a href="#">Formulario P-1</a>
                        </h1>
                        <h2 class="art-slogan" data-left="2.86%">Ayúdenos a generar un nuevo horario.</h2>


                    </div>



                </header>
                <div class="art-layout-wrapper clearfix">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-content clearfix"><article class="art-post art-article">
                                    <?php
                                    // Si la variable de sesión ‘userid’ ya existe, que muestre el mensaje de saludo.
                                    echo 'Bienvenido ' . $_SESSION['user'] . '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;';
                                    echo '<a href="php/logout.php">Logout</a>';
                                    $_SESSION['verif'] = 0;
                                    ?>       

                                    <div class="art-postcontent art-postcontent-0 clearfix"><div class="art-content-layout">
                                            <div class="art-content-layout-row">

                                                <div class="art-layout-cell layout-item-0" style="width: 40%" >
                                                    <p><span style="font-weight: bold; font-size: 24px; text-shadow: rgba(23, 23, 23, 0.984375) 0px 0px 6px; color: #946310;">Inicio</span></p>
                                                </div>
                                            </div>
                                        </div>
                                        <br>
                                        <div class="art-content-layout">
                                            <div class="art-content-layout-row">
                                                <div class="art-layout-cell layout-item-0" style="width: 50%" >
                                                    El problema de la elaboración de un horario de clases puede considerarse como un problema de asignación de recursos limitados a ciertas tareas. Los recursos que suelen tomarse en cuenta son el tiempo, los profesores con que se dispone, el espacio físico, la disponibilidad de profesores. Las tareas se refieren a las actividades docentes que realizan los profesores.<br>
                                                    <br>
                                                    Entre los problemas que suelen ocurrir en la universidad, debido a la falta de un sistema automático de generación de horarios, tenemos: <br>
                                                    <br>
                                                    &nbsp;Dificultad en la elaboración de horarios, lo que demanda el uso de una gran cantidad de horas o días en la elaboración manual.<br>
                                                    <br>
                                                    &nbsp;Profesores que se ven obligados a dictar en horas incómodas, por lo que se dificulta su buen desempeño. <br>
                                                    &nbsp;<br>
                                                    &nbsp;Materias que no están ubicadas en un horario óptimo que respete criterios pedagógicos.<br>
                                                    <br>
                                                </div><div class="art-layout-cell layout-item-0" style="width: 50%" >
                                                    <p>Una vez que se cuenta con un sistema automático de generación de horarios, desaparece el problema de cómo hacer el horario, y es posible enfocar el problema de cómo debe ser el horario, con esto se mejora en gran medida la calidad de la educación y el grado de satisfacción del personal docente y administrativo de los colegios.&nbsp;<span style="font-weight: bold;"><br></span></p>
                                                    <p>Por eso, .........................</p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
                                                    <p><br></p>
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
                <span id="art-footnote-links"><a href="//intranet.uclv.edu.cu" target="_blank">UCLV</a></span>
            </p>
        </div>


    </body></html>