<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>somaentre.php</title>
</head>
<body>
  <?php
    $soma=0; 
    for($num=3;$num<9;$num++){
     $soma=$soma+$num; 
     echo 'Número inteiro '.$num.'<br>';
    }  
    echo 'Soma '.$soma;
  ?> 
</body>
</html>