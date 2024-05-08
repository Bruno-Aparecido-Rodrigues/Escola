<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>aprovar.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    $n2 = $_POST['txtn2'];
    $n3 = $_POST['txtn3'];
    $soma =0;

    $soma =($n1*$n1)+($n2*$n2)+($n3*$n3);
 
    echo 'A soma dos quadrados é de:'.$soma;
  ?> 
</body>
</html>