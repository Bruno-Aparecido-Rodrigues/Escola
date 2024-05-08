<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>dividepor4do.php</title>
</head>
<body>
  <?php
    $num=19;
    do{
     
     $num--;
     if($num%4==0)
     echo 'O número '.$num.' é divisivel por 4 <br>';
     
    }
    while($num>1);
  ?> 
</body>
</html>