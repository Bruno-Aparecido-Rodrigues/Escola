<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>trocavalor.php</title>
</head>
<body>
  <?php
    $nA = $_POST['txtnA'];
    $nB = $_POST['txtnB'];
    $n3 = 0;

    $n3 = $nA;
    $nA = $nB;
    $nB = $n3;
    echo 'O valor de A agora é:'.$nA.'<br/>'.'e B agora é:'.$nB;
  ?> 
</body>
</html>