<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>somaentre_do.php</title>
</head>
<body>
  <?php
    $num=3;
    $soma=0; 
    do{
     $soma=$soma+$num; 
     echo 'Número inteiro '.$num.'<br>';
     $num++;
    }  
    while($num<9);
    echo 'Soma '.$soma;
  ?> 
</body>
</html>