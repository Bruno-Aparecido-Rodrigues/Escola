<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pagina tabuada do dois.php</title>
</head>
<body>
  <?php
    $i= 0;
    do{
        $tab = 2 * $i;
        echo '2'.'X'.$i.'='.$tab.'<br/>';
        $i++;  
      } 
      while($i <= 10);
   
  ?> 
</body>
</html>