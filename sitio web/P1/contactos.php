<?php
session_start();
if ((!isset($_SESSION['rol'])) || ($_SESSION['rol'] != 0)) {    
    header('Location: index.php');
}
?>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.0.0.58475 -->
    <meta charset="utf-8">
    <title>Contactos</title>
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
        <ul class="art-hmenu"><li><a href="start.php">Inicio</a></li>
		<li><a href="Blog Posts/new-post-3.php">P-1</a></li>
		<li><a href="mostrar.html">Eliminar</a></li>
		<li><a href="contactos.php" class="active">Contactos</a></li></ul> 
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
                                <h2 class="art-postheader">Contactos</h2>
                                <br> 
                                <strong><cite>nparada@uclv.edu.cu</cite></strong>    <br>        
                                <strong><cite>lmcastillo@uclv.edu.cu</cite></strong>          
                <div class="art-postcontent art-postcontent-0 clearfix"><div class="art-content-layout">
    <div class="art-content-layout-row">
    <div class="art-layout-cell layout-item-0" style="width: 100%" >
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