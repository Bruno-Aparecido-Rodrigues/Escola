<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>cargo.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    if($n1==1)
    echo 'Secretária:';
    elseif($n1==2)
    echo 'Gerente:';
    elseif($n1==3)
    echo 'Operário:';
    elseif($n1==4)
    echo 'Analista:';
    elseif($n1==5)
    echo 'Faxineiro:';
    else
    echo 'Código inválido';
    
  ?> 
</body>
</html>