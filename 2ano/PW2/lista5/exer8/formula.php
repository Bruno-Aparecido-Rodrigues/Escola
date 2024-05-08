<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>formula.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    $n2 = $_POST['txtn2'];
    $cod = $_POST['txtcod'];
    $cal =0;

    if($cod==1){
        $cal=$n1+$n2;
        echo 'A soma dos valores é de:'.$cal;
    }
    elseif($cod==2){
        $cal=$n1-$n2;
        echo 'A subtração dos valores é de:'.$cal;
    }
    elseif($cod==3){
        $cal=$n1*$n2;
        echo 'A multiplicação dos valores é de:'.$cal;
    }
    elseif($cod==4){
        $cal=$n1/$n2;
        echo 'A divisão dos valores é de:'.$cal;
    }
    else
    echo 'Opcão inválida';
 
    
  ?> 
</body>
</html>