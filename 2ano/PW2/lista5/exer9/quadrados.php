<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>quadrados.php</title>
</head>
<body>
  <?php
    $num=5;
    $res=0; 
    for($num;$num<11;$num++){
     $res=$num*$num; 
     echo 'O quadrado de '.$num.' é '.$res.'<br>';
    }
  ?> 
</body>
</html>