<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>salario.php</title>
</head>
<body>
  <?php
    $bru = $_POST['txtbru'];
    $liq=0;
    $gra=0;
    $imp=0;
   $gra= $bru*(10/100);
   $imp= ($bru+$gra)*(20/100);
   $liq= ($bru+$gra)-$imp;
    echo 'O seu salário líquido é de:'.$liq;
  ?>  
</body>
</html>