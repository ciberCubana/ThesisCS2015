<?php
//error_reporting (E_ALL ^ E_NOTICE);	
session_start();
//datos para establecer la conexion con la base de mysql.
mysql_connect('localhost', 'root', '') or die('Ha fallado la conexi&oacute;n: ' . mysql_error());
mysql_select_db('horario') or die('Error al seleccionar la Base de Datos: ' . mysql_error());
include_once 'DBConection.php';
$_SESSION['verif'] = 0;
$name = $_POST['name'];
$lastname = $_POST['lastname'];
$nameP = $name." ".$lastname;
$carpeta = $_POST['asig'];
$asig = str_replace(' ','_',$carpeta);  
$email = $_POST['email'];
$carr = $_POST['carrera'];
$ano = $_POST['ano'];
$abrev = $_POST['abrev'];
$imparteC = $_POST['conf'];
$imparteCp = $_POST['cp'];
$cantHC = $_POST['cantHC'];
$sem11 = $_POST['s11'];
$sem21 = $_POST['s21'];
$sem31 = $_POST['s31'];
$sem41 = $_POST['s41'];
$sem51 = $_POST['s51'];
$sem61 = $_POST['s61'];
$sem71 = $_POST['s71'];
$sem81 = $_POST['s81'];
$sem91 = $_POST['s91'];
$sem101 = $_POST['s101'];
$sem111 = $_POST['s111'];
$sem121 = $_POST['s121'];
$sem131 = $_POST['s131'];
$sem141 = $_POST['s141'];
$sem151 = $_POST['s151'];
$sem161 = $_POST['s161'];
$sem171 = $_POST['s171'];
$sem12 = $_POST['s12'];
$sem22 = $_POST['s22'];
$sem32 = $_POST['s32'];
$sem42 = $_POST['s42'];
$sem52 = $_POST['s52'];
$sem62 = $_POST['s62'];
$sem72 = $_POST['s72'];
$sem82 = $_POST['s82'];
$sem92 = $_POST['s92'];
$sem102 = $_POST['s102'];
$sem112 = $_POST['s112'];
$sem122 = $_POST['s122'];
$sem132 = $_POST['s132'];
$sem142 = $_POST['s142'];
$sem152 = $_POST['s152'];
$sem162 = $_POST['s162'];
$sem172 = $_POST['s172'];
$sem13 = $_POST['s13'];
$sem23 = $_POST['s23'];
$sem33 = $_POST['s33'];
$sem43 = $_POST['s43'];
$sem53 = $_POST['s53'];
$sem63 = $_POST['s63'];
$sem73 = $_POST['s73'];
$sem83 = $_POST['s83'];
$sem93 = $_POST['s93'];
$sem103 = $_POST['s103'];
$sem113 = $_POST['s113'];
$sem123 = $_POST['s123'];
$sem133 = $_POST['s133'];
$sem143 = $_POST['s143'];
$sem153 = $_POST['s153'];
$sem163 = $_POST['s163'];
$sem173 = $_POST['s173'];
$sem14 = $_POST['s14'];
$sem24 = $_POST['s24'];
$sem34 = $_POST['s34'];
$sem44 = $_POST['s44'];
$sem54 = $_POST['s54'];
$sem64 = $_POST['s64'];
$sem74 = $_POST['s74'];
$sem84 = $_POST['s84'];
$sem94 = $_POST['s94'];
$sem104 = $_POST['s104'];
$sem114 = $_POST['s114'];
$sem124 = $_POST['s124'];
$sem134 = $_POST['s134'];
$sem144 = $_POST['s144'];
$sem154 = $_POST['s154'];
$sem164 = $_POST['s164'];
$sem174 = $_POST['s174'];

//laboratorios

$Ll11 = $_POST['L1lunesP'];
$Ll12 = $_POST['L1lunesS'];
$Ll13 = $_POST['L1lunesT'];
$Ll14 = $_POST['L1lunesC'];
$Ll15 = $_POST['L1lunesQ'];
$Ll16 = $_POST['L1lunesX'];
$Lm11 = $_POST['L1martesP'];
$Lm12 = $_POST['L1martesS'];
$Lm13 = $_POST['L1martesT'];
$Lm14 = $_POST['L1martesC'];
$Lm15 = $_POST['L1martesQ'];
$Lm16 = $_POST['L1martesX'];
$Lmi11 = $_POST['L1miercolesP'];
$Lmi12 = $_POST['L1miercolesS'];
$Lmi13 = $_POST['L1miercolesT'];
$Lmi14 = $_POST['L1miercolesC'];
$Lmi15 = $_POST['L1miercolesQ'];
$Lmi16 = $_POST['L1miercolesX'];
$Lj11 = $_POST['L1juevesP'];
$Lj12 = $_POST['L1juevesS'];
$Lj13 = $_POST['L1juevesT'];
$Lj14 = $_POST['L1juevesC'];
$Lj15 = $_POST['L1juevesQ'];
$Lj16 = $_POST['L1juevesX'];
$Lv11 = $_POST['L1viernesP'];
$Lv12 = $_POST['L1viernesS'];
$Lv13 = $_POST['L1viernesT'];
$Lv14 = $_POST['L1viernesC'];
$Lv15 = $_POST['L1viernesQ'];
$Lv16 = $_POST['L1viernesX'];
$Ll21 = $_POST['L2lunesP'];
$Ll22 = $_POST['L2lunesS'];
$Ll23 = $_POST['L2lunesT'];
$Ll24 = $_POST['L2lunesC'];
$Ll25 = $_POST['L2lunesQ'];
$Ll26 = $_POST['L2lunesX'];
$Lm21 = $_POST['L2martesP'];
$Lm22 = $_POST['L2martesS'];
$Lm23 = $_POST['L2martesT'];
$Lm24 = $_POST['L2martesC'];
$Lm25 = $_POST['L2martesQ'];
$Lm26 = $_POST['L2martesX'];
$Lmi21 = $_POST['L2miercolesP'];
$Lmi22 = $_POST['L2miercolesS'];
$Lmi23 = $_POST['L2miercolesT'];
$Lmi24 = $_POST['L2miercolesC'];
$Lmi25 = $_POST['L2miercolesQ'];
$Lmi26 = $_POST['L2miercolesX'];
$Lj21 = $_POST['L2juevesP'];
$Lj22 = $_POST['L2juevesS'];
$Lj23 = $_POST['L2juevesT'];
$Lj24 = $_POST['L2juevesC'];
$Lj25 = $_POST['L2juevesQ'];
$Lj26 = $_POST['L2juevesX'];
$Lv21 = $_POST['L2viernesP'];
$Lv22 = $_POST['L2viernesS'];
$Lv23 = $_POST['L2viernesT'];
$Lv24 = $_POST['L2viernesC'];
$Lv25 = $_POST['L2viernesQ'];
$Lv26 = $_POST['L2viernesX'];
$Ll31 = $_POST['L3lunesP'];
$Ll32 = $_POST['L3lunesS'];
$Ll33 = $_POST['L3lunesT'];
$Ll34 = $_POST['L3lunesC'];
$Ll35 = $_POST['L3lunesQ'];
$Ll36 = $_POST['L3lunesX'];
$Lm31 = $_POST['L3martesP'];
$Lm32 = $_POST['L3martesS'];
$Lm33 = $_POST['L3martesT'];
$Lm34 = $_POST['L3martesC'];
$Lm35 = $_POST['L3martesQ'];
$Lm36 = $_POST['L3martesX'];
$Lmi31 = $_POST['L3miercolesP'];
$Lmi32 = $_POST['L3miercolesS'];
$Lmi33 = $_POST['L3miercolesT'];
$Lmi34 = $_POST['L3miercolesC'];
$Lmi35 = $_POST['L3miercolesQ'];
$Lmi36 = $_POST['L3miercolesX'];
$Lj31 = $_POST['L3juevesP'];
$Lj32 = $_POST['L3juevesS'];
$Lj33 = $_POST['L3juevesT'];
$Lj34 = $_POST['L3juevesC'];
$Lj35 = $_POST['L3juevesQ'];
$Lj36 = $_POST['L3juevesX'];
$Lv31 = $_POST['L3viernesP'];
$Lv32 = $_POST['L3viernesS'];
$Lv33 = $_POST['L3viernesT'];
$Lv34 = $_POST['L3viernesC'];
$Lv35 = $_POST['L3viernesQ'];
$Lv36 = $_POST['L3viernesX'];
$Ll41 = $_POST['L4lunesP'];
$Ll42 = $_POST['L4lunesS'];
$Ll43 = $_POST['L4lunesT'];
$Ll44 = $_POST['L4lunesC'];
$Ll45 = $_POST['L4lunesQ'];
$Ll46 = $_POST['L4lunesX'];
$Lm41 = $_POST['L4martesP'];
$Lm42 = $_POST['L4martesS'];
$Lm43 = $_POST['L4martesT'];
$Lm44 = $_POST['L4martesC'];
$Lm45 = $_POST['L4martesQ'];
$Lm46 = $_POST['L4martesX'];
$Lmi41 = $_POST['L4miercolesP'];
$Lmi42 = $_POST['L4miercolesS'];
$Lmi43 = $_POST['L4miercolesT'];
$Lmi44 = $_POST['L4miercolesC'];
$Lmi45 = $_POST['L4miercolesQ'];
$Lmi46 = $_POST['L4miercolesX'];
$Lj41 = $_POST['L4juevesP'];
$Lj42 = $_POST['L4juevesS'];
$Lj43 = $_POST['L4juevesT'];
$Lj44 = $_POST['L4juevesC'];
$Lj45 = $_POST['L4juevesQ'];
$Lj46 = $_POST['L4juevesX'];
$Lv41 = $_POST['L4viernesP'];
$Lv42 = $_POST['L4viernesS'];
$Lv43 = $_POST['L4viernesT'];
$Lv44 = $_POST['L4viernesC'];
$Lv45 = $_POST['L4viernesQ'];
$Lv46 = $_POST['L4viernesX'];
$Ll51 = $_POST['L5lunesP'];
$Ll52 = $_POST['L5lunesS'];
$Ll53 = $_POST['L5lunesT'];
$Ll54 = $_POST['L5lunesC'];
$Ll55 = $_POST['L5lunesQ'];
$Ll56 = $_POST['L5lunesX'];
$Lm51 = $_POST['L5martesP'];
$Lm52 = $_POST['L5martesS'];
$Lm53 = $_POST['L5martesT'];
$Lm54 = $_POST['L5martesC'];
$Lm55 = $_POST['L5martesQ'];
$Lm56 = $_POST['L5martesX'];
$Lmi51 = $_POST['L5miercolesP'];
$Lmi52 = $_POST['L5miercolesS'];
$Lmi53 = $_POST['L5miercolesT'];
$Lmi54 = $_POST['L5miercolesC'];
$Lmi55 = $_POST['L5miercolesQ'];
$Lmi56 = $_POST['L5miercolesX'];
$Lj51 = $_POST['L5juevesP'];
$Lj52 = $_POST['L5juevesS'];
$Lj53 = $_POST['L5juevesT'];
$Lj54 = $_POST['L5juevesC'];
$Lj55 = $_POST['L5juevesQ'];
$Lj56 = $_POST['L5juevesX'];
$Lv51 = $_POST['L5viernesP'];
$Lv52 = $_POST['L5viernesS'];
$Lv53 = $_POST['L5viernesT'];
$Lv54 = $_POST['L5viernesC'];
$Lv55 = $_POST['L5viernesQ'];
$Lv56 = $_POST['L5viernesX'];
$Ll61 = $_POST['L6lunesP'];
$Ll62 = $_POST['L6lunesS'];
$Ll63 = $_POST['L6lunesT'];
$Ll64 = $_POST['L6lunesC'];
$Ll65 = $_POST['L6lunesQ'];
$Ll66 = $_POST['L6lunesX'];
$Lm61 = $_POST['L6martesP'];
$Lm62 = $_POST['L6martesS'];
$Lm63 = $_POST['L6martesT'];
$Lm64 = $_POST['L6martesC'];
$Lm65 = $_POST['L6martesQ'];
$Lm66 = $_POST['L6martesX'];
$Lmi61 = $_POST['L6miercolesP'];
$Lmi62 = $_POST['L6miercolesS'];
$Lmi63 = $_POST['L6miercolesT'];
$Lmi64 = $_POST['L6miercolesC'];
$Lmi65 = $_POST['L6miercolesQ'];
$Lmi66 = $_POST['L6miercolesX'];
$Lj61 = $_POST['L6juevesP'];
$Lj62 = $_POST['L6juevesS'];
$Lj63 = $_POST['L6juevesT'];
$Lj64 = $_POST['L6juevesC'];
$Lj65 = $_POST['L6juevesQ'];
$Lj66 = $_POST['L6juevesX'];
$Lv61 = $_POST['L6viernesP'];
$Lv62 = $_POST['L6viernesS'];
$Lv63 = $_POST['L6viernesT'];
$Lv64 = $_POST['L6viernesC'];
$Lv65 = $_POST['L6viernesQ'];
$Lv66 = $_POST['L6viernesX'];
$Ll71 = $_POST['L7lunesP'];
$Ll72 = $_POST['L7lunesS'];
$Ll73 = $_POST['L7lunesT'];
$Ll74 = $_POST['L7lunesC'];
$Ll75 = $_POST['L7lunesQ'];
$Ll76 = $_POST['L7lunesX'];
$Lm71 = $_POST['L7martesP'];
$Lm72 = $_POST['L7martesS'];
$Lm73 = $_POST['L7martesT'];
$Lm74 = $_POST['L7martesC'];
$Lm75 = $_POST['L7martesQ'];
$Lm76 = $_POST['L7martesX'];
$Lmi71 = $_POST['L7miercolesP'];
$Lmi72 = $_POST['L7miercolesS'];
$Lmi73 = $_POST['L7miercolesT'];
$Lmi74 = $_POST['L7miercolesC'];
$Lmi75 = $_POST['L7miercolesQ'];
$Lmi76 = $_POST['L7miercolesX'];
$Lj71 = $_POST['L7juevesP'];
$Lj72 = $_POST['L7juevesS'];
$Lj73 = $_POST['L7juevesT'];
$Lj74 = $_POST['L7juevesC'];
$Lj75 = $_POST['L7juevesQ'];
$Lj76 = $_POST['L7juevesX'];
$Lv71 = $_POST['L7viernesP'];
$Lv72 = $_POST['L7viernesS'];
$Lv73 = $_POST['L7viernesT'];
$Lv74 = $_POST['L7viernesC'];
$Lv75 = $_POST['L7viernesQ'];
$Lv76 = $_POST['L7viernesX'];
$Ll81 = $_POST['L8lunesP'];
$Ll82 = $_POST['L8lunesS'];
$Ll83 = $_POST['L8lunesT'];
$Ll84 = $_POST['L8lunesC'];
$Ll85 = $_POST['L8lunesQ'];
$Ll86 = $_POST['L8lunesX'];
$Lm81 = $_POST['L8martesP'];
$Lm82 = $_POST['L8martesS'];
$Lm83 = $_POST['L8martesT'];
$Lm84 = $_POST['L8martesC'];
$Lm85 = $_POST['L8martesQ'];
$Lm86 = $_POST['L8martesX'];
$Lmi81 = $_POST['L8miercolesP'];
$Lmi82 = $_POST['L8miercolesS'];
$Lmi83 = $_POST['L8miercolesT'];
$Lmi84 = $_POST['L8miercolesC'];
$Lmi85 = $_POST['L8miercolesQ'];
$Lmi86 = $_POST['L8miercolesX'];
$Lj81 = $_POST['L8juevesP'];
$Lj82 = $_POST['L8juevesS'];
$Lj83 = $_POST['L8juevesT'];
$Lj84 = $_POST['L8juevesC'];
$Lj85 = $_POST['L8juevesQ'];
$Lj86 = $_POST['L8juevesX'];
$Lv81 = $_POST['L8viernesP'];
$Lv82 = $_POST['L8viernesS'];
$Lv83 = $_POST['L8viernesT'];
$Lv84 = $_POST['L8viernesC'];
$Lv85 = $_POST['L8viernesQ'];
$Lv86 = $_POST['L8viernesX'];
$Ll91 = $_POST['L9lunesP'];
$Ll92 = $_POST['L9lunesS'];
$Ll93 = $_POST['L9lunesT'];
$Ll94 = $_POST['L9lunesC'];
$Ll95 = $_POST['L9lunesQ'];
$Ll96 = $_POST['L9lunesX'];
$Lm91 = $_POST['L9martesP'];
$Lm92 = $_POST['L9martesS'];
$Lm93 = $_POST['L9martesT'];
$Lm94 = $_POST['L9martesC'];
$Lm95 = $_POST['L9martesQ'];
$Lm96 = $_POST['L9martesX'];
$Lmi91 = $_POST['L9miercolesP'];
$Lmi92 = $_POST['L9miercolesS'];
$Lmi93 = $_POST['L9miercolesT'];
$Lmi94 = $_POST['L9miercolesC'];
$Lmi95 = $_POST['L9miercolesQ'];
$Lmi96 = $_POST['L9miercolesX'];
$Lj91 = $_POST['L9juevesP'];
$Lj92 = $_POST['L9juevesS'];
$Lj93 = $_POST['L9juevesT'];
$Lj94 = $_POST['L9juevesC'];
$Lj95 = $_POST['L9juevesQ'];
$Lj96 = $_POST['L9juevesX'];
$Lv91 = $_POST['L9viernesP'];
$Lv92 = $_POST['L9viernesS'];
$Lv93 = $_POST['L9viernesT'];
$Lv94 = $_POST['L9viernesC'];
$Lv95 = $_POST['L9viernesQ'];
$Lv96 = $_POST['L9viernesX'];
$Ll101 = $_POST['L10lunesP'];
$Ll102 = $_POST['L10lunesS'];
$Ll103 = $_POST['L10lunesT'];
$Ll104 = $_POST['L10lunesC'];
$Ll105 = $_POST['L10lunesQ'];
$Ll106 = $_POST['L10lunesX'];
$Lm101 = $_POST['L10martesP'];
$Lm102 = $_POST['L10martesS'];
$Lm103 = $_POST['L10martesT'];
$Lm104 = $_POST['L10martesC'];
$Lm105 = $_POST['L10martesQ'];
$Lm106 = $_POST['L10martesX'];
$Lmi101 = $_POST['L10miercolesP'];
$Lmi102 = $_POST['L10miercolesS'];
$Lmi103 = $_POST['L10miercolesT'];
$Lmi104 = $_POST['L10miercolesC'];
$Lmi105 = $_POST['L10miercolesQ'];
$Lmi106 = $_POST['L10miercolesX'];
$Lj101 = $_POST['L10juevesP'];
$Lj102 = $_POST['L10juevesS'];
$Lj103 = $_POST['L10juevesT'];
$Lj104 = $_POST['L10juevesC'];
$Lj105 = $_POST['L10juevesQ'];
$Lj106 = $_POST['L10juevesX'];
$Lv101 = $_POST['L10viernesP'];
$Lv102 = $_POST['L10viernesS'];
$Lv103 = $_POST['L10viernesT'];
$Lv104 = $_POST['L10viernesC'];
$Lv105 = $_POST['L10viernesQ'];
$Lv106 = $_POST['L10viernesX'];
$Ll111 = $_POST['L11lunesP'];
$Ll112 = $_POST['L11lunesS'];
$Ll113 = $_POST['L11lunesT'];
$Ll114 = $_POST['L11lunesC'];
$Ll115 = $_POST['L11lunesQ'];
$Ll116 = $_POST['L11lunesX'];
$Lm111 = $_POST['L11martesP'];
$Lm112 = $_POST['L11martesS'];
$Lm113 = $_POST['L11martesT'];
$Lm114 = $_POST['L11martesC'];
$Lm115 = $_POST['L11martesQ'];
$Lm116 = $_POST['L11martesX'];
$Lmi111 = $_POST['L11miercolesP'];
$Lmi112 = $_POST['L11miercolesS'];
$Lmi113 = $_POST['L11miercolesT'];
$Lmi114 = $_POST['L11miercolesC'];
$Lmi115 = $_POST['L11miercolesQ'];
$Lmi116 = $_POST['L11miercolesX'];
$Lj111 = $_POST['L11juevesP'];
$Lj112 = $_POST['L11juevesS'];
$Lj113 = $_POST['L11juevesT'];
$Lj114 = $_POST['L11juevesC'];
$Lj115 = $_POST['L11juevesQ'];
$Lj116 = $_POST['L11juevesX'];
$Lv111 = $_POST['L11viernesP'];
$Lv112 = $_POST['L11viernesS'];
$Lv113 = $_POST['L11viernesT'];
$Lv114 = $_POST['L11viernesC'];
$Lv115 = $_POST['L11viernesQ'];
$Lv116 = $_POST['L11viernesX'];
$Ll121 = $_POST['L12lunesP'];
$Ll122 = $_POST['L12lunesS'];
$Ll123 = $_POST['L12lunesT'];
$Ll124 = $_POST['L12lunesC'];
$Ll125 = $_POST['L12lunesQ'];
$Ll126 = $_POST['L12lunesX'];
$Lm121 = $_POST['L12martesP'];
$Lm122 = $_POST['L12martesS'];
$Lm123 = $_POST['L12martesT'];
$Lm124 = $_POST['L12martesC'];
$Lm125 = $_POST['L12martesQ'];
$Lm126 = $_POST['L12martesX'];
$Lmi121 = $_POST['L12miercolesP'];
$Lmi122 = $_POST['L12miercolesS'];
$Lmi123 = $_POST['L12miercolesT'];
$Lmi124 = $_POST['L12miercolesC'];
$Lmi125 = $_POST['L12miercolesQ'];
$Lmi126 = $_POST['L12miercolesX'];
$Lj121 = $_POST['L12juevesP'];
$Lj122 = $_POST['L12juevesS'];
$Lj123 = $_POST['L12juevesT'];
$Lj124 = $_POST['L12juevesC'];
$Lj125 = $_POST['L12juevesQ'];
$Lj126 = $_POST['L12juevesX'];
$Lv121 = $_POST['L12viernesP'];
$Lv122 = $_POST['L12viernesS'];
$Lv123 = $_POST['L12viernesT'];
$Lv124 = $_POST['L12viernesC'];
$Lv125 = $_POST['L12viernesQ'];
$Lv126 = $_POST['L12viernesX'];
$Ll131 = $_POST['L13lunesP'];
$Ll132 = $_POST['L13lunesS'];
$Ll133 = $_POST['L13lunesT'];
$Ll134 = $_POST['L13lunesC'];
$Ll135 = $_POST['L13lunesQ'];
$Ll136 = $_POST['L13lunesX'];
$Lm131 = $_POST['L13martesP'];
$Lm132 = $_POST['L13martesS'];
$Lm133 = $_POST['L13martesT'];
$Lm134 = $_POST['L13martesC'];
$Lm135 = $_POST['L13martesQ'];
$Lm136 = $_POST['L13martesX'];
$Lmi131 = $_POST['L13miercolesP'];
$Lmi132 = $_POST['L13miercolesS'];
$Lmi133 = $_POST['L13miercolesT'];
$Lmi134 = $_POST['L13miercolesC'];
$Lmi135 = $_POST['L13miercolesQ'];
$Lmi136 = $_POST['L13miercolesX'];
$Lj131 = $_POST['L13juevesP'];
$Lj132 = $_POST['L13juevesS'];
$Lj133 = $_POST['L13juevesT'];
$Lj134 = $_POST['L13juevesC'];
$Lj135 = $_POST['L13juevesQ'];
$Lj136 = $_POST['L13juevesX'];
$Lv131 = $_POST['L13viernesP'];
$Lv132 = $_POST['L13viernesS'];
$Lv133 = $_POST['L13viernesT'];
$Lv134 = $_POST['L13viernesC'];
$Lv135 = $_POST['L13viernesQ'];
$Lv136 = $_POST['L13viernesX'];
$Ll141 = $_POST['L14lunesP'];
$Ll142 = $_POST['L14lunesS'];
$Ll143 = $_POST['L14lunesT'];
$Ll144 = $_POST['L14lunesC'];
$Ll145 = $_POST['L14lunesQ'];
$Ll146 = $_POST['L14lunesX'];
$Lm141 = $_POST['L14martesP'];
$Lm142 = $_POST['L14martesS'];
$Lm143 = $_POST['L14martesT'];
$Lm144 = $_POST['L14martesC'];
$Lm145 = $_POST['L14martesQ'];
$Lm146 = $_POST['L14martesX'];
$Lmi141 = $_POST['L14miercolesP'];
$Lmi142 = $_POST['L14miercolesS'];
$Lmi143 = $_POST['L14miercolesT'];
$Lmi144 = $_POST['L14miercolesC'];
$Lmi145 = $_POST['L14miercolesQ'];
$Lmi146 = $_POST['L14miercolesX'];
$Lj141 = $_POST['L14juevesP'];
$Lj142 = $_POST['L14juevesS'];
$Lj143 = $_POST['L14juevesT'];
$Lj144 = $_POST['L14juevesC'];
$Lj145 = $_POST['L14juevesQ'];
$Lj146 = $_POST['L14juevesX']; 
$Lv141 = $_POST['L14viernesP'];
$Lv142 = $_POST['L14viernesS'];
$Lv143 = $_POST['L14viernesT'];
$Lv144 = $_POST['L14viernesC'];
$Lv145 = $_POST['L14viernesQ'];
$Lv146 = $_POST['L14viernesX'];
$Ll151 = $_POST['L15lunesP'];
$Ll152 = $_POST['L15lunesS'];
$Ll153 = $_POST['L15lunesT'];
$Ll154 = $_POST['L15lunesC'];
$Ll155 = $_POST['L15lunesQ'];
$Ll156 = $_POST['L15lunesX'];
$Lm151 = $_POST['L15martesP'];
$Lm152 = $_POST['L15martesS'];
$Lm153 = $_POST['L15martesT'];
$Lm154 = $_POST['L15martesC'];
$Lm155 = $_POST['L15martesQ'];
$Lm156 = $_POST['L15martesX'];
$Lmi151 = $_POST['L15miercolesP'];
$Lmi152 = $_POST['L15miercolesS'];
$Lmi153 = $_POST['L15miercolesT'];
$Lmi154 = $_POST['L15miercolesC'];
$Lmi155 = $_POST['L15miercolesQ'];
$Lmi156 = $_POST['L15miercolesX'];
$Lj151 = $_POST['L15juevesP'];
$Lj152 = $_POST['L15juevesS'];
$Lj153 = $_POST['L15juevesT'];
$Lj154 = $_POST['L15juevesC'];
$Lj155 = $_POST['L15juevesQ'];
$Lj156 = $_POST['L15juevesX'];
$Lv151 = $_POST['L15viernesP'];
$Lv152 = $_POST['L15viernesS'];
$Lv153 = $_POST['L15viernesT'];
$Lv154 = $_POST['L15viernesC'];
$Lv155 = $_POST['L15viernesQ'];
$Lv156 = $_POST['L15viernesX'];
$Ll161 = $_POST['L16lunesP'];
$Ll162 = $_POST['L16lunesS'];
$Ll163 = $_POST['L16lunesT'];
$Ll164 = $_POST['L16lunesC'];
$Ll165 = $_POST['L16lunesQ'];
$Ll166 = $_POST['L16lunesX'];
$Lm161 = $_POST['L16martesP'];
$Lm162 = $_POST['L16martesS'];
$Lm163 = $_POST['L16martesT'];
$Lm164 = $_POST['L16martesC'];
$Lm165 = $_POST['L16martesQ'];
$Lm166 = $_POST['L16martesX'];
$Lmi161 = $_POST['L16miercolesP'];
$Lmi162 = $_POST['L16miercolesS'];
$Lmi163 = $_POST['L16miercolesT'];
$Lmi164 = $_POST['L16miercolesC'];
$Lmi165 = $_POST['L16miercolesQ'];
$Lmi166 = $_POST['L16miercolesX'];
$Lj161 = $_POST['L16juevesP'];
$Lj162 = $_POST['L16juevesS'];
$Lj163 = $_POST['L16juevesT'];
$Lj164 = $_POST['L16juevesC'];
$Lj165 = $_POST['L16juevesQ'];
$Lj166 = $_POST['L16juevesX'];
$Lv161 = $_POST['L16viernesP'];
$Lv162 = $_POST['L16viernesS'];
$Lv163 = $_POST['L16viernesT'];
$Lv164 = $_POST['L16viernesC'];
$Lv165 = $_POST['L16viernesQ'];
$Lv166 = $_POST['L16viernesX'];
$Ll171 = $_POST['L17lunesP'];
$Ll172 = $_POST['L17lunesS'];
$Ll173 = $_POST['L17lunesT'];
$Ll174 = $_POST['L17lunesC'];
$Ll175 = $_POST['L17lunesQ'];
$Ll176 = $_POST['L17lunesX'];
$Lm171 = $_POST['L17martesP'];
$Lm172 = $_POST['L17martesS'];
$Lm173 = $_POST['L17martesT'];
$Lm174 = $_POST['L17martesC'];
$Lm175 = $_POST['L17martesQ'];
$Lm176 = $_POST['L17martesX'];
$Lmi171 = $_POST['L17miercolesP'];
$Lmi172 = $_POST['L17miercolesS'];
$Lmi173 = $_POST['L17miercolesT'];
$Lmi174 = $_POST['L17miercolesC'];
$Lmi175 = $_POST['L17miercolesQ'];
$Lmi176 = $_POST['L17miercolesX'];
$Lj171 = $_POST['L17juevesP'];
$Lj172 = $_POST['L17juevesS'];
$Lj173 = $_POST['L17juevesT'];
$Lj174 = $_POST['L17juevesC'];
$Lj175 = $_POST['L17juevesQ'];
$Lj176 = $_POST['L17juevesX'];
$Lv171 = $_POST['L17viernesP'];
$Lv172 = $_POST['L17viernesS'];
$Lv173 = $_POST['L17viernesT'];
$Lv174 = $_POST['L17viernesC'];
$Lv175 = $_POST['L17viernesQ'];
$Lv176 = $_POST['L17viernesX'];


 
//Afectaciones

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
$mi15 = $_POST['A1miercolesQ'];
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
$l21 = $_POST['A2lunesP'];
$l22 = $_POST['A2lunesS'];
$l23 = $_POST['A2lunesT'];
$l24 = $_POST['A2lunesC'];
$l25 = $_POST['A2lunesQ'];
$l26 = $_POST['A2lunesX'];
$m21 = $_POST['A2martesP'];
$m22 = $_POST['A2martesS'];
$m23 = $_POST['A2martesT'];
$m24 = $_POST['A2martesC'];
$m25 = $_POST['A2martesQ'];
$m26 = $_POST['A2martesX'];
$mi21 = $_POST['A2miercolesP'];
$mi22 = $_POST['A2miercolesS'];
$mi23 = $_POST['A2miercolesT'];
$mi24 = $_POST['A2miercolesC'];
$mi25 = $_POST['A2miercolesQ'];
$mi26 = $_POST['A2miercolesX'];
$j21 = $_POST['A2juevesP'];
$j22 = $_POST['A2juevesS'];
$j23 = $_POST['A2juevesT'];
$j24 = $_POST['A2juevesC'];
$j25 = $_POST['A2juevesQ'];
$j26 = $_POST['A2juevesX'];
$v21 = $_POST['A2viernesP'];
$v22 = $_POST['A2viernesS'];
$v23 = $_POST['A2viernesT'];
$v24 = $_POST['A2viernesC'];
$v25 = $_POST['A2viernesQ'];
$v26 = $_POST['A2viernesX'];
$l31 = $_POST['A3lunesP'];
$l32 = $_POST['A3lunesS'];
$l33 = $_POST['A3lunesT'];
$l34 = $_POST['A3lunesC'];
$l35 = $_POST['A3lunesQ'];
$l36 = $_POST['A3lunesX'];
$m31 = $_POST['A3martesP'];
$m32 = $_POST['A3martesS'];
$m33 = $_POST['A3martesT'];
$m34 = $_POST['A3martesC'];
$m35 = $_POST['A3martesQ'];
$m36 = $_POST['A3martesX'];
$mi31 = $_POST['A3miercolesP'];
$mi32 = $_POST['A3miercolesS'];
$mi33 = $_POST['A3miercolesT'];
$mi34 = $_POST['A3miercolesC'];
$mi35 = $_POST['A3miercolesQ'];
$mi36 = $_POST['A3miercolesX'];
$j31 = $_POST['A3juevesP'];
$j32 = $_POST['A3juevesS'];
$j33 = $_POST['A3juevesT'];
$j34 = $_POST['A3juevesC'];
$j35 = $_POST['A3juevesQ'];
$j36 = $_POST['A3juevesX'];
$v31 = $_POST['A3viernesP'];
$v32 = $_POST['A3viernesS'];
$v33 = $_POST['A3viernesT'];
$v34 = $_POST['A3viernesC'];
$v35 = $_POST['A3viernesQ'];
$v36 = $_POST['A3viernesX'];
$l41 = $_POST['A4lunesP'];
$l42 = $_POST['A4lunesS'];
$l43 = $_POST['A4lunesT'];
$l44 = $_POST['A4lunesC'];
$l45 = $_POST['A4lunesQ'];
$l46 = $_POST['A4lunesX'];
$m41 = $_POST['A4martesP'];
$m42 = $_POST['A4martesS'];
$m43 = $_POST['A4martesT'];
$m44 = $_POST['A4martesC'];
$m45 = $_POST['A4martesQ'];
$m46 = $_POST['A4martesX'];
$mi41 = $_POST['A4miercolesP'];
$mi42 = $_POST['A4miercolesS'];
$mi43 = $_POST['A4miercolesT'];
$mi44 = $_POST['A4miercolesC'];
$mi45 = $_POST['A4miercolesQ'];
$mi46 = $_POST['A4miercolesX'];
$j41 = $_POST['A4juevesP'];
$j42 = $_POST['A4juevesS'];
$j43 = $_POST['A4juevesT'];
$j44 = $_POST['A4juevesC'];
$j45 = $_POST['A4juevesQ'];
$j46 = $_POST['A4juevesX'];
$v41 = $_POST['A4viernesP'];
$v42 = $_POST['A4viernesS'];
$v43 = $_POST['A4viernesT'];
$v44 = $_POST['A4viernesC'];
$v45 = $_POST['A4viernesQ'];
$v46 = $_POST['A4viernesX'];
$l51 = $_POST['A5lunesP'];
$l52 = $_POST['A5lunesS'];
$l53 = $_POST['A5lunesT'];
$l54 = $_POST['A5lunesC'];
$l55 = $_POST['A5lunesQ'];
$l56 = $_POST['A5lunesX'];
$m51 = $_POST['A5martesP'];
$m52 = $_POST['A5martesS'];
$m53 = $_POST['A5martesT'];
$m54 = $_POST['A5martesC'];
$m55 = $_POST['A5martesQ'];
$m56 = $_POST['A5martesX'];
$mi51 = $_POST['A5miercolesP'];
$mi52 = $_POST['A5miercolesS'];
$mi53 = $_POST['A5miercolesT'];
$mi54 = $_POST['A5miercolesC'];
$mi55 = $_POST['A5miercolesQ'];
$mi56 = $_POST['A5miercolesX'];
$j51 = $_POST['A5juevesP'];
$j52 = $_POST['A5juevesS'];
$j53 = $_POST['A5juevesT'];
$j54 = $_POST['A5juevesC'];
$j55 = $_POST['A5juevesQ'];
$j56 = $_POST['A5juevesX'];
$v51 = $_POST['A5viernesP'];
$v52 = $_POST['A5viernesS'];
$v53 = $_POST['A5viernesT'];
$v54 = $_POST['A5viernesC'];
$v55 = $_POST['A5viernesQ'];
$v56 = $_POST['A5viernesX'];
$l61 = $_POST['A6lunesP'];
$l62 = $_POST['A6lunesS'];
$l63 = $_POST['A6lunesT'];
$l64 = $_POST['A6lunesC'];
$l65 = $_POST['A6lunesQ'];
$l66 = $_POST['A6lunesX'];
$m61 = $_POST['A6martesP'];
$m62 = $_POST['A6martesS'];
$m63 = $_POST['A6martesT'];
$m64 = $_POST['A6martesC'];
$m65 = $_POST['A6martesQ'];
$m66 = $_POST['A6martesX'];
$mi61 = $_POST['A6miercolesP'];
$mi62 = $_POST['A6miercolesS'];
$mi63 = $_POST['A6miercolesT'];
$mi64 = $_POST['A6miercolesC'];
$mi65 = $_POST['A6miercolesQ'];
$mi66 = $_POST['A6miercolesX'];
$j61 = $_POST['A6juevesP'];
$j62 = $_POST['A6juevesS'];
$j63 = $_POST['A6juevesT'];
$j64 = $_POST['A6juevesC'];
$j65 = $_POST['A6juevesQ'];
$j66 = $_POST['A6juevesX'];
$v61 = $_POST['A6viernesP'];
$v62 = $_POST['A6viernesS'];
$v63 = $_POST['A6viernesT'];
$v64 = $_POST['A6viernesC'];
$v65 = $_POST['A6viernesQ'];
$v66 = $_POST['A6viernesX'];
$l71 = $_POST['A7lunesP'];
$l72 = $_POST['A7lunesS'];
$l73 = $_POST['A7lunesT'];
$l74 = $_POST['A7lunesC'];
$l75 = $_POST['A7lunesQ'];
$l76 = $_POST['A7lunesX'];
$m71 = $_POST['A7martesP'];
$m72 = $_POST['A7martesS'];
$m73 = $_POST['A7martesT'];
$m74 = $_POST['A7martesC'];
$m75 = $_POST['A7martesQ'];
$m76 = $_POST['A7martesX'];
$mi71 = $_POST['A7miercolesP'];
$mi72 = $_POST['A7miercolesS'];
$mi73 = $_POST['A7miercolesT'];
$mi74 = $_POST['A7miercolesC'];
$mi75 = $_POST['A7miercolesQ'];
$mi76 = $_POST['A7miercolesX'];
$j71 = $_POST['A7juevesP'];
$j72 = $_POST['A7juevesS'];
$j73 = $_POST['A7juevesT'];
$j74 = $_POST['A7juevesC'];
$j75 = $_POST['A7juevesQ'];
$j76 = $_POST['A7juevesX'];
$v71 = $_POST['A7viernesP'];
$v72 = $_POST['A7viernesS'];
$v73 = $_POST['A7viernesT'];
$v74 = $_POST['A7viernesC'];
$v75 = $_POST['A7viernesQ'];
$v76 = $_POST['A7viernesX'];
$l81 = $_POST['A8lunesP'];
$l82 = $_POST['A8lunesS'];
$l83 = $_POST['A8lunesT'];
$l84 = $_POST['A8lunesC'];
$l85 = $_POST['A8lunesQ'];
$l86 = $_POST['A8lunesX'];
$m81 = $_POST['A8martesP'];
$m82 = $_POST['A8martesS'];
$m83 = $_POST['A8martesT'];
$m84 = $_POST['A8martesC'];
$m85 = $_POST['A8martesQ'];
$m86 = $_POST['A8martesX'];
$mi81 = $_POST['A8miercolesP'];
$mi82 = $_POST['A8miercolesS'];
$mi83 = $_POST['A8miercolesT'];
$mi84 = $_POST['A8miercolesC'];
$mi85 = $_POST['A8miercolesQ'];
$mi86 = $_POST['A8miercolesX'];
$j81 = $_POST['A8juevesP'];
$j82 = $_POST['A8juevesS'];
$j83 = $_POST['A8juevesT'];
$j84 = $_POST['A8juevesC'];
$j85 = $_POST['A8juevesQ'];
$j86 = $_POST['A8juevesX'];
$v81 = $_POST['A8viernesP'];
$v82 = $_POST['A8viernesS'];
$v83 = $_POST['A8viernesT'];
$v84 = $_POST['A8viernesC'];
$v85 = $_POST['A8viernesQ'];
$v86 = $_POST['A8viernesX'];
$l91 = $_POST['A9lunesP'];
$l92 = $_POST['A9lunesS'];
$l93 = $_POST['A9lunesT'];
$l94 = $_POST['A9lunesC'];
$l95 = $_POST['A9lunesQ'];
$l96 = $_POST['A9lunesX'];
$m91 = $_POST['A9martesP'];
$m92 = $_POST['A9martesS'];
$m93 = $_POST['A9martesT'];
$m94 = $_POST['A9martesC'];
$m95 = $_POST['A9martesQ'];
$m96 = $_POST['A9martesX'];
$mi91 = $_POST['A9miercolesP'];
$mi92 = $_POST['A9miercolesS'];
$mi93 = $_POST['A9miercolesT'];
$mi94 = $_POST['A9miercolesC'];
$mi95 = $_POST['A9miercolesQ'];
$mi96 = $_POST['A9miercolesX'];
$j91 = $_POST['A9juevesP'];
$j92 = $_POST['A9juevesS'];
$j93 = $_POST['A9juevesT'];
$j94 = $_POST['A9juevesC'];
$j95 = $_POST['A9juevesQ'];
$j96 = $_POST['A9juevesX'];
$v91 = $_POST['A9viernesP'];
$v92 = $_POST['A9viernesS'];
$v93 = $_POST['A9viernesT'];
$v94 = $_POST['A9viernesC'];
$v95 = $_POST['A9viernesQ'];
$v96 = $_POST['A9viernesX'];
$l101 = $_POST['A10lunesP'];
$l102 = $_POST['A10lunesS'];
$l103 = $_POST['A10lunesT'];
$l104 = $_POST['A10lunesC'];
$l105 = $_POST['A10lunesQ'];
$l106 = $_POST['A10lunesX'];
$m101 = $_POST['A10martesP'];
$m102 = $_POST['A10martesS'];
$m103 = $_POST['A10martesT'];
$m104 = $_POST['A10martesC'];
$m105 = $_POST['A10martesQ'];
$m106 = $_POST['A10martesX'];
$mi101 = $_POST['A10miercolesP'];
$mi102 = $_POST['A10miercolesS'];
$mi103 = $_POST['A10miercolesT'];
$mi104 = $_POST['A10miercolesC'];
$mi105 = $_POST['A10miercolesQ'];
$mi106 = $_POST['A10miercolesX'];
$j101 = $_POST['A10juevesP'];
$j102 = $_POST['A10juevesS'];
$j103 = $_POST['A10juevesT'];
$j104 = $_POST['A10juevesC'];
$j105 = $_POST['A10juevesQ'];
$j106 = $_POST['A10juevesX'];
$v101 = $_POST['A10viernesP'];
$v102 = $_POST['A10viernesS'];
$v103 = $_POST['A10viernesT'];
$v104 = $_POST['A10viernesC'];
$v105 = $_POST['A10viernesQ'];
$v106 = $_POST['A10viernesX'];
$l111 = $_POST['A11lunesP'];
$l112 = $_POST['A11lunesS'];
$l113 = $_POST['A11lunesT'];
$l114 = $_POST['A11lunesC'];
$l115 = $_POST['A11lunesQ'];
$l116 = $_POST['A11lunesX'];
$m111 = $_POST['A11martesP'];
$m112 = $_POST['A11martesS'];
$m113 = $_POST['A11martesT'];
$m114 = $_POST['A11martesC'];
$m115 = $_POST['A11martesQ'];
$m116 = $_POST['A11martesX'];
$mi111 = $_POST['A11miercolesP'];
$mi112 = $_POST['A11miercolesS'];
$mi113 = $_POST['A11miercolesT'];
$mi114 = $_POST['A11miercolesC'];
$mi115 = $_POST['A11miercolesQ'];
$mi116 = $_POST['A11miercolesX'];
$j111 = $_POST['A11juevesP'];
$j112 = $_POST['A11juevesS'];
$j113 = $_POST['A11juevesT'];
$j114 = $_POST['A11juevesC'];
$j115 = $_POST['A11juevesQ'];
$j116 = $_POST['A11juevesX'];
$v111 = $_POST['A11viernesP'];
$v112 = $_POST['A11viernesS'];
$v113 = $_POST['A11viernesT'];
$v114 = $_POST['A11viernesC'];
$v115 = $_POST['A11viernesQ'];
$v116 = $_POST['A11viernesX'];
$l121 = $_POST['A12lunesP'];
$l122 = $_POST['A12lunesS'];
$l123 = $_POST['A12lunesT'];
$l124 = $_POST['A12lunesC'];
$l125 = $_POST['A12lunesQ'];
$l126 = $_POST['A12lunesX'];
$m121 = $_POST['A12martesP'];
$m122 = $_POST['A12martesS'];
$m123 = $_POST['A12martesT'];
$m124 = $_POST['A12martesC'];
$m125 = $_POST['A12martesQ'];
$m126 = $_POST['A12martesX'];
$mi121 = $_POST['A12miercolesP'];
$mi122 = $_POST['A12miercolesS'];
$mi123 = $_POST['A12miercolesT'];
$mi124 = $_POST['A12miercolesC'];
$mi125 = $_POST['A12miercolesQ'];
$mi126 = $_POST['A12miercolesX'];
$j121 = $_POST['A12juevesP'];
$j122 = $_POST['A12juevesS'];
$j123 = $_POST['A12juevesT'];
$j124 = $_POST['A12juevesC'];
$j125 = $_POST['A12juevesQ'];
$j126 = $_POST['A12juevesX'];
$v121 = $_POST['A12viernesP'];
$v122 = $_POST['A12viernesS'];
$v123 = $_POST['A12viernesT'];
$v124 = $_POST['A12viernesC'];
$v125 = $_POST['A12viernesQ'];
$v126 = $_POST['A12viernesX'];
$l131 = $_POST['A13lunesP'];
$l132 = $_POST['A13lunesS'];
$l133 = $_POST['A13lunesT'];
$l134 = $_POST['A13lunesC'];
$l135 = $_POST['A13lunesQ'];
$l136 = $_POST['A13lunesX'];
$m131 = $_POST['A13martesP'];
$m132 = $_POST['A13martesS'];
$m133 = $_POST['A13martesT'];
$m134 = $_POST['A13martesC'];
$m135 = $_POST['A13martesQ'];
$m136 = $_POST['A13martesX'];
$mi131 = $_POST['A13miercolesP'];
$mi132 = $_POST['A13miercolesS'];
$mi133 = $_POST['A13miercolesT'];
$mi134 = $_POST['A13miercolesC'];
$mi135 = $_POST['A13miercolesQ'];
$mi136 = $_POST['A13miercolesX'];
$j131 = $_POST['A13juevesP'];
$j132 = $_POST['A13juevesS'];
$j133 = $_POST['A13juevesT'];
$j134 = $_POST['A13juevesC'];
$j135 = $_POST['A13juevesQ'];
$j136 = $_POST['A13juevesX'];
$v131 = $_POST['A13viernesP'];
$v132 = $_POST['A13viernesS'];
$v133 = $_POST['A13viernesT'];
$v134 = $_POST['A13viernesC'];
$v135 = $_POST['A13viernesQ'];
$v136 = $_POST['A13viernesX'];
$l141 = $_POST['A14lunesP'];
$l142 = $_POST['A14lunesS'];
$l143 = $_POST['A14lunesT'];
$l144 = $_POST['A14lunesC'];
$l145 = $_POST['A14lunesQ'];
$l146 = $_POST['A14lunesX'];
$m141 = $_POST['A14martesP'];
$m142 = $_POST['A14martesS'];
$m143 = $_POST['A14martesT'];
$m144 = $_POST['A14martesC'];
$m145 = $_POST['A14martesQ'];
$m146 = $_POST['A14martesX'];
$mi141 = $_POST['A14miercolesP'];
$mi142 = $_POST['A14miercolesS'];
$mi143 = $_POST['A14miercolesT'];
$mi144 = $_POST['A14miercolesC'];
$mi145 = $_POST['A14miercolesQ'];
$mi146 = $_POST['A14miercolesX'];
$j141 = $_POST['A14juevesP'];
$j142 = $_POST['A14juevesS'];
$j143 = $_POST['A14juevesT'];
$j144 = $_POST['A14juevesC'];
$j145 = $_POST['A14juevesQ'];
$j146 = $_POST['A14juevesX'];
$v141 = $_POST['A14viernesP'];
$v142 = $_POST['A14viernesS'];
$v143 = $_POST['A14viernesT'];
$v144 = $_POST['A14viernesC'];
$v145 = $_POST['A14viernesQ'];
$v146 = $_POST['A14viernesX'];
$l151 = $_POST['A15lunesP'];
$l152 = $_POST['A15lunesS'];
$l153 = $_POST['A15lunesT'];
$l154 = $_POST['A15lunesC'];
$l155 = $_POST['A15lunesQ'];
$l156 = $_POST['A15lunesX'];
$m151 = $_POST['A15martesP'];
$m152 = $_POST['A15martesS'];
$m153 = $_POST['A15martesT'];
$m154 = $_POST['A15martesC'];
$m155 = $_POST['A15martesQ'];
$m156 = $_POST['A15martesX'];
$mi151 = $_POST['A15miercolesP'];
$mi152 = $_POST['A15miercolesS'];
$mi153 = $_POST['A15miercolesT'];
$mi154 = $_POST['A15miercolesC'];
$mi155 = $_POST['A15miercolesQ'];
$mi156 = $_POST['A15miercolesX'];
$j151 = $_POST['A15juevesP'];
$j152 = $_POST['A15juevesS'];
$j153 = $_POST['A15juevesT'];
$j154 = $_POST['A15juevesC'];
$j155 = $_POST['A15juevesQ'];
$j156 = $_POST['A15juevesX'];
$v151 = $_POST['A15viernesP'];
$v152 = $_POST['A15viernesS'];
$v153 = $_POST['A15viernesT'];
$v154 = $_POST['A15viernesC'];
$v155 = $_POST['A15viernesQ'];
$v156 = $_POST['A15viernesX'];
$l161 = $_POST['A16lunesP'];
$l162 = $_POST['A16lunesS'];
$l163 = $_POST['A16lunesT'];
$l164 = $_POST['A16lunesC'];
$l165 = $_POST['A16lunesQ'];
$l166 = $_POST['A16lunesX'];
$m161 = $_POST['A16martesP'];
$m162 = $_POST['A16martesS'];
$m163 = $_POST['A16martesT'];
$m164 = $_POST['A16martesC'];
$m165 = $_POST['A16martesQ'];
$m166 = $_POST['A16martesX'];
$mi161 = $_POST['A16miercolesP'];
$mi162 = $_POST['A16miercolesS'];
$mi163 = $_POST['A16miercolesT'];
$mi164 = $_POST['A16miercolesC'];
$mi165 = $_POST['A16miercolesQ'];
$mi166 = $_POST['A16miercolesX'];
$j161 = $_POST['A16juevesP'];
$j162 = $_POST['A16juevesS'];
$j163 = $_POST['A16juevesT'];
$j164 = $_POST['A16juevesC'];
$j165 = $_POST['A16juevesQ'];
$j166 = $_POST['A16juevesX'];
$v161 = $_POST['A16viernesP'];
$v162 = $_POST['A16viernesS'];
$v163 = $_POST['A16viernesT'];
$v164 = $_POST['A16viernesC'];
$v165 = $_POST['A16viernesQ'];
$v166 = $_POST['A16viernesX'];
$l171 = $_POST['A17lunesP'];
$l172 = $_POST['A17lunesS'];
$l173 = $_POST['A17lunesT'];
$l174 = $_POST['A17lunesC'];
$l175 = $_POST['A17lunesQ'];
$l176 = $_POST['A17lunesX'];
$m171 = $_POST['A17martesP'];
$m172 = $_POST['A17martesS'];
$m173 = $_POST['A17martesT'];
$m174 = $_POST['A17martesC'];
$m175 = $_POST['A17martesQ'];
$m176 = $_POST['A17martesX'];
$mi171 = $_POST['A17miercolesP'];
$mi172 = $_POST['A17miercolesS'];
$mi173 = $_POST['A17miercolesT'];
$mi174 = $_POST['A17miercolesC'];
$mi175 = $_POST['A17miercolesQ'];
$mi176 = $_POST['A17miercolesX'];
$j171 = $_POST['A17juevesP'];
$j172 = $_POST['A17juevesS'];
$j173 = $_POST['A17juevesT'];
$j174 = $_POST['A17juevesC'];
$j175 = $_POST['A17juevesQ'];
$j176 = $_POST['A17juevesX'];
$v171 = $_POST['A17viernesP'];
$v172 = $_POST['A17viernesS'];
$v173 = $_POST['A17viernesT'];
$v174 = $_POST['A17viernesC'];
$v175 = $_POST['A17viernesQ'];
$v176 = $_POST['A17viernesX'];

if($imparteC == "")
    $imparteC = "off";
if($imparteCp == "")
    $imparteCp = "on";

mysql_query('INSERT INTO profesor (
Nombre,
Apellidos,
Asignatura,
carrera,
ano,
imparteC,
imparteCp,
Correo  
)
VALUES (
"' . $name . '", "' . $lastname . '", "' . $asig . '", "' . $carr . '", "' . $ano . '", "' . $imparteC . '", "' . $imparteCp . '", "' . $email . '"
)');
if(isset($sem11) && isset($sem21) && isset($sem31) && isset($sem41) && isset($sem51) && isset($sem61) && isset($sem71) && isset($sem81) && isset($sem91) && isset($sem101) && isset($sem111) && isset($sem121) && isset($sem131) && isset($sem141) && isset($sem151) && isset($sem161) && isset($sem171) &&
   isset($sem12) && isset($sem22) && isset($sem32) && isset($sem42) && isset($sem52) && isset($sem62) && isset($sem72) && isset($sem82) && isset($sem92) && isset($sem102) && isset($sem112) && isset($sem122) && isset($sem132) && isset($sem142) && isset($sem152) && isset($sem162) && isset($sem172) &&
   isset($sem13) && isset($sem23) && isset($sem33) && isset($sem43) && isset($sem53) && isset($sem63) && isset($sem73) && isset($sem83) && isset($sem93) && isset($sem103) && isset($sem113) && isset($sem123) && isset($sem133) && isset($sem143) && isset($sem153) && isset($sem163) && isset($sem173) &&
   isset($sem14) && isset($sem24) && isset($sem34) && isset($sem44) && isset($sem54) && isset($sem64) && isset($sem74) && isset($sem84) && isset($sem94) && isset($sem104) && isset($sem114) && isset($sem124) && isset($sem134) && isset($sem144) && isset($sem154) && isset($sem164) && isset($sem174))
{
mysql_query('INSERT INTO asignatura (
nombre ,carrera ,ano ,abrev ,cantHC ,
s11 ,s21 ,s31 ,s41 ,s51 ,s61 ,s71 ,s81 ,s91 ,s101 ,s111 ,s121 ,s131 ,s141 ,s151 ,s161 ,s171 ,
s12 ,s22 ,s32 ,s42 ,s52 ,s62 ,s72 ,s82 ,s92 ,s102 ,s112 ,s122 ,s132 ,s142 ,s152 ,s162 ,s172 ,
s13 ,s23 ,s33 ,s43 ,s53 ,s63 ,s73 ,s83 ,s93 ,s103 ,s113 ,s123 ,s133 ,s143 ,s153 ,s163 ,s173 ,
s14 ,s24 ,s34 ,s44 ,s54 ,s64 ,s74 ,s84 ,s94 ,s104 ,s114 ,s124 ,s134 ,s144 ,s154 ,s164 ,s174
)
VALUES (
"' . $asig . '", "' . $carr . '", "' . $ano . '", "' . $abrev . '", "' . $cantHC . '", 
    "' . $sem11 . '", "' . $sem21 . '", "' . $sem31 . '", "' . $sem41 . '", "' . $sem51 . '", "' . $sem61 . '", "' . $sem71 . '", "' . $sem81 . '", "' . $sem91 . '", "' . $sem101 . '", "' . $sem111 . '", "' . $sem121 . '", "' . $sem131 . '", "' . $sem141 . '", "' . $sem151 . '", "' . $sem161 . '", "' . $sem171 . '", 
    "' . $sem12 . '", "' . $sem22 . '", "' . $sem32 . '", "' . $sem42 . '", "' . $sem52 . '", "' . $sem62 . '", "' . $sem72 . '", "' . $sem82 . '", "' . $sem92 . '", "' . $sem102 . '", "' . $sem112 . '", "' . $sem122 . '", "' . $sem132 . '", "' . $sem142 . '", "' . $sem152 . '", "' . $sem162 . '", "' . $sem172 . '",
        "' . $sem13 . '", "' . $sem23 . '", "' . $sem33 . '", "' . $sem43 . '", "' . $sem53 . '", "' . $sem63 . '", "' . $sem73 . '", "' . $sem83 . '", "' . $sem93 . '", "' . $sem103 . '", "' . $sem113 . '", "' . $sem123 . '", "' . $sem133 . '", "' . $sem143 . '", "' . $sem153 . '", "' . $sem163 . '", "' . $sem173 . '",
            "' . $sem14 . '", "' . $sem24 . '", "' . $sem34 . '", "' . $sem44 . '", "' . $sem54 . '", "' . $sem64 . '", "' . $sem74 . '", "' . $sem84 . '", "' . $sem94 . '", "' . $sem104 . '", "' . $sem114 . '", "' . $sem124 . '", "' . $sem134 . '", "' . $sem144 . '", "' . $sem154 . '", "' . $sem164 . '", "' . $sem174 . '"
)');
}
mysql_query('INSERT INTO afectsem1 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l11 . '" , "' . $l12 . '", "' . $l13 . '" , "' . $l14 . '", "' . $l15 . '" , "' . $l16 . '", "' 
. $m11 . '" , "' . $m12 . '", "' . $m13 . '" , "' . $m14 . '", "' . $m15 . '" , "' . $m16 . '", "' 
. $mi11 . '" , "' . $mi12 . '", "' . $mi13 . '" , "' . $mi14 . '", "' . $mi15 . '" , "' . $mi16 . '", "' 
. $j11 . '" , "' . $j12 . '", "' . $j13 . '" , "' . $j14 . '", "' . $j15 . '" , "' . $j16 . '", "' 
. $v11 . '" , "' . $v12 . '", "' . $v13 . '" , "' . $v14 . '", "' . $v15 . '" , "' . $v16 . '"
)');
mysql_query('INSERT INTO afectsem2 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l21 . '" , "' . $l22 . '", "' . $l23 . '" , "' . $l24 . '", "' . $l25 . '" , "' . $l26 . '", "' 
. $m21 . '" , "' . $m22 . '", "' . $m23 . '" , "' . $m24 . '", "' . $m25 . '" , "' . $m26 . '", "' 
. $mi21 . '" , "' . $mi22 . '", "' . $mi23 . '" , "' . $mi24 . '", "' . $mi25 . '" , "' . $mi26 . '", "' 
. $j21 . '" , "' . $j22 . '", "' . $j23 . '" , "' . $j24 . '", "' . $j25 . '" , "' . $j26 . '", "' 
. $v21 . '" , "' . $v22 . '", "' . $v23 . '" , "' . $v24 . '", "' . $v25 . '" , "' . $v26 . '"
)');
mysql_query('INSERT INTO afectsem3 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l31 . '" , "' . $l32 . '", "' . $l33 . '" , "' . $l34 . '", "' . $l35 . '" , "' . $l36 . '", "' 
. $m31 . '" , "' . $m32 . '", "' . $m33 . '" , "' . $m34 . '", "' . $m35 . '" , "' . $m36 . '", "' 
. $mi31 . '" , "' . $mi32 . '", "' . $mi33 . '" , "' . $mi34 . '", "' . $mi35 . '" , "' . $mi36 . '", "' 
. $j31 . '" , "' . $j32 . '", "' . $j33 . '" , "' . $j34 . '", "' . $j35 . '" , "' . $j36 . '", "' 
. $v31 . '" , "' . $v32 . '", "' . $v33 . '" , "' . $v34 . '", "' . $v35 . '" , "' . $v36 . '"
)');
mysql_query('INSERT INTO afectsem4 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l41 . '" , "' . $l42 . '", "' . $l43 . '" , "' . $l44 . '", "' . $l45 . '" , "' . $l46 . '", "' 
. $m41 . '" , "' . $m42 . '", "' . $m43 . '" , "' . $m44 . '", "' . $m45 . '" , "' . $m46 . '", "' 
. $mi41 . '" , "' . $mi42 . '", "' . $mi43 . '" , "' . $mi44 . '", "' . $mi45 . '" , "' . $mi46 . '", "' 
. $j41 . '" , "' . $j42 . '", "' . $j43 . '" , "' . $j44 . '", "' . $j45 . '" , "' . $j46 . '", "' 
. $v41 . '" , "' . $v42 . '", "' . $v43 . '" , "' . $v44 . '", "' . $v45 . '" , "' . $v46 . '"
)');
mysql_query('INSERT INTO afectsem5 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l51 . '" , "' . $l52 . '", "' . $l53 . '" , "' . $l54 . '", "' . $l55 . '" , "' . $l56 . '", "' 
. $m51 . '" , "' . $m52 . '", "' . $m53 . '" , "' . $m54 . '", "' . $m55 . '" , "' . $m56 . '", "' 
. $mi51 . '" , "' . $mi52 . '", "' . $mi53 . '" , "' . $mi54 . '", "' . $mi55 . '" , "' . $mi56 . '", "' 
. $j51 . '" , "' . $j52 . '", "' . $j53 . '" , "' . $j54 . '", "' . $j55 . '" , "' . $j56 . '", "' 
. $v51 . '" , "' . $v52 . '", "' . $v53 . '" , "' . $v54 . '", "' . $v55 . '" , "' . $v56 . '"
)');
mysql_query('INSERT INTO afectsem6 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l61 . '" , "' . $l62 . '", "' . $l63 . '" , "' . $l64 . '", "' . $l65 . '" , "' . $l66 . '", "' 
. $m61 . '" , "' . $m62 . '", "' . $m63 . '" , "' . $m64 . '", "' . $m65 . '" , "' . $m66 . '", "' 
. $mi61 . '" , "' . $mi62 . '", "' . $mi63 . '" , "' . $mi64 . '", "' . $mi65 . '" , "' . $mi66 . '", "' 
. $j61 . '" , "' . $j62 . '", "' . $j63 . '" , "' . $j64 . '", "' . $j65 . '" , "' . $j66 . '", "' 
. $v61 . '" , "' . $v62 . '", "' . $v63 . '" , "' . $v64 . '", "' . $v65 . '" , "' . $v66 . '"
)');
mysql_query('INSERT INTO afectsem7 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l71 . '" , "' . $l72 . '", "' . $l73 . '" , "' . $l74 . '", "' . $l75 . '" , "' . $l76 . '", "' 
. $m71 . '" , "' . $m72 . '", "' . $m73 . '" , "' . $m74 . '", "' . $m75 . '" , "' . $m76 . '", "' 
. $mi71 . '" , "' . $mi72 . '", "' . $mi73 . '" , "' . $mi74 . '", "' . $mi75 . '" , "' . $mi76 . '", "' 
. $j71 . '" , "' . $j72 . '", "' . $j73 . '" , "' . $j74 . '", "' . $j75 . '" , "' . $j76 . '", "' 
. $v71 . '" , "' . $v72 . '", "' . $v73 . '" , "' . $v74 . '", "' . $v75 . '" , "' . $v76 . '"
)');
mysql_query('INSERT INTO afectsem8 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l81 . '" , "' . $l82 . '", "' . $l83 . '" , "' . $l84 . '", "' . $l85 . '" , "' . $l86 . '", "' 
. $m81 . '" , "' . $m82 . '", "' . $m83 . '" , "' . $m84 . '", "' . $m85 . '" , "' . $m86 . '", "' 
. $mi81 . '" , "' . $mi82 . '", "' . $mi83 . '" , "' . $mi84 . '", "' . $mi85 . '" , "' . $mi86 . '", "' 
. $j81 . '" , "' . $j82 . '", "' . $j83 . '" , "' . $j84 . '", "' . $j85 . '" , "' . $j86 . '", "' 
. $v81 . '" , "' . $v82 . '", "' . $v83 . '" , "' . $v84 . '", "' . $v85 . '" , "' . $v86 . '"
)');
mysql_query('INSERT INTO afectsem9 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l91 . '" , "' . $l92 . '", "' . $l93 . '" , "' . $l94 . '", "' . $l95 . '" , "' . $l96 . '", "' 
. $m91 . '" , "' . $m92 . '", "' . $m93 . '" , "' . $m94 . '", "' . $m95 . '" , "' . $m96 . '", "' 
. $mi91 . '" , "' . $mi92 . '", "' . $mi93 . '" , "' . $mi94 . '", "' . $mi95 . '" , "' . $mi96 . '", "' 
. $j91 . '" , "' . $j92 . '", "' . $j93 . '" , "' . $j94 . '", "' . $j95 . '" , "' . $j96 . '", "' 
. $v91 . '" , "' . $v92 . '", "' . $v93 . '" , "' . $v94 . '", "' . $v95 . '" , "' . $v96 . '"
)');
mysql_query('INSERT INTO afectsem10 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l101 . '" , "' . $l102 . '", "' . $l103 . '" , "' . $l104 . '", "' . $l105 . '" , "' . $l106 . '", "' 
. $m101 . '" , "' . $m102 . '", "' . $m103 . '" , "' . $m104 . '", "' . $m105 . '" , "' . $m106 . '", "' 
. $mi101 . '" , "' . $mi102 . '", "' . $mi103 . '" , "' . $mi104 . '", "' . $mi105 . '" , "' . $mi106 . '", "' 
. $j101 . '" , "' . $j102 . '", "' . $j103 . '" , "' . $j104 . '", "' . $j105 . '" , "' . $j106 . '", "' 
. $v101 . '" , "' . $v102 . '", "' . $v103 . '" , "' . $v104 . '", "' . $v105 . '" , "' . $v106 . '"
)');
mysql_query('INSERT INTO afectsem11 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l111 . '" , "' . $l112 . '", "' . $l113 . '" , "' . $l114 . '", "' . $l115 . '" , "' . $l116 . '", "' 
. $m111 . '" , "' . $m112 . '", "' . $m113 . '" , "' . $m114 . '", "' . $m115 . '" , "' . $m116 . '", "' 
. $mi111 . '" , "' . $mi112 . '", "' . $mi113 . '" , "' . $mi114 . '", "' . $mi115 . '" , "' . $mi116 . '", "' 
. $j111 . '" , "' . $j112 . '", "' . $j113 . '" , "' . $j114 . '", "' . $j115 . '" , "' . $j116 . '", "' 
. $v111 . '" , "' . $v112 . '", "' . $v113 . '" , "' . $v114 . '", "' . $v115 . '" , "' . $v116 . '"
)');
mysql_query('INSERT INTO afectsem12 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l121 . '" , "' . $l122 . '", "' . $l123 . '" , "' . $l124 . '", "' . $l125 . '" , "' . $l126 . '", "' 
. $m121 . '" , "' . $m122 . '", "' . $m123 . '" , "' . $m124 . '", "' . $m125 . '" , "' . $m126 . '", "' 
. $mi121 . '" , "' . $mi122 . '", "' . $mi123 . '" , "' . $mi124 . '", "' . $mi125 . '" , "' . $mi126 . '", "' 
. $j121 . '" , "' . $j122 . '", "' . $j123 . '" , "' . $j124 . '", "' . $j125 . '" , "' . $j126 . '", "' 
. $v121 . '" , "' . $v122 . '", "' . $v123 . '" , "' . $v124 . '", "' . $v125 . '" , "' . $v126 . '"
)');
mysql_query('INSERT INTO afectsem13 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l131 . '" , "' . $l132 . '", "' . $l133 . '" , "' . $l134 . '", "' . $l135 . '" , "' . $l136 . '", "' 
. $m131 . '" , "' . $m132 . '", "' . $m133 . '" , "' . $m134 . '", "' . $m135 . '" , "' . $m136 . '", "' 
. $mi131 . '" , "' . $mi132 . '", "' . $mi133 . '" , "' . $mi134 . '", "' . $mi135 . '" , "' . $mi136 . '", "' 
. $j131 . '" , "' . $j132 . '", "' . $j133 . '" , "' . $j134 . '", "' . $j135 . '" , "' . $j136 . '", "' 
. $v131 . '" , "' . $v132 . '", "' . $v133 . '" , "' . $v134 . '", "' . $v135 . '" , "' . $v136 . '"
)');
mysql_query('INSERT INTO afectsem14 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l141 . '" , "' . $l142 . '", "' . $l143 . '" , "' . $l144 . '", "' . $l145 . '" , "' . $l146 . '", "' 
. $m141 . '" , "' . $m142 . '", "' . $m143 . '" , "' . $m144 . '", "' . $m145 . '" , "' . $m146 . '", "' 
. $mi141 . '" , "' . $mi142 . '", "' . $mi143 . '" , "' . $mi144 . '", "' . $mi145 . '" , "' . $mi146 . '", "' 
. $j141 . '" , "' . $j142 . '", "' . $j143 . '" , "' . $j144 . '", "' . $j145 . '" , "' . $j146 . '", "' 
. $v141 . '" , "' . $v142 . '", "' . $v143 . '" , "' . $v144 . '", "' . $v145 . '" , "' . $v146 . '"
)');
mysql_query('INSERT INTO afectsem15 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l151 . '" , "' . $l152 . '", "' . $l153 . '" , "' . $l154 . '", "' . $l155 . '" , "' . $l156 . '", "' 
. $m151 . '" , "' . $m152 . '", "' . $m153 . '" , "' . $m154 . '", "' . $m155 . '" , "' . $m156 . '", "' 
. $mi151 . '" , "' . $mi152 . '", "' . $mi153 . '" , "' . $mi154 . '", "' . $mi155 . '" , "' . $mi156 . '", "' 
. $j151 . '" , "' . $j152 . '", "' . $j153 . '" , "' . $j154 . '", "' . $j155 . '" , "' . $j156 . '", "' 
. $v151 . '" , "' . $v152 . '", "' . $v153 . '" , "' . $v154 . '", "' . $v155 . '" , "' . $v156 . '"
)');
mysql_query('INSERT INTO afectsem16 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l161 . '" , "' . $l162 . '", "' . $l163 . '" , "' . $l164 . '", "' . $l165 . '" , "' . $l166 . '", "' 
. $m161 . '" , "' . $m162 . '", "' . $m163 . '" , "' . $m164 . '", "' . $m165 . '" , "' . $m166 . '", "' 
. $mi161 . '" , "' . $mi162 . '", "' . $mi163 . '" , "' . $mi164 . '", "' . $mi165 . '" , "' . $mi166 . '", "' 
. $j161 . '" , "' . $j162 . '", "' . $j163 . '" , "' . $j164 . '", "' . $j165 . '" , "' . $j166 . '", "' 
. $v161 . '" , "' . $v162 . '", "' . $v163 . '" , "' . $v164 . '", "' . $v165 . '" , "' . $v166 . '"
)');
mysql_query('INSERT INTO afectsem17 (
nombreProf ,nombreAsig ,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $nameP . '", "' . $asig . '", "' . $l171 . '" , "' . $l172 . '", "' . $l173 . '" , "' . $l174 . '", "' . $l175 . '" , "' . $l176 . '", "' 
. $m171 . '" , "' . $m172 . '", "' . $m173 . '" , "' . $m174 . '", "' . $m175 . '" , "' . $m176 . '", "' 
. $mi171 . '" , "' . $mi172 . '", "' . $mi173 . '" , "' . $mi174 . '", "' . $mi175 . '" , "' . $mi176 . '", "' 
. $j171 . '" , "' . $j172 . '", "' . $j173 . '" , "' . $j174 . '", "' . $j175 . '" , "' . $j176 . '", "' 
. $v171 . '" , "' . $v172 . '", "' . $v173 . '" , "' . $v174 . '", "' . $v175 . '" , "' . $v176 . '"
)');

//A  PARTIR DE AQUI Laboratorios

mysql_query('INSERT INTO labsem1 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll11 . '" , "' . $Ll12 . '", "' . $Ll13 . '" , "' . $Ll14 . '", "' . $Ll15 . '" , "' . $Ll16 . '", "' 
. $Lm11 . '" , "' . $Lm12 . '", "' . $Lm13 . '" , "' . $Lm14 . '", "' . $Lm15 . '" , "' . $Lm16 . '", "' 
. $Lmi11 . '" , "' . $Lmi12 . '", "' . $Lmi13 . '" , "' . $Lmi14 . '", "' . $Lmi15 . '" , "' . $Lmi16 . '", "' 
. $Lj11 . '" , "' . $Lj12 . '", "' . $Lj13 . '" , "' . $Lj14 . '", "' . $Lj15 . '" , "' . $Lj16 . '", "' 
. $Lv11 . '" , "' . $Lv12 . '", "' . $Lv13 . '" , "' . $Lv14 . '", "' . $Lv15 . '" , "' . $Lv16 . '"
)');
mysql_query('INSERT INTO labsem2 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll21 . '" , "' . $Ll22 . '", "' . $Ll23 . '" , "' . $Ll24 . '", "' . $Ll25 . '" , "' . $Ll26 . '", "' 
. $Lm21 . '" , "' . $Lm22 . '", "' . $Lm23 . '" , "' . $Lm24 . '", "' . $Lm25 . '" , "' . $Lm26 . '", "' 
. $Lmi21 . '" , "' . $Lmi22 . '", "' . $Lmi23 . '" , "' . $Lmi24 . '", "' . $Lmi25 . '" , "' . $Lmi26 . '", "' 
. $Lj21 . '" , "' . $Lj22 . '", "' . $Lj23 . '" , "' . $Lj24 . '", "' . $Lj25 . '" , "' . $Lj26 . '", "' 
. $Lv21 . '" , "' . $Lv22 . '", "' . $Lv23 . '" , "' . $Lv24 . '", "' . $Lv25 . '" , "' . $Lv26 . '"
)');
mysql_query('INSERT INTO labsem3 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll31 . '" , "' . $Ll32 . '", "' . $Ll33 . '" , "' . $Ll34 . '", "' . $Ll35 . '" , "' . $Ll36 . '", "' 
. $Lm31 . '" , "' . $Lm32 . '", "' . $Lm33 . '" , "' . $Lm34 . '", "' . $Lm35 . '" , "' . $Lm36 . '", "' 
. $Lmi31 . '" , "' . $Lmi32 . '", "' . $Lmi33 . '" , "' . $Lmi34 . '", "' . $Lmi35 . '" , "' . $Lmi36 . '", "' 
. $Lj31 . '" , "' . $Lj32 . '", "' . $Lj33 . '" , "' . $Lj34 . '", "' . $Lj35 . '" , "' . $Lj36 . '", "' 
. $Lv31 . '" , "' . $Lv32 . '", "' . $Lv33 . '" , "' . $Lv34 . '", "' . $Lv35 . '" , "' . $Lv36 . '"
)');
mysql_query('INSERT INTO labsem4 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll41 . '" , "' . $Ll42 . '", "' . $Ll43 . '" , "' . $Ll44 . '", "' . $Ll45 . '" , "' . $Ll46 . '", "' 
. $Lm41 . '" , "' . $Lm42 . '", "' . $Lm43 . '" , "' . $Lm44 . '", "' . $Lm45 . '" , "' . $Lm46 . '", "' 
. $Lmi41 . '" , "' . $Lmi42 . '", "' . $Lmi43 . '" , "' . $Lmi44 . '", "' . $Lmi45 . '" , "' . $Lmi46 . '", "' 
. $Lj41 . '" , "' . $Lj42 . '", "' . $Lj43 . '" , "' . $Lj44 . '", "' . $Lj45 . '" , "' . $Lj46 . '", "' 
. $Lv41 . '" , "' . $Lv42 . '", "' . $Lv43 . '" , "' . $Lv44 . '", "' . $Lv45 . '" , "' . $Lv46 . '"
)');
mysql_query('INSERT INTO labsem5 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll51 . '" , "' . $Ll52 . '", "' . $Ll53 . '" , "' . $Ll54 . '", "' . $Ll55 . '" , "' . $Ll56 . '", "' 
. $Lm51 . '" , "' . $Lm52 . '", "' . $Lm53 . '" , "' . $Lm54 . '", "' . $Lm55 . '" , "' . $Lm56 . '", "' 
. $Lmi51 . '" , "' . $Lmi52 . '", "' . $Lmi53 . '" , "' . $Lmi54 . '", "' . $Lmi55 . '" , "' . $Lmi56 . '", "' 
. $Lj51 . '" , "' . $Lj52 . '", "' . $Lj53 . '" , "' . $Lj54 . '", "' . $Lj55 . '" , "' . $Lj56 . '", "' 
. $Lv51 . '" , "' . $Lv52 . '", "' . $Lv53 . '" , "' . $Lv54 . '", "' . $Lv55 . '" , "' . $Lv56 . '"
)');
mysql_query('INSERT INTO labsem6 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll61 . '" , "' . $Ll62 . '", "' . $Ll63 . '" , "' . $Ll64 . '", "' . $Ll65 . '" , "' . $Ll66 . '", "' 
. $Lm61 . '" , "' . $Lm62 . '", "' . $Lm63 . '" , "' . $Lm64 . '", "' . $Lm65 . '" , "' . $Lm66 . '", "' 
. $Lmi61 . '" , "' . $Lmi62 . '", "' . $Lmi63 . '" , "' . $Lmi64 . '", "' . $Lmi65 . '" , "' . $Lmi66 . '", "' 
. $Lj61 . '" , "' . $Lj62 . '", "' . $Lj63 . '" , "' . $Lj64 . '", "' . $Lj65 . '" , "' . $Lj66 . '", "' 
. $Lv61 . '" , "' . $Lv62 . '", "' . $Lv63 . '" , "' . $Lv64 . '", "' . $Lv65 . '" , "' . $Lv66 . '"
)');
mysql_query('INSERT INTO labsem7 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll71 . '" , "' . $Ll72 . '", "' . $Ll73 . '" , "' . $Ll74 . '", "' . $Ll75 . '" , "' . $Ll76 . '", "' 
. $Lm71 . '" , "' . $Lm72 . '", "' . $Lm73 . '" , "' . $Lm74 . '", "' . $Lm75 . '" , "' . $Lm76 . '", "' 
. $Lmi71 . '" , "' . $Lmi72 . '", "' . $Lmi73 . '" , "' . $Lmi74 . '", "' . $Lmi75 . '" , "' . $Lmi76 . '", "' 
. $Lj71 . '" , "' . $Lj72 . '", "' . $Lj73 . '" , "' . $Lj74 . '", "' . $Lj75 . '" , "' . $Lj76 . '", "' 
. $Lv71 . '" , "' . $Lv72 . '", "' . $Lv73 . '" , "' . $Lv74 . '", "' . $Lv75 . '" , "' . $Lv76 . '"
)');
mysql_query('INSERT INTO labsem8 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll81 . '" , "' . $Ll82 . '", "' . $Ll83 . '" , "' . $Ll84 . '", "' . $Ll85 . '" , "' . $Ll86 . '", "' 
. $Lm81 . '" , "' . $Lm82 . '", "' . $Lm83 . '" , "' . $Lm84 . '", "' . $Lm85 . '" , "' . $Lm86 . '", "' 
. $Lmi81 . '" , "' . $Lmi82 . '", "' . $Lmi83 . '" , "' . $Lmi84 . '", "' . $Lmi85 . '" , "' . $Lmi86 . '", "' 
. $Lj81 . '" , "' . $Lj82 . '", "' . $Lj83 . '" , "' . $Lj84 . '", "' . $Lj85 . '" , "' . $Lj86 . '", "' 
. $Lv81 . '" , "' . $Lv82 . '", "' . $Lv83 . '" , "' . $Lv84 . '", "' . $Lv85 . '" , "' . $Lv86 . '"
)');
mysql_query('INSERT INTO labsem9 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll91 . '" , "' . $Ll92 . '", "' . $Ll93 . '" , "' . $Ll94 . '", "' . $Ll95 . '" , "' . $Ll96 . '", "' 
. $Lm91 . '" , "' . $Lm92 . '", "' . $Lm93 . '" , "' . $Lm94 . '", "' . $Lm95 . '" , "' . $Lm96 . '", "' 
. $Lmi91 . '" , "' . $Lmi92 . '", "' . $Lmi93 . '" , "' . $Lmi94 . '", "' . $Lmi95 . '" , "' . $Lmi96 . '", "' 
. $Lj91 . '" , "' . $Lj92 . '", "' . $Lj93 . '" , "' . $Lj94 . '", "' . $Lj95 . '" , "' . $Lj96 . '", "' 
. $Lv91 . '" , "' . $Lv92 . '", "' . $Lv93 . '" , "' . $Lv94 . '", "' . $Lv95 . '" , "' . $Lv96 . '"
)');
mysql_query('INSERT INTO labsem10 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll101 . '" , "' . $Ll102 . '", "' . $Ll103 . '" , "' . $Ll104 . '", "' . $Ll105 . '" , "' . $Ll106 . '", "' 
. $Lm101 . '" , "' . $Lm102 . '", "' . $Lm103 . '" , "' . $Lm104 . '", "' . $Lm105 . '" , "' . $Lm106 . '", "' 
. $Lmi101 . '" , "' . $Lmi102 . '", "' . $Lmi103 . '" , "' . $Lmi104 . '", "' . $Lmi105 . '" , "' . $Lmi106 . '", "' 
. $Lj101 . '" , "' . $Lj102 . '", "' . $Lj103 . '" , "' . $Lj104 . '", "' . $Lj105 . '" , "' . $Lj106 . '", "' 
. $Lv101 . '" , "' . $Lv102 . '", "' . $Lv103 . '" , "' . $Lv104 . '", "' . $Lv105 . '" , "' . $Lv106 . '"
)');
mysql_query('INSERT INTO labsem11 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll111 . '" , "' . $Ll112 . '", "' . $Ll113 . '" , "' . $Ll114 . '", "' . $Ll115 . '" , "' . $Ll116 . '", "' 
. $Lm111 . '" , "' . $Lm112 . '", "' . $Lm113 . '" , "' . $Lm114 . '", "' . $Lm115 . '" , "' . $Lm116 . '", "' 
. $Lmi111 . '" , "' . $Lmi112 . '", "' . $Lmi113 . '" , "' . $Lmi114 . '", "' . $Lmi115 . '" , "' . $Lmi116 . '", "' 
. $Lj111 . '" , "' . $Lj112 . '", "' . $Lj113 . '" , "' . $Lj114 . '", "' . $Lj115 . '" , "' . $Lj116 . '", "' 
. $Lv111 . '" , "' . $Lv112 . '", "' . $Lv113 . '" , "' . $Lv114 . '", "' . $Lv115 . '" , "' . $Lv116 . '"
)');
mysql_query('INSERT INTO labsem12 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll121 . '" , "' . $Ll122 . '", "' . $Ll123 . '" , "' . $Ll124 . '", "' . $Ll125 . '" , "' . $Ll126 . '", "' 
. $Lm121 . '" , "' . $Lm122 . '", "' . $Lm123 . '" , "' . $Lm124 . '", "' . $Lm125 . '" , "' . $Lm126 . '", "' 
. $Lmi121 . '" , "' . $Lmi122 . '", "' . $Lmi123 . '" , "' . $Lmi124 . '", "' . $Lmi125 . '" , "' . $Lmi126 . '", "' 
. $Lj121 . '" , "' . $Lj122 . '", "' . $Lj123 . '" , "' . $Lj124 . '", "' . $Lj125 . '" , "' . $Lj126 . '", "' 
. $Lv121 . '" , "' . $Lv122 . '", "' . $Lv123 . '" , "' . $Lv124 . '", "' . $Lv125 . '" , "' . $Lv126 . '"
)');
mysql_query('INSERT INTO labsem13 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll131 . '" , "' . $Ll132 . '", "' . $Ll133 . '" , "' . $Ll134 . '", "' . $Ll135 . '" , "' . $Ll136 . '", "' 
. $Lm131 . '" , "' . $Lm132 . '", "' . $Lm133 . '" , "' . $Lm134 . '", "' . $Lm135 . '" , "' . $Lm136 . '", "' 
. $Lmi131 . '" , "' . $Lmi132 . '", "' . $Lmi133 . '" , "' . $Lmi134 . '", "' . $Lmi135 . '" , "' . $Lmi136 . '", "' 
. $Lj131 . '" , "' . $Lj132 . '", "' . $Lj133 . '" , "' . $Lj134 . '", "' . $Lj135 . '" , "' . $Lj136 . '", "' 
. $Lv131 . '" , "' . $Lv132 . '", "' . $Lv133 . '" , "' . $Lv134 . '", "' . $Lv135 . '" , "' . $Lv136 . '"
)');
mysql_query('INSERT INTO labsem14 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll141 . '" , "' . $Ll142 . '", "' . $Ll143 . '" , "' . $Ll144 . '", "' . $Ll145 . '" , "' . $Ll146 . '", "' 
. $Lm141 . '" , "' . $Lm142 . '", "' . $Lm143 . '" , "' . $Lm144 . '", "' . $Lm145 . '" , "' . $Lm146 . '", "' 
. $Lmi141 . '" , "' . $Lmi142 . '", "' . $Lmi143 . '" , "' . $Lmi144 . '", "' . $Lmi145 . '" , "' . $Lmi146 . '", "' 
. $Lj141 . '" , "' . $Lj142 . '", "' . $Lj143 . '" , "' . $Lj144 . '", "' . $Lj145 . '" , "' . $Lj146 . '", "' 
. $Lv141 . '" , "' . $Lv142 . '", "' . $Lv143 . '" , "' . $Lv144 . '", "' . $Lv145 . '" , "' . $Lv146 . '"
)');
mysql_query('INSERT INTO labsem15 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll151 . '" , "' . $Ll152 . '", "' . $Ll153 . '" , "' . $Ll154 . '", "' . $Ll155 . '" , "' . $Ll156 . '", "' 
. $Lm151 . '" , "' . $Lm152 . '", "' . $Lm153 . '" , "' . $Lm154 . '", "' . $Lm155 . '" , "' . $Lm156 . '", "' 
. $Lmi151 . '" , "' . $Lmi152 . '", "' . $Lmi153 . '" , "' . $Lmi154 . '", "' . $Lmi155 . '" , "' . $Lmi156 . '", "' 
. $Lj151 . '" , "' . $Lj152 . '", "' . $Lj153 . '" , "' . $Lj154 . '", "' . $Lj155 . '" , "' . $Lj156 . '", "' 
. $Lv151 . '" , "' . $Lv152 . '", "' . $Lv153 . '" , "' . $Lv154 . '", "' . $Lv155 . '" , "' . $Lv156 . '"
)');
mysql_query('INSERT INTO labsem16 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll161 . '" , "' . $Ll162 . '", "' . $Ll163 . '" , "' . $Ll164 . '", "' . $Ll165 . '" , "' . $Ll166 . '", "' 
. $Lm161 . '" , "' . $Lm162 . '", "' . $Lm163 . '" , "' . $Lm164 . '", "' . $Lm165 . '" , "' . $Lm166 . '", "' 
. $Lmi161 . '" , "' . $Lmi162 . '", "' . $Lmi163 . '" , "' . $Lmi164 . '", "' . $Lmi165 . '" , "' . $Lmi166 . '", "' 
. $Lj161 . '" , "' . $Lj162 . '", "' . $Lj163 . '" , "' . $Lj164 . '", "' . $Lj165 . '" , "' . $Lj166 . '", "' 
. $Lv161 . '" , "' . $Lv162 . '", "' . $Lv163 . '" , "' . $Lv164 . '", "' . $Lv165 . '" , "' . $Lv166 . '"
)');
mysql_query('INSERT INTO labsem17 (
nombreAsignatura ,ano , carrera,
L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,
M1 ,M2 ,M3 ,M4 ,M5 ,M6 ,
MI1 ,MI2 ,MI3 ,MI4 ,MI5 ,MI6 ,
J1 ,J2 ,J3 ,J4 ,J5 ,J6 ,
V1 ,V2 ,V3 ,V4 ,V5 ,V6
)
VALUES (
"' . $asig . '", "' . $ano . '", "' . $carr .'", "' .$Ll171 . '" , "' . $Ll172 . '", "' . $Ll173 . '" , "' . $Ll174 . '", "' . $Ll175 . '" , "' . $Ll176 . '", "' 
. $Lm171 . '" , "' . $Lm172 . '", "' . $Lm173 . '" , "' . $Lm174 . '", "' . $Lm175 . '" , "' . $Lm176 . '", "' 
. $Lmi171 . '" , "' . $Lmi172 . '", "' . $Lmi173 . '" , "' . $Lmi174 . '", "' . $Lmi175 . '" , "' . $Lmi176 . '", "' 
. $Lj171 . '" , "' . $Lj172 . '", "' . $Lj173 . '" , "' . $Lj174 . '", "' . $Lj175 . '" , "' . $Lj176 . '", "' 
. $Lv171 . '" , "' . $Lv172 . '", "' . $Lv173 . '" , "' . $Lv174 . '", "' . $Lv175 . '" , "' . $Lv176 . '"
)');


header('Location: ../start.php');
mysql_close();
?>