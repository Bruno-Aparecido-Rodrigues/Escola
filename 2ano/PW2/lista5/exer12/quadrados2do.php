<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>quadrados2do.php</title>
</head>
<body>
  <?php
    $num=0;
    $res=0; 
    do{
     $res=$num*$num; 
     echo 'O quadrado de '.$num.' é '.$res.'<br>';
     $num++;
    }
    while($num<11);
  ?> 
</body>
</html>