<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>compramaiorigual.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];

    if($n1>100)
    echo 'Valor da compra é maior que 100:';
    elseif($n1==100)
    echo 'Valor da compra é igual a 100:';
    else
    echo 'Valor da compra é menor que 100:';
  ?> 
</body>
</html>