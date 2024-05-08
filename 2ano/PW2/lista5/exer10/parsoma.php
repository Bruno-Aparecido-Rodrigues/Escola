<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>parsoma.php</title>
</head>
<body>
  <?php
    $par=0;
    $soma=0; 
    for($par=0;$par<11;$par=$par+2){
     $soma=$soma+$par; 
     echo 'Número par '.$par.'<br>';
    }  
    echo 'Soma '.$soma;
  ?> 
</body>
</html>