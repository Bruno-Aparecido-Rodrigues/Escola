<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>calculadora.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    $n2 = $_POST['txtn2'];
    $nOp = $_POST['txtnOp'];
    $res=0;

    if ($nOp=="+"){
    $res=$n1+$n2;
     echo 'A soma dos valores é de:'.$res;}
    elseif ($nOp=="-"){
    $res=$n1-$n2;
    echo 'A subtração dos valores é de:'.$res;}
    elseif ($nOp=="*"){
    $res=$n1*$n2;
    echo 'A multiplicação dos valores é de:'.$res;}
    elseif ($nOp=="/"){
    $res=$n1/$n2;
    echo 'A divisão dos valores é de:'.$res;}
    else
    echo 'operador não identificado';
    
  ?> 
</body>
</html>