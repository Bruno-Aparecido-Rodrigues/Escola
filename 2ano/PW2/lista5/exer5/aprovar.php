<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>aprovar.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    $n2 = $_POST['txtn2'];
    $media =0;
    
    $media =($n1+$n2)/2;
    if($media>=8)
    echo 'Você foi aprovado:';
    elseif($media<=3)
    echo 'Você foi reprovado:';
    else
    echo 'Você esta de recuperação'
  ?> 
</body>
</html>